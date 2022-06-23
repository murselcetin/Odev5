package com.example.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
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
        binding.buttonArti.setOnClickListener {
            binding.textView.text = "${binding.textView.text}+"
        }
        binding.buttonSifirla.setOnClickListener {
            sifirla()
        }
        binding.buttonEsittir.setOnClickListener {
            var tpl = 0
            val sayilar = binding.textView.text.toString().split("+").toTypedArray()
            for (i in 0 until sayilar.size) {
                tpl += sayilar[i].toInt()
            }
            binding.textView.text = tpl.toString()
        }
        setContentView(binding.root)
    }

    fun sifirla() {
        binding.textView.text = ""
    }

    fun button(sayi: Int) {
        binding.textView.text = "${binding.textView.text}$sayi"
    }
}
