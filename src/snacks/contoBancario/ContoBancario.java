package snacks.contoBancario;

import java.math.BigDecimal;

public class ContoBancario {
    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario(int numeroConto, BigDecimal saldo) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
    }

    public void deposit(BigDecimal depositAmount) {

    }

    public void withdraw(BigDecimal withdrawAmount) {

    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }
}
