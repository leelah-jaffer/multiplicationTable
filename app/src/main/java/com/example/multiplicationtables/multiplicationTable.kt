package com.example.multiplicationtables

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class multiplicationTable : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_table)

        // get the table number from the bundle
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        // convert to a non-nullable integer
        val tableNumber = tableString!!.toInt()

        // find the TextView
        val multiplicationTable = findViewById<TextView>(R.id.multiplicationTableTextView)

        // start with the heading and two new lines
        var tableDisplay: String = "$tableNumber x table\n\n"

        // loop 20 times and keep adding to the string
        var counter = 1
        while (counter <= 20) {
            val answer = tableNumber * counter
            tableDisplay += "$tableNumber x $counter = ${answer}\n"
            counter++
        }

        // set the string onto the display
        multiplicationTable.text = tableDisplay
    }
}