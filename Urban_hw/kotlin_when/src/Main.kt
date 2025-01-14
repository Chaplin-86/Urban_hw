//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /**
     * 1. Дан порядковый номер месяца года. Нужно написать программу, которая будет выводить на экран время года и название месяца.
     * Пример вывода: «Зима: Январь.»
     * 2. Дана переменная с плавающей точкой. Написать программу, которая округляет эту переменную до целого числа.
     * 3. Написать программу, которая определяет время суток.
     * Допустим с 0 часов до 5 -"Раннее утро", с 6 до 11 – утро, с 12 до 17 - день, с 17 – 20 – вечер,
     * после 20 до 23 – поздний вечер.
     * 4. Даны две переменные a = 8, b = 5. Написать алгоритм, при котором a = 5, b = 8.
     */

    //Task 1
    println("Task 1")
    val month = 10
    when(month){
        12 -> println("Зима: Декабрь.")
        1 -> println("Зима: Январь.")
        2 -> println("Зима: Февраль.")
        3 -> println("Весна: Март.")
        4 -> println("Весна: Апрель.")
        5 -> println("Весна: Май.")
        6 -> println("Лето: Июнь.")
        7 -> println("Лето: Июль.")
        8 -> println("Лето: Август.")
        9 -> println("Осень: Сентябрь.")
        10 -> println("Осень: Октябрь.")
        11 -> println("Осень: Ноябрь.")
    }

    println("Task 2")
    var numDouble = 5.8
    var numInt: Int = numDouble.toInt()
    when{
        (numDouble >= numInt + 0.5) -> {
            numDouble = numInt + 1.0
            println(numDouble)
        }
        else -> {
            numDouble = numInt + 0.0
            println(numDouble)
        }
    }

    println("Task 3")
    val time = 15
    when(time) {
        in 0..5 -> {
        println("Раннее утро{")
        }
        in 6..11 -> {
            println("Утро")
        }
        in 12..16 ->  {
            println("День")
        }
        in 17..19 -> {
            println("Вечер")
        }
        in 20..23 -> {
            println("Поздний вечер")
        }
    }

//    println("Task 4")
//    var a = 8
//    var b = 5
//    when {
//        (a == 8) -> {
//            a = b
//            b = a
//            println("a = b, b = a")
//            println(a)
//            println(b)
//        }
//    }



}