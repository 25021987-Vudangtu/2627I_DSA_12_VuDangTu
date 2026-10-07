import java.util.*;

public class W4Bai7_CountingSort1 {

    public static void countingSort(List<Integer> arr) {
        int[] frequency = new int[100];

        for (int num : arr) {
            frequency[num]++;
        }
        for (int i = 0; i < 100; i++) {
            System.out.print(frequency[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        countingSort(arr);
        scanner.close();
    }
}