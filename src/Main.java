public class Main {
    public static void main(String[] args) {

        System.out.println(" Homework " );

        //Задание 1

        System.out.println("Задание 1");

        byte a = 4;
        System.out.println("Значение переменной a c типом byte равно " + a );
        short b = 32000;
        System.out.println("Значение переменной b c типом short равно " + b );
        int c = 2000000000;
        System.out.println("Значение переменной c c типом byte равно " + c );
        long q = 2000;
        System.out.println("Значение переменной q c типом byte равно " + q );

        float d = 4.4F;
        System.out.println("Значение переменной f c типом byte равно " + d );
        double f = 3.5;
        System.out.println("Значение переменной f c типом byte равно " + f );

        //Задание 2
        System.out.println("Задание 2");

        double w = 27.12;
        System.out.println("Значение переменной w c типом byte равно " + w );
        long W = 987678965549L;
        System.out.println("Значение переменной W c типом byte равно " + W );
        double S = 2.786;
        System.out.println("Значение переменной S c типом byte равно " + S );
        short D = 569;
        System.out.println("Значение переменной D c типом byte равно " + D );
        short F = - 159;
        System.out.println("Значение переменной F c типом byte равно " + F );
        short G = 27897;
        System.out.println("Значение переменной G c типом byte равно " + G );
        byte g = 67;
        System.out.println("Значение переменной g c типом byte равно " + g );

        //Задание 3
        System.out.println("Задание 3");

        byte Ludmila = 23;
        System.out.println("Кол-во учеников у Людмилы " + 23 + " чел." );
        byte Anna = 27;
        System.out.println("Кол-во учеников у Анны " + 27 + " чел." );
        byte Ekaterina = 30;
        System.out.println("Кол-во учеников у Екатерины " + 30 + " чел." );
        short Paper = 480;
        System.out.println("Общее кол-во бумаги " + 480);
        long allStudents = Ekaterina + Anna + Ludmila;
        System.out.println("Общее кол-во учеников " + allStudents + " чел." );
        long paperStedents = Paper / allStudents;
        System.out.println("На каждого ученика расчитано " + paperStedents + " листов бумаги. " );

        // Задание 4
        System.out.println("Задание 4");
        int rate = 16;
        int bottlesIn20Minutes = rate * 10;
        int bottlesPerDay = rate * 60 * 24;
        int bottlesIn3Days = rate * 60 * 24 * 3;
        int bottlesInMonth = rate * 60 * 24 * 30;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Minutes + " штук бутылок");
        System.out.println("В сутки машина производит " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произведет " + bottlesInMonth + " штук бутылок");

        //Задание 5
        System.out.println("Задание 5");

        int totalClasses = 30;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int totalWhitePaint = totalClasses * whitePaintPerClass;
        int totalBrownPaint = totalClasses * brownPaintPerClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        //Задание 6
        System.out.println("Задание 6");

        int bananasWeight = 5 * 80;
        int milkWeight = 200 * 105 / 100;
        int iceCreamWeight = 2 * 100;
        int eggsWeight = 4 * 70;
        int totalWeightGrams = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        long totalWeightInKg = totalWeightGrams / 1000;
        System.out.println("Общий вес завтрака в граммах: " + totalWeightGrams);
        System.out.println("Общий вес завтрака в килограммах: " + totalWeightInKg);

        //Задание 7
        System.out.println("Задание 7");
        int targetWeightLoss = 7;
        int minDailyWeightLoss = 250;
        int maxDailyWeightLoss = 500;
        int daysFor250g = targetWeightLoss * 1000 / minDailyWeightLoss;
        int daysFor500g = targetWeightLoss * 1000 / maxDailyWeightLoss;
        int averageDays = (daysFor250g + daysFor500g) / 2;
        System.out.println("Дней, чтобы сбросить 7 кг при приеме 250 г в день: " + daysFor250g + " дней");
        System.out.println("Дней, чтобы сбросить 7 кг при приеме 500 г в день: " + daysFor500g + " дней");
        System.out.println("Среднее количество дней, необходимых для похудения: " + averageDays + " дней");


        //Задание 8
        System.out.println("Задание 8");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        double newSalaryMasha = salaryMasha + 6776;
        double newSalaryDenis = salaryDenis + 8369;
        double newSalaryKristina = salaryKristina + 7623;
        double annualIncreaseMasha = newSalaryMasha * 12 - salaryMasha * 12;
        double annualIncreaseDenis = newSalaryDenis * 12 - salaryDenis * 12;
        double annualIncreaseKristina = newSalaryKristina * 12 - salaryKristina * 12;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + annualIncreaseMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + annualIncreaseDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + annualIncreaseKristina + " рублей.");


    }
}