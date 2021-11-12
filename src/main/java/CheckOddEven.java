import java.util.Scanner;

public class CheckOddEven {

//    2.Написать программу с названием “CheckOddEven”, которая печатает “Odd Number” если переменная “number” типа int нечетная.
//    Или “Even Number” если переменная четная.
//    Программа всегда должна перед выходом печатать “BYE”

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your number");
        int number = in.nextInt();

        if (number%2 == 0){
            System.out.println("Even Number");
        }else {
            System.out.println("Odd Number");
        }
        System.out.println("BYE");
    }
}
