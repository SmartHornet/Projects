
fun task78(){ //78. Скорая помощь https://coderun.yandex.ru/problem/ambulance
    val k1 = 12; val k2 = 18  //квартира
    var n1 = 0; val n2 = 2  //этаж
    val m = 3               //количество этажей в доме
    var p1 = 0; var p2 = 2  //номер подьезда
    var x = 0               //количество квартир на этаже

    K1​, MM, K2K2​, P2P2​, N2N

    //поиск значения количества квартир на этаже методом подбора
    var kMin = 0
    var kMax = 0
    var xIsFind = false

    for(i in 1..1000000){
        kMin = (p2 -1)*m*i+(n2-1)*i
        kMax = (p2 -1)*m*i+n2*i
        if((k2 <= kMax) && (k2 > kMin)){
            x = i
            xIsFind = true
            break
        }
    }

    println("xIsFind: $xIsFind")
    println("Квартир на этаж: $x")

    p1 = Math.ceilDiv(k1, m*x)
    println("Подьезд: $p1")

    n1 = Math.ceilDiv(k1, x) - (p1-1)*m
    println("Этаж: $n1")

}

fun main(args: Array<String>) {

    task78()
    //println("Program arguments: ${args.joinToString()}")
}