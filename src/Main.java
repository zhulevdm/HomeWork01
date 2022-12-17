import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
// Первое задание
//        hw01_01();
//        hw01_02();
//        hw01_03();
// Третье задание
//        int[] arr1 = {4, 5, 6};
//        int[] arr2 = {4, 5, 6, 8};
//        System.out.println(Arrays.toString(hw03(arr1, arr2)));
    }
/** Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
* */
    public static void hw01_01(){
        int a = 12;
        int b = 0;
        int c = a / b; //ArithmeticException
}

    public static void hw01_02(){
        int[] arr = {1, 2, 3, 4, 5};
        int a = arr[50]; //ArrayIndexOutOfBoundsException
    }

    public static void hw01_03(){
        String str = null;
        System.out.println(str.length()); //NullPointerException
    }

/** Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
* */
    public static int hw02(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) { // j < 5 может вызвать ArrayIndexOutOfBoundsException
                int val = Integer.parseInt(arr[i][j]); // Если строка некорректна: 123t или null вызовет NumberFormatException
                sum += val;
            }
        }
        return sum;
    }

/** Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,и возвращающий новый массив,
 каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
 Если длины массивов не равны, необходимо как-то оповестить пользователя.
 Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 * */

    public static int[] hw03(int[] arr1, int[] arr2){
        if(arr1.length != arr2.length){
            throw new RuntimeException("Длины массивов не равны!");
        }
        int[] res = new int[arr1.length];
        int a;
        for (int i = 0; i < arr1.length; i++) {
            a = arr1[i] / arr2[i];
            res[i] = a;

        }
        return res;
    }
}