// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача 1\n");

        int q = 1;
        System.out.println("Значение переменной q с типом int равно " + q);
        byte w = 1;
        System.out.println("Значение переменной w с типом byte равно " + w);
        short e = 1;
        System.out.println("Значение переменной e с типом short равно " + e);
        long r = 1L;
        System.out.println("Значение переменной r с типом long равно " + r);
        float t = 1.1f;
        System.out.println("Значение переменной t с типом float равно " + t);
        double y = 1.1d;
        System.out.println("Значение переменной y с типом double равно " + y);

        System.out.println("\nЗадача 2\n");

        float z = 27.12f;
        long x = 987_678_965_549L;
        double c = 2.786;
        short v = 569;
        short b = -159;
        int n = 27897;
        byte m = 67;

        System.out.println("\nЗадача 3\n");

        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short totalPiecesOfPaper = 480;

        float piecesPerStudent = (float) totalPiecesOfPaper / (studentsLP + studentsAS + studentsEA);
        System.out.println("На каждого ученика рассчитано " + piecesPerStudent + " листов бумаги");

        System.out.println("\nЗадача 4\n");

        byte bottlesPerMinute = 8;
        int bottlesPer20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела … штук бутылок");
        System.out.println("За сутки машина произвела … штук бутылок");
        System.out.println("За 3 дня машина произвела … штук бутылок");
        System.out.println("За 1 месяц машина произвела … штук бутылок");

    }
}