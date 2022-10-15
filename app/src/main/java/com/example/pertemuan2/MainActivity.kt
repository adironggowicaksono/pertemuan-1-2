package com.example.pertemuan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pertemuan2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding :ActivityMainBinding
    var scoreA = 0
    var scoreB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnplusA.setOnClickListener {
            if (scoreA < 9){
                scoreA = scoreA + 1
            binding.tvscoreA.text = scoreA.toString()}
        }
        binding.btnminA.setOnClickListener {
            if (scoreA >0) {
                scoreA = scoreA - 1
                binding.tvscoreA.text = scoreA.toString()
            }
        }
        binding.btnplusB.setOnClickListener {
            if (scoreB < 9) {scoreB = scoreB + 1
            binding.tvscoreB.text = scoreB.toString()}
        }
        binding.btnminB.setOnClickListener {
            if (scoreB > 0) {
                scoreB = scoreB - 1
                binding.tvscoreB.text = scoreB.toString()
            }
        }
        binding.btnReset.setOnClickListener {
            scoreA = 0
            scoreB = 0
            binding.tvscoreA.text = scoreA.toString()
            binding.tvscoreB.text = scoreB.toString()
        }
    }
}