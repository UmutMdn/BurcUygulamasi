package com.umutmadanoglu.burcuygulamas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.umutmadanoglu.burcuygulamas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
        lateinit var binding:ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

          binding.akrepCard.setOnClickListener {
                  intent= Intent(applicationContext,akrep::class.java)
                  startActivity(intent)
          }

          binding.aslanCard.setOnClickListener {
                   intent= Intent(applicationContext,aslan::class.java)
                   startActivity(intent)
           }

           binding.balikCard.setOnClickListener {
           intent= Intent(applicationContext,balik::class.java)
           startActivity(intent)
           }

           binding.basakCard.setOnClickListener {
           intent= Intent(applicationContext,basak::class.java)
           startActivity(intent)
           }

            binding.bogaCard.setOnClickListener {
            intent= Intent(applicationContext,boga::class.java)
            startActivity(intent)
             }

             binding.oglakCard.setOnClickListener {
             intent= Intent(applicationContext,oglak::class.java)
             startActivity(intent)
             }

             binding.kocCard.setOnClickListener {
             intent= Intent(applicationContext,koc::class.java)
             startActivity(intent)
             }

             binding.kovaCard.setOnClickListener {
             intent= Intent(applicationContext,kova::class.java)
             startActivity(intent)
             }


             binding.yengecCard.setOnClickListener {
             intent= Intent(applicationContext,yengec::class.java)
             startActivity(intent)
              }

                binding.teraziCard.setOnClickListener {
                intent= Intent(applicationContext,terazi::class.java)
                startActivity(intent)
                }

                binding.ikizlerCard.setOnClickListener {
                        intent= Intent(applicationContext,ikizler::class.java)
                        startActivity(intent)
                }

                binding.yayCard.setOnClickListener {
                        intent= Intent(applicationContext,yay::class.java)
                        startActivity(intent)
                }

    }
}