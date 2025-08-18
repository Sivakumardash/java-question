package javaquestion;

public class finding_duplicate {

	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        int max = 0;
        for (int num : arr) {
            if (num > max) max = num;
        }
        int[] freq = new int[max + 1];

        System.out.print("Duplicates are: ");
        boolean found = false;
        for (int num : arr) {
            freq[num]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 1) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("No duplicates found");
        }
    }
}