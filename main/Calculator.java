package main;

import java.util.List;

public class Calculator {
    public int sum(List<String> values) {
        int sum = 0;
        for (String value : values) {
            sum += Integer.parseInt(value);
        }
        return sum;
    }

    public int product(List<String> values) {
        int product = 1;
        for (String value : values) {
            product *= Integer.parseInt(value);
        }
        return product;
    }
}
