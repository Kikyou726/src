public class methodFan {
    public static void main(String[] args) {
        System.out.println("the sum from 1 to 10 " + sum(1, 10));
        System.out.println("the sum from 20 to 30 " + sum(20, 30));
        System.out.println("the sum from 30 to 50 " + sum(30, 50));
    }

    public static int sum(int i1, int i2) {
        int sum = 0;
        for (int i = i1; i <= i2; i++) {
            sum += i;
        }
        return sum;
    }
}
