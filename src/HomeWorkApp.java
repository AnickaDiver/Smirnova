public class HomeWorkApp {
    public static void main(String[] args) {

       // printThreeWords();
        // checkSumSign();
       // printColor();
       // compareNumbers();

        boolean red = CompareNumbers(2, 5);
        System.out.println(red);

        String fun = PositiveNumber (8);
        System.out.println(fun);

        boolean sun = RightNumber(6);
        System.out.println(sun);
        PrintMessage("Hello", 4);

//        boolean night = LeapYear(2000);
//        System.out.println(night);
    }

    public static boolean CompareNumbers (int a, int b) {
return a + b >= 10 && a + b <= 20;
    }

    public static String PositiveNumber (int a) {
     if (a >= 0)
         return "Положительно";
     else
         return "Отрицательно";
    }
public static boolean RightNumber (int a) {
        return a < 0;
}
public static void PrintMessage (String message, int number) {
        int i;
    for (i = 1; i <= number; i++) {
        System.out.println(message);
}

}
// Попытка сделать задание 5.
//public static boolean LeapYear (int year) {
//        int year1;
//        for (year1 = 4; year1 > 0; year1 =+4)
//            if (year == year1 && year != 100);
//            return;
//
//}


    /*public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 7;
        int b = 21;
        int c = a +b;
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    public static void printColor() {
        int value = 5;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 8;
        int b = 31;
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
    }*/

}
