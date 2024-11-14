package dev.omuzalevska.amstrong;


public class Armstrong{

    public static void CheckArmstrong(int n){
        int originalNumber = n;
        int numberOfDigits = String.valueOf(n).length();
        int sum = 0;

        while (n != 0) {
            int digit = n % 10;  // остання цифра
            sum += Math.pow(digit, numberOfDigits);  // + піднесену до степеня
            n /= 10;  // Видаляємо останню цифру з числа
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " yes");
        } else {
            System.out.println(originalNumber + " not");
        }
    }
}