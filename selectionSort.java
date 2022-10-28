package Arrays;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[]={9,8,7,6,1,2,3,0,5};
        System.out.println("Array before sorting "+ Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after sorting "+ Arrays.toString(arr));
    }
    static void swap(int []arr ,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int max=getMax(arr,n-i-1);
            swap(arr,max,n-i-1);
        }
    }
    static int getMax(int arr[],int last){
        int max=0;
        for(int i=0;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
