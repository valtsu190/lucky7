import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        // oikein

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int randomNum = 0;
        int randomNum2 = 0;
        int randomNum3 = 0;
        int money = 0;
        int score = 0;
        String input = "";
        String input2 = "";

        System.out.println("Syötä aloitus rahamäärä");

        input2 = in.nextLine();
        money = Integer.parseInt(input2);

        while (money > 0) {

            money = money - 1;

            randomNum = random.nextInt(10) + 1;
            randomNum2 = random.nextInt(10) + 1;
            randomNum3 = random.nextInt(10) + 1;

            System.out.println(randomNum);
            System.out.println(randomNum2);
            System.out.println(randomNum3);

            if (randomNum == 7) {
                score++;
            }
            if (randomNum2 == 7) {
                score++;
            }
            if (randomNum3 == 7) {
                score++;
            }

            if (score == 1) {
                money = money + 3;
            }

            else if (score == 2) {
                money = money + 5;

            } else if (score == 3) {
                System.out.println("Jackpot!");
                money = money + 10;
            }

            System.out.println("Rahan määrä = " + money);

            if (money <= 0) {
                System.out.println("You ran out of money!");
                break;
            }

            do {
                System.out.println("Haluatko pelata uudestaan? Y/N");
                input = in.nextLine();
            } while (!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));

            if (input.equalsIgnoreCase("n")) {
                System.out.println("Kiitos pelaamisesta!");
                break;
            }

            score = 0;
        }
    }
}
// Failed attempt 2
// Scanner in = new Scanner(System.in);
// Random random = new Random();

// String input = " ";
// int randomNumber = 0;
// int randomNumber2 = 0;
// int randomNumber3 = 0;
// int raha = 5;

// while (raha > 0) {

// randomNumber = random.nextInt(10) + 1;
// randomNumber2 = random.nextInt(10) + 1;
// randomNumber3 = random.nextInt(10) + 1;

// System.out.println(randomNumber);
// System.out.println(randomNumber2);
// System.out.println(randomNumber3);

// if (randomNumber == 7 || randomNumber2 == 7 || randomNumber3 == 7) {
// System.out.println("Sinä voitit");
// raha = raha + 3;

// System.out.println("Rahaa jäljellä = " + raha);

// }

// if (randomNumber == 7 && randomNumber2 == 7 || randomNumber == 7 &&
// randomNumber3 == 7
// || randomNumber2 == 7 && randomNumber3 == 7) {
// raha = raha + 5;
// System.out.println("Rahaa jäljellä = " + raha);
// }

// else {
// System.out.println("Sinä hävisit");
// raha = raha - 1;

// System.out.println("Rahaa jäljellä = " + raha);

// System.out.println("Do you want to play again? (Y=yes, N=no)");

// input = in.nextLine();

// if (!input.equalsIgnoreCase("y")) {
// break;
// }

// }

// }

// Failed attempt 1

// do {
// System.out.println("Arvotaan numeroa");

// randomNumber = random.nextInt(10) + 1;
// randomNumber2 = random.nextInt(10) + 1;
// randomNumber3 = random.nextInt(10) + 1;

// System.out.println(randomNumber);
// System.out.println(randomNumber2);
// System.out.println(randomNumber3);

// if (oikeaNumero == randomNumber && oikeaNumero == randomNumber2 &&
// oikeaNumero == randomNumber3) {
// System.out.println("Voitit");
// break;
// }

// } while (oikeaNumero != randomNumber && oikeaNumero != randomNumber2 &&
// oikeaNumero != randomNumber3);
