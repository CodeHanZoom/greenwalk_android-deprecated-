package com.yj.lotterymachine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.contains
import androidx.core.view.size
import org.w3c.dom.Text

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



        var numberList = numList.toList()

        numberList.forEachIndexed { idx, it ->
            textList[idx].text = it.toString()
        }
    }
}