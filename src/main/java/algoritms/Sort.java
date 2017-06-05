package algoritms;

import java.util.Arrays;

/**
 * Created by mixan on 05.06.2017.
 */
public class Sort {

    public int[] bubble(int[] arr){
        int max, changes = 1;

        while(changes != 0) {
            changes = 0;
            for (int i = 0; i < arr.length - 1; i++) {

                if (arr[i] > arr[i + 1]) {
                    max = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = max;
                    changes ++;
                }
            }
        }

        return arr;
    }

    public int[] insert(int[] arr){

        int min, tmp;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                min = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = min;
                for (int j = i; j > 0 && arr[j - 1] > min; j--) {
                    tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                }
            }
        }

        return arr;
    }

    public int[] cocktail(int[] arr){


        return arr;
    }

    public int[] pyramyd(int[] arr){


        return arr;
    }



    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 4, 3, 10, 7, 6, 9, 8, 0};
        System.out.println(Arrays.toString(new Sort().bubble(arr)));
        System.out.println(Arrays.toString(new Sort().insert(arr)));
    }
}
