package ss4_class_object.bai_tap.stopWatch;

import java.util.Scanner;

public class StopWatchManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch time = new StopWatch();
        time.start();
        System.out.println("Nói chuyên với nhau chút đi bro");
        String a = sc.nextLine();;
        System.out.println("Nói đi mà");
        String b = sc.nextLine();
        System.out.println("Sao không nói gì hết vậy trời");
        time.stop();
        System.out.println(time.getElapsedTime() + " miliseconds");
    }
}
