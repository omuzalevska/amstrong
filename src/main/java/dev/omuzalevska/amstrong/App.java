package dev.omuzalevska.amstrong;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input int: ");
        int n = scanner.nextInt();
        
        Armstrong.CheckArmstrong(n);
  
        scanner.close();
    }
}
