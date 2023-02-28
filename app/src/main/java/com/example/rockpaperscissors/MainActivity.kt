package com.example.rockpaperscissors

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.rockpaperscissors.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private  var rnds:Int?=null
    private  var oyuncuskor=0
    private  var rakipskor=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)





    }

    fun tasbtnclick(view: View){
        rnds = (1..3).random()

        binding.oyuncuimgview.setImageResource(R.drawable.rock)

        if (rnds==1){
            binding.rakipimgview.setImageResource(R.drawable.rock)
            binding.textView5.setText("berabere")
        }
        else if (rnds==2){
            binding.rakipimgview.setImageResource(R.drawable.paper)
            rakipskor++
           binding.rakipskortxt.setText(rakipskor.toString())
            binding.textView5.setText("rakip kazandi")

        }
        else if (rnds==3){
            binding.rakipimgview.setImageResource(R.drawable.scissor)
            oyuncuskor++
            binding.oyuncuskortxt.setText(oyuncuskor.toString())
            binding.textView5.setText("sen kazandin")
        }



    }

    fun kagitbtnclick(view: View){
        rnds = (1..3).random()

        binding.oyuncuimgview.setImageResource(R.drawable.paper)


        if (rnds==1){
            binding.rakipimgview.setImageResource(R.drawable.rock)
            oyuncuskor++
            binding.oyuncuskortxt.setText(oyuncuskor.toString())
            binding.textView5.setText("sen kazandin")
        }
        else if (rnds==2){
            binding.rakipimgview.setImageResource(R.drawable.paper)
            binding.textView5.setText("berabere")
        }
        else if (rnds==3){
            binding.rakipimgview.setImageResource(R.drawable.scissor)
            rakipskor++
            binding.rakipskortxt.setText(rakipskor.toString())
            binding.textView5.setText("rakip kazandi")

        }

    }
    fun makasbtnclick(view: View){

        rnds = (1..3).random()

        binding.oyuncuimgview.setImageResource(R.drawable.scissor)


        if (rnds==1){
            binding.rakipimgview.setImageResource(R.drawable.rock)
            rakipskor++
            binding.rakipskortxt.setText(rakipskor.toString())
            binding.textView5.setText("rakip kazandi")
        }
        else if (rnds==2){
            binding.rakipimgview.setImageResource(R.drawable.paper)
            oyuncuskor++
            binding.oyuncuskortxt.setText(oyuncuskor.toString())
            binding.textView5.setText("sen kazandin")

        }
        else if (rnds==3){
            binding.rakipimgview.setImageResource(R.drawable.scissor)
            binding.textView5.setText("berabere")


        }


    }

    fun tekrarbtnclick(view: View){
        oyuncuskor=0
        rakipskor=0
        binding.oyuncuskortxt.setText(oyuncuskor.toString())
        binding.rakipskortxt.setText(rakipskor.toString())

    }
}