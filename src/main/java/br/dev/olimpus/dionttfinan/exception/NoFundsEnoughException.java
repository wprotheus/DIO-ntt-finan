package br.dev.olimpus.dionttfinan.exception;

public class NoFundsEnoughException extends RuntimeException {
    public NoFundsEnoughException(String message) {
        super(message);
    }
}
