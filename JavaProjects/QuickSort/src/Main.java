import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //int m[] = new int[]{4,3,8,7,9,1,4,1,6,2};
        //int m[] = new int[]{4,3,8,7,9,11,14,11,16,12};
        int m[],l;

        Scanner scanner = new Scanner(System.in);

        while(true) {

            l = (int) Math.round(Math.random() * 20);
            m = new int[l];

            for (int i = 0; i < l; i++) {
                m[i] = (int) Math.round(Math.random() * 100);
                System.out.print(m[i] + ",");
                //System.out.print(Math.round(Math.random()*100)+",");
            }
            System.out.println("");
            quickSort(m);
            for (int i = 0; i < l; i++) {
                System.out.print(m[i] + ",");
                //System.out.print(Math.round(Math.random()*100)+",");
            }
            scanner.nextLine();
        }

        //System.out.println(" ");


        /*for (int i = 0; i < 10; i++){
            System.out.print(m[i]+",");

            //System.out.print(Math.round(Math.random()*100)+",");

        }*/

    }



    public static void quickSort(int[] array){
        quickSort(array, 0, array.length-1);
    }

    private static void quickSort(int[] array, int left, int right){
        //System.out.println("--------------------quickSort  left:"+left+" right:"+right+"---------------------------");

        if(left >= right) {

            //System.out.println("--------------------EXIT  left:"+left+" right:"+right+"---------------------------");
            return;
        }

        int pivot = array[left + (right-left)/2];
        int temp, r  = right, l = left;

        /*System.out.println("START pivot:"+pivot+" index pivot:"+(left + (right-left)/2)+" l:"+l+" r:"+r);
        for (int i = left; i <= right; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.println("");*/

        while (l <= r) {
            while (array[l] < pivot) {l++; /*System.out.println("--------------l++:"+l+"-----------------");*/}
            while (array[r] > pivot) {r--; /*System.out.println("--------------r--:"+r+"-----------------");*/}

            if(l <= r) {
                //System.out.println("--------------replace-----------------");
                //System.out.println("l:" + l + "(" + array[l] + ")" + "r:" + r + "(" + array[r] + ")");
                temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;


                /*System.out.println("--------------after replace l:"+l+" r:"+r+"------------------");
                for (int i = left; i <= right; i++) {
                    System.out.print(array[i] + ",");
                }*/
            }

        }


        //System.out.println("");


        //System.out.println("-----------pered quickSort1 left:"+left+" r:"+r+"--------------");
        quickSort(array, left, r);
        // System.out.println("-----------pered quickSort2 l:"+l+" right:"+right+"--------------");
        quickSort(array, l, right);
    }



}