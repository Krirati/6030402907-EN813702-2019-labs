package com.example.aboutme

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

// import com.example.aboutme.databinding.Activity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: MyName = MyName("krirati kani")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.myName = myName
        binding.doneButton.setOnClickListener{
            addNickname(it)
        }
    }

    private  fun addNickname(view: View) {
        binding.apply {
//            myName?.nickname = nicknameEdit.text.toString()
            nicknameText.text = nicknameEdit.text
            invalidateAll()
            doneButton.visibility = View.GONE
            nicknameEdit.visibility = View.GONE
            nicknameText.visibility = View.VISIBLE
        }
    }
}
