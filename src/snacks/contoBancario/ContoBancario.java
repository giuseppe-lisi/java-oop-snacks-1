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
        if (depositAmount.compareTo(new BigDecimal(0)) == 1) {
            this.saldo = this.saldo.add(depositAmount);
        }
    }

    public void withdraw(BigDecimal withdrawAmount) {
        if (this.saldo.subtract(withdrawAmount).compareTo(withdrawAmount) == 1 && withdrawAmount.compareTo(new BigDecimal(0)) == 1) {
            this.saldo = this.saldo.subtract(withdrawAmount);
        }
    }

    public BigDecimal getSaldo() {
        return this.saldo.setScale(2, RoundingMode.HALF_EVEN);
    }
}
