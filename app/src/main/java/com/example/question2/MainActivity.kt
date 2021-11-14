package com.example.question2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.time.temporal.ValueRange

class MainActivity : AppCompatActivity() {

    lateinit var rg_gender : RadioGroup
    lateinit var rb_male : RadioButton
    lateinit var rb_female : RadioButton

    lateinit var cb_english : CheckBox
    lateinit var cb_hindi : CheckBox

    lateinit var btn_submit : Button
    lateinit var tv_answer : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rg_gender = findViewById(R.id.rg_gender) as RadioGroup
        rb_male = findViewById(R.id.rb_male) as RadioButton
        rb_female = findViewById(R.id.rb_female) as RadioButton

        cb_english = findViewById(R.id.cb_english) as CheckBox
        cb_hindi = findViewById(R.id.cb_hindi) as CheckBox

        btn_submit = findViewById(R.id.btn_submit) as Button

        tv_answer = findViewById(R.id.tv_answer) as TextView

        btn_submit.setOnClickListener(View.OnClickListener {
           var result = ""
            if (rg_gender.checkedRadioButtonId != -1) {
                result += "Selected Gender :"
                if (rb_male.isChecked){
                    Toast.makeText(getApplicationContext(),rb_male.getText(), Toast.LENGTH_SHORT).show()
                    result += "Male\n"}
                else if (rb_female.isChecked){
                    Toast.makeText(getApplicationContext(),rb_female.getText(), Toast.LENGTH_SHORT).show()
                    result += "Female\n"}
            }
            result += "Language Known :"
                if (cb_english.isChecked) {
                    Toast.makeText(
                        getApplicationContext(),
                        cb_english.getText(),
                        Toast.LENGTH_SHORT
                    ).show()
                    result += "English"
                }
                else if (cb_hindi.isChecked){
                    Toast.makeText(getApplicationContext(),cb_hindi.getText(), Toast.LENGTH_SHORT).show()
                    result += "Hindi"}

            tv_answer.text = result
        })

    }
}