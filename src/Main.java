public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();


    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + salary;
            System.out.println("Месяц " + total / salary + " Сумма накоплений равна  " + total + " рублей  ");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 1;
        int total = 0;
        while (total < 10) {
            total = total + i;
            System.out.print(total / i + " ");
        }
        System.out.println("");
        for (int a = 10; a > 0; a = a - 1) {
            System.out.print(a + " ");
        }
        System.out.println();}



    public static void task3() {
        System.out.println("Задача 3");{

            int population = 12_000_000;
            int i=1;
            int born = 17;
            int death = 8;
            int dif = born - death;
            while(  i <= 10){

                population += population * dif / 1000;



        System.out.println("год "+i+++" численность населения составляет "+population);
        } }}

    public static void task4() {
        System.out.println("Задача 4");{
            int salary = 15000;
            int total = 0;
            int i = 1;
            for (; total < 12_000_000; i++) {
                total = total + total/100*7;
                total = total + salary;
                if (i % 1 == 0) {
                    System.out.println("Месяц " + i + " Итого " + total);
                }
            }
            System.out.println(total);
                }}

    public static void task5() {
        System.out.println("Задача 5");{
            int salary = 15000;
            int total = 0;
            int i = 1;
            for (; total < 12_000_000; i++) {
                total = total + total/100*7;
                total = total + salary;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + " Итого " + total);
                }
            }
            System.out.println(total);
        }}

    public static void task6() {
        System.out.println("Задача 6");{
            int salary = 15000;
            int total = 0;
            int i = 1;
            for (; i <= 9*12; i++) {
                total = total + total/100*7;
                total = total + salary;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + " Итого " + total);
                }
            }
            System.out.println(total+" сумма накоплений за 9 лет ");
        }}
    public static void task7() {
        System.out.println("Задача 7");{
            int friday = 6;
            for (; friday <= 31; friday++) {
                if (friday % 7 == 6) {
                    System.out.println("«Сегодня пятница, " +friday + " число. Необходимо подготовить отчет».");
                }}}}

    public static void task8() {
        System.out.println("Задача 8");{
        int b = 2054;
        int a = 1896;
        for (; b>=a; a++ ) {

        if (a%79 ==0 ) {
        System.out.println( a);
         }}}}}








