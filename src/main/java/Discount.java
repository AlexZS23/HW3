import java.util.Scanner;

public class Discount {

//    Сумма покупки составляет а$. Если а больше 1000$, то предоставляется скидка 15%.
//    Вывести на экран сумму покупки с учетом скидки либо сообщение о том, что скидка не предоставляется.

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите сумму Вашей покупки");
        float sum = in.nextFloat();
        float discount = (float) 0.15;

        if (sum > 1000){
            System.out.println("Сумма покупки с учетом скидки составляет " + (sum - sum*discount));
        }else {
            System.out.println("Скидка на указанную сумму не распространяется");
        }


    }
}
