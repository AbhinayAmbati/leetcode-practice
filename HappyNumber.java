class HappyNumber {
    public boolean isHappy(int n) {
        while(n > 4) {
            n = digitSquareSum(n);
        }
        if(n == 1)
            return true;
        else
            return false;
    }
    public int digitSquareSum(int n) {
        int sum = 0;
        while(n > 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return sum;
    }
}