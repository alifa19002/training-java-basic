package com.gdn.onboarding.onboardingjava;

public class Factorial {
    private int result = 1;
    public int resultFactorial(int num){
        for(int i=1;i<=num;i++){
            result = 1 * i;
        }
        return result;
    }
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int fac = factorial.resultFactorial(5);
        System.out.println("Hasil Faktorial = " + fac);
	}
}
