public class Main {
    public static void main(String[] args) {
    for(double rate = 2.0 ; rate <= 5.0; rate ++){
        double interestAmount = calculateInresst(10000.0,rate);
        System.out.println("10,000 at " + rate + "% interest = " +interestAmount);
    }

    for(double i = 7.5 ; i <= 10.0; i +=0.25){
        double interestAmount = calculateInresst(100.0,i);
        System.out.println("$100 at " + i + "% interest = $" +interestAmount);
        }
    }
    public static double calculateInresst(double amount , double interestRate) {
        return (amount * (interestRate / 100));
    }
}
