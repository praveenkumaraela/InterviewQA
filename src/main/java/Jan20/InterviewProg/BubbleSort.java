package Jan20.InterviewProg;


import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        //System.out.print(performBubbleSort());

        int[] arrayData = new int[]{1, 4, 5, 6, 7, 2, 6};
        System.out.println(arrayData);
    bubbleSort(arrayData);
    }


    public static void bubbleSort(int arrayData[]){

        int size = arrayData.length;
        for(int temp = size; temp <= size; temp--){

            for(int i=0; i<= size-1; i++){
                if(arrayData[i] > arrayData[i +1]){
                    swap(arrayData, arrayData[i] , arrayData[i+1]);
                }
            }

            System.out.println(arrayData);
        }
    }

    private static int[] swap(int[] array, int i, int k) {

        int temp = i;
        array[i]= k;
        array[k] = temp;
        System.out.println(" = " + Arrays.toString(array));
        return array;
    }

}
