public class Square extends Rectangle {

   // No-arg constructor
   public Square() {
      super(1.0, 1.0);
   }

   // Constructor with side
   public Square(double side) {
      super(side, side);
   }

   // Constructor with side, color, filled
   public Square(double side, String color, boolean filled) {
      super(side, side, color, filled);
   }

   // Getter for side
   public double getSide() {
      return getWidth(); // atau getLength(), sama
   }

   // Setter for side
   public void setSide(double side) {
      super.setWidth(side);
      super.setLength(side);
   }

   // Override setWidth
   @Override
   public void setWidth(double side) {
      super.setWidth(side);
      super.setLength(side);
   }

   // Override setLength
   @Override
   public void setLength(double side) {
      super.setWidth(side);
      super.setLength(side);
   }

   @Override
   public String toString() {
      return "A Square with side=" + getSide() +
             ", which is a subclass of " + super.toString();
   }
}
