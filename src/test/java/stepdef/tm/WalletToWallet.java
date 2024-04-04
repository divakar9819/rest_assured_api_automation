package stepdef.tm;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import utilities.CommonStepDef;
import utilities.CommonStepDefImpl;
import utilities.PropertyReader;

import java.io.FileNotFoundException;


/**
 * @author Divakar Verma
 * @created_at : 04/04/2024 - 12:05 pm
 * @mail_to: vermadivakar2022@gmail.com
 */
public class WalletToWallet {

    private static Response res;

    private static PropertyReader reader = new PropertyReader();
    private static CommonStepDef commonStepDef = new CommonStepDefImpl();


    @Given("User login with valid cred to do p2p transaction")
    public void user_login_with_valid_cred_to_do_p2p_transaction() throws FileNotFoundException {
        System.out.println("User login with valid cred to do p2p transaction");
        res = commonStepDef.login(reader.getValueFromConfig("wallet.test.user2.mobile.number"),reader.getValueFromConfig("wallet.test.user2.passcode"),reader.getValueFromConfig("wallet.test.user2.device.id"));
        String accessToken = commonStepDef.getDataFromResponse(res,"results.access_token");
    }

    @Given("User has a valid details of receiver to do p2p transaction")
    public void user_has_a_valid_details_of_receiver_to_do_p2p_transaction() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User enter amount and other details to do p2p transaction")
    public void user_enter_amount_and_other_details_to_do_p2p_transaction() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("User click pay api to do p2p transaction")
    public void user_click_pay_api_to_do_p2p_transaction() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Verify p2p transaction status")
    public void verify_p2p_transaction_status() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Also verify p2p transaction status from db if transaction has been succeed")
    public void also_verify_p2p_transaction_status_from_db_if_transaction_has_been_succeed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
