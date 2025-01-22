//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("Task 1")
    /**
     * Пользователь вводит с клавиатуры число. Требуется посчитать факториал числа.
     * Например, если введено 3, факториал числа 1*2*3 = 6.
     */
//    do {
//        val input = readln().toInt()
//    }

    println("Task 2")
    /**
     * Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, …, 10 кг конфет.
     */
    val price = 245.0
    var amount = 0
    var totalPrice = 0.0

    while(amount++ < 10) {
        totalPrice = price * amount
        println(totalPrice)
    }

    println("Task 3")
    /**
     * Даны два целых числа A и B (A<B). Вывести в порядке возрастания все целые числа, расположенные между A и B
     * (включая сами числа A и B), а также количество N этих чисел.
     */
    var A = 6
    val B = 18
    var count = 0

    do {
        count++
        println(A)
    } while (A++ < B)
    println(count)

    println("Task 4")
    /**
     * Дано целое число N (>0). Используя операции деления нацело и взятия остатка от деления, вывести все его цифры,
     * начиная с самой правой.
     */

    println("Task 5")
    /**
     * Напишите программу, в которой выводятся на экран числа от 1 до 20 включительно со следующими условиями:
     * если числа нечетные – их не выводить на экран, если делятся на 4 без остатка – умножаем на 2,
     * если число равно 19 завершаем программу.
     */
    var start = 0
    var finish = 20

    while(start++ < finish) {
        if (start % 2 == 0){
            println(start)
        }
        if (start % 4 == 0){
            println(start * 2)
        }
        if(start == 19) {
            break
        }
    }

    println("Task 6")
    /**
     * За каждый месяц банк начисляет к сумме вклада 7% от суммы. Напишите программу, в которой вычисляется
     * конечная сумма вклада с учетом начисления процентов за каждый месяц. Сумма вклада равна 350, количество месяцев – 9.
     */
    var sum = 350.0
    //var total = sum + (sum * 0.07)
    //var total = sum * 1.07
    val limit = 9
    var months = 0
    do {
        sum *= 1.07
    } while (months++ < limit)
    println(sum)
}