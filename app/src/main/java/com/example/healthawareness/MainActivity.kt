package com.example.healthawareness

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonabout.setOnClickListener(View.OnClickListener {
            //link/intent
            val i = Intent(this,About::class.java)
            startActivity(i)
        });
        buttonsymptoms.setOnClickListener(View.OnClickListener {
            //link/intent
            val i = Intent(this,Symptoms::class.java)
            startActivity(i)
        });
        buttonprevention.setOnClickListener(View.OnClickListener {
            //link/intent
            val i = Intent(this,Prevention ::class.java)
            startActivity(i)
        });
        buttonwho.setOnClickListener(View.OnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.who.int/"))
            startActivity(i)
        });
        buttoncall.setOnClickListener(View.OnClickListener {
            val i=Intent(Intent.ACTION_CALL, Uri.parse("Tel: 911"))
            startActivity(i)
        });
        buttontest.setOnClickListener(View.OnClickListener {
            val i=Intent(Intent.ACTION_VIEW, Uri.parse("geo: -1.2054030000000047, 36.854067000000015z=15"))
            startActivity(i)
        });
        buttonaddress.setOnClickListener(View.OnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"))
            startActivity(i)
        });
        buttonshare.setOnClickListener(View.OnClickListener {
            val i: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "I am using COVID 19 app,chek on Google Play Store")
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(i, null)
            startActivity(shareIntent)
        });

        buttonhosi.setOnClickListener(View.OnClickListener {

            val i=Intent(this,Hospitals::class.java)
            startActivity(i) //this button takes you to hospitals
        });
    }
}