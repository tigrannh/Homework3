public class main {
    public static void main(String[] args) {
        // 1.Create an array and fill it with 2 number.
        int[] Array1 = new int[2];
        Array1[0] = 2;
        Array1[1] = 5;

        // 2.Create an array and fill it with numbers from 1:1000.
        int[] Array2 = new int[1000];
        for(int i = 0; i < Array2.length; i++){
            Array2[i] = i + 1;
        }

        //3.Create an array and fill it with odd numbers from -20:20
        int[] Array3 = new int[20];
        for(int i = 0, j = -20; i < Array3.length; i++, j+=2){
            Array3[i] = j + 1;
        }

        //4.Create an array and fill it. Print all elements which can be divided by 5.
        int[] Array4 = new int[]{5, 1, 46, 0, 10, 17, 35};
        for(int i = 0; i < Array4.length; i++){
            if(Array4[i] % 5 == 0) System.out.print(Array4[i] + " ");
        }

        System.out.println();

        //5.Create an array and fill it. Print all elements which are between 24.12 and 467.23.
        double[] Array5 = {1.0, 68.66, 598.33, 167.787, 24.12, 3.56, 400.23};
        for (int i = 0; i < Array5.length; i++) {
            if( Array5[i] > 24.12 && Array5[i] < 467.23) System.out.print(Array5[i] + " " );
        }

        System.out.println();

        //6.Create an array and fill it. Print count of elements which can be divided by 2.
        int[] Array6 = {3, 5, 12, 67, 122, 2202, 14, 15};
        int count = 0;
        for (int i = 0; i < Array6.length; i++) {
            if( Array6[i] % 2 == 0 ) ++count;
        }
        System.out.println("The count of elements which can be divided by 2 is " + count );

        //7. Given an integer, 0< N < 21 , print its first 10 multiples.
        //Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result.

        int N = 15;
        for(int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d", N, i, N*i);
            System.out.println();
        }
    }
}
