import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Yucky{
  public static void main(String[] args){
    System.out.println("What size chocolate bar would you like to eat?");
    System.out.println("Enter '1' for 7 x 11");
    System.out.println("Enter '2' for 8 x 24");
    System.out.println("Enter '3' for 26 x 20");

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if (n == 1){
      YuckyGUI demo = new YuckyGUI(11, 7);
    }
    else if (n == 2){
      YuckyGUI demo = new YuckyGUI(24, 8);
    }
    else if (n == 3){
      YuckyGUI demo = new YuckyGUI(20, 26);
    }
    else {
      System.out.println("Hey! Please do not get greedy. There are only three options. Please try again.");
    }
  }
}
