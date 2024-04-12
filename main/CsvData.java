package main;

import java.util.ArrayList;
import java.util.List;

public class CsvData {
    private final List<String> values;

    public CsvData() {
        this.values = new ArrayList<>();
    }

    public void addValue(String value) {
        this.values.add(value);
    }

    public List<String> getValues() {
        return this.values;
    }
}