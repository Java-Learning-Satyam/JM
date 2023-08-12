public class Main {
    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number) {
//        int column = number;
//        int row = number;
        for (int col = 0; col < number; col++) {
            for (int row = 0 ; row < number; row++){
                if (row == 0 || row == number-1 || col == 0 || col == number-1 || row == col || row + col == number -1) {
                    System.out.print("*");
                    System.out.print(col + row);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
