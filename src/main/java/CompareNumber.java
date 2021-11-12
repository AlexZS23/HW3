import java.util.Scanner;

public class CompareNumber {

//    4.Написать программу, которая сравнивает два числа типа int и определяет, какое из чисел большее, а какое меньшее.
//    Программа должна вывести что-то типа “The number x has the greatest value”.
//    Где “x” одно из чисел

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = in.nextInt();
        System.out.println("Please enter the second number");
        int b = in.nextInt();

        if (a>b){
            System.out.println("The number " + a + " has the greatest value");
        }else if (a<b){
            System.out.println("The number " + b + " has the greatest value");
        }else {
            System.out.println("The numbers " + a + " and " + b + " are equal");
        }
    }


}
