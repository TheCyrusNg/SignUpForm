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

        val toast = Toast.makeText(applicationContext, "Name: "+ name.getText().toString() + "\n Email: " + email.getText().toString() + "\n Password: " + password.getText().toString(), duration)

        if(name.getText().toString() == ""){
            name.error = "Name no good"
        }
        if(email.getText().toString() == ""){
            email.error = "Email no good"
        }
        if(password.getText().toString() == ""){
            password.error = "Password no good"
        }
        if(confPassword.getText().toString() == ""){
            confPassword.error = "Confirm password no good"
        }
        if(!password.getText().toString().equals(confPassword.getText().toString())){
            confPassword.error = "Confirm password defenitly no good"
        }
        toast.show()
    }
}