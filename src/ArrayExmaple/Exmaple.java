package ArrayExmaple;

public class Exmaple {
    public static void main(String[] args) {
        double tabl [][] = new double [3][3];
        //double[][] tab = new double[3][];
        tabl[0][0] = 1;
        tabl[0][1] = 1.5;
        tabl[0][2] = 2;

        tabl[1][0] = 1.5;
        tabl[1][1] = 2;
        tabl[1][2] = 2.5;

        tabl[2][0] = 2;
        tabl[2][1] = 2.5;
        tabl[2][2] = 3;

        double sumaIloczynow =  (tabl[0][0] * tabl[1][1] * tabl[2][2]) + ( tabl[0][2] * tabl[1][1] * tabl[2][0] )  ;

        System.out.println("Suma iloczynów przekątnych tablicy: " + sumaIloczynow  );

    }
}
