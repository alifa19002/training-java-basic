package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class LetterGradeTest {

	@Test
	public void testGrade_fail() throws Exception {
        LetterGrade lettergrade = new LetterGrade();
        char grading = lettergrade.setGrade(10);
        if(grading != 'D'){
            System.out.println("GAGAL");
            //throw new Exception();
        }  

	}
    @Test
	public void testGrade_success() throws Exception {
        LetterGrade lettergrade = new LetterGrade();
        char grading = lettergrade.setGrade(10);
        if(grading == 'D'){
            System.out.println("SUCCESS");
            //throw new Exception();
        }  

	}

}