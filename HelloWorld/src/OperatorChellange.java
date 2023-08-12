public class OperatorChellange {
    public static void  main(String[] arge) {
        double myVar1 = 20d;
        double myVar2 = 80d;
        double myAnswer = (myVar1 + myVar2) * 100d;
        System.out.println(myAnswer);
        double division = myAnswer % 40d;
        System.out.println(division);
        boolean isNoRemainder = (division == 0.00) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("got some remainder");
        }
    }
}
