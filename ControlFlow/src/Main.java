public class Main {
    public static void main(String[] args) {

//        int value = 1;
//        if(value == 1) {
//            System.out.println("value was 1");
//        } else if (value == 2) {
//            System.out.println("value was 2");
//        } else {
//            System.out.println("Was ont 1 or 2");
//        }

        int switchValue = 3;
        switch (switchValue) {
            case 1 -> System.out.println("value was 1");
            case 2 -> System.out.println("value was 2");
            case 3, 4, 5 -> { //to test multiple value using switch case
                System.out.println("Was a 3, a 4 , or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("was not 1, 2, 3, 4, or 5");

        }
        System.out.println("The result  " + getQuater("JAN"));

    }

    public static String getQuater(String month) {
        return switch (month) {
            case "JAN", "FEB", "MARCH", "APR" -> "1st";
            case "MAY", "JUM", "JULY", "AUG" -> "2st";
            case "SEPT", "OCT", "NOV", "DEC" -> "3st";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };

    }
}
