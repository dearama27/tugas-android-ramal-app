package com.dea.zodiakapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class RamalActivity extends AppCompatActivity {

    TextView textRamalan;
    TextView txtNamalengkap;
    TextView txtJudul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramal);

        Intent intent   = getIntent();

        textRamalan     = findViewById(R.id.textRamal);
        txtNamalengkap  = findViewById(R.id.txtNamalengkap);
        txtJudul        = findViewById(R.id.txtJudul);

        String tglStr   = intent.getStringExtra(MainActivity.TGL_STR);
        String nama     = intent.getStringExtra(MainActivity.NAMA);

        txtNamalengkap.setText("Nama : "+nama);


        String[] tglAplit = tglStr.split("-");

        int month = Integer.parseInt( tglAplit[1] );
        int day = Integer.parseInt(tglAplit[0]);

        String zodiak  = getZodiak(month, day);
        String ramalan = getRamal(zodiak);
        txtJudul.setText(zodiak);
        textRamalan.setText(ramalan);


    }

    public String getZodiak(int month, int day) {
        String zodiak = null;
        switch (month) {
            case 1:
                if (day < 20) {
                    zodiak = "Capricorn";
                } else {
                    zodiak = "Aquarius";
                }
                break;
            case 2:
                if (day < 18) {
                    zodiak = "Aquarius";
                } else {
                    zodiak = "Pisces";
                }
                break;
            case 3:
                if (day < 21) {
                    zodiak = "Pisces";
                } else {
                    zodiak = "Aries";
                }
                break;
            case 4:
                if (day < 20) {
                    zodiak = "Aries";
                } else {
                    zodiak = "Taurus";
                }
                break;
            case 5:
                if (day < 21) {
                    zodiak = "Taurus";
                } else {
                    zodiak = "Gemini";
                }
                break;
            case 6:
                if (day < 21) {
                    zodiak = "Gemini";
                } else {
                    zodiak = "Cancer";
                }
                break;
            case 7:
                if (day < 23) {
                    zodiak = "Cancer";
                } else {
                    zodiak = "Leo";
                }
                break;
            case 8:
                if (day < 23) {
                    zodiak = "Leo";
                } else {
                    zodiak = "Virgo";
                }
                break;
            case 9:
                if (day < 23) {
                    zodiak = "Virgo";
                } else {
                    zodiak = "Libra";
                }
                break;
            case 10:
                if (day < 23) {
                    zodiak = "Libra";
                } else {
                    zodiak = "Scorpio";
                }
                break;
            case 11:
                if (day < 22) {
                    zodiak = "Scorpio";
                } else {
                    zodiak = "Sagittarius";
                }
                break;
            case 12:
                if (day < 22) {
                    zodiak = "Sagittarius";
                } else {
                    zodiak = "Capricorn";
                }
                break;
        }

        return  zodiak;
    }

    public String getRamal(String zodiak) {
        String ramal = "Tidak ada ramalan.";

        if(zodiak == "Capricorn") {
            ramal = "Orang yang lahir pada tanggal antara 21 Desember sampai 19 Januari berada di bawah pengaruh zodiak Capricorn, yang berlambang kambing. Orang yang berzodiak Capricorn mengutamakan kesuksesan, status, posisi, reputasi, loyalitas, konsentrasi, pemecahan masalah, bertanggung jawab, memperlihatkan kebijaksanaan, dan keseriusan belajar melalui pengalaman. Namun, ada kalanya orang berzodiak Capricorn cenderung bersikap memandang buruk (pesimis), selalu terpaksa, membebani, takut menghadapi hambatan, memperlihatkan batasan, kurang simpati, terlalu khawatir, dan pemikiran sempit. Capricorn termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Anda dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Capricorn adalah Aries, Cancer dan Libra.\n" +
                    "Pasangan yang Tepat untuk Capricorn\n" +
                    "Dalam pergaulan, orang yang berkelahiran Capricorn agak posesif (mengekang). Dalam pergaulan yang membuahkan cinta, Capricorn sering mencemburui kekasihnya tanpa alasan yang jelas. Sifat seperti ini menyebabkan perilakunya sulit untuk dimengerti dan terkadang seperti kekanak-kanakan. Untuk mengatasi masalah ini, seseorang yang berkepribadian dewasa, ramah dan penuh pengertian adalah pendamping ideal bagi Capricorn. Orang yang di bawah naungan Aries (21 Maret – 20 April), Taurus (21 April – 20 Mei) atau Libra (23 September – 22 Oktober) memang sesuai bagi Capricorn. Sikap Aries yang penuh perhatian dapat mendamaikan hati Capricorn. Bersamanya, Anda (Capricorn) akan merasa dibutuhkan dan dicintai. Taurus yang tenang juga tepat bagi Capricorn. Sikap Taurus yang kerap melindungi dan jujur, memang yang Anda butuhkan. Berpasangan dengan Libra yang bijaksana, juga akan membahagiakan Capricorn. Libra sangat berhati – hati dalam tutur kata sehingga perasaan Capricorn yang sensitif, tidak akan terluka.\n";
        }
        else if(zodiak == "Aquarius ") {
            ramal = "Sifat Baik dan Buruk Zodiak Aquarius\n" +
                    "Orang yang lahir pada tanggal antara 20 Januari sampai 18 Febuari berada di bawah pengaruh zodiak Aquarius, yang berlambang gelombang (alur air). Orang Aquarius tertarik dengan petualangan, berjiwa kemanusiaan, ingin tahu, ada semangat berontak, bersikap spontan, progesif, persahabatan, hak asasi, kelompok, dan mampu memberi manfaat untuk sekitar. Namun, ada kalanya Aquarius menghadapi gangguan, tak bisa diharapkan, suka membantah, memberontak, tak lengkap, perilaku salah, tak kosisten, perangai radikal, kurang metode, dan mendatangkan bencana. Aquarius termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Aquarius baik untuk memastikan sesuatu berjalan lancar atau berhasil. Lambang – lambang yang termasuk dalam kategori tetap selain Aquarius adalah Taurus, Leo dan Scorpio.\n" +
                    "Pasangan yang Tepat untuk Aquarius\n" +
                    "Teman atau kekasih yang paling cocok bagi Aquarius adalah Aries dan Gemini. Aries merupakan pendamping yang cocok bagi Aquarius. Semangat Aries yang tinggi dalam menambah ilmu merupakan hal menarik perhatian bagi Aquarius. Aries sebaliknya menyenangi sikap Aquarius yang terbuka. Gemini juga memiliki persamaan dengan Aquarius. Kedua – duanya memandang daya intelektual bukan rupa dan tubuh semata – mata. Keinginan Aquarius berburu karir turut disenangi oleh Gemini. Sementara itu, Aquarius harus bersabar ketika berdamping dengan Capricorn dan Virgo. Oleh sebab Aquarius bersikap dingin, mungkin akan sulit bergaul dengan Capricorn yang sikapnya tertutup. Namun begitu, keduanya sama – sama cerdas dan memendam rasa. Selanjutnya, Aquarius mungkin kurang sesuai berdampingan dengan Virgo. Hidupnya menjadi kaku dan horisontal bila dipasangkan denganVirgo yang serius.\n";
        }
        else if(zodiak == "Pisces") {
            ramal = "Sifat Baik dan Buruk Zodiak Pisces\n" +
                    "Orang yang lahir antara tanggal 19 Febuari sampai 20 Maret dikatakan bernaung di bawah zodiak Pisces, yang berlambang ikan. Pisces mengutamakan cinta universal, bersifat manja, selalu mencari ilham, memperlihatkan kepercayaan, ada kesepahaman, berjiwa puitis, menyukai musik, beragama, bersifat setia, mampu menghibur diri, mengutamakan kerohanian, dan tidak mudah mengaku kalah. Namun, ada kalanya Pisces merasa bingung, bersalah, mudah mengaku kalah, mudah kecewa, khawatir, risau, terlibat dalam penipuan, ketagihan, dan mudah menurut kemauan hati. Pisces termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Pisces adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori fleksibel selain Pisces adalah Gemini, Virgo dan Sagitarius.\n" +
                    "Pasangan yang Tepat untuk Pisces\n" +
                    "Orang berzodiak Pisces suka pada pujian dan mengharapkan ungkapan cinta dari kekasih. Justru itu, seseorang yang berkeperibadian kuat adalah pendamping yang tepat untuk Pisces. Zodiak Taurus yang bersifat pendiam tetapi mantap, sesuai untuk Pisces. Sikap Taurus yang dewasa, bersikap melindungi, akan mampu menenteramkan hati Pisces yang sensitif ini. Selain itu, Cancer yang matang dan gemar melindungi, juga diidamkan Pisces. Pasangan Cancer dan Pisces akan senada seirama lantaran keduanya sama – sama berpandangan konservatif. Sebaliknya, Aries) bukan teman yang tepat untuk Pisces. Lagak cakap Aries yang terlalu cerewet menyulitkan Pisces yang sensitif. Aries juga banyak meminta – minta buat Pisces. Gemini juga bukan ideal untuk Pisces. Sifatnya yang pembosan dan sering berubah – ubah dapat menyebabkan Pisces tersinggung.\n" +
                    "Karir dan Keuangan Pisces\n";

        }
        else if(zodiak == "Aries") {
            ramal = "Sifat Baik dan Buruk Zodiak Aries\n" +
                    "Orang yang lahir pada tanggal antara 21 Maret sampai 20 April dikatakan bernaung di bawah zodiak Aries, yang berlambang Biri-biri jantan. Dengan demikian, Aries seorang yang berani, yakin, inisiatif, mengutamakan tindakan, ada pertahanan diri, ada rasa merintis, ada daya juang, dan pencinta / memperjuangkan nasib. Namun, ada kalanya Aries ini terlalu pemikir, ada kekasaran, kesombongan diri, gemar memicu permusuhan, agresif, hasil kerja tak sempurna, dan ada kelemahan. Aries termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Aries dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Aries adalah Capricorn, Cancer dan Libra.\n" +
                    "Pasangan yang Tepat untuk Aries\n" +
                    "Aries punya daya pesona yang tinggi. Dalam pergaulan, Aries kelihatan lincah, pintar, berkeperibadian kuat dan teman bual yang mengasyikan. Zodiak Taurus, Gemini dan Aquarius adalah kekasih yang tepat bagi Aries. Taurus yang matang adalah pendamping yang tepat bagi Aries. Dengan sikapnya yang tenang; Taurus yang berlambang Lembu Jantan, mampu menundukkan Biri – biri Jantan (Aries) yang tidak mau duduk diam. Gemini juga cocok menjadi kekasih yang ideal bagi Aries. Kebetulan Gemini dan Aries mempunyai banyak persamaan, yaitu aktif , cerdas dan bijak. Dengan kematangannya, Aries dapat menutupi kekurangan Gemini. Bersama Aquarius, Aries mampu mengecapi bahagia. Aries tidak mempersoalkan sifat kekasih yang romantik seperti Aquarius. Sebaliknya kecerdasan Aquarius menjadi daya tarikan yang kuat buat Aries. Sebaliknya, Aries harus berhati – hati ketika berkasih dengan Capricorn atau Cancer. Capricorn bukan pula pasangan yang ideal bagi Aries yang aktif dan terbuka. Sifat Capricorn yang konservatif dan tertutup dapat membosankan Aries. Namun, Capricorn setia orangnya! Sebaliknya, Aries sulit bergaul dengan Cancer yang sensitif. Bila Aries salah bicara, Cancer mungkin murung berkelanjutan. Walau bagaimana pun, Cancer jujur dan pelindung orangnya.\n" +
                    "Karir dan Keuangan Aries\n";

        }
        else if(zodiak == "Taurus") {
            ramal = "Sifat Baik dan Buruk Zodiak Taurus\n" +
                    "Orang yang lahir pada tanggal antara 21 April sampai 20 Mei dikatakan bernaung di bawah zodiak Taurus, yang berlambang Lembu Jantan. Dengan demikian, Taurus mengutamakan kekayaan, ketinggian spiritual, kaut daya rasa, loyalitas, gemar berpelesiran, kesuburan, terlalu praktis, murah rezeki dan ketabahan. Walau bagaimana pun, ada kalanya Taurus bersikap terlalu kebendaan, terlalu mengekang, keras hati, suka menurut rasa hati dan buntu pikiran. Taurus termasuk dalam kategori tetap, yaitu termasuk stabilitas, daya ketabahan, daya tahan, dan daya kesempurnaan. Dengan kualitas ini Taurus baik untuk mempastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Taurus adalah Aquarius, Leo dan Scorpio.\n" +
                    "Pasangan yang Tepat untuk Taurus\n" +
                    "Cancer dan Virgo adalah pasangan yang ideal bagi Taurus. Cancer memang pendamping tepat bagi Taurus. Keperibadian Cancer yang matang dan tidak berubah – ubah sesuai dengan cita rasa Taurus. Lagi pula, Cancer mempunyai pandangan yang konservatif (kolot) seperti Taurus. Sikap Virgo yang tenang dan agak kolot juga sesuai bagi Taurus. Sebaliknya, Taurus harus berhati – hati ketika dipasangkan dengan Aries atau Gemini. Pasangan Taurus – Aries mungkin tidak sesuai. Ini karena, Aries bercita – cita tinggi, lincah dan terbuka dibandingkan dengan Taurus yang tenang tapi matang. Gemini juga bukan pasangan ideal bagi Taurus. Sifat Gemini yang mudah berubah – ubah dapat menyebabkan Taurus mudah merasa kecewa.\n" +
                    "Karir dan Keuangan Taurus\n";

        }
        else if(zodiak == "Gemini") {
            ramal = "Sifat Baik dan Buruk Zodiak Gemini\n" +
                    "Orang yang lahir pada tanggal antara 21 Mei sampai 20 Juni dikatakan bernaung di bawah zodiak Gemini, yang berlambang Saudara Kembar. Dengan demikian, Gemini terampil berkomunikasi, suka bepergian, serbaguna, cerdas, ada kekuatan berbicara, mampu menulis, kedekatan pada sanak saudara dan tetangga, gemar migrasi, dan bersikap terbuka. Namun, ada kalanya Gemini bersikap hanya suka sekejap saja, bersikap keanak-anakan, gugup, suka bermuka dua, berbicara kosong, tak lengkap dan suka berpura-pura. Gemini termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Gemini adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Gemini adalah Pisces, Virgo dan Sagitarius.\n" +
                    "Pasangan yang Tepat untuk Gemini\n" +
                    "Pendamping yang cocok untuk Gemini adalah seseorang yang cerdas dan memahami cita rasa Gemini yang selalu berubah – ubah. Zodiak Aries dan Taurus adalah pasangan yang tepat buat Anda. Gemini memiliki daya pesona yang dapat meluluhkan hati seseorang, terutama Aries. Ketangkasan, kecerdasan dan kelincahan Gemini adalah merupakan fitur – fitur yang disenangi oleh Aries. Sebaliknya, Aries sendiri juga adalah pendamping yang setia dan penuh perhatian buat Gemini. Taurus yang tenang adalah pasangan yang tepat buat Gemini. Kepribadian Taurus yang kuat, matang dan selalu melindungi, dapat mengelola sifat Gemini yang pembosan dan mudah berubah – ubah. Sedangkan Cancer dan Virgo bukanlah pasangan yang ideal bagi Gemini. Sifat Gemini yang selalu berubah – ubah menyebabkan Gemini sulit berdampingan dengan Cancer yang sifatnya juga demikian. Namun, Cancer adalah jenis yang setia orangnya! Dengan Virgo yang dingin sifatnya, juga kurang cocok bagi Gemini. Kesukaan Virgo pada kerapian menyulitkan Gemini.\n";

        }
        else if(zodiak == "Cancer") {
            ramal = "Orang yang lahir pada tanggal antara 21 Juni sampai 20 Juli dikatakan bernaung di bawah zodiak Cancer, yang berlambang Kepiting. Dengan demikian, Cancer menyukai rumah tangga, keluarga, kesehatan, makanan, ada rasa simpati, memberi perlindungan, agak sensitif, punya kesabaran, kejujuran, dan kecerdasan. Namun, ada kalanya Cancer bersikap kekanak-kanakan, berbolak-balik, berpura-pura, tidak aman, terlalu bertahan dan takut pada perpisahan. Cancer termasuk dalam kategori kardinal, yaitu aktif. Dengan kualitas ini Cancer dianggap baik untuk memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Cancer adalah Aries, Capricorn dan Libra.\n" +
                    "Pasangan yang Tepat untuk Cancer\n" +
                    "Seseorang yang berperibadian yang matang adalah pasangan yang ideal buat Cancer. Di sini, zodiak Taurus dan Virgo merupakan pendamping yang ideal bagi Cancer. Taurus yang tenang adalah pasangan yang dicari oleh Cancer. Bersama – sama Taurus, Cancer akan tenteram. Sikap Taurus yang matang dan berperibadian yang kuat menjadikan Cancer berasa terlindungi. Virgo juga pasangan yang sesuai untuk Cancer. Namun demikian, Virgo cenderung menjadi dingin dan tidak romantis. Cancer perlu menunggu ungkapan cintanya. Bersabarlah, karena Virgo memang lambat dalam soal cinta ini. Namun, Virgo juga seorang yang hangat. Sebaliknya, hubungan Cancer dengan Aries dan Gemini adalah kurang sesuai. Aries gemar bicara, sementara Cancer adalah seorang yang sangat sensitif. Kalau Aries suka berteman dan mudah berkumpul dengan teman – temannya; Cancer justru sebaliknya. Zodiak Gemini yang mudah bosan dan berubah – ubah sifatnya, juga membuat hubungan Cancer dengan Gemini kurang sesuai. Cancer mudah kesal lantaran Gemini tidak memperlihatkan sifat tetap yang dibutuhkan.\n" +
                    "Karir dan Keuangan Cancer\n";

        }
        else if(zodiak == "Leo") {
            ramal = "Sifat Baik dan Buruk Zodiak Leo\n" +
                    "Orang yang lahir pada tanggal antara 21 Juli sampai 21 Agustus dikatakan bernaung di bawah zodiak Leo, yang berlambang Singa. Anda mengutamakan rasa cinta, ramah, bersifat pemurah, ada daya kepemimpinan, menonjolkan kemegahan, selalu hidup, menyoroti keagungan, keberanian, kemampuan, dekat dengan anak-anak, berbakat dan suka pada hiburan. Walau bagaimana pun, ada kalanya Leo ini kerap menunjukkan ego, banyak bicara, memperlihatkan sifat kekuasaan, suka pamer, mengejar kemewahan, dan memenuhi komplek rendah diri dan bangga diri. Leo termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Anda akan baik untuk mempastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Anda adalah Taurus, Aquarius dan Scorpio.\n" +
                    "Pasangan yang Tepat untuk Leo\n" +
                    "Leo suka bergaul sehingga tidak dapat berdampingan dengan seseorang yang cemburu dan mengungkung. Dalam situasi ini, Libra, Sagitarius, dan Taurus adalah pendamping ideal buat Leo. Hubungan dengan Libra dapat membahagiakan Leo. Seperti sifat Leo, Libra juga membutuhkan cinta yang menyenangkan. Libra tidak suka memutuskan hubungan lantaran dia matang dalam membuat keputusan. Pasangan yang juga tepat bagi Leo adalah Sagitarius dan Taurus. Sifat Sagitarius yang periang bisa membuat Leo berbahagia. Daya pikir Sagitarius yang luas sehingga mengesankan Leo.\n";

        }
        else if(zodiak == "Virgo") {
            ramal = "Sifat Baik dan Buruk Zodiak Virgo\n" +
                    "Orang yang lahir pada tanggal antara 22 Agustus hingga 22 September dikatakan bernaung di bawah zodiak Virgo, yang berlambang Seorang Gadis. Dengan demikian, Virgo suka pada kerja, hasil kerja sempurna, punya pahlawan diri, suci, mengutamakan kesehatan, ada kesadaran, memberikan konsentrasi berdisiplin, praktis, siap melayani dan komprehensif. Namun, ada kalanya Virgo merasa khawatir, cerewet, berpandangan sempit, terlalu tertib, suka mengeluh, tidak mudah mengaku kalah, dan ada suka mengkritik. Virgo termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Virgo adalah zodiak kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Virgo adalah Gemini, Pisces dan Sagitarius.\n" +
                    "Pasangan yang Tepat untuk Virgo\n" +
                    "Zodiak Cancer dapat menjadi teman atau kekasih yang baik bagi Virgo. Sementara bersama Virgo yang serius, Cancer yang cemburu; tidak akan merasa resah. Selain sifat Cancer yang sulit diharapkan akan membuat Virgo menjadi ceria memikirkan sesuatu yang tersirat di pikiran. Pasangan yang juga tepat bagi Virgo adalah Leo. Sifat Leo yang gemar berubah menurut kehendak hati; tetapi Leo tahu cara untuk menyenangkan teman atau kekasih seperti Virgo. Sebaliknya, Sagitarius bukan pasangan yang ideal buat Virgo. Sagitarius pecinta kebebasan sedangkan Virgo cenderung untuk merencanakan sesuatu dalam hidup dengan teliti. Selanjutnya, sifat Virgo agak tertutup, misalnya dalam hal mengungkapkan rasa cinta, sementara sifat Sagitarius lebih terbuka, sehingga tidak segan – segan menciumi kekasihnya di depan umum.\n";

        }
        else if(zodiak == "Libra") {
            ramal = "Sifat Baik dan Buruk Zodiak Libra\n" +
                    "Orang yang lahir pada tanggal antara 23 September sampai 22 Oktober dikatakan bernaung di bawah zodiak Libra, yang berlambang Alat Penimbang (Dacin). Dengan demikian, orang yang berzodiak Libra biasanya berciri-ciri harmonis, seimbang, menyukai pernikahan, mendapati perhubungan, mengutamakan kesetaraan, aliansi, diplomasi, berseni, suka membantu, selalu dalam keadaan ceria, dapat menjadi pasangan yang ideal dan menyukai keadilan. Namun, ada kalanya Libra bersikap bolak-balik, pura-pura, tidak jujur, tujuan kurang tegas, atau tindakan kurang seimbang. Libra termasuk dalam kategori kardinal, yaitu aktif (berprinsip memulai sesuatu). Dengan kualitas ini Libra dianggap baik untuk merangsang dan memulai setiap proyek baru. Lambang-lambang yang termasuk dalam kategori kardinal selain Libra adalah Aries, Cancer dan Capricorn.\n" +
                    "Pasangan yang Tepat untuk Libra\n" +
                    "Libra adalah seorang kekasih yang cerdas dan selalu menjaga perbuatan dan pertuturannya agar kekasihnya tidak tersinggung. Pendamping yang ideal buat Libra adalah Taurus dan Leo. Bintang Taurus yang matang dan sabar sangat diperlukan untuk mengendalikan sifat Libra yang selalu dalam keraguan. Sementara, Leo yang tangkas, dapat menjadi kekasih yang baik buat Libra. Dia tahu menyenangkan hati Libra yang suka menimbang – nimbang keputusan dan selalu dalam kondisi keraguan. Sebaliknya, hubungan Libra dengan Aries dan Gemini diperkirakan kurang sesuai. Aries yang suka bergantung pada teman / pasangannya sudah tentu tidak sesuai dengan Libra yang memang suka menimbang – nimbang dan selalu ragu – ragu itu. Selain itu, Aries menyukai keputusan yang cepat, sedangkan Libra memang agak lambat dalam memberi keputusan. Begitu juga halnya hubungan Libra dengan Gemini, bukanlan hubungan yang ideal. Sifat Gemini yang cepat bosan dan sering berubah – ubah memungkinkan Libra cepat merasa kecewa.\n";

        }
        else if(zodiak == "Scorpio") {
            ramal = "Sifat Baik dan Buruk Zodiak Scorpio\n" +
                    "Orang yang lahir pada tanggal antara 23 Oktober sampai 22 November dikatakan bernaung di bawah zodiak Scorpio, yang berlambang kalajengking. Scorpio memiliki kemewahan, kreatif, ada keinginan yang kuat, punya stamina, daya sensual yang tinggi dan ada bakat menyembuhkan. Walau bagaimana pun, ada kalanya Scorpio mudah menaruh rasa cemburu, suka menuntut bela, suka ‘membinasakan diri’, ekstrim, fanatik, tamak dan berdaya untuk menyerang. Scorpio termasuk dalam kategori tetap, yaitu termasuk stabilitas, ketabahan, ketahanan, dan kesempurnaan. Dengan kualitas ini Scorpio akan baik untuk memastikan sesuatu berjalan lancar atau berhasil. Lambang-lambang yang termasuk dalam kategori tetap selain Scorpio adalah Taurus, Leo dan Aquarius.\n" +
                    "Pasangan yang Tepat untuk Scorpio\n" +
                    "Orang yang bernaung di bawah lambang Taurus dan Cancer merupakan pendamping yang sesuai untuk Scorpio. Taurus adalah pedamping yang diperlukan oleh Scorpio. Dengan kesabaran yang ditunjukkan oleh Taurus, Scorpio mampu melenyapkan sikap kasarnya. Dengan sikap Taurus yang matang dan mantap akan menyebabkan sifat Scorpio yang pencemburu itu akan mudah merasa damai (tenang). Berpasangan dengan Cancer pun akan memberikan kebahagiaan untuk Scorpio. Cancer biasanya seorang yang handal dan mantap. Dia mampu memberi perlindungan dan kedamaian yang diperlukan. Selanjutnya, Cancer juga berpandangan konservatif seperti Scorpio. Sebaliknya, orang yang bernaung di bawah naungan Aries dan Gemini harus dihindari oleh Scorpio. Aries cenderung mengatakan apa pun hal, sedangkan Scorpio takut dikritik. Demikian juga dengan hubungan Scorpio – Gemini. Sifat Gemini yang kekanak – kanakan tidak sesuai bagi Scorpio yang juga cenderung bersifat demikian.\n";

        }
        else {
            ramal = "Sifat Baik dan Buruk Zodiak Sagitarius\n" +
                    "Orang yang lahir pada tanggal antara 23 November sampai 20 Desember dikatakan bernaung di bawah zodiak Sagitarius, yang berlambang Pemanah. Sagitarius suka minat belajar, bersikap optimis, pemanjat, pemahaman diri, bercita-cita tinggi, memiliki hati nurani, berpegang pada agama, psikologi, suka pada kesenangan, bijaksana, selalu ada keberuntungan, gemar eksplorasi dan ada berbagai impian. Namun, ada kalanya Sagitarius berada dalam kelalaian, tidak mematuhi hukum, berada dalam kegelisahan, pembazir, terlalu menurut kehendak hati, tidak jujur dan tidak bertanggung jawab. Sagitarius termasuk dalam kategori variabel, yaitu mudah mengalami daya perubahan, daya adaptasi dan daya keseimbangan. Dengan kategori variabel ini, Sagitarius adalah kreatif meskipun tidak selalu praktis. Lambang-lambang yang termasuk dalam kategori bervariasi selain Sagitarius adalah Gemini, Virgo dan Pisces.\n" +
                    "Pasangan yang Tepat untuk Sagitarius\n" +
                    "Sagitarius seorang kekasih yang setia. Pasangan yang dilakukan adalah bukan dari jenis yang cemburu. Jadi, pasangan yang cocok dengan Sagitarius adalah Aries dan Gemini. Aries sesuai dengan Sagitarius karena Aries juga menyukai pada kebebasan. Sifat Aries yang periang dan cerdas juga sangat menyenangi Sagitarius. Begitu juga dengan hubungan Sagitarius dengan Gemini karena Gemini menyukai kebebasan dan periang yang mana sudah tentu sesuai dengan Sagitarius. Sebaliknya, hubungan dengan Capricorn atau Cancer perlu dihindari lantaran kurang sesuai dengan Sagitarius. Capricorn yang cemburu dan posesif agak kurang sesuai bagi Sagitarius yang menyukai kebebasan. Begitu juga hubungan dengan Cancer yang agak sensitif. Ini karena orang Sagitarius tidak bersedia untuk meluangkan waktu untuk menyelami isi hati orang yang sensitif.\n";

        }

        return ramal;
    }
}
