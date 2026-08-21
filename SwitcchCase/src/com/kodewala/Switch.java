package com.kodewala;

public class Switch {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        String output = Switch.identifyDay(number);
        System.out.println("output " + output);
    }

    public static String identifyDay(int number) {
        String day = null;

        switch (number) {
            case 1:
                day = "mon";
                break;
            case 2:
                day = "tues";
                break;
            case 3:
                day = "wed";
                
                break;
            case 4:
                day = "thru";
                break;
            case 5:
                day = "fri";
                break;
            case 6:
                day = "sat";
                break;
            case 7:
                day = "sun";
                break;
            default:
                day = "unknown";
                break;
        }

        return day;
    }
}