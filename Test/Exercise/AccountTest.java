package Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void testAccount() {
        Account ac = new Account(1122, 20000);
        ac.getAnnualInterestRate(4.5);

        ac.withdraw(2500);
        ac.deposit(3000);
        ac.getMonthlyInterest();
        ac.getDateCreated();
    }

}