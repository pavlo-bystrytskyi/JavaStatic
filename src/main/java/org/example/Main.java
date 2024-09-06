package org.example;

//Step 1: Create a class with a static variable 'totalCount' and an instance variable 'instanceCount'. Initialize both variables with the value 0.
//Step 2: Write a static method 'incrementTotalCount' that increments the 'totalCount' by 1.
//Step 3: Write an instance method 'incrementInstanceCount' that increments the 'instanceCount' for the object by 1.
//Step 4: In the main method, create multiple objects of the class and call both the static and instance methods.
//Step 5: Override the ToString method to output the current values of 'totalCount' and 'instanceCount'.
//Create a new class 'Calculator' with a static method 'add' that takes two numbers as parameters and returns their sum.
//Write code in the main method to call the 'add' method and print the result.
//Optional: Implement additional static methods in the 'Calculator' class (subtraction, multiplication, division) and call them in the main method.


public class Main {
    public static void main(String[] args) {
        Count count1 = new Count();
        Count count2 = new Count();
        Count count3 = new Count();
        Count count4 = new Count();
        Count count5 = new Count();

        count1.incrementInstanceCount();
        Count.incrementTotalCount();
        count1.incrementInstanceCount();
        count2.incrementInstanceCount();
        count3.incrementInstanceCount();
        count4.incrementInstanceCount();
        Count.incrementTotalCount();

        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
        System.out.println(count4);
        System.out.println(count5);
    }
}
