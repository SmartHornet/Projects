
fun task78(){ //78. Скорая помощь https://coderun.yandex.ru/problem/ambulance
    val k1 = 0; val k2 = 0  //квартира
    val n1 = 0; val n2 = 0  //этаж
    val m = 0               //количество этажей в доме
    val p1 = 0; val p2 = 0  //номер подьезда
    var x = 0               //количество квартир на этаже

    //поиск значения количества квартир на этаже методом подбора
    var kMin = 0
    var kMax = 0

    for(i in 2..1000000){
        x = i
        kMin = (p2 -1)*m*x+(n2-1)*x
        kMax = (p2 -1)*m*x+n2*x
        if((k2 <= kMax) && (k2 > kMin)){
            x = i
            i = 1000000
        }
    }




}

fun main(args: Array<String>) {


    //println("Program arguments: ${args.joinToString()}")
}