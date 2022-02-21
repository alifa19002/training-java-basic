package com.gdn.onboarding.onboardingjava;

public class Calendar {
    public String getMonths (int num){
        switch(num){

            case 1:
            return "January";

            case 2:
            return "February";

            case 3:
            return "March";

            case 4:
            return "April";

            case 5:
            return "May";

            case 6:
            return "June";

            case 7:
            return "July";
            
            case 8:
            return "August";

            case 9:
            return "September";

            case 10:
            return "October";

            case 11:
            return "November";

            case 12:
            return "December";

            default:
            return "(wrong number)";
        }
    }
    public static void main(String[] args) {
        Calendar calendar = new Calendar();
        String month = calendar.getMonths(10);
        System.out.println("This month is = " + month);
	}
}
