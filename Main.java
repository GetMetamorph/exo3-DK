import main.Calculator;
import main.CsvParser;
import main.Operator;
import main.OutputFormatter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "numbers.csv";

        List<String> operators = List.of("+", "*");

        CsvParser csvParser = new CsvParser(fileName);

        List<String> values = csvParser.parseCsv().getValues();

        OutputFormatter outputFormatter = new OutputFormatter();
        for (String operatorSymbol : operators) {
            Operator operator = Operator.fromString(operatorSymbol);
            String output = outputFormatter.formatOutput(values, operator);

            System.out.println(output);
        }
    }
}
