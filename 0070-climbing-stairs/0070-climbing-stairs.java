class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;

        int m = 1;
        int s = 2;
        for(int i=3; i<=n; i++) {
            int temp = m+s;
            m = s;
            s = temp;
        }
        return s;
    }
}