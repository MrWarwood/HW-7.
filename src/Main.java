public class Main {
    public static void main(String[] args) {
        System.out.println("Д/З №7!");
        System.out.println();

        System.out.println("  Задача №1.");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        //в условиях задачи ничего не сказано про проценты


        System.out.println();
        System.out.println("  Задача №2.");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("  Задача №3.");
        int population = 12_000_000;
        //рождаемость 17 на 1000 населения
        //смертность 8 на 1000 населения
        //Год …, численность населения составляет
        for (int g = 1; g <= 10; g++) {
            population = population + population * 17 / 1000 - population * 8 / 1000;
            System.out.println("Год " + g + ", численность населения составляет " + population);
        }


        System.out.println();
        System.out.println("  Задача №4.");
        double savings = 15_000;
        int months = 0;
        //Как я понял из условий ,он положил деньги 1 раз и прибыль идет из процента банка
        do {
            savings = savings + savings / 100 * 7;
            months++;
            System.out.println(months + " месяц, сумма накоплений - " + savings);
        } while (savings < 12_000_000);


        System.out.println();
        System.out.println("  Задача №5.");
        double financing = 15_000;
        int monthsTask5 = 0;
        while (financing < 12_000_000) {
            financing = financing + financing / 100 * 7;
            monthsTask5++;
            if (monthsTask5 % 6 == 0) {
                System.out.println(monthsTask5 + " месец, сумма накоплений - " + financing);
            }
        }


        System.out.println();
        System.out.println("  Задача №6.");
        double financingForTask6 = 15_000f;
        int monthsTask6 = 0;
        int yearsOld9 = 9 * 12;
        while (monthsTask6 != yearsOld9) {
            financingForTask6 = financingForTask6 + financingForTask6 / 100 * 7;
            monthsTask6++;
            if (monthsTask6 % 6 == 0) {
                System.out.println(monthsTask6 + " месяц, сумма накоплений - " + financingForTask6);
            }
        }


        System.out.println();
        System.out.println("  Задача №7.");
        int friday = 3;
        for (; friday <= 31; friday += 7) {
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