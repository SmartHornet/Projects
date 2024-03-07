package org.example
import java.io.*

//while(readln().equals("*")) task2()

fun main() {
        //println(readln().split(Regex("\\s")).sumOf {it.toInt()})  TASK1-MINIMUM
    var inFileStream = BufferedReader(FileReader("in.txt"))
    var sumn = inFileStream.readLine().split(Regex("\\s")).sumOf {it.toInt()}
    inFileStream.close()

    var outFileStream = BufferedWriter(FileWriter("out.txt"))
    outFileStream.write(sumn.toString())
    outFileStream.close()
}

fun task2() {
    try{
        var inFileStream = BufferedReader(FileReader("in.txt"))
        var input = inFileStream.readLine()
        inFileStream.close()

        var sumn = 0
        if(input.isNotBlank()) {
            sumn = sumOfString(input)
            println("Сумма: $sumn")
        } else println("Неверный формат ввода!")

        var outFileStream = BufferedWriter(FileWriter("out.txt"))
        outFileStream.write(sumn.toString())
        outFileStream.close()
    } catch (e: Exception){
        println("Ошибка ввода-вывода: $e")
    }
}

fun task1(){
    println("Введите числа через пробел:")
    val input = readln()
    var sumn = 0
    if(input.isNotBlank()) {
        sumn = sumOfString(input)
        println("Сумма: $sumn")
    } else println("Неверный формат ввода!")
}


fun sumOfString(str: String): Int =
    str.filter {it.isDigit() || it.isWhitespace() || it == '-'}.trim().split(Regex("\\s+")).sumOf {it.toInt()}


fun task1_sumOfString_protect() {

    println("Введите числа через пробел:")
    var input = readln()
    if(input.isNotBlank()){
        input = input.filter {it.isDigit() || it.isWhitespace() || it == '-'}
        println(input)
        input = input.trim()
        var strList = input.split(Regex("\\s+"))
        println(strList)
        var sumn = 0
        sumn = strList.sumOf {it.toInt()}

        println("Сумма: $sumn")

    } else println("Неверный формат строки!")
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

class test(var name: String)

class rectangle( val a: Int, val b: Int){
    val isSquare: Boolean
        get(){
            return  a == b
        }
}
