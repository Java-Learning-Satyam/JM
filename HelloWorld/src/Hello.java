public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello, Satyam");

        boolean isAllean = false;
        if (isAllean == false) {
            System.out.println("This is no an allien");
            System.out.println("And im scared allien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you have got the high score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Grater than second top score and less than 100");
        }



        int newvalue = 50;
        if (newvalue == 50) {
            System.out.println("this is an erreo which was solved");
        }

        String makerOfCar = "Volkswargen";
        boolean isDomestic = makerOfCar == "Volkswargen" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }
    }
}
