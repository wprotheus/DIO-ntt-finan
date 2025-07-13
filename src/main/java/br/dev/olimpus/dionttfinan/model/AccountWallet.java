package br.dev.olimpus.dionttfinan.model;


import lombok.Getter;

import java.util.List;

@Getter
public class AccountWallet extends Wallet {

    private final List<String> pix;

    public AccountWallet(final List<String> pix) {
        super(BankService.ACCOUNT);
        this.pix = pix;
    }

    public AccountWallet(final long amount, final List<String> pix) {
        super(BankService.ACCOUNT);
        this.pix = pix;
        addMoney(amount, "Depósito inicial na conta.");
    }

    public void addMoney(final long amount, final String description) {
        var money = generateMoney(amount, description);
        this.money.addAll(money);
    }

    @Override
    public String toString() {
        return new StringBuilder("Account Wallet -> ")
                .append("\nPIX: ").append(pix)
                .toString();
    }
}
