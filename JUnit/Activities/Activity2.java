package Activities;
/*Create a JUnit test named Activity2.
Write two @Test annotations, notEnoughFunds() and enoughFunds().
In notEnoughFunds(),
Create an object for the BankAccount and set balance to 10.
Add an assertion, assertThrows(), that expects the NotEnoughFundsException custom exception to be thrown.

In enoughFunds(),
Create an object for the BankAccount and set balance to 100.
Add an assertion, assertDoesNotThrow(), that expects the NotEnoughFundsException custom exception to NOT be thrown.
 */


import Activities.BankAccount;
import Activities.NotEnoughFundsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpectedExceptionTest {

    @Test
    void notEnoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(9);

        // Assertion for exception
        assertThrows(NotEnoughFundsException.class, () -> account.withdraw(10),
                "Balance must be greater than amount of withdrawal");
    }

    @Test
    void enoughFunds() {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(100);

        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));
    }
}