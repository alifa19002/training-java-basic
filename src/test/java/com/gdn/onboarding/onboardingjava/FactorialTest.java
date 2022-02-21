package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class FactorialTest {
    
    @Test
	public void testFactorial_fail() throws Exception {
        Factorial factorial = new Factorial();
        int fac = factorial.resultFactorial(3);
        if(fac!=6){
            System.out.println("GAGAL");
            //throw new Exception();
        }  

	}
}
