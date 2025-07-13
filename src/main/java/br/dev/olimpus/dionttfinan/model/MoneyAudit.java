package br.dev.olimpus.dionttfinan.model;

import java.time.OffsetDateTime;
import java.util.UUID;

public record MoneyAudit(
        UUID transactionId,
        BankService targetBankService,
        String description,
        OffsetDateTime createdAt
) {

    @Override
    public String toString() {
        return new StringBuilder("MoneyAudit -> ")
                .append("Transaction ID: ").append(transactionId)
                .append("\nTarget Bank Service: ").append(targetBankService)
                .append("\nDescription: ").append(description)
                .append("\nCreated At: ").append(createdAt)
                .toString();
    }
}
