package com.dicoding.volumer

import android.content.Intent
import androidx.activity.result.contract.ActivityResultContract

class TeoriIntent {
//    explicit intent -> perpindahan activity yang sudah pasti dan harus memakai nama class untuk parameternya
//    val moveIntent = Intent(this@TeoriIntent, DetailActivity::class.java)
//    startActivity(moveIntent)

//    implisit intent -> perpindahan class tetapi program tidak tau nama activity apa yang akan dibuka.
//    membuka komponen lain didalam aplikasi lain untuk membantu kinerja program. ex : gallery, my files dll
//    private val launcherIntentGallery = registerForActivityResult(
//    ActivityResultContract.StartActivityForResult()
//    ) { result -> {
//        ....
//}}
//    val intent = Intent(Intent.ACTION_GET_CONTENT)
//    intent.type = "image/*"
//    launcherIntentGallery.launch(Intent.createChooser(intent, "Choose a picture..."))
}