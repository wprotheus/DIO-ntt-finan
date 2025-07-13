package br.dev.olimpus.dionttfinan.model;

public record Investment(
        long id,
        long tax,
        long initialFunds) {

    @Override
    public String toString() {
        return new StringBuilder("Investment -> ")
                .append("Id: ").append(id)
                .append("\nTax: ").append(tax).append("%")
                .append("\tInitial Funds: ").append(initialFunds / 100)
                .append(",").append(initialFunds % 100)
                .toString();
    }
}