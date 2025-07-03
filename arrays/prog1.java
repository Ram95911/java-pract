public class prog1 {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 5, 2 };

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Using for-each loop:");

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
