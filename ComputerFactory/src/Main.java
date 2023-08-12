public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208","dell","240");
        Monitor theMonitor = new Monitor("27inch Beast","Acer",27,"2540 x 1440");
        MotherBord theMotherbord = new MotherBord("BJ-200","Asus",4,6,"v2.44");
        PersonalComputer thePC = new PersonalComputer("2208","Dell",theMonitor,theCase,theMotherbord);
//        thePC.getMonitor().drawPixelAt(10,10,"Blue");
//        thePC.getMotherBord().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }

}
