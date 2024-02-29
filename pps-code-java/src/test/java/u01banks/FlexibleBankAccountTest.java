package u01banks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlexibleBankAccountTest extends BankAccountWithFeeTest {

    @BeforeEach
    void setUp() {
        this.account = new FlexibleBankAccount(()->1); // pass information on fee
    }
}
