public class in1To10 {
    public static void main(String[] args) {
        System.out.println(in1To10(5,false));
        System.out.println(in1To10(11,false));

    }
    public static boolean in1To10(int n, boolean outsideMode){
        if (outsideMode==false){
            if(n >= 1 && n <= 10){
                return true;
            }
        }
        if (outsideMode==true){
            if(n <= 1 || n >= 10){
                return true;

            }

        }
        return false;
    }
}
