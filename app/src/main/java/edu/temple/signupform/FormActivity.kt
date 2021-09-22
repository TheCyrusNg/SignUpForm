package edu.temple.signupform

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onBtnClick(view: View?){
        val name = findViewById<EditText>(R.id.txtName)
        val email = findViewById<EditText>(R.id.txtEmail)
        val password = findViewById<EditText>(R.id.txtPassword)
        val confPassword = findViewById<EditText>(R.id.txtConfPassword)
        val duration = Toast.LENGTH_SHORT

        val toast = Toast.makeText(applicationContext, "Name: "+ name.getText().toString() + "Email: " + email.getText().toString() + "Password: " + password.getText().toString(), duration)
        toast.show()
    }
}