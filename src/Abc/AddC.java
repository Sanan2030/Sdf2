package Abc;

public class AddC implements ProcessStep{
    @Override
    public String process(String input) throws Exception {
        if (Math.random() < 0.5) {
            throw new Exception("Error adding C");
        }
        return input + "C";
    }
}
