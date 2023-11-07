import Default.SafeInput;

import java.util.Random;
import java.util.Scanner;


public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        for (int e = 0; e < dataPoints.length; e++) {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }

        System.out.print("DataPoints: ");
        for (int e = 0; e < dataPoints.length; e++) {
            System.out.printf("%d", dataPoints[e]);
            if (e < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println("\n");


        int sum = 0;
        for (int e : dataPoints) {
            sum += e;
        }
        double average = (double) sum / dataPoints.length;

        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + average);
        int searchTarget = SafeInput.getRangedInt("Enter a value between 1 and 100: ", 1, 100);
        int count = 0;
        for (int e : dataPoints) {
            if (e == searchTarget) {
                count++;
            }
        }
        System.out.println("The value " + searchTarget + " was found " + count + " times in the dataPoints array.");
        int position = -1;
        for (int e = 0; e < dataPoints.length; e++) {
            if (dataPoints[e] == searchTarget) {
                position = e;
                break;
            }
        }
        if (position != -1) {
            System.out.println("The value " + searchTarget + " was found at array index " + position);
        } else {
            System.out.println("The value " + searchTarget + " not found in the array.");
        }
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int e : dataPoints) {
            if (e < min) {
                min = e;
            }
            if (e > max) {
                max = e;
            }
        }
        System.out.println("Minimum value in dataPoints: " + min);
        System.out.println("Maximum value in dataPoints: " + max);
        System.out.printf("Average of dataPoints is: %s%n", getAverage(dataPoints));
    }
    public static double getAverage(int values[]) {
        int sum = 0;
        for (int e : values) {
            sum += e;
        }
        return (double) sum / values.length;
    }
    public static int min(int values[]) {
        int min = values[0];
        for (int e : values) {
            if (e < min) {
                min = e;
            }
        }
        return min;
    }

    public static int max(int values[]) {
        int max = values[0];
        for (int e : values) {
            if (e > max) {
                max = e;
            }
        }
        return max;
    }

    public static int occuranceScan(int values[], int target) {
        int count = 0;
        for (int e : values) {
            if (e == target) {
                count++;
            }
        }
        return count;
    }

    public static int sum(int values[]) {
        int sum = 0;
        for (int e : values) {
            sum += e;
        }
        return sum;
    }
}



