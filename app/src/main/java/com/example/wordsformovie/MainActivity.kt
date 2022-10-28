package com.example.wordsformovie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    companion object{
        val INTENT_PARCELABLE = "OOBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieList = listOf<Movies>(
            Movies(
                R.drawable.thor,
                "THOR: Love And Thunder",
                "Thor: Love and Thunder menceritakan Thor dalam sebuah perjalanan yang belum pernah ia jalani – pencariankedamaian batin. Namun, masa pensiunnya terganggu oleh seorang pembunuh galaksi yang dikenal sebagai Gorr sang Dewa Jagal , yang ingin memusnahkan para dewa."
            ),
            Movies(
                R.drawable.hitnrun,
                "Hit And Run",
                "Tegar Saputra, seorang polisi selebriti yang kemana-mana selalu diikuti kamera karena memiliki acara reality shownya sendiri. Tegar ditugaskan untuk menangkap Coki (Yayan Ruhian), seorang gembong narkoba yang baru kabur dari penjara. Sayangnya, di misi kali ini Tegar yang individualis harus dipasangkan dengan Lio, seorang tukang tipu. Tegar yang terbiasa beraksi sendirian kini harus berusaha menyelesaikan misinya bersama Lio yang justru membuat susah. Aksi Tegar dan Lio mencari Coki ditemanin Meisa seorang penyanyi dan Jefri."
            ),
            Movies(
                R.drawable.jalangkung,
                "Jalangkung",
                "Jailangkung: Sandekala mengisahkan perjalanan liburan keluarga kecil Adrian (Dwi Sasono) dan Sandra (Titi Kamal) ke luar kota. Yang tidak mereka ketahui, liburan mereka ternyata berubah menjadi petaka."
            ),
            Movies(
                R.drawable.smallfoot,
                "Small Foot",
                "Di sebuah gunung es hidup sekelompok hewan besar dan berbulu putih yang disebut Yeti. Salah satu Yeti bernama Migo (Channing Tatum) yang secara tidak sengaja bertemu mahluk Smallfoot sebutan untuk manusia dalam bahasa Yeti. Bagi kaum Yeti manusia merupakan mahluk aneh berkaki kecil dengan gigi yang putih."
            ),
            Movies(
                R.drawable.upinipin,
                "Upin Dan Ipin",
                "Upin & Ipin: Keris Siamang Tunggal adalah film petualangan dan fantasi terbaru dari Upin & Ipin dan keenam sahabatnya: Ehsan, Fizi, Mail, Jarjit, Mei Mei, dan Susanti dalam menyelamatkan kerajaan fantasi Inderaloka dari ancaman musuhnya, Raja Bersiong yang jahat. Cerita bermula saat Upin, Ipin, dan para sahabatnya tak sengaja menemukan keris mistis di gudang Tok Dalang yang ternyata membuka portal menuju kerajaan Inderaloka."
            ),
            Movies(
                R.drawable.tekatekitika,
                "Teka Teki Tika",
                "Budiman dan Sherly tengah merayakan ulang tahun pernikahan di rumah megah mereka. Arnold, Laura, Andre, dan Jane datang untuk merayakan sembari berakhir pekan. Mereka tengah berbahagia juga karena Budiman akan mendapatkan proyek besar dari pemerintah."
            ),
            Movies(
                R.drawable.venom2,
                "Venom 2",
                "Venom kembali beraksi ketika seorang pembunuh berantai, Cletus Kasady bertransformasi menjadi sosok jahat Carnage."
            )
        )

        val recyclerview = findViewById<RecyclerView>(R.id.rv_movies)
        recyclerview.layoutManager = LinearLayoutManager(this)
        recyclerview.setHasFixedSize(true)
        recyclerview.adapter = Movies_Adapter(this, movieList) {
            val intent = Intent (this, DetailMoviesActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}