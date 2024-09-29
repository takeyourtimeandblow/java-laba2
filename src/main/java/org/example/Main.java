package org.example;

public class Main {
    public static void main(String[] args) {

        String distance =  String.format("%.2f", distance(0, 0, 2, 1));

        System.out.println(distance);

        System.out.println(distance(2, 1, 3, 1));

        System.out.println(tribonacci(4));
    }

    //exercise 1
    public static boolean isTriangle(int a, int b, int c) {
        if ((a & b & c) > 0)
            if (a+b > c && b+c > a && a + c > b)
                return true;
        return false;
    }

    //exercise 2
    public static double distance (double x1, double y1, double x2, double y2) {
        //c^2 = (x)^2 + (y)^2

        double distance;
        double x = Math.abs(x2-x1);
        double y = Math.abs(y2-y1);

        distance = Math.sqrt( x*x + y*y );

        return distance;
    }

    //exercise 3
    public static double powerLoop(double a, int n) {
        double a_= a;
        for (int i=2; i<=n; i++){
            a*=a_;
        }
        return a;
    }

    //exercise 4
    public static double power(double a, int n) {
        if(n<0 || a<0)
            return -1;
        if (n==0)
            return 1;
        if (n>1)
            return a*(power(a, n-1));
        return a;
    }

    //exercise 5
    public static int tribonacci(int n){
        if( n == (0 | 1) || n<0)
            return 0;
        if(n == 2)
            return 1;
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }

}

//отчёт в word обязательно