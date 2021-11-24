package LamdaExpression;

import java.util.List;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] x = {1,2,3,4,5};
        rotLeft(x,6);

    }

    public static void rotLeft(int[] a, int d) {
        // if number of rotations is more than the array length
        if (d> a.length)
            d=d% a.length;
        //if number of rotations is less than the array length
        if (d < a.length){
            while (d!=0){
                int first = a[0];
                for (int i=0;i<a.length-1;i++) {
                    a[i]=a[i+1];
                }
                a[a.length-1]=first;
                d--;
            }
        }
        //Print the array
        for (int elem: a)
            System.out.print(elem+" ");

    }
}
