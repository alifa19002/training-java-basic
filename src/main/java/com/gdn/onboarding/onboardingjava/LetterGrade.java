package com.gdn.onboarding.onboardingjava;

public class LetterGrade {
    public char setGrade(int nilai){
        if(nilai>=0 && nilai <26){
            return 'D';
        }
        else if(nilai>=26 && nilai <50){
            return 'C';
        }
        else if(nilai>=50 && nilai <75){
            return 'B';
        }
        else if(nilai>=75 && nilai <100){
            return 'A';
        }
        return 'X';
    }

    public static void main(String[] args) {
        LetterGrade lettergrade = new LetterGrade();
        char grading = lettergrade.setGrade(78);
        System.out.println("Grade yang didapat = " + grading);
		//SpringApplication.run(OnboardingJavaApplication.class, args);
	}
}