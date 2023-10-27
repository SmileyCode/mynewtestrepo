import java.util.Arrays;

public class Main {

    //Вт, Пт в 19:00

    //Java-Разработка
    //Web-разработка -> Spring
    //Android-разработка -> Kotlin
    //Автотесты -> Selenium, Appium
    //.jar

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int result = pow(a, b);

        System.out.println(a + " в степени " + b + " = " + result);

        int c = 7;
        int d = 4;
        int result2 = pow(c, d);


        System.out.println(c + " в степени " + d + " = " + result2);

        double result3 = Math.pow(2,3);
        System.out.println(result3);

        int[] arr = {6, 1, 5, 8, 3};
        sortAndPrint(arr);

        String list = "Молоко,Яица,Хлеб,Сахар";
        String[] myArr = list.split(",");
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        System.out.println(list.toUpperCase());

        String a1 = new String("Строка1");
        String a2 = new String("строка1");

        if (a1.equals(a2)) {
            System.out.println("a1 = a2");
        } else {
            System.out.println("a1 != a2");
        }

        if (list.contains("Молоко")) {
            System.out.println("Молоко есть в списке");
        } else {
            System.out.println("Молока нет в списке");
        }

        String space = "   ";
        System.out.println("isBlank = " + space.isBlank());
        System.out.println("isEmpty = " + space.isEmpty());

        System.out.println(list.charAt(1));
        String newFromlist = list.substring(0, 7);
        System.out.println(newFromlist);
        System.out.println(newFromlist.endsWith("ко,"));

        String newString = "String 1 " + "String 2" + " String 3";
        //arr[] = {"String 1 String 2 String 3"}
        newString = newString.concat("String4");
        System.out.println(newString);

        StringBuilder sb = new StringBuilder();
        sb.append("New").append(" ");
        sb.append("String");
        sb.append(5);
        System.out.println(sb.toString());

        String resArr = String.join("!", myArr);
        System.out.println(resArr);

        printq(8,0);
        System.out.println(calc(2, 1));//1+2+3+4
    }

    public static Integer calc(int finishNum, int start) {
        if (start < finishNum) {
            return start + calc(finishNum, start + 1);
        }
        return finishNum;
    }

    //start = 1, finish = 3      1 + 5 == 6
    //start = 2, finish = 3      2 + 3 = 5
    //start = 3, finish = 3      3

    public static void printq(int a, int currrent) {
        if (a != currrent) {
            for (int i = 0; i < currrent; i++) {
                System.out.print("*");
            }
            System.out.println();
            printq(a, currrent + 1);
        }
    }

    public static int pow(int a, int b) {
        int result = a;
        for (int i = 0; i < b-1; i++) {
            result = result * a;
        }
        return result;
    }

    public static void sortAndPrint(int[] arr) {
        Arrays.sort(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

}