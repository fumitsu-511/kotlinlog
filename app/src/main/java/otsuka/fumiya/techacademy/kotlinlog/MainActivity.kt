package otsuka.fumiya.techacademy.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //humanインスタンスの作成
        val taro = Human("きらめき太郎", 30, "Kotlin")
        val hanako = Human("きらめき花子",25,"Java")

        //太郎のsayメソッド、thinkメソッドの呼び出し
        taro.say()
        taro.think()

        //花子のsayメソッド、thinkメソッドの呼び出し
        hanako.say()
        hanako.think()


    }
}