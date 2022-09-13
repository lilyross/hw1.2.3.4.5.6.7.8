public class Main {
    public static void main(String[] args) {
    // Задание 1
        System.out.println(" Задание 1 ");
    int dog = 8;
    System.out.println(" Значение переменной dog с типом int ровно " + dog);
    byte cat = 2;
    System.out.println(" Значение переменной cat с типом bute ровно " + cat);
    short horse = 4;
    System.out.println(" Значение переменной horse с типом short ровно " + horse);
    long giraffe = 150L;
    System.out.println(" Значение переменной giraffe с типом long ровно " + giraffe);
    double sandWeight = 1.1;
    System.out.println(" Значение переменной sandWeight с типом double ровно " + sandWeight);
    float stoneWeight = 15.5f;
    System.out.println(" Значение переменной stoneWeight типом float ровно " + stoneWeight);

    // Задание 2
        System.out.println(" Задание 2 ");
    float d = 27.12f;
    System.out.println(d);
    long l = 987_678_965_549L;
    System.out.println(l);
    double f = 2.786;
    System.out.println(f);
    char s = 569;
    System.out.println(s);
    short temp = -159;
    System.out.println(temp);
    boolean exTemp = false;
    System.out.println(exTemp);
    int un = 27897;
    System.out.println(un);
    byte b = 67;
    System.out.println(b);

    //Задание 3
        System.out.println(" Задание 3 ");
    int x = 23;
    int y = 27;
    int z = 30;
    int list = 480;
    int result = list / (x + y + z);
    System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

    //Задание 4
        System.out.println(" Задание 4 ");
    int bottle = 16;
    int min = 2;
        result = bottle * 10;
    System.out.println("За 20 минут машина произвела бутылок " + result + " штук");
    int oneDay = 60 * 24;
        result = bottle * (oneDay / min);
    System.out.println("За сутки машина произвела бутылок " + result + " штук");
    int threeDays = oneDay * 3;
        result = bottle * (threeDays / min);
        System.out.println("За трое суток машина произвела бутылок " + result + " штук");
    int oneMonth = threeDays * 10;
        result = bottle * (oneMonth / min);
    System.out.println("За один месяц машина произвела бутылок " + result + " штук");

    //Задание 5
        System.out.println(" Задание 5 ");
    int jar = 120;
    int white = 2;
    int brown = 4;
        result = jar / (white + brown);
    System.out.println(result);
    int cabinet = jar / (white +brown);
        result = cabinet * white;
    System.out.println(result);
        result = cabinet * brown;
    System.out.println(result);
    System.out.println("В школе, где " + cabinet + " классов, нужно " + result + " банок белой краски и " + result + " банок коричневой краски");

    //Задание 6
        System.out.println(" Задание 6 ");
        int banana =  5 * 80;
    System.out.println(banana);
    int milk = 2 * 105;
    System.out.println(milk);
    int icecream = 2 * 100;
    System.out.println(icecream);
    int eggs = 4 * 70;
    System.out.println(eggs);
    int weightGr = (banana + icecream + eggs + milk);
    System.out.println(weightGr);
    int grPerKg = 1000;
    System.out.println(grPerKg);
    float weightKg = weightGr / (float)grPerKg;
    System.out.println(weightKg);

    //Задание 7
        System.out.println(" Задание 7 ");
    int lossWeight1 = 7 * 1000;
    int days = lossWeight1 / 250;
    System.out.println(days + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
    int lossWeight2 = lossWeight1 / 500;
    System.out.println(lossWeight2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        result = (days + lossWeight2) / 2;
    System.out.println(result + " день в среднем уйдет на похудение у спортсмена");

    //Задание 8
System.out.println(" Задание 8 ");
int mashaGets = 67760;
System.out.println(mashaGets);
int denisGets = 83690;
System.out.println(denisGets);
int christeningGets = 76230;
System.out.println(christeningGets);
double mashaNowGets = mashaGets * 1.1;
System.out.println("Маша теперь получает " + mashaNowGets + " руб " + " Годовой доход увеличился на " + (mashaNowGets) % mashaGets + " руб ");
float denisNowGets = denisGets * 1.1f;
System.out.println("Денис тепрь получает " + denisNowGets + " руб " + "Годовой доход увеличился на " + (denisNowGets) % denisGets + " руб ");
double christeningNowGets = christeningGets * 1.1;
System.out.println("Кристина теперь получает " + christeningNowGets + " руб " + "Годовой доход увеличился на " + (christeningNowGets) % christeningGets + " руб ");
    }
}