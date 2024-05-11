package Abc;


public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        String input1 = "Hello";
        String input2 = "Hello";
        System.out.println("No error case:");
        System.out.println("Input string: " + input1);
        System.out.println("Output: " + processor.processString(input1 + "ABC"));
        System.out.println("Error case:");
        System.out.println("Input string: " + input2);
        System.out.println("Output: " + processor.processString(input2));
    }

}