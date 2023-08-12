public class Dog extends Animal{

   private String earShape;
   private String tailShape;

   public Dog(String type, double weight){
      this(type, weight, "Preky","Curled");
   }
   public Dog(String type,  double weight, String earShape, String tailShape) {
      super(type, weight < 15 ? "small" : (weight < 35 ? "medium": "large"), weight);
      this.earShape = earShape;
      this.tailShape = tailShape;
   }

   public Dog() {
      super("Mutt", "Big" ,50);
   }

   @Override
   public String toString() {
      return "Dog{" +
              "earShape='" + earShape + '\'' +
              ", tailShape='" + tailShape + '\'' +
              "} " + super.toString();
   }

   @Override
   public void move(String speed) {
      super.move(speed);
      if (speed == "slow") {
         walk();
         wagtail();
      } else {
         run();
         bark();
      }
      System.out.println();
   }

   private void bark() {
      System.out.println("Woooo bhou bhou! ");
   }

   private void run() {
      System.out.println("Dog Running ");
   }

   private void walk() {
      System.out.println("Dog walking ");
   }
   private void wagtail() {
      System.out.println("Tail Wagging ");
   }
}
