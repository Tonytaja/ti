package project;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Pick {


    public static double computePolygonArea(int Peaks, double[] x, double[] y) {
        double sigma = 0;
        for (int i = 0; i < Peaks - 1; i++) {
            sigma += (x[i] * y[i + 1] - x[i + 1] * y[i]);
        }
        return (abs(sigma) / 2);
    }

    public void pickMethod() {
        Scanner in = new Scanner(System.in);
        System.out.println("How many polygons do you wish to enter?");
        int howManyPeaks = in.nextInt();

        double[] x = new double[howManyPeaks];
        double[] y = new double[howManyPeaks];


        for (int i = 0; i < howManyPeaks; i++) {


            System.out.println("Enter X " + i + " co-ordinates");
            x[i] = in.nextInt();
            System.out.println("Enter Y " + i + " co-ordinates");
            y[i] = in.nextInt();



        }
        double polygonArea = computePolygonArea(howManyPeaks, x, y);
        System.out.println("polygonArea = " + polygonArea);
    }

//    public static void main(String[] args) {
//
//
//        Scanner in = new Scanner(System.in);
//
//
//        System.out.println("How many polygons do you wish to enter?");
//        int howManyPeaks = in.nextInt();
//
//        double[] x = new double[howManyPeaks];
//        double[] y = new double[howManyPeaks];
//
//
//        for (int i = 0; i < howManyPeaks; i++) {
//            System.out.println("Enter X " + i + " co-ordinates");
//            x[i] = in.nextInt();
//            System.out.println("Enter Y " + i + " co-ordinates");
//            y[i] = in.nextInt();
//
//
//        }
//    }
}



