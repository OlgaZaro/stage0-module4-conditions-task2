package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public static void main(String[] args) {
        GreatestNumberPrinter greatestNumberPrinter = new GreatestNumberPrinter();
        greatestNumberPrinter.printGreatest(5,7);
    }
    public void printGreatest(int first, int second) {
        int max = first > second ? first : second;
    }
}
