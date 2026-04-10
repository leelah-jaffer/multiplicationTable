package com.example.multiplicationtables

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class multiplicationTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_multiplication_table)

        // recieving intent from main activity
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        val tableNumber = tableString!!.toInt()

        //assigned variable to text view
        val multiplyTbl = findViewById<TextView>(R.id.multiplyTableTxt)

        var tableDisplay: String = "$tableNumber x table\n\n"
        counter
        var counter = 1

        multiplyTbl.text = tableDisplay

        while (count <= 10) {
            val answer= tableNumber + count

            if (count == 3) {
                count++
                continue
            }
        }
    }
}




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}