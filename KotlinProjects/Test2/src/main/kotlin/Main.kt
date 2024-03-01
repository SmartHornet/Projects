package org.example

class test(var name: String)

class rectangle( val a: Int, val b: Int){
    val isSquare: Boolean
        get(){
            return  a == b
        }
}

fun task1_fullProtect(){
    println("Введите числа через пробел:")
    var input = readln()
    if(input.isNotBlank()){
        input = input.filter {it.isDigit() || it.isWhitespace()}
        println(input)
        input = input.trim()
        var strList = input.split(Regex("\\s+"))
        println(strList)
        var sumn = strList.sumOf {it.toInt()}


        /*println("Введены следующие числа:")
        var sum = 0;
        for(str in strList) {
            if (str.isNotBlank()) {
                println(str);
                sum += str.toInt();
            }
        }
        println("Сумма1: $sum");*/
        println("Сумма2: $sumn")

    } else println("Неверный формат ввода!")
}

fun task1(){
    println("Введите числа через пробел:")
    var input = readln();
    var strList = input.split(' ')


    if(input.isNotBlank()){
        input = input.filter {it.isDigit() || it.isWhitespace()}
        println(input);
        input = input.replace(Regex("\\s+"), " ")
        println(input);


        println(strList)
        println("Введены следующие числа:")
        var sum = 0;
        for(str in strList) {
            if (str.isNotBlank()) {
                println(str);
                sum += str.toInt();
            }
        }
        println("Сумма: $sum");

    } else println("Неверный формат ввода!")
}


fun main() {
    while(readln().equals("*")) task1_fullProtect()

    //println('1'.isWhitespace())
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


