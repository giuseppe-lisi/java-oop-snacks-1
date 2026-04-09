package snacks.contoBancario;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContoBancario {
    private int numeroConto;
    private BigDecimal saldo;

    public ContoBancario(int numeroConto, BigDecimal saldo) {
        this.numeroConto = numeroConto;
        this.saldo = saldo;
    }

    public void deposit(BigDecimal depositAmount) {
        this.saldo = this.saldo.add(depositAmount);
    }

    public void withdraw(BigDecimal withdrawAmount) {

    }

    public BigDecimal getSaldo() {
        return this.saldo.setScale(2, RoundingMode.HALF_EVEN);
    }
}
