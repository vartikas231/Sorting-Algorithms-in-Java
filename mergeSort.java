package Arrays;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={0,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int arr[],int start,int end){

        if(start>=end){return ;}
        int mid=start+(end-start)/2;
        //sort the left part
        mergeSort(arr,start,mid);
        //sort the right part
        mergeSort(arr,mid+1,end);
        //merge both the parts
        merge(arr,start,end);

    }

    public static void merge(int arr[],int start,int end){
            int mid=start+(end-start)/2;
            int len1=mid-start+1;
            int len2=end-mid;
            int part1[]=new int[len1];
            int part2[]=new int[len2];

//          k is the main index of array
            int k=start;
            for (int i=0;i<len1;i++){
                part1[i]=arr[k++];
            }
             k=mid+1;
            for (int j=0;j<len2;j++){
                part2[j]=arr[k++];
            }


//            merge the sorted arrays
            int index1=0;
            int index2=0;

            k=start;
            while(index1<len1 && index2<len2){
                if(part1[index1]<part2[index2]){
                    arr[k++]=part1[index1++];
                }
                else{
                    arr[k++]=part2[index2++];
                }
            }
            // if part1 me abhi bhi kuch baaki hai and part2 khaali  hai
            while(index1<len1){
                arr[k++]=part1[index1++];
            }

            //if part2 me abhi bhi kuch bcha hai and part1 khaali hai
            while(index2<len2){
                arr[k++]=part2[index2++];
            }
    }
}
