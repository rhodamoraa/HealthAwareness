package com.example.healthawareness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_prevention.*

class Prevention : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prevention)

        preventiondata.text="To prevent infection and to slow transmission of COVID-19, do the following:\n" +
                "\n" +
                "Wash your hands regularly with soap and water, or clean them with alcohol-based hand rub.\n" +
                "Maintain at least 1 metre distance between you and people coughing or sneezing.\n" +
                "Avoid touching your face.\n" +
                "Cover your mouth and nose when coughing or sneezing.\n" +
                "Stay home if you feel unwell.\n" +
                "Refrain from smoking and other activities that weaken the lungs.\n" +
                "Practice physical distancing by avoiding unnecessary travel and staying away from large groups of people."
    }
}