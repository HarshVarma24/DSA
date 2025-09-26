import java.util.*;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int MOD = 1_000_000_007;
        int n = arr.length;

        int[] next = findNSE(arr);  
        int[] prev = findPSE(arr);  

        long ans = 0;
        for (int i = 0; i < n; i++) {
            long left = i - prev[i];
            long right = next[i] - i;
            ans = (ans + (arr[i] * left * right) % MOD) % MOD;
        }
        return (int) ans;
    }

    // Next Smaller Element (right)
    public static int[] findNSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, n); 
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }

    // Previous Smaller Element (left)
    public static int[] findPSE(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1); 
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            if (!st.isEmpty()) {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
}
