import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array =  new int[]{ -1,8,4,4,5,7};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

public static void bubbleSort(int[] array){
       int len =  array.length;

       for(int i = 0; i < len-1; i++) {
           boolean isSwapped = false;
           for (int j = 0; j < len - i - 1; j++) {
               if (array[j] > array[j + 1]) {
                   int temp = array[j];
                   array[j] = array[j + 1];
                   array[j + 1] = temp;
                   isSwapped = true;
               }
           }
           if(!isSwapped){
               break;
           }
       }

}



}


