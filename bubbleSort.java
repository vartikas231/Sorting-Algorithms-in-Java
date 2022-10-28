package Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        System.out.println("Array before sorting"+ Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after sorting"+ Arrays.toString(arr));
    }

    static void sort(int [] arr){
        int length=arr.length;
        for(int i=0;i<length;i++){
            boolean isSorted=true;
            for(int j=0;j<length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }

            }
            if(isSorted){
                break;
            }
        }


    }
}
