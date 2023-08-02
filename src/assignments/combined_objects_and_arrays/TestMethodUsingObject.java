package assignments.combined_objects_and_arrays;
//Q2. Write a program to create an object of an class which contain a method and call that class method in main method.
public class TestMethodUsingObject {
    public void testMethod (){
        System.out.println("method called buy Test class Object");
    }
    public static void main(String[] args) {
        TestMethodUsingObject test = new TestMethodUsingObject();
        test.testMethod();
    }
}
