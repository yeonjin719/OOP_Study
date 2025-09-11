public class Prac10 {
    public static void main(String[] args) {
        double[] arr1 = {1.1, 2.3, 4.7, 7.5};
        double[] arr2;
        arr2 = new double[4];
        arr2[0] = 1.1;
        arr2[1] = 2.3;
        arr2[2] = 4.7;
        arr2[3] = 7.5;
        System.out.printf("arr1 = { %.1f, %.1f, %.1f, %.1f }\narr1의 길이: %d\n", arr1[0], arr1[1], arr1[2], arr1[3], arr1.length);
        System.out.printf("arr2 = { %.1f, %.1f, %.1f, %.1f }\narr2의 길이: %d", arr2[0], arr2[1], arr2[2], arr2[3], arr2.length);
    }
}
