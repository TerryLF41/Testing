/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BubbleSort;

/**
 *
 * @author Terry Louis
 */
public class No1 {
    public static void main(String[] args) {
        int[] data={8, 7, 5, 9, 1, 3, 10, 6, 4, 2};

        for (int i=0; i<data.length; i++) {
            for (int j=1; j<data.length-i; j++) {
                if (data[j]>data[j-1]) {
                    int temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
        for (int i=0; i<data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
}
