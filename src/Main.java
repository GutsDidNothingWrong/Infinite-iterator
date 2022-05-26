public class Main {
    public static void main(String[] args) {
        for (int rand : new Randoms(0, 100)) {
            System.out.println("Случайное число: " + rand);
            if (rand == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
