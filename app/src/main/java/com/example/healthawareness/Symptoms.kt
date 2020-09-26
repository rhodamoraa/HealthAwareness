package com.example.healthawareness

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_symptoms.*

class Symptoms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms)
        symptomsdata.text="COVID-19 affects different people in different ways. Most infected people will develop mild to moderate illness and recover without hospitalization.\n" +
                "\n" +
                "Most common symptoms:\n" +
                "\n" +
                "fever.\n" +
                "dry cough.\n" +
                "tiredness.\n" +
                "Less common symptoms:\n" +
                "\n" +
                "aches and pains.\n" +
                "sore throat.\n" +
                "diarrhoea.\n" +
                "conjunctivitis.\n" +
                "headache.\n" +
                "loss of taste or smell.\n" +
                "a rash on skin, or discolouration of fingers or toes.\n" +
                "Serious symptoms:\n" +
                "\n" +
                "difficulty breathing or shortness of breath.\n" +
                "chest pain or pressure.\n" +
                "loss of speech or movement.\n" +
                "Seek immediate medical attention if you have serious symptoms.  Always call before visiting your doctor or health facility. \n" +
                "\n" +
                "People with mild symptoms who are otherwise healthy should manage their symptoms at home. \n" +
                "\n" +
                "On average it takes 5–6 days from when someone is infected with the virus for symptoms to show, however it can take up to 14 days. \n" +
                "\n" +
                " "
    }
}