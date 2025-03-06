public class PaintJob {
    // Metoda z czterema parametrami
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1; // Sprawdzenie poprawności danych wejściowych
        }

        double wallArea = width * height; // Obliczenie powierzchni ściany
        int neededBuckets = (int) Math.ceil(wallArea / areaPerBucket); // Obliczenie liczby potrzebnych wiader

        return Math.max(0, neededBuckets - extraBuckets); // Uwzględnienie dodatkowych wiader
    }

    // Przeciążona metoda z trzema parametrami
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1; // Sprawdzenie poprawności danych wejściowych
        }

        double wallArea = width * height;
        return (int) Math.ceil(wallArea / areaPerBucket); // Obliczenie liczby potrzebnych wiader
    }

    // Przeciążona metoda z dwoma parametrami
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1; // Sprawdzenie poprawności danych wejściowych
        }

        return (int) Math.ceil(area / areaPerBucket); // Obliczenie liczby potrzebnych wiader
    }
}
