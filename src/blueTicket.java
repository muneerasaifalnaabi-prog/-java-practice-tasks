public class blueTicket {
    public static void main(String[] args) {
        System.out.println(blueTicket(9,1,0));
        System.out.println(blueTicket(9,2,0));

    }
    public static int blueTicket(int a, int b, int c){
        if (a+b==10 || b+c==10 || a + c==10){
            return 10;

        }
        if (a+b==b+c +10 || a+b == c+a +10){
            return 5;
        }
        return 0;
    }
}
