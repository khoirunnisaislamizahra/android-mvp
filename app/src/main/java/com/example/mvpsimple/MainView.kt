package com.example.mvpsimple

interface MainView {
    fun updateLuas(luas: Float)
    fun updateKeliling(keliling: Float )
    fun showError(errorMsg: String)

     //klas yg hanya memberikan sebuah metod,
    //hanya dengan 1 inputan bisa menghitung luas dan keliling
}

