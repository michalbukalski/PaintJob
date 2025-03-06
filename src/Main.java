public class Main {
    public static void main(String[] args) {
        // Testowanie metody
        System.out.println(PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2)); // Powinno zwrócić -1 (błąd)
        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5, 2));  // Powinno zwrócić 3
        System.out.println(PaintJob.getBucketCount(2.75, 3.25, 2.5, 1)); // Powinno zwrócić 3

        System.out.println(PaintJob.getBucketCount(3.4, 2.1, 1.5)); // Powinno zwrócić 5
        System.out.println(PaintJob.getBucketCount(7.25, 4.3, 2.35)); // Powinno zwrócić 14

        System.out.println(PaintJob.getBucketCount(3.4, 1.5)); // Powinno zwrócić 3
        System.out.println(PaintJob.getBucketCount(6.26, 2.2)); // Powinno zwrócić 3
        System.out.println(PaintJob.getBucketCount(3.26, 0.75)); // Powinno zwrócić 5
    }
}