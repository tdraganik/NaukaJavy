package AbstractClass.AnonymousClasses;

public class CompareNumbers {
    public static void main(String[] args) {
        int [] tab = {1,3,5,7,9,11,13,17,23,29,-4,-6,0 };

        BigestNumber nc = new BigestNumber(){
            //wygląda na obiekt interfejsu ale to klasa anomimowa
            @Override
            public int takeBiggest(int[] tab) {
                if(tab == null)
                    throw new NullPointerException("Argument nie może być pusty");
                if(tab.length == 0 )
                    throw new IllegalArgumentException("Tablica musie mieć co najmniej jedną wartość" );

                int biggestNumber = tab[0];   // zakładamy, że pierwszy element tablicy jest największy

                for (int i = 0; i < tab.length; i++) {
                    if(biggestNumber < tab[i]){

                        biggestNumber = tab[i];
                    }
                }
                return biggestNumber;
            }
        };

        System.out.println("Największa liczba to: " + nc.takeBiggest(tab));
    }
}
