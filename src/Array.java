//Допустим, требуется написать программу,
//в процессе работы которой будет сохраняться число пассажиров, перевезенных автобусом-
//экспрессом в аэропорт. Если автобус делает по десять рейсов в будние дни и по
//два рейса в субботу и воскресенье, то массив riders можно объявить так, как показано
//в приведенном ниже фрагменте кода. Обратите внимание на то, что длина массива по
//второму индексу для первых пяти элементов равна 10, а для двух последних - 2.

public class Array {

    public static void main (String[] args){
        int riders [][] = new int [7][];

        riders [0] = new int[10];
        riders [1] = new int[10];
        riders [2] = new int[10];
        riders [3] = new int[10];
        riders [4] = new int[10];
        riders [5] = new int[2];
        riders [6] = new int[2];

        int i, j;

       for (i=0; i<5; i++)
           for (j=0; j<10; j++)
               riders [i][j] = i + j + 10;
       for (i=5; i<7; i++)
          for (j=0; j<2; j++)
               riders [i][j] = i + j + 10;

        System.out.println("Koличecтвo пассажиров, перевезенных каждым рейсом, в будние дни недели:");

        for (i=0; i<5; i++) {
            for (j = 0; j<10; j++)
                System.out.println(riders[i][j] + " ");
        }
        System.out.println();


        System.out.println("Koличecтвo пассажиров, перевезенных каждым рейсом, в выходные дни:");

        for (i=5; i<7; i++) {
            for (j = 0; j < 2; j++)
                System.out.println(riders[i][j] + " ");
            System.out.println();

        }
    }
}
