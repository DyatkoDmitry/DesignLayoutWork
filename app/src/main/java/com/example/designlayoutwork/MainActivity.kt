package com.example.designlayoutwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //checkElementCentringLayout()
        //checkScrollViewHandlingLayout()
        checkViewSquareLayout()
    }

    private fun checkElementCentringLayout(){
        setContentView(R.layout.element_centring)
    }

    private fun checkScrollViewHandlingLayout(){
        setContentView(R.layout.scroll_view_handling)

        val view:View = findViewById(R.id.contentView)
        val button: Button = findViewById(R.id.contentButton)

        button.setOnClickListener {
            view.layoutParams.height = getHeightView()
            view.requestLayout()
        }
    }

    private fun getHeightView(): Int{
        return try {
            val editText: EditText = findViewById(R.id.heightEditText)
            Integer.parseInt(editText.text.toString())
        }
        catch (e: Exception ){
            0
        }
    }

    private fun checkViewSquareLayout(){
        setContentView(R.layout.view_square)
    }
}