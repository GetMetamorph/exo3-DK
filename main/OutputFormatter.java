package main;

import java.util.List;

public class OutputFormatter {
    public String formatOutput(List<String> values, Operator operator) {
        StringBuilder output = new StringBuilder();
        int total = 0;

        for (String value : values) {
            int number = Integer.parseInt(value);
            if (operator == Operator.ADD) {
                total += number;
                output.append((number > 0 ? "+" : "")).append(number).append(" (=").append(total).append(")\n");
            } else if (operator == Operator.MULTIPLY) {
                total = (total == 0) ? 1 : total;
                total *= number;
                output.append((number > 0 ? "*" : "")).append(number).append(" (=").append(total).append(")\n");
            }
        }
        output.append("-------\n");
        output.append("total = ").append(total).append(" (").append(operator == Operator.ADD ? "addition" : "multiplication").append(")\n");

        return output.toString();
    }
}