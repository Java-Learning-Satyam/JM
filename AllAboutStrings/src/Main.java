public class Main {
    public static void main(String[] args) {
      printInFormation("Hello World");
      printInFormation("");
      printInFormation("\t  \n");

      String helloWorld = "Hello world";
      System.out.printf("index of r  = %d %n", helloWorld.indexOf('r'));
      System.out.printf("index of World  = %d %n", helloWorld.indexOf("world"));

      System.out.printf("index of l  = %d %n", helloWorld.indexOf("l"));
      System.out.printf("index of l  = %d %n", helloWorld.lastIndexOf('l'));

      System.out.printf("index of l  = %d %n", helloWorld.indexOf('l',3));
      System.out.printf("index of l  = %d %n", helloWorld.lastIndexOf('l' ,8));

      String helloWorldLower = helloWorld.toLowerCase();
      if (helloWorld.equals(helloWorldLower)) {
          System.out.println("Values matches Exactly");
      }
      if (helloWorld.equalsIgnoreCase(helloWorld)) {
          System.out.println("Values match ignoring case");
      }
      if (helloWorld.startsWith("Hello")) {
          System.out.println("String Starts with Hello");
      }
        if (helloWorld.endsWith("world")) {
            System.out.println("String ends with world");
        }
        if (helloWorld.contains("Hello")) {
            System.out.println("String contains hello");
        }

        if (helloWorld.contentEquals("Hello world")) {
            System.out.println("String is same");
        }
    }

    public static void printInFormation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);

        if (string.isEmpty()){
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()){
            System.out.println("String is blank");
        }
        System.out.printf("First char = %c %n", string.charAt(0));

        System.out.printf("Last char = %c %n", string.charAt(length -1));

    }
}
