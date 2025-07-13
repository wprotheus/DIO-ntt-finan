package br.dev.olimpus.dionttfinan.repository;

import br.dev.olimpus.dionttfinan.exception.NoFundsEnoughException;
import br.dev.olimpus.dionttfinan.model.*;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

import static br.dev.olimpus.dionttfinan.model.BankService.ACCOUNT;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class CommonRepository {

    public static void checkFundsForTransaction(final Wallet source, final long amount){
        if (source.getFunds() < amount){
            throw new NoFundsEnoughException("Conta não tem o valor suficiente para realizar essa transação.");
        }
    }

    public static List<Money> generateMoney(final UUID transactionId, final long funds, final String description){
        var history = new MoneyAudit(transactionId, ACCOUNT, description, OffsetDateTime.now());
        return Stream.generate(() -> new Money(history)).limit(funds).toList();
    }

}
