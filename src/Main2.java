import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Ввести с клавиатуры два числа m и n.
//Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
//
//Пример: m=2, n=4
//8888
//8888
//
//2
//Используя цикл for вывести на экран прямоугольный треугольник из восьмёрок со сторонами 10 и 10.
//
//Пример вывода на экран:
//8
//88
//888
//8888
//88888
//888888
//8888888
//88888888
//888888888
//8888888888
//
//3
//
//Ввести с клавиатуры три числа, вывести на экран среднее из них.
//Т.е. не самое большое и не самое маленькое.
//Если все числа равны, вывести любое из них.
//
//4
//Вводить с клавиатуры числа.
//Если пользователь ввел -1, вывести на экран сумму всех введенных чисел и завершить программу.
//-1 должно учитываться в сумме.
//
//Подсказка: один из вариантов решения этой задачи, использовать конструкцию:
//
//while (true) {
//    int number = считываем число;
//    if (проверяем, что number -1)
//        break;
//}
//
//
//5
//Вывести на экран таблицу умножения 10х10 используя цикл while.
//Числа разделить пробелом.
//
//Пример вывода на экран:
//1 2 3 4 5 6 7 8 9 10
//2 4 6 8 10 12 14 16 18 20
//3 6 9 12 15 18 21 24 27 30
//4 8 12 16 20 24 28 32 36 40
//5 10 15 20 25 30 35 40 45 50
//6 12 18 24 30 36 42 48 54 60
//7 14 21 28 35 42 49 56 63 70
//8 16 24 32 40 48 56 64 72 80
//9 18 27 36 45 54 63 72 81 90
//10 20 30 40 50 60 70 80 90 100
//
//6
//Ввести с клавиатуры строку name.
//Ввести с клавиатуры дату рождения (три числа): y, m, d.
//
//Вывести на экран текст:
//"Меня зовут name.
//Я родился d.m.y"
//
//Пример вывода:
//Меня зовут Вася.
//Я родился 15.2.1988
public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*1

        1. Создать массив на 10 строк.
        2. Ввести с клавиатуры 8 строк и сохранить их в массив.
        3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.*/

//        System.out.println("Task 1");
//        String[] arr1 = new String[10];
//        for (int i = 0; i < 8; i++) {
//            arr1[i] = scanner.nextLine();
//        }
//        for (int i = arr1.length - 1; i >= 0; i--) {
//            System.out.println(arr1[i]);
//        }
//
//        System.out.println();
//        System.out.println("-----------------------------------------------------------------------------------------");
//        System.out.println();
//
//            /*
//            *2
//
//            1.1. Создай массив на 10 чисел
//            1.2. Считай с консоли 10 чисел и заполни ими массив
//            2. Найти максимальное число из элементов массива
//            * */
//        System.out.println("Task2");
//        int[] arr2 = new int[10];
//        for (int i = 0; i < arr2.length; i++) {
//            arr2[i] = scanner.nextInt();
//        }
//        int maxi = Integer.MIN_VALUE;
//        for (int i : arr2) {
//            if (maxi < i) {
//                maxi = i;
//            }
//        }
//        System.out.println("Максимальное число массива arr2: " + maxi);
//
//        System.out.println();
//        System.out.println("-----------------------------------------------------------------------------------------");
//        System.out.println();
//
//        /*
//        3.
//        1. Создать массив на 10 строк.
//        2. Создать массив на 10 чисел.
//        3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
//        4. В каждую ячейку массива чисел записать длину строки из массива строк,
//        индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
//        */
//        System.out.println("Task 3");
//
//        int[] arr3Int = new int[10];
//        String[] arr3Str = new String[10];
//        for (int i = 0; i < arr3Str.length; i++) {
//            arr3Str[i] = scanner.nextLine();
//            arr3Int[i] = arr3Str[i].length();
//        }
//        for (int i : arr3Int) {
//            System.out.print(i + " ");
//        }
//
//        System.out.println();
//        System.out.println("-----------------------------------------------------------------------------------------");
//        System.out.println();
//
//
//        /*
//        4
//
//        1. Создать массив на 10 чисел.
//        2. Ввести с клавиатуры 10 чисел и записать их в массив.
//        3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
//        */
//
//        System.out.println("Task 4");
//        int[] arr4 = new int[10];
//        for (int i = 0; i < arr4.length; i++) {
//            arr4[i] = scanner.nextInt();
//        }
//        for (int i = arr4.length - 1; i >= 0; i--) {
//            System.out.println(arr4[i]);
//        }
//
//        System.out.println();
//        System.out.println("-----------------------------------------------------------------------------------------");
//        System.out.println();
//
//        /*
//        5
//        1. Создать массив на 20 чисел.
//        2. Ввести в него значения с клавиатуры.
//        3. Создать два массива на 10 чисел каждый.
//        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
//        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
//        */
//        System.out.println("Task 5");
//        int[] arr5 = new int[20];
//        for (int i = 0; i < arr5.length; i++) {
//            arr5[i] = scanner.nextInt();
//        }
//        int[] arr5Num1 = new int[10];
//        int[] arr5Num2 = new int[10];
//
////        arr5Num1 = Arrays.copyOfRange(arr5, 0, 9);
////        arr5Num2 = Arrays.copyOfRange(arr5, 10, 19);
//        for (int i = 0; i < arr5.length; i++) {
//            if (i < arr5.length / 2) {
//                arr5Num1[i] = arr5[i];
//            } else {
//                arr5Num2[i - 10] = arr5[i];
//            }
//        }
//
//        System.out.println("Массив arr5Num1: ");
//        for (int i : arr5Num1) {
//            System.out.println(i);
//        }
//        System.out.println("Массив arr5Num2: ");
//        for (int i : arr5Num2) {
//            System.out.println(i);
//        }
//
//        System.out.println();
//        System.out.println("-----------------------------------------------------------------------------------------");
//        System.out.println();

        /*
        6
        Создать массив на 20 чисел.
        Заполнить его числами с клавиатуры.
        Найти максимальное и минимальное числа в массиве.
        Вывести на экран максимальное и минимальное числа через пробел.
         */
        System.out.println("Task 6");
        int[] arr6 = new int[20];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = scanner.nextInt();
            if (arr6[i] > max) {
                max = arr6[i];
            }
            if (arr6[i] < min) {
                min = arr6[i];
            }
        }
        System.out.println("Max = " + max + " Min = " + min);

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println();


//        7
//        Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.

        System.out.println("Task 7");
        int[] arr7 = new int[20];
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = scanner.nextInt();
        }
        sortBub(arr7);
        for (int i : arr7) {
            System.out.print(i + " ");
        }

    }

    public static int[] sortBub(int[] array) {
        boolean stop = false;
        while (!stop) {
            stop = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                    stop = false;
                }
            }
        }
        return array;
    }

}
