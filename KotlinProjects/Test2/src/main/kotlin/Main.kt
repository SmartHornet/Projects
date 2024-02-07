package org.example

class test(var name: String)

class rectangle( val a: Int, val b: Int){
    val isSquare: Boolean
        get(){
            return  a == b
        }
}

fun main() {
    //println("What is you name?")
    //var name = readLine()


    val r: rectangle = rectangle(4,6)
    println(r.isSquare)
    println(r.b)






    //println(test(1))
}










fun test(index: Int, num: Int = 0)
:String{

    var str: String = when(index){
        1 -> "Мяка"
        in 2..4 -> "Пыщь"
        else -> "Мякоть"
    }

    println(str);

    return when {
        index > num -> ">"
        index == num -> "="
        index < num -> "<"
        else -> "<=>"
    }

}


