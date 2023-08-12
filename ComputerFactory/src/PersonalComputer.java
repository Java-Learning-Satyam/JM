public class PersonalComputer extends Product {
    private Monitor monitor;
    private ComputerCase computerCase;
    private MotherBord motherBord;

    public PersonalComputer(String model, String manifacturer, Monitor monitor, ComputerCase computerCase,
                            MotherBord motherBord) {
        super(model, manifacturer);
        this.monitor = monitor;
        this.computerCase = computerCase;
        this.motherBord = motherBord;
    }

    private void drawLogo() {
        monitor.drawPixelAt(1200,50,"Blue");
    }

    public void powerUp(){
        computerCase.pressPowerButton();
        drawLogo();
    }

//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public MotherBord getMotherBord() {
//        return motherBord;
//    }
}
