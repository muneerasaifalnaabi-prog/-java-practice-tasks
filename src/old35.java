public class old35 {
    public static void main(String[] args) {
        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));
    }
    public static boolean old35(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return false;
        }
        if (n % 3 == 0 || n % 5 == 0) {
            return true;
        }
        return false;
    }
}
