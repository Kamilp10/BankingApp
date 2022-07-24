import org.junit.Assert;
import org.junit.Test;

public class BATesting {
    @Test
    public void method_to_see_if_withdrawal_shrinks_account_balance(){
    AccountDetails accountDetails = new AccountDetails();
        accountDetails.setBalance(100);
        long expectedResult = accountDetails.getBalance();
        Assert.assertEquals(expectedResult,accountDetails.getBalance());

    }
}
