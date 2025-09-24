public class TestGoods {
    public static void main(String[] args) {
        Food mango = new Food("Mango", 1.5, 95);
        Toy bricks = new Toy("Bricks", 25.0, 8);
        Book novel = new Book("Bumi", 45.0, " Tere Liye");

        System.out.println("=== Food ===");
        mango.display();

        System.out.println("\n=== Toy ===");
        bricks.display();

        System.out.println("\n=== Book ===");
        novel.display();
    }
}
