public class dateFashion {
    public static void main(String[] args) {
        System.out.println(dateFashion(5,10));
        System.out.println(dateFashion(5,2));

    }
    public  static int dateFashion(int you, int date){
        if (you<=2 || date<=2){
            return 0;
        }
        if (you>=2 ||date>=2){
            return 2;
        }
        return 1;
    }
}
