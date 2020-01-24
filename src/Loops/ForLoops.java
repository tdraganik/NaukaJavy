package Loops;

import javax.swing.*;
import java.util.Scanner;

public class ForLoops {

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if(i % 2 == 0){
//                continue;
//            }
//            System.out.println("Pierwsza pętla " + i);
//        }
//        for(int i = 0; i < 10; i ++){
//            if(i==5){
//                break;
//            }
//            System.out.println("druga pętla: " + i);
//        }
//
//
        int tablica[] = {1,4,7,8,9,3,6,8,2};

        for (int value : tablica) {
            System.out.print(value + " ");
        }


    }

}
