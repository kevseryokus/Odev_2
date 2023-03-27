package com.example.odev_2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Soru1(10.2)
        Soru2(10, 20)
        Soru3(10)
        Soru4("araba")
        Soru5(4)
        Soru6(30)
        Soru7(50)
    }

    fun Soru1(C: Double) {
        // F = C x 1.8 + 32
        var myFahrenhiet = ((C * 1.8) + 32)
        println("myFahrenhiet : $myFahrenhiet")
    }

    fun Soru2(kisaKenar: Int, uzunKenar: Int) {
        var cevre = kisaKenar * 2 + uzunKenar * 2
        println("Çevre : $cevre")
    }

    fun Soru3(faktoriyel: Int) {
        var sonuc: Long = 1
        for (i in 1..faktoriyel) {
            sonuc = i.toLong()
        }
        println("Faktoriyel : $sonuc")
    }

    fun Soru4(kelime: String) {
        var sayac = 0
        for (i in 0 until kelime.length) {
            if (kelime[i] == 'a') {
                sayac++
            }
        }
        println("Girdiginiz kelimede $sayac tane 'a' vardır")
    }

    fun Soru5(kenarSayisi: Int) {
        var sonuc = ((kenarSayisi - 2) * 180)
        println("İç Açılar Toplamı : $sonuc")
    }

    fun Soru6(günSayisi: Int) {
        if (günSayisi <= 30) {
            if (günSayisi <= 20) {
                var maas = günSayisi * 8 * 10
                println(maas)
            } else {
                var mesaiGun = günSayisi - 20
                var mesailiMaas = (1600 + (mesaiGun * 8 * 20))
                println(mesailiMaas)
            }
        } else {

            var fark = günSayisi - 30
            var yeniMaas = fark * 8 * 10
            var yirmiGunMaas = 20 * 8 * 10
            var mesaiGun = 10 * 8 * 20
            println(yeniMaas + yirmiGunMaas + mesaiGun)
        }

    }

    fun Soru7(kotaMiktari: Int) {
        if (kotaMiktari <= 50) {
            var kotaOdemesi = kotaMiktari * 2
            println(kotaOdemesi)
        } else {
            var kotaAsimi = kotaMiktari - 50
            var asimOdemesi = (100 + (kotaAsimi * 4))
            println(asimOdemesi)
        }
    }

}