package se.lexicon;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;


public class wordPerMinute {

    static String[] words = {"caravan", "house", "dumpster", "daycare", "fabric", "daughter", "rumble", "royal", "tenderness", "water", "horse", "dog",
            "home", "garden", "roof", "mad", "doorway", "amazing", "trampoline", "hairdresser", "airplane", "potatoes", "ruler", "validate", "job"};



    public static void main(String[] args) throws InterruptedException {

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for( int i=0; i<10; i++) {
            System.out.print(words[rand.nextInt(9)] +" ");
        }
        System.out.println();

        double start =LocalTime.now().toNanoOfDay();

        Scanner scan = new Scanner(System.in);
        String typedWords = scan.nextLine();

        double end = LocalTime.now().toNanoOfDay();
        double elapsedTime = end - start;
        double seconds = elapsedTime/ 1000000000.0;
        int numberChars = typedWords.length();

        int wpm = (int) ((((double) numberChars / 5) / seconds) *60);

        System.out.println("Your words per minute is:" + wpm + "!");




    }
}