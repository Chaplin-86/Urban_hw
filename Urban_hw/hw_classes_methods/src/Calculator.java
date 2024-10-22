public class Calculator {

    /**
     * 1. Создать класс Calculator(Калькулятор) для выполнения основных арифметических операций.
     * Он содержит два поля: a и b.
     * 2. Написать методы вычисления суммы, разности, произведения и частного.
     *
     * Методы суммы и разности принимают входные параметры a и b и возвращают результат
     * соответствующих операций.
     *
     * Методы произведения и частного необходимо написать с типом возвращаемого значения void
     * (ничего не возвращают) и результат этих операций внутри метода выводится в консоль
     * методом System.out.println().
     */
    int a;
    int b;

    public int sum(int a, int b) {
        return a + b;
    }

    public int subtruction(int a, int b) {
        return a - b;
    }

    public void multiplication() {
        System.out.println(a * b);
    }

    public void division() {
        System.out.println(a / b);
    }


}
