import java.io.PrintStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Task 1
        System.out.println("Задание 1");
        int sum = 0;
        int i = 0;
        while (sum < 2459000) {
            i++;
            sum = sum + 15000;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + sum);
        }
        System.out.println(i + " месяцев потребуется для накопления");
        // Task 2
        System.out.println("  ");
        System.out.println("Задание 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + "  ");
        }
        System.out.println("  ");
        for (a = 10; a > 0; a--) {
            System.out.print(a + "  ");
        }
        System.out.println("  ");

        // Task 3

        System.out.println("  ");
        System.out.println("Задание 3");
        int population = 12000000;
        int death = 8;
        int birth = 17;
        int year = 0;
        int bith = (Math.abs(death - birth) * population) / 1000;
        do {
            year++;
            population = population + bith;
            System.out.println("Год " + year + " , численность населения составляет " + population);
        } while (year < 10);

        // Task 4

        System.out.println("  ");
        System.out.println("Задание 4");
        double deposit = 0;
        int constantDeposit = 15000;
        int month = 0;
        double percent = 0.07;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        String result = decimalFormat.format(deposit);
        while (deposit < 11000000) {
            month++;
            deposit += deposit * percent + constantDeposit;
            System.out.println(String.format("Месяц %d , сумма накоплений равна " + decimalFormat.format(deposit), month));
        }
        System.out.println(month + " месяцев потребуется для накопления");


        // Task 5
        System.out.println("  ");
        System.out.println("Задание 5");
        double deposit5 = 0;
        int month5 = 0;
        int constantDeposit5 = 15000;
        double percent5 = 0.07;
        DecimalFormat decimalFormat5 = new DecimalFormat("#.##");
        String result5 = decimalFormat5.format(deposit5);
        while (deposit5 < 11000000) {
            month5++;
            deposit5 += deposit5 * percent5 + constantDeposit5;
            if (month5 % 6 == 0) {
                System.out.println(String.format("Месяц %d , сумма накоплений равна " + decimalFormat.format(deposit5), month5));
            }
        }
        System.out.println(month5 + " месяцев потребуется для накопления");

        // Task 6

        System.out.println("  ");
        System.out.println("Задание 6");
        double deposit6 = 0;
        int yearM = 108;
        int month6 = 1;
        double percent6 = 0.07;
        DecimalFormat decimalFormat6 = new DecimalFormat("#.##");
        String result6 = decimalFormat.format(deposit6);
        while (month6 < yearM) {
            month6++;
            deposit6 += deposit6 * percent6 + 15000;
            if (month6 % 6 == 0) {
                int yearN = 1;
                yearN = month6 / 12;
                System.out.println(String.format("Месяц %d , %d год, сумма накоплений равна " + decimalFormat.format(deposit6), month6, yearN));
            }
        }

        // Task 7

        System.out.println("  ");
        System.out.println("Задание 7");
        int day = 1;
        while (day < 31) {
            day++;
            if (day % 7 == 0) {
                System.out.println(String.format("Сегодня пятница , %d -е число. Необходимо подготовить отчет.", day));
            }
        }


        // Task 8

        System.out.println("  ");
        System.out.println("Задание 8");
        int yearPast = 1824;
        int yearNow = 2024;
        int yearFuture = 2124;
        while (yearPast <= yearFuture) {
            yearPast++;
            if (yearPast % 79 == 0) {
                System.out.println(yearPast);
            }
        }
    }
}



