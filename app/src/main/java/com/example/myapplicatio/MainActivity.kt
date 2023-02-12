package com.example.myapplicatio

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners(){
        val clickableViews : List<View> =
            listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, Constraint_layout, red_button, yellow_button, green_button)

        for(item in clickableViews){
            item.setOnClickListener { makeColored(it) }
        }

    }

    private fun makeColored(view : View){
        when(view.id) {
            R.id.box_one_text -> view.setBackgroundColor(Color.rgb(221, 127, 110))
            R.id.box_two_text -> view.setBackgroundColor(Color.rgb(230, 143, 115))
            R.id.box_three_text -> view.setBackgroundColor(Color.rgb(240, 153, 125))
            R.id.box_four_text -> view.setBackgroundColor(Color.rgb(255, 195, 161))
            R.id.box_five_text -> view.setBackgroundColor(Color.rgb(167, 93, 93))

            R.id.red_button -> box_three_text.setBackgroundColor(Color.parseColor("#E54304"))
            R.id.yellow_button -> box_four_text.setBackgroundColor(Color.parseColor("#ffc107"))
            R.id.green_button -> box_five_text.setBackgroundColor(Color.parseColor("#12C700"))

            else -> view.setBackgroundColor(Color.rgb(211, 117, 107))

        }
    }
}