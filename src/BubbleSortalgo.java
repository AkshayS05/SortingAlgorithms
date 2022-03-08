import java.util.Arrays;

public class BubbleSortalgo {
    public static void sort(int arr[]){
        //taking inital variables for swap and boolean swap for already sorted array
        int temp;
        boolean swapped;
for ( int i=0; i<arr.length; i++){
    //for first iteration swapped is equals to false
   swapped= false;
   //every iteration will put the greatest element to its respective index in the array
    for( int j=1; j<arr.length-i; j++){
        //swap if the condition met. If item is smaller than the previous item.
        if (arr[j]<arr[j-1]){
                temp= arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                //if gets swapped, meaning the array is not sorted
                swapped= true;
        }
    }
    //if after the first iteration, swap remains false, meaning we have the sorted array,
    // thus we will break the operation
    //O(N) time will be taken in this case.
    if(!swapped){
        break;
    }
}
    }
    public static void main(String[] args) {
        int arr[]={3,1,5,4,2};
        sort(arr);
        System.out.println((Arrays.toString(arr)));
    }
}
