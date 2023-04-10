package com.example.whattodo

import android.content.Intent
import android.os.Build.VERSION_CODES.S
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.whattodo.FindIP.FindIdPassActivity

class MainActivity : AppCompatActivity() {
    private lateinit var emailedt:EditText
    private lateinit var passedt:EditText
    private lateinit var findemailtxt:TextView
    private lateinit var findpasstxt:TextView
    private lateinit var jointxt:TextView
    private lateinit var loginbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emailedt=findViewById<EditText>(R.id.emailArea)
        passedt=findViewById<EditText>(R.id.passArea)
        findemailtxt=findViewById<TextView>(R.id.findIdText)
        findpasstxt=findViewById<TextView>(R.id.findPassText)
        jointxt=findViewById<TextView>(R.id.joinText)
        loginbtn=findViewById<Button>(R.id.loginButton)

//        클릭 이벤트 처리부분
        jointxt.setOnClickListener {
            val intent=Intent(this,JoinActivity::class.java)
            startActivity(intent)
        }
        findemailtxt.setOnClickListener {
            val intent=Intent(this, FindIdPassActivity::class.java)
            intent.putExtra("text",findemailtxt.text.toString())
            startActivity(intent)
        }

        findpasstxt.setOnClickListener {
            val intent=Intent(this,FindIdPassActivity::class.java)
            intent.putExtra("text",findpasstxt.text.toString())
            startActivity(intent)
        }

        loginbtn.setOnClickListener {
            val email=emailedt.text.toString()
            val pass=passedt.text.toString()

//            서버와 통신 필요
        }
    }
}