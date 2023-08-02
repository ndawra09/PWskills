package assignments.combined_objects_and_arrays;

import java.util.Scanner;

//Q4 Write a Java program to find the index of a specific element in an integer array.?
public class FindIndexOfElement {
    public static int findIndex(int[] array, int elt){
        for (int i=0; i< array.length; i++){
            if(elt == array[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,-1,6,-8,90,32,-78};
        System.out.println("Please enter the elt:-");
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();
        System.out.println(findIndex(arr,element));
    }
}
