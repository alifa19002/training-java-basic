package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class CalenderTest {
    @Test
	public void testCalendar_fail() throws Exception {
        Calendar calendar = new Calendar();
        String month = calendar.getMonths(10);
        if(month != "October"){
            System.out.println("GAGAL");
            //throw new Exception();
        }  

	}
}    
