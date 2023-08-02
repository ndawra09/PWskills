package assignments.combined_objects_and_arrays;
// Q5 Write a Java program to print an entire array
public class PrintEntireArray {
    public static void printArray(int[] array){
        for (int x : array ){
            System.out.print(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        printArray(arr);
    }
}
