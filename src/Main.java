public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println( "Task 1" );

        int a = 232323;
        byte b = 100;
        short c = 3233;
        long d = 432423425324L;
        float i = 234.324F;
        double f = 35.4324235554;

        System.out.println("int a = " + a);
        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("long d = " + d);
        System.out.println("float i = " + i);
        System.out.println("double f = " + f);

        System.out.println(" Task2 ");
        float i1 = 27.12f;
        long d1 = 987_678_965_549L;
        float i2 = 2.786f;
        int a1 = 569;
        short c1 = -159;
        short c2 = 27897;
        byte b1 = 67;

        System.out.println(" Task3 ");
        int LudmilaClassSize = 23;
        int AnnaClassSize = 27;
        int EkaterinaClassSize = 30;

        double PaperAmount = 480;
        int AllStudentsAmount = LudmilaClassSize + AnnaClassSize + EkaterinaClassSize;
        double AmountPaperInStudents = PaperAmount / AllStudentsAmount;
        System.out.println(" На каждого ученика рассчитано " + AmountPaperInStudents + " листов бумаги ");

        System.out.println(" Task4 ");
        int MacihinWorkPerMinute = 16 / 2;
        int MachineWorkPerTwentyMinute = MacihinWorkPerMinute * 20;
        int minutesPerDay = 60 * 24;
        int MachineWorkPerOneDay = MacihinWorkPerMinute * minutesPerDay;
        int MachinWorkPerThreeDays = MachineWorkPerOneDay * 3;
        int MachinWorkPerMonth = MachineWorkPerOneDay * 31;
        System.out.printf("За 20 минут машина произвела %s штук бутылок\n",MachineWorkPerTwentyMinute);
        System.out.printf("За 1 день машина произвела %s штук бутылок\n",MachineWorkPerOneDay);
        System.out.printf("За 3 дня машина произвела %s штук бутылок\n",MachinWorkPerThreeDays);
        System.out.printf("За месяц машина произвела %s штук бутылок\n",MachinWorkPerMonth);

        System.out.println(" Task5 ");
        int AllCanMount = 120;
        int whiteCanAmountPerClass = 2;
        int brownCanAmountPerClass = 4;
        int amountOfClass = AllCanMount / (whiteCanAmountPerClass + brownCanAmountPerClass);
        double whiteCanAmount = whiteCanAmountPerClass * amountOfClass;
        double brownCanAmount = brownCanAmountPerClass * amountOfClass;
        System.out.printf("В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски", amountOfClass , whiteCanAmount , brownCanAmount );
        System.out.println(" Task 6" );
        
        int BananesAmount = 5;
        int MilkAmount = 200;
        int IceCreamAmount = 2;
        int EgsAmount = 4;

        int BananWeight = 80;
        int MilkWeight = 105;
        int IceCreamWeight = 100;
        int EgsWeight = 70;

        int BananaBreakfast = BananesAmount * BananWeight;
        int MilkBreakfast = (MilkAmount / 100) * MilkWeight;
        int IceCreamBreakfast = IceCreamAmount * IceCreamWeight;
        int EgsBreakfast = EgsAmount * EgsWeight ;

        int SummaryBreakfastWeight = BananaBreakfast + MilkBreakfast +
                IceCreamBreakfast + EgsBreakfast;
        double SummaryBreakfastWeightKilogramm = SummaryBreakfastWeight / 1000.0;
        System.out.printf(" Завтрак в граммах %s, а в килограммах %s",
                SummaryBreakfastWeight , SummaryBreakfastWeightKilogramm );

        System.out.println(" Task 7 " );
        int targetWeightKilos = 7;
        int targetWeightGramm = targetWeightKilos * 1000;
        double daysAmountWith500 = targetWeightGramm / 500;
        double daysAmountWith250 = targetWeightGramm / 250;
        double averageDaysAmount = (daysAmountWith500 + daysAmountWith250) / 2;
        System.out.println("С похуданием в 500 грамм = " + daysAmountWith500);
        System.out.println("С похуданием в 250 грамм = " + daysAmountWith250);
        System.out.println("С похудением в среднем  = " + averageDaysAmount);

        System.out.println(" Task 8 " );

        double SalaryIncreasePercentage = 1.1;
        int SalaryMasha = 67760;
        int SalaryDenis = 83690;
        int SalaryKristina = 76230;

        int yearSalaryMasha = SalaryMasha * 12;
        int yearSalaryDenis = SalaryDenis * 12;
        int yearSalaryKristina = SalaryKristina * 12;

        double newSalaryMasha = SalaryMasha * SalaryIncreasePercentage;
        double newSalaryDenis = SalaryDenis * SalaryIncreasePercentage;
        double newSalaryKristina = SalaryKristina * SalaryIncreasePercentage;

        double yearNewSalaryMasha = newSalaryMasha * 12;
        double yearNewSalaryDenis = newSalaryDenis * 12;
        double yearNewSalaryKristina = newSalaryKristina * 12;

        double differenceSalaryMasha = yearNewSalaryMasha - yearSalaryMasha;
        double differenceSalaryDenis = yearNewSalaryDenis - yearSalaryDenis;
        double differenceSalaryKristina = yearNewSalaryKristina - yearSalaryKristina;

        System.out.printf("Маша теперь получает %s рублей. Годовой доход вырос на %s рублей %n",
                newSalaryMasha ,
                differenceSalaryMasha  );
        System.out.printf("Денис теперь получает %.1f рублей. Годовой доход вырос на %.1f рублей%n",
                newSalaryDenis ,
                differenceSalaryDenis  );
        System.out.printf("Кристина теперь получает %s рублей. Годовой доход вырос на %s рублей%n",
                newSalaryKristina ,
                differenceSalaryKristina  );
;













    }
}