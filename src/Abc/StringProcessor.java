package Abc;

import java.util.ArrayList;
import java.util.List;

public class StringProcessor {
    private final List<ProcessStep> steps = new ArrayList<>();

    public StringProcessor() {
        steps.add(new AddA());
        steps.add(new AddB());
        steps.add(new AddC());
    }
    public String processString(String input) {
        for (ProcessStep step : steps) {
            try {
                input = step.process(input);
            } catch (Exception e) {
                System.err.println("Error occurred: " + e.getMessage());
                return input;
            }
        }
        return input;
    }
}
