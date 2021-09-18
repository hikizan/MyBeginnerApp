package com.hikizan.mybeginnersubmission.model

import com.hikizan.mybeginnersubmission.R

object FoodsData {
    private val foodNames = arrayOf(
            "Burgo",
            "Celimpungan",
            "Gulo Puan",
            "Laksan",
            "Lakso Palembang",
            "Martabak Palembang",
            "Mie Celor",
            "Pempek",
            "Pindang Patin",
            "Pindang Tulang",
            "Ragit",
            "Tekwan"
    )

    private val foodsIdr = arrayOf(
            "Rp6000",
            "Rp7000",
            "Rp5000",
            "Rp6500",
            "Rp7000",
            "Rp4000",
            "Rp5500",
            "Rp5000",
            "Rp7000",
            "Rp6000",
            "Rp5000",
            "Rp5000"
    )

    private val foodstocks = intArrayOf(
            12,
            10,
            10,
            13,
            10,
            8,
            11,
            10,
            10,
            12,
            10,
            10
    )

    private val foodDetails = arrayOf(
            "Burgo adalah makanan khas dari Palembang. Makanan ini dapat digolongkan sebagai makanan kecil dan bukan makanan utama. Makanan ini dapat ditemui di warung-warung khas Palembang dan biasanya disajikan bersama dengan makanan lain seperti lakso, laksan, dan celimpungan. Burgo akan terasa lebih nikmat dimakan jika dalam keadaan hangat, sehingga warung-warung biasanya menjajakan makanan ini dengan kompor untuk menghangatkannya. Bahan utama burgo adalah setengah kilogram beras, sagu, setengah kilogram ikan gabus, dan air. Selain itu, proses pembuatan burgo juga memakai bumbu-bumbu tambahan, seperti lengkuas, ketumbar, biji kemiri, kencur, temu kunci, bawang merah, bawang putih, gula pasir, daun salam, dan sedikit kapur sirih.",
            "Celimpungan berbentuk bulat dengan diameter 10 cm dan tipis (pipih) hampir seperti bakso. Kuahnya terbuat dari santan dan racikan bumbu-bumbu lainnya. Kuah Celimpungan yang terbuat dari santan memiliki warna kekuningan, namun rasanya tidak pedas.",
            "Gulo puan adalah penganan yang terbuat dari susu dan gula, yang diolah  menjadi karamel.Mengapa saya sebut sangat khas, karena bahan bakunya bukan susu sembarangan, apalagi susu produksi masal.",
            "Laksan adalah makanan khas Palembang yang terbuat dari bahan baku sagu dan ikan. Laksan dibuat dalam bentuk oval dengan rasa yang hampir pempek, tetapi disajikan dengan menggunakan kuah santan.",
            "Lakso adalah hidangan mie gurih khas Indonesia yang disajikan dalam kuah berbahan santan kelapa berwarna kekuningan yang gurih, biasanya dicampur dengan ikan, dan ditaburi bawang goreng. Hidangan ini adalah salah satu makanan khas daerah Palembang, ibukota Sumatera Selatan, Indonesia.",
            "Martabak HAR adalah makan khas Palembang yang menjadi salah satu paling favorit selain pempek.Ciri khas Martabak HAR yakni diisi dengan dua buah telur, bisa ayam atau bebek-, lalu diberi irisan daging, tanpa menggunakan daun bawang yang digunakan pada martabak biasa.",
            "Mie Celor adalah hidangan mi yang disajikan dalam campuran kuah santan dan kaldu ebi (udang kering), dicampurkan taoge dan disajikan bersama irisan telur rebus, ditaburi irisan seledri, daun bawang dan bawang goreng.",
            "Pempek atau empek-empek adalah makanan khas Palembang yang terbuat dari daging ikan yang digiling lembut dan tepung kanji (secara salah kaprah sering disebut sebagai \"tepung sagu\"), serta beberapa komposisi lain seperti telur, bawang putih yang dihaluskan, penyedap rasa dan garam. Sebenarnya sulit untuk mengatakan bahwa penganan pempek pusatnya adalah di Palembang karena hampir semua daerah di Sumatera Selatan memproduksinya.",
            "Pindang Patin merupakan makanan khas Palembang. Rasa ikan yang lunak  sangat mudah dilepaskan dari durinya saat masuk ke mulut kita. Tinggal mulut menggoyang perlahan melepaskan daging dari duri. Yummy...... banget, Selain itu metode pemasakannya yang direbus sangat sesuai untuk manusia dewasa yang harus mulai memperhatikan asupan lemak jenuh.",
            "Pindang tulang merupakan olahan daging sapi bagian iga yang dibuat kuah pedas asam. Rasa asam berasal dari asam Jawa. Bumbu lain yang dibutuhkan seperti lengkuas, serai, daun salam, tomat, kunyit, jahe, bawang putih dan merah, aram dan gula putih.",
            "Ragit adalah makanan khas Palembang, yang hanya bisa di jumpai saat bulan puasa. Makanan ini mirip roti jala dari India. Ragit ini sendiri terdapat dua jenis, yaitu Ragit Gulung yang berbentuk segitiga dan Ragit Rajut yang berbentuk seperti dadar gulung.",
            "Tekwan adalah penganan khas Palembang yang terbuat dari campuran daging ikan dan tapioka, yang dibentuk berupa bulatan kecil-kecil, dan disajikan dalam kuah udang dengan rasa yang khas. Biasanya pelengkap tekwan adalah sohun, irisan bengkoang dan jamur, serta ditaburi irisan daun bawang, seledri, dan bawang goreng."
    )

    private val foodImages = intArrayOf(
            R.drawable.burgo,
            R.drawable.celimpungan,
            R.drawable.gulo_puan,
            R.drawable.laksan,
            R.drawable.lakso_palembang,
            R.drawable.martabak_palembang,
            R.drawable.micelor,
            R.drawable.pempek,
            R.drawable.pindang_patin,
            R.drawable.pindang_tulang,
            R.drawable.ragit,
            R.drawable.tekwan
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodDetails[position]
                food.photo = foodImages[position]
                food.idr = foodsIdr[position]
                food.stock = foodstocks[position].toString()
                list.add(food)
            }
            return list
        }
}