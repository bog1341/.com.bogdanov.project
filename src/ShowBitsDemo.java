class ShowBits{
    int numbits;

    ShowBits(int n){
        numbits = n;
    }

    void show(long val){
        long mask = 1;
        mask <<= numbits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1){
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0){
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}


public class ShowBitsDemo {
    public static void main(String args[]){
        ShowBits b = new ShowBits(8);
        ShowBits i = new ShowBits(16);
        ShowBits li = new ShowBits(32);

        System.out.print("123 в двоичном: ");
        li.show(123);

        System.out.print("\n87987 в двоичном: ");
        li.show(87987);

        System.out.print("\n237658768 в двоичном: ");
        li.show(237658768);

        System.out.print("\nМладшие биты 87987: ");
        b.show(87987);
    }
}
