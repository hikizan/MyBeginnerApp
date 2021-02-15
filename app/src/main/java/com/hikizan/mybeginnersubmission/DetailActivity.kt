package com.hikizan.mybeginnersubmission

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.hikizan.mybeginnersubmission.model.Food

class DetailActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_DATA = "extra_data"
    }

    private lateinit var tvIdr: TextView
    private lateinit var tvStock: TextView
    private lateinit var tvDetail: TextView
    private lateinit var imgPhoto: ImageView
    private lateinit var imgBanner: ImageView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        tvIdr = findViewById(R.id.tvIdr)
        tvStock = findViewById(R.id.tvStock)
        tvDetail = findViewById(R.id.tvItemDetail)
        imgPhoto = findViewById(R.id.imgItemPhoto)
        imgBanner = findViewById(R.id.imgItemBanner)

        val food: Food? = intent.getParcelableExtra(EXTRA_DATA)
        tvIdr.text = food?.idr
        tvStock.text = food?.stock+ " porsi tersisa"
        tvDetail.text = food?.detail

        Glide.with(this@DetailActivity)
                .load(food?.photo)
                .apply(RequestOptions().override(120, 120))
                .into(imgPhoto)

        Glide.with(this@DetailActivity)
                .load(food?.photo)
                .into(imgBanner)

        supportActionBar?.title = food?.name
    }
}