package com.example.note

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

       // var binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.main_activity)

    }

}
