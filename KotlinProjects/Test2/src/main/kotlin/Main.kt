package org.example

fun main() {

    var index = 0

    var str: String = when(index){
        1 -> "Мяка"
        in 2..4 -> "Пыщь"
        else -> "Мякоть"
    }

    println(str);

    var num = 0

    str = when{
       index > num -> ">"
        index == num -> "="
        index < num -> "<"
        else -> "<=>"
    }

    println(str);

}