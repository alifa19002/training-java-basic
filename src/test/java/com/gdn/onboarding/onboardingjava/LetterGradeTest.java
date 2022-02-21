package com.gdn.onboarding.onboardingjava;

import org.junit.jupiter.api.Test;

public class LetterGradeTest {

	@Test
	public void testGrade_success() throws Exception {
        LetterGrade lettergrade = new LetterGrade();
        char grading = LetterGrade.setGrade(78);
        if (grading <= 'A' && grading >= 'D'){
            System.out.println("GAGAL");
            throw new Exception();
        }  

	}

}