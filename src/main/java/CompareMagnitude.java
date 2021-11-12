import java.util.Scanner;

public class CompareMagnitude {

//    6.Написать программу которая будет сравнивать величину (magnitude) двух чисел.
//    Например, если одно число = 3, а второе число = -9, программа должна выдать, что число -9 имеет большую величину.

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();

        if (Math.abs(a) > Math.abs(b)){
            System.out.println("Число " + a + " имеет большую величину");
        }else if (Math.abs(a) < Math.abs(b)){
            System.out.println("Число " + b + " имеет большую величину");
        }else {
            System.out.println("Величина чисел " + a + " и " + b + " одинаковая.");
        }
    }


}
