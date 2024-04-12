import main.Calculator;
import main.CsvParser;
import main.Operator;
import main.OutputFormatter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = args[0];
        String operatorSymbol = args[1];

        CsvParser csvParser = new CsvParser(fileName);

        Operator operator = Operator.fromString(operatorSymbol);
        List<String> values = csvParser.parseCsv().getValues();

        OutputFormatter outputFormatter = new OutputFormatter();
        String output = outputFormatter.formatOutput(values, operator);

        System.out.println(output);
    }
}
