package com.example.tipcalculatorproject


import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.tipcalculatorproject.databinding.ActivityMainBinding
import com.example.tipcalculatorproject.databinding.ActivityMainBinding.*
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)
    }

fun convertTip(view: View){
      if(binding.Tip.text.isNotEmpty()){
        val billAmount = binding.Tip.text.toString().toFloat()
        val tipAmount10 = (billAmount * 0.10f).roundToInt()
          val tipAmount15 = (billAmount * 0.15f).roundToInt()
          val tipAmount20 = (billAmount * 0.20f).roundToInt()
          val output = " 10% =  $$tipAmount10\n 15% = $$tipAmount15\n 20% = $$tipAmount20"
        binding.textView.text = output.toString()
    }else{
        binding.textView.text = getString(R.string.no_value_string)
    }
}
}