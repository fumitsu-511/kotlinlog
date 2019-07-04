package otsuka.fumiya.techacademy.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {

    //プロパティ
    var hobby:String

    //コンストラクタ
    constructor(name:String, age:Int, hobby:String):super(name, age){
        this.hobby = hobby
    }

    //Animalクラスのメソッドをオーバーライド
    override fun say() {
        Log.d("kotlintest", "私の名前は" + name + "です。 年は" + age + "歳です。」")
    }

    //Thinkableインターフェースをオーバーライド
    override fun think() {
        val d = Log.d("kotlintest", "「私は" + hobby + "について考える。」")
    }

}