public class ThreadSleepDemo {
    public static void main(String[] args) throws InterruptedException {
        String importantInfo[] = { "one", "two", "three", "four" };
        for (int i = 0; i < importantInfo.length; i++) {
            Thread.sleep(4000);
            System.out.println(importantInfo[i]);
        }
        for (String string : importantInfo) {
            Thread.sleep(4000);
            System.out.println(string);
        }
    }
}