import java.util.*;

    class SantaProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of toys
        int M = scanner.nextInt(); // Meters of Rafaelito
        int[] types = new int[N];
        int[] values = new int[N];

        for (int i = 0; i < N; i++) {
            types[i] = scanner.nextInt(); // Types
        }

        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt(); // Values
        }

        System.out.println(maxValue(N, M, types, values));
    }

    private static int maxValue(int N, int M, int[] types, int[] values) {
        int maxValue = 0;
        // Implementation for finding the maximum value of toys Rafaelito can collect
        // based on the provided conditions.
        
        // Your algorithm goes here.

        return maxValue;
    }
}
