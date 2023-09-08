import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int m[] = new int[]{40,3,48,76,16,96,43,10,46,72};


       for (int i = 0; i < 10; i++){
           System.out.print(m[i]+",");

           //System.out.print(Math.round(Math.random()*100)+",");

       }



    }



    public int[] quickSort(int[] array){
        if(array.length < 1) return array;




    }

    private int[] quickSort(int left, int right, int[] array){
        int pivot = array[(right-left)/2];
        //int left = 0;
        //int right = array.length - 1;
        int temp;

        while (left < right) {
            while (array[left] < pivot) left++;
            while (array[right] > pivot) right--;

            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
    }


    private void partition(int[] array) {


    }
}