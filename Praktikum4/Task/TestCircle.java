public class TestCircle {
   public static void main(String[] args) {
      Circle c1 = new Circle();
      Circle c2 = new Circle(2.0);
      Circle c3 = new Circle(3.0, "blue");

      System.out.println(c1.toString());
      System.out.println(c2.toString());
      System.out.println(c3.toString());

      // Tes getter & setter
      c3.setColor("green");
      System.out.println("After setColor: " + c3.toString());
   }
}
