package com.fridofirman.UAS_Frido.utils

import com.fridofirman.UAS_Frido.R
import com.fridofirman.UAS_Frido.data.source.local.entity.MovieEntity
import com.fridofirman.UAS_Frido.data.source.local.entity.TvShowEntity
import com.fridofirman.UAS_Frido.data.source.remote.response.MovieResponse
import com.fridofirman.UAS_Frido.data.source.remote.response.TvShowResponse

object DataDummy {

    fun generateDummyMovies() : List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()
        movies.add(
            MovieEntity("297802", "Aquaman (2018)" ,"Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
        "Action, Adventure, Fantasy", "2018-12-07",
            8.0, R.drawable.poster_aquaman.toString(), "movie"
        )
        )

        movies.add(
            MovieEntity("2", "Bohemian Rhapsody (2018)", "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor, dan gitaris bass John Deacon menggemparkan dunia musik saat mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan.",
        "Musik, Drama, Sejarah", "02/11/2018", 8.5,
        R.drawable.poster_bohemian.toString(), "movie")
        )

        movies.add(
            MovieEntity("3", "Cold Pursuit (2019)", "Kehidupan keluarga yang tenang dari Nels Coxman, seorang pengemudi bajak salju, berubah setelah pembunuhan putranya. Nels memulai perburuan dendam untuk Viking, raja obat bius yang dianggapnya bertanggung jawab atas pembunuhan tersebut, melenyapkan rekan-rekan Viking satu per satu. Saat Nels semakin dekat dengan Viking, tindakannya membawa konsekuensi yang lebih tidak terduga dan kejam, karena ia membuktikan bahwa balas dendam ada dalam eksekusi.",
        "Aksi, Kejahatan, Cerita Seru", "08/02/2019", 8.5, R.drawable.poster_cold_persuit.toString(), "movie")
        )

        movies.add(
            MovieEntity("4", "Creed II (2018)", "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang terkait dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
        "Drama", "21/11/2018", 8.1,
        R.drawable.poster_creed.toString(), "movie")
        )

        movies.add(
            MovieEntity("5", "Glass (2019)", "Dalam serangkaian pertemuan yang meningkat, mantan penjaga keamanan David Dunn menggunakan kemampuan supernaturalnya untuk melacak Kevin Wendell Crumb, seorang pria yang memiliki dua puluh empat kepribadian yang terganggu. Sementara itu, kehadiran bayangan Elijah Price muncul sebagai seorang orkestra yang menyimpan rahasia penting bagi keduanya.",
        "Cerita Seru, Drama, Cerita Fiksi", "18/01/2019", 8.2,
        R.drawable.poster_glass.toString(), "movie")
        )

        movies.add(
            MovieEntity("6", "How to Train Your Dragon: The Hidden World (2019)", "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
        "Animasi, Keluarga, Petualangan", "22/02/2019", 8.3,
        R.drawable.poster_how_to_train.toString(), "movie")
        )

        movies.add(
            MovieEntity("7", "Avengers: Infinity War (2018)", "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
                "Petualangan, Aksi, Cerita Fiksi","27/04/2018", 8.2,
            R.drawable.poster_infinity_war.toString(), "movie")
        )

        movies.add(
            MovieEntity("8", "Master Z: Ip Man Legacy (2018)", "Menyusul kekalahannya dari Tuan Ip, Cheung Tin Chi mencoba hidup bersama putranya yang masih kecil di Hong Kong, menunggu meja di bar yang melayani ekspatriat. Tapi itu tidak lama sebelum campuran orang asing, uang, dan pemimpin tiga serangkai menariknya sekali lagi ke pertarungan.",
        "Aksi", "26/12/2018", 8.2,
        R.drawable.poster_master_z.toString(), "movie")
        )

        movies.add(
            MovieEntity("9", "Wreck-It Ralph (2012)", "Wreck-It Ralph adalah penjahat setinggi 9 kaki dan seberat 643 pon dari video game arcade bernama Fix-It Felix Jr., di mana pahlawan tituler game tersebut memperbaiki bangunan yang dihancurkan Ralph. Ingin membuktikan bahwa dia bisa menjadi orang baik dan bukan hanya penjahat, Ralph lolos dari permainannya dan mendarat di Hero's Duty, penembak orang pertama di mana dia membantu pertempuran pahlawan game melawan penjajah alien. Dia kemudian memasuki Sugar Rush, permainan balap kart yang dibuat di trek yang terbuat dari permen, kue, dan makanan manis lainnya. Di sana, Ralph bertemu Vanellope von Schweetz yang mengetahui bahwa gimnya dihadapkan pada ancaman mengerikan yang dapat memengaruhi seluruh arcade, dan yang mungkin secara tidak sengaja dimulai oleh Ralph.",
        "Keluarga, Animasi, Petualangan", "02/11/2012", 8.1,
        R.drawable.poster_ralph.toString(), "movie")
        )

        movies.add(
            MovieEntity("10", "Spider-Man: Into the Spider-Verse (2018)", "Miles Morales menyulap hidupnya antara menjadi siswa sekolah menengah dan menjadi manusia laba-laba. Ketika Wilson \"Kingpin\" Fisk menggunakan super collider, yang lain dari seberang Spider-Verse dipindahkan ke dimensi ini.",
        "Aksi, Petualangan, Animasi", "14/12/2018", 8.1,
        R.drawable.poster_spiderman.toString(), "movie")
        )
        return movies
    }

    fun generateDummyDetailMovie() : MovieEntity {
        return MovieEntity("297802", "Aquaman (2018)", "Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
                        "Action, Adventure, Fantasy", "2018-12-07",
                        8.0, R.drawable.poster_aquaman.toString(), "movie", false
                )
    }

    fun generateDummyDetailTvShow() : TvShowEntity {
        return TvShowEntity("297802", "Aquaman (2018)", "Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
                "Action, Adventure, Fantasy", "2018-12-07",
                8.0, R.drawable.poster_aquaman.toString(), "movie"
        )
    }

    fun generateDummyTvShow() : List<TvShowEntity> {
        val movies = ArrayList<TvShowEntity>()
        movies.add(
            TvShowEntity("297802", "Aquaman (2018)" ,"Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
                "Aksi, Petualangan, Fantasi", "21/12/2018",
                8.0, R.drawable.poster_aquaman.toString(), "tv_show"
            )
        )

        movies.add(
            TvShowEntity("2", "Bohemian Rhapsody (2018)", "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor, dan gitaris bass John Deacon menggemparkan dunia musik saat mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan.",
            "Musik, Drama, Sejarah", "02/11/2018", 8.5,
            R.drawable.poster_bohemian.toString(), "tv_show")
        )

        movies.add(
            TvShowEntity("3", "Cold Pursuit (2019)", "Kehidupan keluarga yang tenang dari Nels Coxman, seorang pengemudi bajak salju, berubah setelah pembunuhan putranya. Nels memulai perburuan dendam untuk Viking, raja obat bius yang dianggapnya bertanggung jawab atas pembunuhan tersebut, melenyapkan rekan-rekan Viking satu per satu. Saat Nels semakin dekat dengan Viking, tindakannya membawa konsekuensi yang lebih tidak terduga dan kejam, karena ia membuktikan bahwa balas dendam ada dalam eksekusi.",
            "Aksi, Kejahatan, Cerita Seru", "08/02/2019", 8.5, R.drawable.poster_cold_persuit.toString(), "tv_show")
        )

        movies.add(
            TvShowEntity("4", "Creed II (2018)", "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang terkait dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
            "Drama", "21/11/2018", 8.1,
            R.drawable.poster_creed.toString(), "tv_show")
        )

        movies.add(
            TvShowEntity("5", "Glass (2019)", "Dalam serangkaian pertemuan yang meningkat, mantan penjaga keamanan David Dunn menggunakan kemampuan supernaturalnya untuk melacak Kevin Wendell Crumb, seorang pria yang memiliki dua puluh empat kepribadian yang terganggu. Sementara itu, kehadiran bayangan Elijah Price muncul sebagai seorang orkestra yang menyimpan rahasia penting bagi keduanya.",
            "Cerita Seru, Drama, Cerita Fiksi", "18/01/2019", 8.2,
            R.drawable.poster_glass.toString(), "tv_show")
        )

        movies.add(
            TvShowEntity("6", "How to Train Your Dragon: The Hidden World (2019)", "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
            "Animasi, Keluarga, Petualangan", "22/02/2019", 8.3,
            R.drawable.poster_how_to_train.toString(), "tv_show")
        )

        movies.add(
            TvShowEntity("7", "Avengers: Infinity War (2018)", "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
            "Petualangan, Aksi, Cerita Fiksi","27/04/2018", 8.2,
            R.drawable.poster_infinity_war.toString(), "tv_show")
        )

        movies.add(
            TvShowEntity("8", "Master Z: Ip Man Legacy (2018)", "Menyusul kekalahannya dari Tuan Ip, Cheung Tin Chi mencoba hidup bersama putranya yang masih kecil di Hong Kong, menunggu meja di bar yang melayani ekspatriat. Tapi itu tidak lama sebelum campuran orang asing, uang, dan pemimpin tiga serangkai menariknya sekali lagi ke pertarungan.",
            "Aksi", "26/12/2018", 8.2,
            R.drawable.poster_master_z.toString(), "tv_show")
        )

        movies.add(
            TvShowEntity("9", "Wreck-It Ralph (2012)", "Wreck-It Ralph adalah penjahat setinggi 9 kaki dan seberat 643 pon dari video game arcade bernama Fix-It Felix Jr., di mana pahlawan tituler game tersebut memperbaiki bangunan yang dihancurkan Ralph. Ingin membuktikan bahwa dia bisa menjadi orang baik dan bukan hanya penjahat, Ralph lolos dari permainannya dan mendarat di Hero's Duty, penembak orang pertama di mana dia membantu pertempuran pahlawan game melawan penjajah alien. Dia kemudian memasuki Sugar Rush, permainan balap kart yang dibuat di trek yang terbuat dari permen, kue, dan makanan manis lainnya. Di sana, Ralph bertemu Vanellope von Schweetz yang mengetahui bahwa gimnya dihadapkan pada ancaman mengerikan yang dapat memengaruhi seluruh arcade, dan yang mungkin secara tidak sengaja dimulai oleh Ralph.",
            "Keluarga, Animasi, Petualangan", "02/11/2012", 8.1,
            R.drawable.poster_ralph.toString(), "tv_show")
        )

        movies.add(
            TvShowEntity("10", "Spider-Man: Into the Spider-Verse (2018)", "Miles Morales menyulap hidupnya antara menjadi siswa sekolah menengah dan menjadi manusia laba-laba. Ketika Wilson \"Kingpin\" Fisk menggunakan super collider, yang lain dari seberang Spider-Verse dipindahkan ke dimensi ini.",
            "Aksi, Petualangan, Animasi", "14/12/2018", 8.1,
            R.drawable.poster_spiderman.toString(), "tv_show")
        )
        return movies
    }

    fun generateRemoteDummyMovies() : List<MovieResponse> {
        val movies = ArrayList<MovieResponse>()
        movies.add(
            MovieResponse("297802", "Aquaman (2018)" ,"Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
                "Aksi, Petualangan, Fantasi", "21/12/2018",
                8.0, R.drawable.poster_aquaman.toString(), "movie"
            )
        )

        movies.add(
            MovieResponse("2", "Bohemian Rhapsody (2018)", "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor, dan gitaris bass John Deacon menggemparkan dunia musik saat mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan.",
            "Musik, Drama, Sejarah", "02/11/2018", 8.5,
            R.drawable.poster_bohemian.toString(), "movie")
        )

        movies.add(
            MovieResponse("3", "Cold Pursuit (2019)", "Kehidupan keluarga yang tenang dari Nels Coxman, seorang pengemudi bajak salju, berubah setelah pembunuhan putranya. Nels memulai perburuan dendam untuk Viking, raja obat bius yang dianggapnya bertanggung jawab atas pembunuhan tersebut, melenyapkan rekan-rekan Viking satu per satu. Saat Nels semakin dekat dengan Viking, tindakannya membawa konsekuensi yang lebih tidak terduga dan kejam, karena ia membuktikan bahwa balas dendam ada dalam eksekusi.",
            "Aksi, Kejahatan, Cerita Seru", "08/02/2019", 8.5, R.drawable.poster_cold_persuit.toString(), "movie")
        )

        movies.add(
            MovieResponse("4", "Creed II (2018)", "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang terkait dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
            "Drama", "21/11/2018", 8.1,
            R.drawable.poster_creed.toString(), "movie")
        )

        movies.add(
            MovieResponse("5", "Glass (2019)", "Dalam serangkaian pertemuan yang meningkat, mantan penjaga keamanan David Dunn menggunakan kemampuan supernaturalnya untuk melacak Kevin Wendell Crumb, seorang pria yang memiliki dua puluh empat kepribadian yang terganggu. Sementara itu, kehadiran bayangan Elijah Price muncul sebagai seorang orkestra yang menyimpan rahasia penting bagi keduanya.",
            "Cerita Seru, Drama, Cerita Fiksi", "18/01/2019", 8.2,
            R.drawable.poster_glass.toString(), "movie")
        )

        movies.add(
            MovieResponse("6", "How to Train Your Dragon: The Hidden World (2019)", "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
            "Animasi, Keluarga, Petualangan", "22/02/2019", 8.3,
            R.drawable.poster_how_to_train.toString(), "movie")
        )

        movies.add(
            MovieResponse("7", "Avengers: Infinity War (2018)", "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
            "Petualangan, Aksi, Cerita Fiksi","27/04/2018", 8.2,
            R.drawable.poster_infinity_war.toString(), "movie")
        )

        movies.add(
            MovieResponse("8", "Master Z: Ip Man Legacy (2018)", "Menyusul kekalahannya dari Tuan Ip, Cheung Tin Chi mencoba hidup bersama putranya yang masih kecil di Hong Kong, menunggu meja di bar yang melayani ekspatriat. Tapi itu tidak lama sebelum campuran orang asing, uang, dan pemimpin tiga serangkai menariknya sekali lagi ke pertarungan.",
            "Aksi", "26/12/2018", 8.2,
            R.drawable.poster_master_z.toString(), "movie")
        )

        movies.add(
            MovieResponse("9", "Wreck-It Ralph (2012)", "Wreck-It Ralph adalah penjahat setinggi 9 kaki dan seberat 643 pon dari video game arcade bernama Fix-It Felix Jr., di mana pahlawan tituler game tersebut memperbaiki bangunan yang dihancurkan Ralph. Ingin membuktikan bahwa dia bisa menjadi orang baik dan bukan hanya penjahat, Ralph lolos dari permainannya dan mendarat di Hero's Duty, penembak orang pertama di mana dia membantu pertempuran pahlawan game melawan penjajah alien. Dia kemudian memasuki Sugar Rush, permainan balap kart yang dibuat di trek yang terbuat dari permen, kue, dan makanan manis lainnya. Di sana, Ralph bertemu Vanellope von Schweetz yang mengetahui bahwa gimnya dihadapkan pada ancaman mengerikan yang dapat memengaruhi seluruh arcade, dan yang mungkin secara tidak sengaja dimulai oleh Ralph.",
            "Keluarga, Animasi, Petualangan", "02/11/2012", 8.1,
            R.drawable.poster_ralph.toString(), "movie")
        )

        movies.add(
            MovieResponse("10", "Spider-Man: Into the Spider-Verse (2018)", "Miles Morales menyulap hidupnya antara menjadi siswa sekolah menengah dan menjadi manusia laba-laba. Ketika Wilson \"Kingpin\" Fisk menggunakan super collider, yang lain dari seberang Spider-Verse dipindahkan ke dimensi ini.",
            "Aksi, Petualangan, Animasi", "14/12/2018", 8.1,
            R.drawable.poster_spiderman.toString(), "movie")
        )
        return movies
    }

    fun generateRemoteDummyTvShow() : List<TvShowResponse> {
        val movies = ArrayList<TvShowResponse>()
        movies.add(
            TvShowResponse("297802", "Aquaman (2018)" ,"Dulunya rumah bagi peradaban paling maju di Bumi, Atlantis sekarang menjadi kerajaan bawah air yang diperintah oleh Raja Orm yang haus kekuasaan. Dengan pasukan besar yang dimilikinya, Orm berencana untuk menaklukkan orang-orang samudra yang tersisa dan kemudian dunia permukaan. Yang menghalangi jalannya adalah Arthur Curry, saudara setengah manusia Orm, saudara setengah Atlantis dan pewaris sejati takhta.",
                "Aksi, Petualangan, Fantasi", "21/12/2018",
                8.0, R.drawable.poster_aquaman.toString(), "tv_show"
            )
        )

        movies.add(
            TvShowResponse("2", "Bohemian Rhapsody (2018)", "Penyanyi Freddie Mercury, gitaris Brian May, drummer Roger Taylor, dan gitaris bass John Deacon menggemparkan dunia musik saat mereka membentuk band rock 'n' roll Queen pada tahun 1970. Lagu-lagu hit menjadi klasik instan. Ketika gaya hidup Mercury yang semakin liar mulai lepas kendali, Queen segera menghadapi tantangan terbesarnya - menemukan cara untuk menjaga band tetap bersama di tengah kesuksesan dan kelebihan.",
            "Musik, Drama, Sejarah", "02/11/2018", 8.5,
            R.drawable.poster_bohemian.toString(), "tv_show")
        )

        movies.add(
            TvShowResponse("3", "Cold Pursuit (2019)", "Kehidupan keluarga yang tenang dari Nels Coxman, seorang pengemudi bajak salju, berubah setelah pembunuhan putranya. Nels memulai perburuan dendam untuk Viking, raja obat bius yang dianggapnya bertanggung jawab atas pembunuhan tersebut, melenyapkan rekan-rekan Viking satu per satu. Saat Nels semakin dekat dengan Viking, tindakannya membawa konsekuensi yang lebih tidak terduga dan kejam, karena ia membuktikan bahwa balas dendam ada dalam eksekusi.",
            "Aksi, Kejahatan, Cerita Seru", "08/02/2019", 8.5, R.drawable.poster_cold_persuit.toString(), "tv_show")
        )

        movies.add(
            TvShowResponse("4", "Creed II (2018)", "Antara kewajiban pribadi dan pelatihan untuk pertarungan besar berikutnya melawan lawan yang terkait dengan masa lalu keluarganya, Adonis Creed menghadapi tantangan dalam hidupnya.",
            "Drama", "21/11/2018", 8.1,
            R.drawable.poster_creed.toString(), "tv_show")
        )

        movies.add(
            TvShowResponse("5", "Glass (2019)", "Dalam serangkaian pertemuan yang meningkat, mantan penjaga keamanan David Dunn menggunakan kemampuan supernaturalnya untuk melacak Kevin Wendell Crumb, seorang pria yang memiliki dua puluh empat kepribadian yang terganggu. Sementara itu, kehadiran bayangan Elijah Price muncul sebagai seorang orkestra yang menyimpan rahasia penting bagi keduanya.",
            "Cerita Seru, Drama, Cerita Fiksi", "18/01/2019", 8.2,
            R.drawable.poster_glass.toString(), "tv_show")
        )

        movies.add(
            TvShowResponse("6", "How to Train Your Dragon: The Hidden World (2019)", "Ketika Hiccup memenuhi mimpinya untuk menciptakan utopia naga yang damai, penemuan Toothless 'dari pasangan yang tak teruji dan sukar ditangkap membuat Night Fury menjauh. Ketika bahaya meningkat di rumah dan pemerintahan Hiccup sebagai kepala desa diuji, baik naga dan pengendara harus membuat keputusan yang mustahil untuk menyelamatkan jenis mereka.",
            "Animasi, Keluarga, Petualangan", "22/02/2019", 8.3,
            R.drawable.poster_how_to_train.toString(), "tv_show")
        )

        movies.add(
            TvShowResponse("7", "Avengers: Infinity War (2018)", "Karena Avengers dan sekutunya terus melindungi dunia dari ancaman yang terlalu besar untuk ditangani oleh seorang pahlawan, bahaya baru telah muncul dari bayangan kosmik: Thanos. Seorang lalim penghujatan intergalaksi, tujuannya adalah untuk mengumpulkan semua enam Batu Infinity, artefak kekuatan yang tak terbayangkan, dan menggunakannya untuk menimbulkan kehendak memutar pada semua realitas. Segala sesuatu yang telah diperjuangkan oleh Avengers telah berkembang hingga saat ini - nasib Bumi dan keberadaannya sendiri tidak pernah lebih pasti.",
            "Petualangan, Aksi, Cerita Fiksi","27/04/2018", 8.2,
            R.drawable.poster_infinity_war.toString(), "tv_show")
        )

        movies.add(
            TvShowResponse("8", "Master Z: Ip Man Legacy (2018)", "Menyusul kekalahannya dari Tuan Ip, Cheung Tin Chi mencoba hidup bersama putranya yang masih kecil di Hong Kong, menunggu meja di bar yang melayani ekspatriat. Tapi itu tidak lama sebelum campuran orang asing, uang, dan pemimpin tiga serangkai menariknya sekali lagi ke pertarungan.",
            "Aksi", "26/12/2018", 8.2,
            R.drawable.poster_master_z.toString(), "tv_show")
        )

        movies.add(
            TvShowResponse("9", "Wreck-It Ralph (2012)", "Wreck-It Ralph adalah penjahat setinggi 9 kaki dan seberat 643 pon dari video game arcade bernama Fix-It Felix Jr., di mana pahlawan tituler game tersebut memperbaiki bangunan yang dihancurkan Ralph. Ingin membuktikan bahwa dia bisa menjadi orang baik dan bukan hanya penjahat, Ralph lolos dari permainannya dan mendarat di Hero's Duty, penembak orang pertama di mana dia membantu pertempuran pahlawan game melawan penjajah alien. Dia kemudian memasuki Sugar Rush, permainan balap kart yang dibuat di trek yang terbuat dari permen, kue, dan makanan manis lainnya. Di sana, Ralph bertemu Vanellope von Schweetz yang mengetahui bahwa gimnya dihadapkan pada ancaman mengerikan yang dapat memengaruhi seluruh arcade, dan yang mungkin secara tidak sengaja dimulai oleh Ralph.",
            "Keluarga, Animasi, Petualangan", "02/11/2012", 8.1,
            R.drawable.poster_ralph.toString(), "tv_show")
        )

        movies.add(
            TvShowResponse("10", "Spider-Man: Into the Spider-Verse (2018)", "Miles Morales menyulap hidupnya antara menjadi siswa sekolah menengah dan menjadi manusia laba-laba. Ketika Wilson \"Kingpin\" Fisk menggunakan super collider, yang lain dari seberang Spider-Verse dipindahkan ke dimensi ini.",
            "Aksi, Petualangan, Animasi", "14/12/2018", 8.1,
            R.drawable.poster_spiderman.toString(), "tv_show")
        )
        return movies
    }

}