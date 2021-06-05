class Recursion {
    public static void main(String[ ] args) {
        int result = factorial(4);
        System.out.println(result);
    }

    public static int factorial(int num) {
        if (num == 1) {
            return num;
        } else {
            return num * factorial(num - 1);
        }
    }
}
