package hw6;

//* ООП - объектно-ориентированное программирование. Основные принципы:
//1. Инкапсуляция - область видимости, реализована через модификаторы доступа:
//public - метод/класс будет доступен внутри всех пакетов всего проекта (99% случаев использует
//protected - внутри пакета и его наследникам, то есть дочерним классам, расположенных в других ＿
// --------- будет доступен только внутри текущего пакета (текущей папки);
//private - только внутри текущего класса (файла);
//2. Наследование - extends - это механизм, который позволяет создавать классы на основе
//других классов наследую их метады в дочерних (подчиненных) классах.
//3. Абстракция - означает выделение главных, наиболее значимых характеристик предмета и
//нооборот - отбрасывание второстепенных, незначительных.
//4. Полиморфизм - это способность программы идентично использовать объекты с одинаковым интерфейсом
// без информации о конкретном типе этого объекта.
// Мы можем работать со многими типами, как с одним (при условии, что эти типы являются производными (дочерними)
// от базового (разового) типа

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Вася",false,80);
        Human human2 = new Human("Маша",true,75);
        Human human3 = new Human("Толя",false,81);
        Human human4 = new Human("Нина",true,77);

        Human human5 = new Human("Петя",false,50, human1, human2);
        Human human6 = new Human("Лиза",true,45, human3, human4);

        Human human7 = new Human("Коля",false,52, human5, human6);
        Human human8 = new Human("Оля",true,47, human5, human6);

        Human human9 = new Human("Ваня",true,25, human7, human8);

        Cat cat = new Cat("Барсик", 10, 7);
        System.out.println(cat);

        Man man = new Man("Вася", 80, "ул. Пушкина");
        System.out.println(man);

//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        boolean needToStop = false;
//        while (!needToStop) {
//            String readed = sc.nextLine();
//            if ("сумма".equals(readed)) {
//                needToStop = true;
//            } else {
//                sum += Integer.parseInt(readed);
//            }
//        }
//        System.out.println(sum);
//Написать программу, которая:
//1. считывает с консоли число N, которое должно быть больше 0
//2. потом считывает N чисел с консоли
//3. выводит на экран максимальное из введенных N чисел

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//3
        int[] arr = new int[n];// [0, 1, 2]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(arr[n-1]);

    }

    public static class Man {
        private String name;
        private int age;
        private String address;

        public Man(String name, int age, String address) {
            setName(name);
            setAge(age);
            setAddress(address);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        @Override
        public String toString() {
            return name + ' ' + age + " " + address;
        }
    }

}
