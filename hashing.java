import java.util.*;

public class hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int arr[] = new int[x];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[13];
        // pre-computing
        for (int i = 0; i < x; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("Enter the no of query elements:");
        int q = sc.nextInt();

        while (q > 0) {
            int num = sc.nextInt();
            System.out.println(hash[num]);
            q--;
        }
    }
}