package Arrays;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        System.out.println("Array before sorting" + Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after sorting" + Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int length=arr.length;
        for(int i=1;i<length;i++){
            int temp=arr[i];
            int j=i-1;
            for(;j>=0;j--){
                //left me jaana
                if(arr[j]>temp)
                arr[j+1]=arr[j];
                //vahin ruk jaana
                else if(temp>arr[j]){
                    break;
                }
            }
            arr[j+1]=temp;
        }
    }
}
