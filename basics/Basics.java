import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Basics {
  public static void main(String[] args) {
  int num = 2;
  String word = "dog";
  int n = 5;

  System.out.println("I own " + num + " " + pluralize(num, word) + ".");
  flipNHeads(n);
  clock();
  }
 
  // === Making Words Plural === 
  public static String pluralize(int num, String word) { 
    // The following code considers edge cases: negative numbers. If it's exactly 1, go with the word, otherwise pluralize it. 
    if(num == 1) { 
      return word;
    } else {
    return word + "s";
    }
  }

  // === Flipping Coins ===
  // Notes: double randomNumber = random.nextDouble(); <--- this can create a range of 0 to 1?
  // Edge case: What if you want to pass in n = 0 <-- no problem. How about a negative number? <-- no problem.
  public static void flipNHeads(int n) {
    int max = 1;
    int min = 0;
    int headCounter = 0;
    int flips = 0;
    Random rand = new Random();
    
    while (headCounter < n) { 
      flips += 1;
      int randyNum = rand.nextInt((max - min) + 1);
      if (randyNum == 1) {
        headCounter += 1;
        System.out.println("heads");
      } else {
        headCounter = 0;
        System.out.println("tails");
      }
    } 
    System.out.println("It took " + flips + " flips to flip " + n + " heads in a row.");
  }

  // === Printing out the time on the second ===
  // learning note: if you decide to divide by 1000, you can represent it with 1_000, and Java will allow you to divide it still.
  // learning point: doubles: a number with a decimal point. They can be used to represent really large numbers, bigger than what an int can represent, however they lose some precision. 
  
  public static void clock(){
    LocalDateTime now = LocalDateTime.now();
    int oldSecond = now.getSecond();
    int counter = 0;

    while (true){
      now = LocalDateTime.now();
      counter += 1;
      int newSecond = now.getSecond();
      if(oldSecond != newSecond){ 
        oldSecond = newSecond;
        String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(currentTime + " " + counter + " Hz");
        counter = 0;
      }
    }  
  } 
}

