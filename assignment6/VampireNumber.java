package ankit.assignment6;

import java.util.Scanner;
/*
1. A vampire number v is a number with an even number of digits n, that can be factored into two numbers x and y each with n/2 digits and not both with trailing zeroes, 
where v contains precisely all the digits from x and from y, in any order.
Write a java program to print first 100 vampire numbers.
*/
public class VampireNumber {

    public static int countDigits(int number) {
        int count = 0;
        for (int i = number; i > 0; i /= 10) {
            count++;
        }

        return count;
    }

    public static int[] getFactors(int number, int count) {
        int lowerLimit = (int) Math.pow(10, count / 2 - 1);
        int upperLimit = (int) Math.pow(10, count / 2);

        int[] factors = new int[2];
        for (int i = lowerLimit; i < upperLimit; i++) {
            if (number % i == 0) {
                factors[0] = i;
                factors[1] = number / i;
            }
            if (checkFactors(number, factors, count)) {
                return factors;
            }
        }
        return factors;
    }

    public static boolean checkFactors(int number, int[] factors, int count) {
        if (countDigits(factors[0]) != count / 2 || countDigits(factors[1]) != count / 2) {
            return false;
        }

        if (factors[0] % 10 == 0 && factors[1] % 10 == 0) {
            return false;
        }

        int[] numsCount = new int[10];
        int[] factorsCount = new int[10];
        for (int i = number; i > 0; i /= 10) {
            int lastDigit = i % 10;
            numsCount[lastDigit]++;
        }

        for (int i = factors[0]; i > 0; i /= 10) {
            int lastDigit = i % 10;
            factorsCount[lastDigit]++;
        }

        for (int i = factors[1]; i > 0; i /= 10) {
            int lastDigit = i % 10;
            factorsCount[lastDigit]++;
        }


        for (int i = 0; i < 10; i++) {
            if (numsCount[i] != factorsCount[i]) {
                return false;
            }
        }

        return true;

    }

    public static void printVampireNumbers(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Printing first 100 vampire numbers");


        int number = 100;
        int vampireCount = 0;
        while (true) {
            int count = countDigits(number);

            if (count % 2 == 0) {
                int[] factors = new int[2];
                factors = getFactors(number, count);

                if (checkFactors(number, factors, count)) {
                    vampireCount++;
                    System.out.println("The "+vampireCount+" vampire no is: " + number);
                }
            }
            number++;
            if(vampireCount==100){
                break;
            }
        }
    }

    public static void main(String args[]) {
        printVampireNumbers();
    }
}
