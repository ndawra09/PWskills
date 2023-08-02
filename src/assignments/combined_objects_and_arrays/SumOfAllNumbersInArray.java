package assignments.combined_objects_and_arrays;
//Q3. Write a Java program to calculate the sum of all elements in an integer array?
public class SumOfAllNumbersInArray {
    public static int sumNumsInArray(int[] array){
        int sum = 0;
        for (int x : array) {
            sum = x + sum;
        }
        return sum;
    }
    public static void main(String[] args) {
        int [] arr = {14,72,-33,48,25};
        System.out.println(sumNumsInArray(arr));
    }
}
