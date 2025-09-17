public class TestShape {
   public static void main(String[] args) {
      Shape s1 = new Shape();
      Shape s2 = new Shape("blue", false);

      CircleShape c1 = new CircleShape();
      CircleShape c2 = new CircleShape(2.0, "yellow", true);

      Rectangle r1 = new Rectangle();
      Rectangle r2 = new Rectangle(2.0, 5.0, "red", false);

      Square sq1 = new Square();
      Square sq2 = new Square(4.0, "purple", true);

      System.out.println(s1.toString());
      System.out.println(s2.toString());
      System.out.println(c1.toString());
      System.out.println(c2.toString());
      System.out.println(r1.toString());
      System.out.println(r2.toString());
      System.out.println(sq1.toString());
      System.out.println(sq2.toString());

      sq2.setSide(7.0);
      System.out.println("After setSide(7): " + sq2.toString());
   }
}
