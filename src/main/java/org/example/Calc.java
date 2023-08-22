package org.example;

public class Calc {
    public int sum(int a, int b) {
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
    public int multiplication(int a, int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }

    public double sqrt(int i) {
        if(i<0) throw new ArithmeticException();
        return Math.sqrt(i);
    }
}
