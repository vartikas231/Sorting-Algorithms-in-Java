//cyclic sort is only useful when numbers are in a particular range
package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;
public class cyclicSort {
    public static void main(String[] args) {
        int []arr={2,1};
        System.out.println("Array before sorting "+Arrays.toString(arr));
        sort(arr);
        System.out.println("Array after sorting "+ Arrays.toString(arr));
    }

    public static void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int correctPosition=arr[i]-1;
            if(arr[i]==arr[correctPosition]){
                continue;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[correctPosition];
                arr[correctPosition]=temp;
                }
        }
    }
}
