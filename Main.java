public class Main {

    public static void main(String[] args) {

        //Calling the method to see the day it is
        printDayOfTheWeek(-1);
        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);

        System.out.println("Mid Week");

        printDayOfTheWeeks(4);
        printDayOfTheWeeks(5);
        printDayOfTheWeeks(6);
        printDayOfTheWeeks(7);

    }

    //Creating a method using the logic with "switch".
    public static void printDayOfTheWeek(int day) {

        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    //Creating another method with the if-else logic
    public static void printDayOfTheWeeks(int day) {

        if (day == 0) {
            System.out.println("Sunday");
        } else if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }
}
