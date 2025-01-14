//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /**
     * 1. Дано целое число. Если оно является положительным, то прибавить к нему 1; в противном случае не изменять его.
     * Вывести полученное число.
     * 2. Даны целые числа: 4, 45, -2, 8. Найти количество положительных чисел в исходном наборе.
     * 3. Даны два числа. Вывести большее из них.
     * 4. Дано целое число в диапазоне 1–7. Вывести строку — название дня недели, соответствующее данному числу
     * (1 — «понедельник», 2 — «вторник» и т. д.).
     * 5. Дано целое число K. Вывести строку-описание оценки, соответствующей числу (1 — «плохо», 2 — «неудовлетворительно»,
     * 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если не лежит в диапазоне 1–5, то вывести строку «ошибка».
     * 6. Арифметические действия над числами пронумерованы следующим образом: 1 — сложение, 2 — вычитание, 3 — умножение,
     * 4 — деление. Дан номер действия (целое число в диапазоне 1–4) и числа типа double(не равно 0).
     * Выполнить над числами указанное действие и вывести результат.
     */

    //Task 1
    val a = 7
    val b = if(a > 0) {
        a + 1
    } else {
        a
    }
    println(b)

    println("------------------")

    //Task 2
    val c = 4
    val d = 45
    val e = -2
    val f = 8
    var count = 0
//    if(c > 0) {
//       count = count + 1
//        println(count)
//    } else if (d > 0) {
//        count = count + 1
//        println(count)
//    } else if (e > 0) {
//        count = count + 1
//        println(count)
//    } else if ( f > 0) {
//        count = count + 1
//        println(count)
//    } else {
//        println(count)
//    }

    println("--------------")

    //Task 3
    val g = 50
    val h = 30
    val i = if(g > h)g else h
    println(i)

    println("--------------")

    //Task 4
    val day = 2
    if (day == 1) {
        println("понедельник")
    } else if (day == 2) {
        println("вторник")
    } else if (day == 3) {
        println("среда")
    } else if (day == 4) {
        println("четверг")
    } else if (day == 5) {
        println("пятница")
    } else if (day == 6) {
        println("суббота")
    } else if (day == 7) {
        println("воскресенье")
    }

    println("---------------")

    //Task 5
    val K = 5
    if (K == 1) {
        println("плохо")
    } else if (K == 2) {
        println("неудовлетворительно")
    } else if (K == 3) {
        println("удовлетворительно")
    } else if (K == 4) {
        println("хорошо")
    } else if (K == 5) {
        println("отлично")
    } else {
        println("ошибка")
    }

    println("--------------")

    //Task 6
    val math = 4
    val A = 23.0
    val B = 48.0
    var result = 0.0
        if (math == 1) {
        result = A + B
    } else if (math == 2) {
        result = A - B
    } else if (math == 3) {
        result = A * B
    } else if (math == 4) {
       result = A / B
    }
    println(result)
}