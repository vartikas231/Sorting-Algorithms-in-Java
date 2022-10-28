package Arrays;

import java.util.Arrays;

public class quickSort {

    public static void main(String[] args) {
        int arr[]={99,81,72 ,67,89,24,21,0};
        System.out.println("Array before sorting"+Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("Array after sorting"+Arrays.toString(arr));
    }



    static void quickSort(int arr[],int start,int end){
        if(start>=end){return;}

//        take the partition
        int part=partition(arr,start,end);
//        sort left of partition
        quickSort(arr,start,part-1);
//        sort right of partition
        quickSort(arr,part+1,end);
    }

    static int partition(int arr[],int start,int end){
        int pivot=arr[start];

        int count=0;
        for(int i=start+1;i<=end;i++){
              if(arr[i]<=pivot){
                  count++;
              }
        }

//        pivotIndex is correct position of pivot element
        int pivotIndex=start+count;

//        swap the starting part with pivotIndex
//        swap(arr[start],arr[pivotIndex]);
            int temp=arr[start];
            arr[start]=arr[pivotIndex];
            arr[pivotIndex]=temp;

        int i=start;int j=end;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;}

            if(i<pivotIndex && j>pivotIndex){
//                swap(arr[i++],arr[j--]);
                int temp2=arr[i];
                arr[i]=arr[j];
                arr[j]=temp2;
                i++;j--;
            }

        }
return pivotIndex;

    }
}
