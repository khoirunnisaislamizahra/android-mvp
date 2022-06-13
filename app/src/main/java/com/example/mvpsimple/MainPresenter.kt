package com.example.mvpsimple

class MainPresenter(private val mainView: MainView) {
    fun hitungLuasPersegiPjg(panjang: Float, lebar: Float) {
        if (panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }

        val luas = panjang * lebar
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegiPjg(panjang: Float, lebar: Float) {
        if (panjang == 0F) {
            mainView.showError("Panjang tidak boleh 0")
            return
        }
        if (lebar == 0F) {
            mainView.showError("Lebar tidak boleh 0")
            return
        }

        val keliling = 2 * (panjang + lebar)
        mainView.updateKeliling(keliling)
    }

    fun hitungLuasPersegi(sisi: Float) {
        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }

        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }
        val luas = sisi * sisi
        mainView.updateLuas(luas)
    }

    fun hitungKelilingPersegi(sisi: Float) {
        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }

        if (sisi == 0F) {
            mainView.showError("Sisi tidak boleh 0")
            return
        }

        val Keliling = 4 * sisi
        mainView.updateLuas(Keliling)
    }
}
