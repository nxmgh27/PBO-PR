public class CircleShape extends Shape {
   private double radius;

   // No-arg constructor
   public CircleShape() {
      super();          // call Shape()
      this.radius = 1.0;
   }

   // Constructor with radius
   public CircleShape(double radius) {
      super();          // default Shape
      this.radius = radius;
   }

   // Constructor with radius, color, filled
   public CircleShape(double radius, String color, boolean filled) {
      super(color, filled);
      this.radius = radius;
   }

   // Getter & Setter
   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   // Methods
   public double getArea() {
      return Math.PI * radius * radius;
   }

   public double getPerimeter() {
      return 2 * Math.PI * radius;
   }

   @Override
   public String toString() {
      return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
   }
}
