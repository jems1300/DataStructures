public class Main {
    public static void main(String[] args) {

        System.out.println("10:" + Algorithm(10));
        System.out.println("100:" + Algorithm(100));
        System.out.println("1000:" + Algorithm(1000));
        System.out.println("10000:" + Algorithm(10000));
    }
    // Use this to track your time
    public static Long Algorithm(int n) {
        Long startTime;
        Long endTime;
        Long elapsedTime;

        startTime = System.nanoTime();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        endTime = System.nanoTime();
        elapsedTime = endTime - startTime;
        return elapsedTime;
    }
}