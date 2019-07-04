package otsuka.fumiya.techacademy.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log         //  追加
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //humanインスタンスの作成
        val human = Human("きらめき太郎", 30, "kotlin")

        //sayメソッドの呼び出し
        human.say()

        //thinkメソッドの呼び出し
        human.think()

    }
}