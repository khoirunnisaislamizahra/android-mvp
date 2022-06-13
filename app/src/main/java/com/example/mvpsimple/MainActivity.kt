package com.example.mvpsimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivityMvp : AppCompatActivity(), MainView{
    private lateinit var etPanjang: EditText
    private lateinit var etLebar: EditText
    private lateinit var etSisi: EditText
    private lateinit var btHitungLuas: Button
    private lateinit var btHitungKeliling: Button
    private lateinit var tvHasil: TextView
    private lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainPresenter = MainPresenter(this)
        etPanjang = findViewById(R.id.et_panjang)
        etLebar = findViewById(R.id.et_lebar)
        etSisi = findViewById(R.id.et_sisi)
        btHitungLuas = findViewById(R.id.btn_hitung_luas)
        btHitungKeliling = findViewById(R.id.btn_hitung_keliling)
        tvHasil = findViewById(R.id.tvhasil)

        btHitungLuas.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungLuasPersegiPjg(panjang, lebar)
        }

        btHitungKeliling.setOnClickListener {
            val panjang = etPanjang.text.toString().toFloat()
            val lebar = etLebar.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegiPjg(panjang, lebar)
        }

        btHitungLuas.setOnClickListener {
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungLuasPersegi(sisi)
        }

        btHitungKeliling.setOnClickListener {
            val sisi = etSisi.text.toString().toFloat()
            mainPresenter.hitungKelilingPersegi(sisi)
        }
    }

    override fun updateLuas(luas: Float) {
        tvHasil.text = luas.toString()
    }

    override fun updateKeliling(keliling: Float) {
        tvHasil.text = keliling.toString()
    }

    override fun showError(errorMsg: String) {
        tvHasil.text = errorMsg
    }
}

