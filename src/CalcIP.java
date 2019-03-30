public class CalcIP {
    public static void main(String[] args){
        int x = 64;

        int i = 128;
        while (i > 0) {
            if (x >= i) {
                x -= i;
                System.out.print("1");
            } else
                System.out.print("0");
            i /= 2;


        }
    }
}
