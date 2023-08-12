public class MbConverterChellange {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int kbToMb = kiloBytes/1024;
        int remanaing = kiloBytes % 1024;
        String feedback = kiloBytes < 0 ? ("Invalid Value") : (kiloBytes + " KB = " + kbToMb + " MB and " + remanaing + " KB");
        System.out.println(feedback);
    }
}