package ss8_clean_code_and_refactory.bai_tap.tennis;

import java.util.Scanner;

public class TestTennisGame {
    public static void main(String[] args) {
        TennisGame tennisGame = new TennisGame();
        Scanner c = new Scanner(System.in);
        System.out.println("Nhập score cho player 1 : ");
        int input = c.nextInt();
        System.out.println("Nhập score cho player 2 : ");
        int input2 = c.nextInt();
        System.out.println(tennisGame.getScore(input, input2));
    }
}
