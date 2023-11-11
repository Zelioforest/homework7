public class Main {
    public static void main(String[] args) {

        // tack 1
        System.out.println("Задание 1");
        int numberOfMonths = 0;
        int contribution = 15_000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + total / 100 * 12 + contribution;
            System.out.println("Месяц "  + numberOfMonths + ", сумма накоплений равна " + total + " рублей");
            numberOfMonths += 1;
        }
        System.out.println();

        // tack 2
        System.out.println("Задание 2");
        int i = 0;
        while (i < 11) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 0; --i) {
            System.out.print(i + " ");
        }
        System.out.println();

        // tack 3
        System.out.println("Задание 3");

        int people = 12_000_000;
        int died = people / 1000 * 8;
        int burn = people / 1000 * 17;
        for (i = i + 1; i <= 10; i++) {
            people = people + burn - died;
            System.out.println("Год " + i + ", численность населения составляет " + people);
        }
        System.out.println();

        // tack 4
        System.out.println("Задание 4");
        int precent = 7;
        int contrib = 15000;
        i = 0;
        while (contrib <= 12_000_000) {
            contrib = contrib + contrib / 100 * precent;
            i++;
            System.out.println("Месяц " + i + " накопление составляет " + contrib);
        }
        System.out.println();

        // tack 5
        System.out.println("Задание 5");
        i = 0;
        contrib = 15000;
        while (contrib <= 12_000_000) {
            contrib = contrib + contrib / 100 * precent;
            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " накопление составляет " + contrib);
            }
        }
        System.out.println();

        // tack 6
        System.out.println("Задание 6");

        int year = 9;
        int month = 12 * year;
        contrib = 15000;
        for (i = 1; i <= month; i++) {
            contrib = contrib + contrib / 100 * precent;
                if (i % 6 == 0) {
                    System.out.println("Месяц " + i + " накопление составляет " + contrib);
            }
        }
        System.out.println();

        // tack 7
        System.out.println("Задание 7");
        int day = 5;
        while (day <= 31) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            day = day + 7;
        }
        System.out.println();
        
        // tack 8
        System.out.println("Задание 8");
        int comet = 79;
        day = comet + 1800/comet * comet;
        while (day <= 2100) {
            System.out.println(day);
            day = day + comet;
        }
        System.out.println();



    }
}