package com.dea.zodiakapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONArray;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private DatePickerDialog datePickerDialog;
    Button btnRamal; //Deklarasi object bernama btnCekBMI yang merupakan Button
    EditText txtTanggalLahir;
    EditText txtNamaLengkap;
    SimpleDateFormat dateFormatter;

    public static final String TGL_STR = "com.example.myfirstapp.TGL_STR";
    public static final String NAMA = "com.example.myfirstapp.NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Kita menggunakan format tanggal dd-MM-yyyy
         * jadi nanti tanggal nya akan diformat menjadi
         * misalnya 01-12-2017
         */
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        txtTanggalLahir = findViewById(R.id.txtTanggalLahir);
        txtNamaLengkap = findViewById(R.id.txtNamaLengkap);

        txtTanggalLahir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });
        btnRamal = findViewById(R.id.btnRamal); //Menyambungkan elemen dengan id btnCekBMI yang ada di activity_main.xml kesini
        btnRamal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String value = txtTanggalLahir.getText().toString();
                Log.d("Log", value);

                openHasil(value, txtNamaLengkap.getText().toString());
            }
        });
    }

    public void openHasil(String tglStr, String name) {

        Intent intentHasil = new Intent(this, RamalActivity.class);
        intentHasil.putExtra(TGL_STR, tglStr);
        intentHasil.putExtra(NAMA, name);
        startActivity(intentHasil);
    }

    public String hitungBMI(double beratBadan, double tinggiBadan){
        String statusBadan;
        double BMI = beratBadan/(tinggiBadan*tinggiBadan);
        if(BMI<18.5){
            statusBadan = "Anda kekurangan berat badan.";
        } else if(BMI>=18.5 && BMI<=24.9){
            statusBadan = "Berat badan anda normal (ideal).";
        } else if(BMI>=25 && BMI<=29.9){
            statusBadan = "Anda kelebihan berat badan.";
        } else {
            statusBadan = "Anda kegemukan (obesitas).";
        }
        return statusBadan;
    }

    private void showDateDialog(){

        /**
         * Calendar untuk mendapatkan tanggal sekarang
         */
        Calendar newCalendar = Calendar.getInstance();

        /**
         * Initiate DatePicker dialog
         */
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                /**
                 * Method ini dipanggil saat kita selesai memilih tanggal di DatePicker
                 */

                /**
                 * Set Calendar untuk menampung tanggal yang dipilih
                 */
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                /**
                 * Update TextView dengan tanggal yang kita pilih
                 */
                txtTanggalLahir.setText(dateFormatter.format(newDate.getTime()));
            }

        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        /**
         * Tampilkan DatePicker dialog
         */
        datePickerDialog.show();
    }
}
