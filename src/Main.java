public class Main {
    public static void main(String[] args) {
        BodyIndex bodyIndex = new BodyIndex();
        double weight = 80.00; // масса тела в килограммах
        double height= 1.70; // рост в метрах
        double index = bodyIndex.calculate(weight, height);
        System.out.println("Индкус массы тела равен: " + index);
    }
}