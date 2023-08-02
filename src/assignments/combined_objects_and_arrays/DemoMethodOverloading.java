package assignments.combined_objects_and_arrays;
//Q1. Write a program to demonstrate method overloading with 3 different parameters.
public class DemoMethodOverloading {
    public void overloadedMethod(int num){
        System.out.println("int-arg method " + num);
    }
    public void overloadedMethod(boolean b){
        System.out.println("boolean-arg method " + b);
    }
    public void overloadedMethod(String s){
        System.out.println("String-arg method " + s);
    }
    public static void main(String[] args) {
        DemoMethodOverloading test = new DemoMethodOverloading();
        test.overloadedMethod(10);
        test.overloadedMethod(true);
        test.overloadedMethod("test");
    }
}
