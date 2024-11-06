public class CheckArray <T> {
    T[] array1;
    T[] array2;

    public CheckArray(T[] array1, T[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }


    public boolean checkArraysSame(T[] array1, T[] array2) {
        if(array1 == array2) {
            return true;
        }

        return false;

    }



    public T[] getArray1() {
        return array1;
    }

    public T[] getArray2() {
        return array2;
    }
}
