package com.techsharezone.bootifycrudawsrds.misc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FindMyBinaryNumber
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter any number");
        Integer inputNumber = scanner.nextInt();
        final int[] result = new int[Math.max(0, Integer.bitCount(inputNumber) - 1)];

        inputNumber >>>= Integer.numberOfTrailingZeros(inputNumber) +1;

        String binaryNumber = Integer.toBinaryString(inputNumber);
        System.out.println("You've entered " + inputNumber + " number, and it's binary number representation is: " + binaryNumber + " and binary gap is: " + findBinaryGap(binaryNumber));
    }
    public static Integer findBinaryGap(String binVal) {
        Integer retVal = 0;
        String splitVal[] = binVal.split("1");
        int endVal = splitVal.length;
        if (binVal.endsWith("0")) {
            endVal = endVal - 1;
        }
        for (int incr = 0; incr < endVal; incr++) {
            if (retVal < splitVal[incr].length()) {
                retVal = splitVal[incr].length();
            }
        }
        return retVal;
    }
}
