public class DogBarkChellange {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,4));
    }
    public static boolean shouldWakeUp (boolean barking , int hourOfTheDay){
        if (!barking  || (hourOfTheDay < 0||hourOfTheDay > 23) ){
            return false;
        } else if (hourOfTheDay < 8 || hourOfTheDay >= 22) {
            return true;
        } else {
            return false;
        }
    }
}
