package main;

public enum Operator {
    ADD("+"),
    MULTIPLY("*");

    private final String symbol;

    Operator(String symbol) {
        this.symbol = symbol;
    }
    public String getSymbol() {
        return this.symbol;
    }

    public static Operator fromString(String symbol) {
        if (symbol.trim().isEmpty()) {
            return null;
        }

        for (Operator operator : Operator.values()) {
            if (operator.symbol.equals(symbol)) {
                return operator;
            }
        }
        throw new IllegalArgumentException("Unknown operator: " + symbol);
    }

}
