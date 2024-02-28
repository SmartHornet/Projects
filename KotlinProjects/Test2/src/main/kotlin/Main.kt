package org.example

class test(var name: String)

class rectangle( val a: Int, val b: Int){
    val isSquare: Boolean
        get(){
            return  a == b
        }
}

fun task1(){
    println("Введите числа через пробел:")
    var input = readln();
    if(input.isNotBlank()){
        input = input.filter { it.isDigit() || it.isWhitespace()}



        input = input.replace(Regex("\\s+"), " ")
        //println(input);
        var strList = input.split(' ')
        strList.

        println(strList);
        /*println("Введены следующие числа:")
        var sum = 0;
        for(str in strList){
            println(str);
            sum += str.toInt();
        }
        println("Сумма: $sum");*/

    } else println("Неверный формат ввода!");
}

fun task1_1(){

    println("Введите числа через пробел:");
    var input = readln();
    //var input2 = input.replace("  ", " ")

    //while(!input.equals(input2)){input = input2.replace("  ", " ")}


    //input = input.replace("  ", " ")
    println()


}


fun main() {
    while(readln().equals("*")) task1()

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


