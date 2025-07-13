package br.dev.olimpus.dionttfinan.exception;

public class InvestmentNotFoundException extends RuntimeException {
  public InvestmentNotFoundException(String message) {
    super(message);
  }
}
