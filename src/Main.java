//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1:");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("Задача 2:");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println("Задача 3:");
        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        System.out.println("Задача 4:");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("Задача 5:");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        System.out.println("Задача 6:");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }

        System.out.println("Задача 7:");
        //1 2 4 8 16 32 64 128 256 512
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }

        System.out.println("Задача 8:");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 12; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + " Сумма накоплений равна " + total+ " рублей");
        }
            System.out.println("К концу года сумма накоплений " +total);

        System.out.println("Задача 9:");
            int salaryOne = 29000;
            double totalOne = 0;
            for (int i = 1; i < 12; i++) {
                totalOne = totalOne * 1.01f;
                totalOne += salaryOne;
                System.out.println(String.format("Месяц %d, сумма накоплений равна %.0f рублей.", i + 1, totalOne));
            }

            System.out.println("Задача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" +i+ "=" +2*i);
        }
    }
}