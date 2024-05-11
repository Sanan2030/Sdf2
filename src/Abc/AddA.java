package Abc;

public class AddA implements ProcessStep{
    @Override
    public String process(String input) throws Exception {
        if (Math.random() < 0.5) {
            throw new Exception("Error adding A");
        }
        return input + "A";
    }
}
