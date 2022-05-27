import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        // Main.main(null);
        System.out.println("Hello world!");

        //Primitive types
        byte number1 = 127;
        short number2 = 200;
        char number3 = 200;
        char character = 'A';
        int number4 = 100_000;
        long number5 = 50000000000L;
        long number6 = 50000000000L;
        float f1 = 8.3F;
        boolean b = true;

        //Reference types
        String a = "apple";
        String b2 = new String("apple");
        System.out.println(a.equals(b2));
        System.out.println(b2.isBlank());
        System.out.println(b2.startsWith("a"));
        Main m = new Main();

        //Operators
        System.out.println(5 % 7);  //Ennek az eredménye 5 lesz.
        System.out.println(18 / 10); //1 lesz az eredménye.
        System.out.println(18.0 / 10); //1.8 lesz az eredménye.
        System.out.println(18D / 10); //1.8 lesz az eredménye.
        System.out.println(18F / 10); //1.8 lesz az eredménye.
        System.out.println((double) 18 / 10); //1.8 lesz az eredménye. (típuskényszerítés)
        System.out.println((float) 18 / 10); //1.8 lesz az eredménye.
        System.out.println(5 == 6); //false
        System.out.println(5 != 6); //true
        System.out.println(5 > 2 && 6 == 6); //logikai és, && akkor igaz, ha mindkét operandus igaz
        System.out.println(5 > 2 || 6 == 6); //logikai vagy, || akkor igaz, ha legalább az egyik operandus igaz

        //Branches (Elágazások): If, switch, ?:operator
        //Írjuk ki az osztályzatot a pontszám alapján.
        int points = 87;
        if (points >= 90) {
            System.out.println(5);
        } else if (points >= 80) {
            System.out.println(4);
        } else if (points >= 70) {
            System.out.println(3);
        } else if (points >= 60) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }

        /*
        A felhasználótól kérjünk be egy pozitív, egész számot.
        Ha 3-mal osztható, írjuk ki, hogy “Buzz”, ha 5-tel osztható, akkor “Fizz”, ha 3-mal és 5-tel is osztható,
        akkor pedig “Luss” jelenleg meg.
         */
        int number = 15;
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Luss");
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else if (number % 5 == 0) {
            System.out.println("Fizz");
        }
    /*
    switch(kifejezés) {
		case minta1: utasítások; break;
        case minta2: utasítások; break;
        case minta3: utasítások; break;
        case minta4: utasítások; break;
        default: utasítások;
}
     */
    /*
    A felhasználó egy bolygó nevét adja meg (Mars, Vénusz, Föld, Jupiter) és válaszul
    a Naptól mért távolságot kapja.
    (Nem a távolság a lényeg, elég valamilyen nagy számot visszaadni.)
     */
        String planet = "Föld";
        switch (planet) {
            case "Mars":
                System.out.println(20000);
                break;
            case "Vénusz":
                System.out.println(30000);
                break;
            case "Föld":
                System.out.println(40000);
                break;
            case "Jupiter":
                System.out.println(50000);
                break;
            default:
                System.out.println("No planet");
                break;
        }
    }
}