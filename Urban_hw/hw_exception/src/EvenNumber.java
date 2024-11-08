public class EvenNumber {

    public boolean isEven(int num) throws Exception{
        if(num % 2 ==0){
            return true;
        } else {
            throw new Exception("Ошибка!!! " + num + " - нечетное число");
        }
    }


//    public boolean isEven(int num) throws Exception {
//        if (num % 2 != 0) {
//            throw new Exception("Ошибка!!! " + num + " - нечетное число");
//        } else {
//            return true;
//        }
//    }
}
