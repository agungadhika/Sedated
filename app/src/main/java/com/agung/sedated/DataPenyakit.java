package com.agung.sedated;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class DataPenyakit extends AppCompatActivity {

    private TextView getdesc, getnama, getcara, getstep,getstep1,getstep2, getstep3 ,getpembuatan, getlangkah,getlangkah2, getlangkah3,getlangkah4, getlangkah5,getlangkah6;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_penyakit);
        button = findViewById(R.id.button);
        getdesc = findViewById(R.id.getdekripsi);
        getnama = findViewById(R.id.getnama);
        getpembuatan = findViewById(R.id.getpembuatan);
        getlangkah = findViewById(R.id.getlangkah);
        getlangkah2 = findViewById(R.id.getlangkah2);
        getlangkah3 = findViewById(R.id.getlangkah3);
        getlangkah4 = findViewById(R.id.getlangkah4);
        getlangkah5 = findViewById(R.id.getlangkah5);
        getlangkah6 = findViewById(R.id.getlangkah6);
        getcara = findViewById(R.id.getcara);
        getstep = findViewById(R.id.getstep);
        getstep1 = findViewById(R.id.getstep1);
        getstep2 = findViewById(R.id.getstep2);
        getstep3 = findViewById(R.id.getstep3);
        showData();
    }
    @SuppressLint("SetTextI18n")
    private void showData(){
        String nama = getIntent().getExtras().getString("MyName");
        switch (nama){
            case "Asma":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Asma adalah penyakit obstrupsi(penyempitan) jalan nafas yang berulang dengan gejala klinis berupa batuk dan sesak nafas. Sebagian penyebabnya adalah zat allergen(alergi) atau polusi dan kegiatan jasmani berlebihan atau emosi");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 3 Kuntum bunga kenanga kering");
                getlangkah2.setText("2. 200cc air");
                getlangkah3.setText("Cara pembuatan Obat Herbal:");
                getlangkah3.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah4.setText("1.Bunga kenanga kering diseduh dengan 200cc air yang telah mendidih kemudian ditutup rapat");
                getlangkah5.setText("2.Setelah agak dingin, saring airnya dan diminum sekaligus");
                getlangkah6.setText("3.Minum secara teratur setiap hari");
                getcara.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep.setText("https://www.youtube.com/watch?v=rd5kT0AUP9A");
                getstep.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep, Linkify.WEB_URLS);
                break;
                /*button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent();
                        intent.setAction(Intent.ACTION_VIEW);
                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                        intent.setData(Uri.parse("http://www.google.com"));
                        startActivity(intent);
                    }
                });*/


         case "Asam Urat":
             getdesc.setText("Deskripsi Penyakit");
             getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
             getnama.setText("Asam urat adalah penyakit sendi yang berhubungan dengan metabolisme. Biasanya asam urat disebabkan oleh ketidakmampuan ginjal membuang zat asam urat. ");
             getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
             getpembuatan.setText("Bahan yang Diperlukan :");
             getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
             getlangkah.setText("1. 5 Butir Kapulaga");
             getlangkah2.setText("2. 5 Butir Cengkih");
             getlangkah3.setText("3. 15 gram jahe merah");
             getlangkah4.setText("4. 1 jari kayu manis");
             getlangkah5.setText("5. 5 gram biji pala");
             getlangkah6.setText("6. 10 butir lada");
             getcara.setText("Cara pembuatan Obat Herbal:");
             getcara.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
             getstep.setText("1.Semua bahan direbus dalam air hingga tersisa separuhnya.");
             getstep1.setText("2.Minum air rebusannya dan makan ubi jalarnya.");
             getstep2.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
             getstep3.setText("https://www.youtube.com/watch?v=KNtJs-IDg_A");
             getstep3.setMovementMethod(LinkMovementMethod.getInstance());
             Linkify.addLinks(getstep3, Linkify.WEB_URLS);
                break;

            case "Batuk":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Batuk merupakan respons alami yang diberikan tubuh saat sistem pertahanan saluran napas mengalami gangguan dari luar. Melalui batuk, tubuh bisa membersihkan lendir atau faktor penyebab iritasi lainnya agar keluar dari paru-paru.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 1 buah jeruk bali");
                getlangkah2.setText("2. 1 gram kapur sirih");
                getlangkah3.setText("Cara pembuatan Obat Herbal:");
                getlangkah3.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah4.setText("1. Buah jeruk bali dibakar, kemudian diperas. Air perasannya dicampur dengan kapur sirih, lalu diminum 1 kali sehari.");
                getlangkah5.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getlangkah6.setText("https://www.youtube.com/watch?v=ZffsL-67wfo");
                getlangkah6.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah6, Linkify.WEB_URLS);
                break;

            case "Bisul":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Bisul atau furunkel adalah benjolan merah pada kulit yang berisi nanah dan terasa nyeri. Kondisi ini paling sering disebabkan oleh infeksi bakteri yang memicu peradangan pada folikel rambut, yaitu tempat tumbuhnya rambut.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 20 gram daun kecubung");
                getlangkah2.setText("2. garam dapur secukupnya");
                getlangkah3.setText("3. 10 gram daun sirih");
                getlangkah4.setText("Cara pembuatan Obat Herbal:");
                getlangkah4.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah5.setText("1. Semua bahan ditumbuk menjadi satu lalu tambahkan air bersih secukupnya.");
                getlangkah6.setText("2. Tempelkan pada bisul hingga tertutup seluruhnya. Ulangi lagi jika sudah kering.");
                getcara.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep.setText("https://www.youtube.com/watch?v=PmR2QUFbWcY");
                getstep.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep, Linkify.WEB_URLS);
                break;

            case "Campak":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Campak adalah penyakit yang menunjukan gejala ruam pada seluruh tubuh dan sangat menular. Campak bisa mengarah pada komplikasi yang lebih serius dan sangat mengganggu. Umumnya, gejala campak muncul sekitar satu hingga dua minggu setelah tubuh terkena virus campak tersebut.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 1 buah jagung muda");
                getlangkah2.setText("Cara pembuatan Obat Herbal:");
                getlangkah2.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah3.setText("1.Jagung muda mentah dikunyah, lalu disemburkan ke badan yang terkena campak. Lakukan 2-3 kali sehari.");
                getlangkah4.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getlangkah5.setText("https://www.youtube.com/watch?v=Q_W0JVqFdLM");
                getlangkah5.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah5, Linkify.WEB_URLS);
                break;
            case "Cholera":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Cholera adalah diare akibat infeksi bakteri yang bernama Vibrio cholerae. Penyakit ini dapat terjadi pada orang dewasa maupun anak-anak dan diare yang ditimbulkan dapat parah hingga menimbulkan dehidrasi.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 40 gram sembung legi");
                getlangkah2.setText("2. 50 gram laos, dirajang");
                getlangkah3.setText("3. 10 gram daun sangket, dipotong-potong");
                getlangkah4.setText("Cara pembuatan Obat Herbal:");
                getlangkah4.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah5.setText("1.Semua bahan dimasak dengan air 4 gelas hingga matang. Minum 3x sehari masing-masing 1 cangkir.");
                getlangkah6.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getcara.setText("https://www.youtube.com/watch?v=Yb5lQRFhYMk");
                getcara.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getcara, Linkify.WEB_URLS);
                break;

            case "Demam":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Demam adalah kondisi meningkatnya suhu tubuh hingga lebih dari 38C. Demam menandakan adanya penyakit atau kondisi lain di dalam tubuh.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 1 ruas (5-10 gram) daun dadap serep muda");
                getlangkah2.setText("2. 4-5 gram kapur sirih");
                getlangkah3.setText("3. 5-10 gram daun adas");
                getlangkah4.setText("Cara pembuatan Obat Herbal:");
                getlangkah4.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah5.setText("1.Daun dadap serep yang masih muda diremas, dicampur sedikit kapur sirih dan adas, lalu ditempelkan pada kepala 1-2 kali sehari masing-masing 15-30 menit.");
                getlangkah6.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getcara.setText("https://www.youtube.com/watch?v=942SQPQMYH4");
                getcara.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getcara, Linkify.WEB_URLS);
                break;

            case "Demam Meriang":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Meriang adalah sebutan untuk gejala demam yang disertai menggigil.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 5 gram Pegagan");
                getlangkah2.setText("2. 4 gram daun kacapiring");
                getlangkah3.setText("3. 7 gram sembung legi");
                getlangkah4.setText("4. 5 gram babakan pule");
                getlangkah5.setText("5. 4 gram kulit kina");
                getlangkah6.setText("6. 6 gram jahe");
                getcara.setText("Cara pembuatan Obat Herbal:");
                getcara.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getstep.setText("1.Semua bahan direbus dengan 2 setengah gelas air. Minum 3x sehari.");
                getstep2.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep3.setText("https://www.youtube.com/watch?v=KNtJs-IDg_A");
                getstep3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep3, Linkify.WEB_URLS);
                break;

            case "Darah Rendah":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Darah rendah atau hipotensi adalah kondisi ketika tekanan darah berada di bawah 90/60 mmHg.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 250 gram wortel");
                getlangkah2.setText("2. 100 gram bayam");
                getlangkah3.setText("3. 150 gram seledri");
                getlangkah4.setText("4. 200 gram bit");
                getlangkah5.setText("5. 150 gram timun");
                getlangkah6.setText("6. 150 gram kelapa");
                getcara.setText("Cara pembuatan Obat Herbal:");
                getcara.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getstep.setText("1.Semua bahan dilumat menjadi satu, diperas, dan diambil sarinya.");
                getstep2.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep3.setText("https://www.youtube.com/watch?v=trlrkdmT-rk");
                getstep3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep3, Linkify.WEB_URLS);
                break;
            case "Darah Tinggi":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Hipertensi adalah istilah medis dari penyakit tekanan darah tinggi. Kondisi ini dapat mengakibatkan berbagai komplikasi kesehatan yang membahayakan nyawa sekaligus meningkatkan risiko terjadinya penyakit jantung, stroke, bahkan kematian.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 5 gram bawang putih");
                getlangkah2.setText("2. 2 buah mentimun");
                getlangkah3.setText("3. 2 sendok makan madu murni");
                getlangkah4.setText("Cara pembuatan Obat Herbal:");
                getlangkah4.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah5.setText("1.Bawang putih dan mentimun dihancurkan dan diambil airnya. Campur dengan madu.");
                getlangkah6.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getcara.setText("https://www.youtube.com/watch?v=trlrkdmT-rk");
                getcara.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getcara, Linkify.WEB_URLS);
                break;

            case "Flu":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Flu atau influenza adalah infeksi virus yang menyerang hidung, tenggorokan, dan paru-paru. Penderita flu akan mengalami demam, sakit kepala, pilek, hidung tersumbat, serta batuk");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 2-3 buah kemukus");
                getlangkah2.setText("Cara pembuatan Obat Herbal:");
                getlangkah2.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah3.setText("1.Buah kemukus ditumbuk hingga halus, lalu aromanya dihisap berulang kali sekitar 5-10 menit.");
                getlangkah4.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getlangkah5.setText("https://www.youtube.com/watch?v=e6Bg-89Rgf0");
                getlangkah5.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah5, Linkify.WEB_URLS);
                break;

            case "Ginjal":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Penyakit ginjal adalah istilah yang menggambarkan setiap gangguan yang terjadi pada ginjal. Penyakit ginjal akan mengganggu fungsi organ ini untuk membersihkan dan menyaring limbah atau racun dari darah.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1.10 lembar daun belimbing wuluh");
                getlangkah2.setText("2. 3 lembar daun sembung");
                getlangkah3.setText("3. 1 potong(2cm) brotowali");
                getlangkah4.setText("4. 1 buah jeruk nipis");
                getlangkah5.setText("5. 3 sendok makan gula batu");
                getlangkah6.setText("Cara pembuatan Obat Herbal:");
                getlangkah6.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getcara.setText("1.Daun sembung, brotowali dan daun belimbing direbus menjadi satu dengan 3 gelas air. Biarkan hingga tinggal setengahnya. Setelah itu, air rebusan diberikan gula batu dan perasan jeruk nipis, lalu diaduk sampai rata.");
                getstep.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep2.setText("https://www.youtube.com/watch?v=PmVAYNSR_aw");
                getstep2.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep2, Linkify.WEB_URLS);
                break;

            case "Gondong":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Gondongan adalah peradangan kelenjar parotis akibat infeksi virus. Gondongan ditandai dengan pembengkakan pada pipi penderita. Kondisi ini dapat menular dan umumnya diderita oleh anak-anak.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 4 buah belimbing wuluh");
                getlangkah2.setText("2. 2 butir bawang putih");
                getlangkah3.setText("Cara pembuatan Obat Herbal:");
                getlangkah3.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah4.setText("1. Parut belimbing wuluh dan bawang merah, lalu campurkan menjadi satu. Pakai sebagai bobok di tempat yang bengkak. Lakukan tiap pagi dan sore secara teratur.");
                getlangkah5.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getlangkah6.setText("https://www.youtube.com/watch?v=PmVAYNSR_aw");
                getlangkah6.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah6, Linkify.WEB_URLS);
                break;
            case "Jerawat":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Jerawat  adalah masalah kulit yang terjadi ketika folikel rambut atau tempat tumbuhnya rambut tersumbat oleh minyak dan sel kulit mati. Kondisi ini umumnya ditandai dengan munculnya bintik-bintik pada beberapa bagian tubuh, seperti wajah, leher, punggung, dan dada.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1.7 lembar daun nangka tua");
                getlangkah2.setText("2. 4 klungsu buah asam");
                getlangkah3.setText("3. 300 cc air");
                getlangkah4.setText("Cara pembuatan Obat Herbal:");
                getlangkah4.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah5.setText("1.Daun nangka dipotong kecil kecil lalu dicampur dengan buah asam");
                getlangkah6.setText("2.Rebus dalam air hingga kental, lalu dinginkan");
                getcara.setText("3.Setelah ramuan dingin, oleskan pada wajah yang berjerawat setiap hari");
                getstep.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep2.setText("https://www.youtube.com/watch?v=ZSw7RdLUabA");
                getstep2.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep2, Linkify.WEB_URLS);
                break;
            case "Kanker":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Kanker adalah penyakit yang terjadi akibat pertumbuhan sel-sel abnormal yang tidak terkendali, menyebabkan jaringan tubuh normal rusak. Pada dasarnya, tubuh manusia terdiri dari triliunan sel yang tersebar di setiap organ dan bagian. Nantinya, sel-sel ini akan terus tumbuh dan berkembang menjadi sel baru. Karena sudah tergantikan, secara alami sel-sel yang tidak sehat, tidak berfungsi dan tua akan mati.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 15 gram benalu teh");
                getlangkah2.setText("2. 500 mg daun sambung nyawa");
                getlangkah3.setText("Cara pembuatan Obat Herbal:");
                getlangkah3.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah4.setText("1.Rebus bahan dengan 2-3 gelas air bersih dengan api kecil hingga air tinggal separuhnya. Saring dan endapkan");
                getlangkah5.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getlangkah6.setText("https://www.youtube.com/watch?v=ZSw7RdLUabA");
                getlangkah6.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah6, Linkify.WEB_URLS);
                break;
            case "Kencing Batu":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Kencing batu merupakan pembentukan batu dalam , yaitu ginjal, kandung kemih, ureter, dan uretra (saluran kemih). Batu bisa terbentuk akibat adanya penumpukan garam dan mineral (kalsium, amonia, asam urat, sistein) dalam urine.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 20-30 gram akar alang-alang");
                getlangkah2.setText("2. 20-30 gram akar jambe muda");
                getlangkah3.setText("3. 2 ruas tebu ireng");
                getlangkah4.setText("4. 10-15 gram akar kates");
                getlangkah5.setText("5. 4-5 gelas air bersih");
                getlangkah6.setText("Cara pembuatan Obat Herbal:");
                getlangkah6.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getcara.setText("1.Semua bahan direbus dengan air hingga mendidih");
                getstep.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep2.setText("https://www.youtube.com/watch?v=EVz_YDuoO7w");
                getstep2.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep2, Linkify.WEB_URLS);
                break;
            case "Kencing Manis":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Penyakit kronis yang ditandai dengan tingginya kadar gula (glukosa) di dalam darah. Kondisi ini juga sering disebut sebagai penyakit gula atau kencing manis.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 150 gram daun murbei");
                getlangkah2.setText("2. 150 gram meniran");
                getlangkah3.setText("3. 150 gram tanaman kumis kucing");
                getlangkah4.setText("4. 150 gram petai cina");
                getlangkah5.setText("5. 150 gram daun pegangan");
                getlangkah6.setText("Cara pembuatan Obat Herbal:");
                getlangkah6.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getstep.setText("1.Campurkan semua bahan lalu rebus dengan 3 liter air hingga tinggal 1 1/2 liter");
                getstep2.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep3.setText("https://www.youtube.com/watch?v=8cJgM2rTTiI");
                getstep3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep3, Linkify.WEB_URLS);
                break;
            case "Kolesterol":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Kolesterol adalah lemak yang berguna bagi tubuh. Namun bila kadarnya di dalam tubuh terlalu tinggi, kolesterol akan menumpuk di pembuluh darah dan mengganggu aliran darah.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 2 jari temu giring");
                getlangkah2.setText("2. 3 lembar daun jati belanda");
                getlangkah3.setText("3. 13 lembar daun kemuning muda");
                getlangkah4.setText("Cara pembuatan Obat Herbal:");
                getlangkah4.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah5.setText("1.Temu giring dikupas lalu dicuci bersih dan diiris kecil-kecil. Selanjutnya, rebus bersama dengan bahan lain dalam 4 gelas air sehingga tersisa 2 gelas. Saring airnya");
                getlangkah6.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep.setText("https://www.youtube.com/watch?v=Sn7NeoLfN4c");
                getstep.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep, Linkify.WEB_URLS);
                break;
            case "Maag":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Sakit maag atau dispepsia adalah gejala penyakit berupa rasa nyeri dan panas pada lambung yang terjadi akibat sejumlah kondisi. Di antaranya adalah luka terbuka pada lapisan dalam lambung (tukak lambung), infeksi bakteri Helicobacter pylori, efek samping penggunaan obat antiinflamasi nonsteroid (OAINS), dan stres.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. 5 siung bawang putih");
                getlangkah2.setText("2. 5 kuntum bunga pepaya");
                getlangkah3.setText("3. 10 kuntum bunga tanjung");
                getlangkah4.setText("Cara pembuatan Obat Herbal:");
                getlangkah4.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah5.setText("1.Bawang putih ditumbuk halus, dan semua bahan diseduh dengan 1 gelas air mendidih, biarkan 10 menit, lalu saring");
                getlangkah6.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getstep.setText("https://www.youtube.com/watch?v=BaMoA0zjtXQ");
                getstep.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getstep, Linkify.WEB_URLS);
                break;
            case "Migrain":
                getdesc.setText("Deskripsi Penyakit");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Migrain adalah sakit kepala yang terasa berdenyut, dan biasanya terjadi pada satu sisi kepala saja. Migrain merupakan penyakit saraf, yang dapat menimbulkan gejala, seperti mual, muntah, serta sensitif terhadap cahaya atau suara.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Bahan yang Diperlukan :");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("1. Daun Dewa");
                getlangkah2.setText("Cara pembuatan Obat Herbal:");
                getlangkah2.setTextSize(TypedValue.COMPLEX_UNIT_PX,60);
                getlangkah3.setText("1.Konsumsi daun dewa yang sudah dicuci bersih sebagai lalapan sebanyak 3 kali sehari, masing-masing 3 lembar");
                getlangkah4.setText("Klik link berikut untuk dokumentasi pembuatan obat herbal :");
                getlangkah5.setText("https://www.youtube.com/watch?v=BaMoA0zjtXQ");
                getlangkah5.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah5, Linkify.WEB_URLS);
                break;

            //Tanaman
            case "Tanaman Sambiloto":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Tanaman ini tumbuh liar di tempat terbuka di dataran rendah sampai dengan ketinggian 700 meter di atas permukaan laut. Tinggi batangnya bisa mencapai 50-90cm.Daunnya berwarna hijau tua di permukaan atas, berwarna hijau muda di bagian bawah dengan panjang daun 2-8 dan lebar 1-3 cm. Sambiloto bisa diperbanyak dengan biji atau setek batang.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Sambiloto berkhasiat untuk mengatasi hepatitis, disentri basiler, infeksi saluran empedu, radang saluran napas, radang ginjal akut, radang telinga, kencing nanah, kencing manis, darah tinggi, keracunan jamur, kusta dll.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=reBvdbT4jCQ");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Rumput Mutiara":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Rumput mutiara bisa tumbuh sumbur pada tanah yang lembab di pinggir selokam, atau di sisi jalan. Batangnya bersegi dengan daun saling berhadapan dan memiliki tangkal daun yang pendek.ingginya bisa mencapai 15-50 cm, panjang daun 2-5 cm dan jumlah bunga majemuk 2-5. Rumput mutiara mempunyai khasiat yang sama seperti Hedyotis diffusa Wild.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Beberapa khasiatnya yaitu untuk mengatasi radang usus buntu, tonsilis, hepatitis, bronchitis, radang panggul, infeksi saluran kemih, pneumonia dan kanker payudara.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=vNZOK-eKlzY");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Putri Malu":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Tanaman putri malu banyak tumbuh liar di pinggir jalan dan tanah lapang. Daunnya akan menutup jika disentuh. Batangnya bulat, berduri dan berbulu. Putri malu memiliki bunga yang berbentuk bulat seperti bola, warnanya merah muda dan bertangkai. Daun dan akar tanaman putri malu, baik yang segar atau yang dikeringkan bisa digunakan sebagai obat tradisional.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Khasiat dari putri malu diantaranya untuk mengobati rheumatic, susah tidur, cacingan, radang saluran nafas, herpes, dan panas tinggi pada anak-anak.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=CcXtaOj5xFo");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Petai Cina":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Petai cina disebut juga lamtoro (Jawa) atau peuteuy (Sunda). Tanaman ini banyak ditanam oleh para petani di pedesaan sebagai tanaman pagar. Batang pohonnya keras tapi tidak berukuran begitu besar.Buahnya mirip dengan buah petai tapi berukuran lebih kecil dan berpenampang lebih tipis. Petai Cina bisa dikembangbiakan dengan penyebaran biji atau dengan cara stek batang.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Petai cina bisa digunakan untuk mengobati diabetes mellitus, kasura, cacingan, bengkak, gairah seks dan luka baru.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=fflrIdWNJFk");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Pare":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Pare termasuk tanaman merambat yang banyak hidup di daerah tropis. Tanaman ini banyak dibudidayakan atau ditanam di pekarangan rumah dengan dirambatkan di pagar.Tanaman pare terkenal dengan rasa pahitnya. Daun dan buah pare yang masih muda bisa dimakan sebagai lalab mentah atau di kukus dan ditumis sebagai sayuran.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Buah, biji, bunga, daun dan akar dari tanaman pare bisa digunakan sebagai obat. Penyakit yang bisa diobati diantaranya batuk radang tenggorokan, cacinga, sakit mata merah, sembelit, demam, sakit lever, malaria, abses, menambah nafsu makan, bisul, sariawan, kencing manis dan rematik.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=Iy-SKx9hLlE");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Pandan Wangi":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Pandan wangi tumbuh di daerah tropis di tempat yang agak lembab dari daerah pantai sampai daerah dengan ketinggian 500 meter di atas permukaan laut. Tingginya mencapai 1-2 meter, panjang daun 40-80 cm dan lebar daun 3-5 cm.Daun pandan wangi baunya harum, biasa digunakan sebagai bahan rempah-rempah, bahan baku pembuatan minyak wangi dan penyedap rasa pada masakan.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Daun pandan wangi mengandung senyawa alkaloida, polifenol, saponin, tannin, flavonoida dan zat warna. Daun pandan berkhasiat untuk mengatasi ketombe, lemah saraf, rambut rontok, tidak nafsu makan, menghitamkan rambut, rematik, pegal linu, dan sakit disertai gelisah.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=JLr4vLOaTzA");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Pala":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Tanaman pala tingginya lebih kurang mencapai 10 meter. Tanaman ini memiliki batang tegak, berkayu dan berwarna putih kotor. Daunnya berbentuk lonjong dengan pangkalnya meruncing dan berwarna hijau mengkilat.Bunga jantan berwarna kuning dan berbentuk bola. Bijinya kecil berbentuk bulat telur, selubung biji berwarna merah dan bijinya berwarna hitam kecoklatan.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Selubung biji buah, biji dan kulit buah dari tanaman pala memiliki khasiat untu mengobati disentri, rematik, maag, perut kembung, mencret, mual, sulit tidur pada anak-anak dan menghentikan muntah.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=sBwuhwGhlxQ");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Mengkudu":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Tanaman mengkudu merupakan tanaman asli Indonesia dari jenis kopi-kopian. Mengkudu bisa tumbuh di dataran rendah sampai dengan ketinggian 1.500 meter di atas permukaan laut.Batang mengkudu tidak begitu besar tapi tingginya bisa mencapai 3-8 meter. Daunnya berwarna hijau dengan panjang 20-40 cm dan lebar 7-15 cm.Buahnya berbentuk lonjong berwarna hijau mengkilap. Mengkudu banyak dipelihara di perkebunan dan pekarangan rumah.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Mengkudu mempunyai khasiat untuk mengobati hipertensi, menghilangkan sisik pada kaki, sakit kuning, sakit perut, demam, batuk dan influenza.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=PPBHGgXoIeA");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Lidah Buaya":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Lidah buaya banyak tumbuh di kawasan Afrika bagian utara dan Hindia Barat. Lidah buaya banyak ditanam didalam pot di pekarangan rumah sebagai tanaman hias.Daun lidah buaya berbentuk taji yang tebal dan agak runcing. Panjangnya sekitar 15-36 cm dengan lebar 2-6 cm. Batang dari lidah buaya tidak terlihat karena tertutup oleh daun yang rapat dan sebagian terbenam di dalam tanah.Tanaman lidah buaya tahan terhadap panas dan bisa ditanam di tempat yang berhawa panas karena di dalam daunnya tersimpan banyak cadangan air.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Lidah buaya mengandung senyawa kimia yaitu aloin, aloesin, barbaloin, aloenin, isobarbaloin dan aloe-emodin. Daun, bunga dan akar lidah buaya yang segar bisa digunakan untuk penyubur rambut, sakit kepala atau pusing, peluruh haid, sembelit, kencing manis, kejang pada anak dan muntah darah.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=h-ypuHpHFW4");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Lengkuas":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Lengkuas bisa ditanam di daerah dengan ketinggian 1-1.200 meter di atas permukaan laut. Orang Sunda biasa menyebutnya dengan nama laja.Kita mengenal 2 jenis lengkuas, yaitu lengkuas merah dan lengkuas putih. Lengkuas putih biasa digunakan sebagai penyedap masakan, lengkuas merah bisa digunakan sebagai obat-obatan tradisional.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Lengkuas berkhasiat untuk mengobati reumatik, panu, sakit limpa, morbili, membangkitkan gairah seks, bronchitis dan menambah nafsu makan.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=KVXpN_MS5w0");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Lada":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Lada merupakan tanaman herba tahunan yang tubuh memanjat. Batangnya berwarna hijau kotor, berbentuk bulat, beruas dan memiliki akar pelekat.Daunnya tunggal, berbentuk bulat telur dengan ujung meruncing. Panjang daun 5-8 cm dengan lebar 2-5 cm. Lada mengandung senyawa minyak atsiri, minyak lemak, pinena, zat pahit, kariofilena, piperidina, limonene, kavisina, filandrena, piperina dan alkaloid.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Buah lada berguna untuk mengobati disentri, sakit kepala, kolera, selesma, kaki bengkak pada wanita hamil, rematik dan nyeri haid.Daun lada bisa digunakan untuk mengobati penyakit batu ginjal. Lada dalam obat tradisional dibedakan menjadi dua, ada lada hitam (tidak dikupas) dan lada putih (buah sudah masak dikupas.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=hg7BG5ukIQU");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Kunyit":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Kunyit merupakan tanaman rempah dan obat asli wilayah Asia, khususnya Asia Tenggara. Tanaman kunyit kemudian menyebar ke daerah Malaysia, Indonesia, Australia dan Afrika.Hampir setiap orang Indonesia pasti pernah mengkonsumsi kunyit, baik itu sebagai bumbu masakan, jamu maupun untuk keperluan kesehatan dan kecantikan.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Tanaman kunyit mengandung senyawa kurkuminoid yang memiliki khasiat sebagai obat. Kunyit berkhasiat untuk mengobati penyakit diabetes mellitus, morbili, tifus, berak lender, usus buntu, amandel, disentri, memperlancar ASI, sakit keputihan, perut mulas saat haid, dan membantu melancarkan haid.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=KVXpN_MS5w0");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Kumis Kucing":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Tanaman kumis kucing bisa tumbuh di daerah dengan ketinggian 500-900 meter di atas permukaan laut. Tanaman ini tumbuh tegak ke atas dengan tinggi mencapai 1-2 meter.Batangnya berbentuk segi empat agak beralur dan berbulu pendek. Daunnya tunggal berbentuk telur lonjong atau belah ketupat, bergerigi di bagian tepinya dan terdapat bintik-bintik di kedua permukaannya. Bunganya keluar di ujung cabang, berwarna ungu pucat atau putih.");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Seluruh bagian kumis kucing bisa dimanfaatkan sebagai obat setelah di anginkan dan dijemur di panas matahari. Khasiatnya antara lain untuk menghilangkan panas dan lembab, infeksi ginjal, peluruh air seni, infeksi kandung kemih, encok dan sakit kencing batu.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=NbcKGiKmwhQ");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
            case "Tanaman Kencur":
                getdesc.setText("Deskripsi Tanaman");
                getdesc.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getnama.setText("Kencur termasuk kelompok tanaman jenis empon-empon yang tumbuh subur di daerah dataran rendah. Kencur memiliki daging buah yang lunak, berwarna putih dan tidak berserat.Kulit luar kencur berwarna coklat. Setiap kencur memiliki helaian daun yang tidak lebih dari 2-3 lembar dan saling berhadapan. Kencur bisa ditanam di dalam pot atau di kebun yang mendapat sinar matahari cukup.Rimpang kencur mengandung mineral (13,73 %), pati (4,14 %) dan minyak atsiri (0,02 %).");
                getnama.setTextSize(TypedValue.COMPLEX_UNIT_PX,50);
                getpembuatan.setText("Manfaat Tanaman:");
                getpembuatan.setTextSize(TypedValue.COMPLEX_UNIT_PX,72);
                getlangkah.setText("Kencur berkhasiat untuk mengobati radang lambung, menghilangkan lelah, radang anak telinga, memperlancar haid, menghilangkan darah kotor, masuk angin, influenza pada bayi, sakit kepala, mata pegal, batu dan keseleo.");
                getlangkah2.setText("Klik link berikut untuk dokumentasi pengolahan tanaman ini :");
                getlangkah3.setText("https://www.youtube.com/watch?v=eifBW0E8z88");
                getlangkah3.setMovementMethod(LinkMovementMethod.getInstance());
                Linkify.addLinks(getlangkah3, Linkify.WEB_URLS);
                break;
        }
    }
}