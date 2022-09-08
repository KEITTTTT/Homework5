public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();task2();task3();task4();
    }
    public static void task1(){
        // Задача 1
        for(int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // Задача 2
        for(int i = 10; i > 0; i--) {
            System.out.println(i);
        }

        // Задача 3
        for(int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача 4
        for(int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }

    public static void  task2() {

        // Задача 1
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        // Задача 2
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        // Задача 3
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }
    }

    public static void task3() {

        // Задача 1
        int contribution = 29000;
        int savings = 0;
        for (int i = 0; i < 12; i++) {
            savings = savings + contribution;
            System.out.println ( "Месяц " + i + " Сумма накоплений равна " + savings);
        }
    }
    public static void task4(){

        // Задача 2
        int contribution = 29000;
        int savings = 0;
        for (int i = 0; i < 12; i++){
            savings = savings + savings/100;
            savings = savings + contribution;
            System.out.println( " Месяц " + i + " Сумма накоплений равна " + savings);}


    }
}