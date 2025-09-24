public class TestCylinder {
   public static void main(String[] args) {
      Cylinder c1 = new Cylinder();
      System.out.println("Cylinder c1:"
            + " radius=" + c1.getRadius()
            + " height=" + c1.getHeight()
            + " surface area=" + c1.getArea()
            + " volume=" + c1.getVolume());

      Cylinder c2 = new Cylinder(10.0);
      System.out.println("Cylinder c2:"
            + " radius=" + c2.getRadius()
            + " height=" + c2.getHeight()
            + " surface area=" + c2.getArea()
            + " volume=" + c2.getVolume());

      Cylinder c3 = new Cylinder(2.0, 10.0);
      System.out.println("Cylinder c3:"
            + " radius=" + c3.getRadius()
            + " height=" + c3.getHeight()
            + " surface area=" + c3.getArea()
            + " volume=" + c3.getVolume());

      Cylinder c4 = new Cylinder(2.0, 5.0, "blue");
      System.out.println(c4.toString());
   }
}
