public class Boks {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 40, 100, 40);
        Fighter f2 = new Fighter("B", 20, 50, 85, 30);

        Match match = new Match(f1, f2, 80, 100);
        match.run();
    }
}

