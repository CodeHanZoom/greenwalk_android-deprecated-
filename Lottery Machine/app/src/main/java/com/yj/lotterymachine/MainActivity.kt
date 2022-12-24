package com.yj.lotterymachine

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private val addButton: Button by lazy {
        findViewById(R.id.addButton)
    }

    private val clearButton: Button by lazy {
        findViewById(R.id.clearButton)
    }

    private val numberPicker: NumberPicker by lazy {
        findViewById(R.id.numberPicker)
    }

    private var numList: MutableSet<Int> = mutableSetOf()

    private val textList: MutableList<TextView> = mutableListOf()

    private val num1: TextView by lazy {
        findViewById(R.id.num1)
    }
    private val num2: TextView by lazy {
        findViewById(R.id.num2)
    }
    private val num3: TextView by lazy {
        findViewById(R.id.num3)
    }
    private val num4: TextView by lazy {
        findViewById(R.id.num4)
    }
    private val num5: TextView by lazy {
        findViewById(R.id.num5)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberPicker.minValue = 1
        numberPicker.maxValue = 45


        textList.add(num1)
        textList.add(num2)
        textList.add(num3)
        textList.add(num4)
        textList.add(num5)

        addButton.setOnClickListener {
                initAddButton()
        }

        clearButton.setOnClickListener {
            runClearButton()
        }
    }

    private fun initAddButton(){
        if(numList.size >= 5){
            Toast.makeText(this, "숫자는 최대 5개까지 선택가능", Toast.LENGTH_SHORT).show()
            return
        }

        if(numList.contains(numberPicker.value)){
            Toast.makeText(this, "이미 선택된 숫자임", Toast.LENGTH_SHORT).show()
            return
        }

        numList.add(numberPicker.value)

        when (numberPicker.value) {
            in 1..10 -> textList[numList.size-1].background = ContextCompat.getDrawable(this, R.drawable.circle_yellow)
            in 11..20 -> textList[numList.size-1].background = ContextCompat.getDrawable(this, R.drawable.circle_blue)
            in 21..30 -> textList[numList.size-1].background = ContextCompat.getDrawable(this, R.drawable.circle_red)
            in 31..40 -> textList[numList.size-1].background = ContextCompat.getDrawable(this, R.drawable.circle_gray)
            in 41..45 -> textList[numList.size-1].background = ContextCompat.getDrawable(this, R.drawable.circle_green)
        }


        var numberList = numList.toList()

        numberList.forEachIndexed { idx, it ->
            textList[idx].text = it.toString()
        }
    }

    private fun runClearButton(){

        var numberList = numList.toList()

        numberList.forEachIndexed { idx, it ->
            textList[idx].apply{
                text = ""
                setBackgroundColor(Color.WHITE)
            }
        }

        numList.clear()
    }
}