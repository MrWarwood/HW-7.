public class Main {
    public static void main(String[] args) {
        System.out.println("Д/З №7!");
        System.out.println();

        System.out.println("  Задача №1.");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        do {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            total = total + salary;
            month++;
        }
        while (total <= 2_459_00);


        System.out.println();
        System.out.println("  Задача №2.");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("  Задача №3.");
        int population = 12_000_000;
        //рождаемость 17 на 1000 населения
        //смертность 8 на 1000 носеления
        //Год …, численность населения составляет
        for (int g = 1; g <= 10; g++) {
            population = population + population * 17 / 1000 - population * 8 / 1000;
            System.out.println("Год " + g + ", численность населения составляет " + population);
        }


        System.out.println();
        System.out.println("  Задача №4.");
        int savings = 15_000;
        int months = 0;
        //Как я понял из условий ,он положил деньги 1 раз и приболь идет из процетна банка
        do {
            savings = savings + savings / 100 * 7;
            months++;
            System.out.println(months + " месец, сумма накоплений - " + savings);
        }
        while (savings < 12_000_000);


        System.out.println();
        System.out.println("  Задача №5.");
        int savings1 = 15_000;
        int months1 = 0;
        do {
            savings1 = savings1 + savings1 / 100 * 7;
            months1++;
            if (months1 % 6 == 0) {
                System.out.println(months1 + " месец, сумма накоплений - " + savings1);
            } else if (months1 % 6 != 0 && savings1 >= 12_000_000) {
                System.out.println(months1 + " месец, сумма накоплений - " + savings1);
            }
        } while (savings1 < 12_000_000);


        System.out.println();
        System.out.println("  Задача №6.");
        int savings2 = 15_000;
        int months2 = 0;
        int yearsOld9 = 9 * 12;
        do {
            savings2 = savings2 + savings2 / 100 * 7;
            months2++;
            if (months2 % 6 == 0) {
                System.out.println(months2 + " месец, сумма накоплений - " + savings2);
            } else if (months2 % 6 != 0 && months2 == yearsOld9) {
                System.out.println(months2 + " месец, сумма накоплений - " + savings2);
            }
        } while (months2 != yearsOld9);


        System.out.println();
        System.out.println("  Задача №7.");
        int friday = 3;
        for (; friday < 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }


        System.out.println();
        System.out.println("  Задача №8.");
        int currentYear = 2024;
        for (int x = 0; x < currentYear + 100; x += 79) {
            if (x > currentYear - 200) {
                System.out.println(x);
            }
        }
    }
}