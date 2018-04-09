import java.util.Random;

public class Massives {
    public static void main(String[] args) {
        int mas[] = new int[20];
        Random r = new Random();
        int k = 0, l = 0;

        for (int i = 0; i < mas.length; i++) {
            mas[i] = r.nextInt(20) - 10;
        }

        printMas(mas);

        for (int i = 0; i < mas.length; i++) {
            if ((mas[i] < 0 && mas[i] > mas[k]) || mas[k] >= 0) {
                k = i;
            } else if ((mas[i] > 0 && mas[i] < mas[l]) || mas[l] <= 0) {
                l = i;
            }
        }
        System.out.println(k + " " + l);

        int c = mas[k];
        mas[k] = mas[l];
        mas[l] = c;

        printMas(mas);
    }

    public static void printMas(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
