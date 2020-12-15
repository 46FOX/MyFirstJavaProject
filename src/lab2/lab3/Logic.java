package lab2.lab3;

public class Logic {

    public int compareNumbers(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;

        }
    }

    public String compareStrings(String value) {

        if (value.equals("FastTrack")) {
            return ("Learning text comparison");
        } else {
            return "Got to try some more";
        }
    }

    public int verifyinInterval(int aNumber) {
        if (aNumber >= 2 && aNumber <= 8) {
            return aNumber;
        } else {
            return -1;
        }
    }

    public String verifyTextAndNumberInterval(int number, String text) {
        if (text.equals("FastTrack") && number <= 3) {
            return (text + number);
        } else if (!text.equals("FastTrack") && number >= 4) {
            return (number + text);
        } else {
            return "";
        }

    }


    public String verifySnow(int number1) {
        if (number1 > 8 || number1 == 6) {
            return ("The amount of snow this winter was (cm)" + number1);
        } else {
            return ("The forecast snow is (cm)" + number1);
        }
    }

    public String verifyNumber(double w) {
        if ((w > 3) && (w != 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (w == 4) {
            return "The number is equal to 4";
        } else if (w < 3) {
            return "The number is lower than 3";
        } else {
            return "";
        }
    }

    public void eightCase(int number) {
        switch (number) {
            case 1:
                System.out.println("The number is 1");
                break;
            case 2:
                System.out.println("The number is 2");
                break;
            case 3:
                System.out.println("The number is 3");
                break;
            case 4:
                System.out.println("The number is 4");
            default:
                System.out.println("Not a valid number");


        }
    }

    public boolean isNumberEven(int number2) {
        if ((number2 % 2) == 0 ) {
            return true ;
        } else {
            return false;}

    }


    public boolean isEligibleToVote(double p ){
        if (p > 18) {
            return true ;
        } else {
            return false ;
        }
    }




}