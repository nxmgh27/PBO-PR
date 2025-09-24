public class Toy {
    private String name;
    private double price;
    private int recommendedAge;

    public Toy(String name, double price, int recommendedAge) {
        this.name = name;
        this.price = price;
        this.recommendedAge = recommendedAge;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Recommended Age: " + recommendedAge + "+");
    }
}