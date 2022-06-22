package com.example.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var ilkSayi = 0
    var ikinciSayi = 0
    var ilkSayiKontrol = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button0.setOnClickListener {
            button((binding.button0.text.toString()).toInt())
        }
        binding.button1.setOnClickListener {
            button((binding.button1.text.toString()).toInt())
        }
        binding.button2.setOnClickListener {
            button((binding.button2.text.toString()).toInt())
        }
        binding.button3.setOnClickListener {
            button((binding.button3.text.toString()).toInt())
        }
        binding.button4.setOnClickListener {
            button((binding.button4.text.toString()).toInt())
        }
        binding.button5.setOnClickListener {
            button((binding.button5.text.toString()).toInt())
        }
        binding.button6.setOnClickListener {
            button((binding.button6.text.toString()).toInt())
        }
        binding.button7.setOnClickListener {
            button((binding.button7.text.toString()).toInt())
        }
        binding.button8.setOnClickListener {
            button((binding.button8.text.toString()).toInt())
        }
        binding.button9.setOnClickListener {
            button((binding.button9.text.toString()).toInt())
        }
        binding.buttonSifirla.setOnClickListener {
            sifirla()
            binding.textView.text = "0"
        }
        binding.buttonEsittir.setOnClickListener {
            binding.textView.text = "${binding.textView.text} = ${ilkSayi + ikinciSayi}"
            sifirla()
        }
        setContentView(binding.root)
    }

    fun sifirla() {
        ilkSayi = 0
        ikinciSayi = 0
        ilkSayiKontrol = false
    }

    fun button(sayi: Int) {
        if (ilkSayiKontrol) {
            ikinciSayi = sayi
            binding.textView.text = "${binding.textView.text} $sayi"
        } else {
            ilkSayi = sayi
            binding.textView.text = "$sayi +"
            ilkSayiKontrol = true
        }

    }

}
