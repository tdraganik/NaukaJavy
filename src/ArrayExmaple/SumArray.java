package ArrayExmaple;

public class SumArray {
    public static void main(String[] args) {
        int [] tablica = {2,4,6,8,0};
        int [] tablica2 = {1,3,5,7,0};

//       int suma = tablica[0] + tablica[1] + tablica[2] + tablica[3];
//       int suma2 = tablica2[0] + tablica2[1] + tablica2[2] + tablica2[3];
//       int suma3 =  tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica2[0] + tablica2[1] + tablica2[2] + tablica2[3];
//
//        System.out.println(suma);
//        System.out.println("Suma elementóœ tablicy 1: " + tablica[0] + tablica[1] + tablica[2] + tablica[3]);
//        System.out.println(suma2);
//        System.out.println("Suma elementów tablicy 2: " + tablica2[0] + tablica2[1] + tablica2[2] + tablica2[3]);
//        System.out.println("Suma elemwntów obu tablic: " + tablica[0] + tablica[1] + tablica[2] + tablica[3] +
//                tablica2[0] + tablica2[1] + tablica2[2] + tablica2[3]);
//        System.out.println(suma3);

//        int[][] dwieTabl = {tablica,tablica2};
//
//        System.out.println("Pierwsza para to : " + dwieTabl[0][0] + " "  + dwieTabl[1][0]);
//        System.out.println("Druga  para to : "   + dwieTabl[0][1] + " "  + dwieTabl[1][1]);
//        System.out.println("Trzecia  para to : " + dwieTabl[0][2] + " "  + dwieTabl[1][2]);
//        System.out.println("czwarta  para to : " + dwieTabl[0][3] + " "  + dwieTabl[1][3]);
//        System.out.println("Piąta    para to : " + dwieTabl[0][4] + " "  + dwieTabl[1][4]);
//
//        System.out.println("Wielkość tablicy dwietabl: " + dwieTabl.length);
//        System.out.println("tablica. lenght " +  tablica.length);
//        System.out.println("tablica2. lenght " + tablica2.length);
//        System.out.println("dwietabl[0] " + dwieTabl[0].length);
//        System.out.println("dwietabl[1] " + dwieTabl[1].length);

        int[][] array = new int[3][]; //chcemy tablicę złożoną z 3 tablic (wierszy)
        array[0] = new int[3]; //pierwsza tablica z 3 elementami (kolumnami)
        array[1] = new int[2]; //druga z dwoma
        array[2] = new int[1]; //trzecia w tylko jednym

        System.out.println(array[1][0]);
    }
}
