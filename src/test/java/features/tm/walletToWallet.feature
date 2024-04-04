@Regression @TM @P2P-txn @Positive @Negative
Feature: || Transaction Manager || Verify WALLET_TO_WALLET flow ||Total Test cases : 1||
  1. Verify P2P Transaction when user has all valid details

  @Positive @Sanity @P2P-txn
  Scenario: Verify P2P Transaction when user has all valid details
    Given User login with valid cred to do p2p transaction
    And User has a valid details of receiver to do p2p transaction
    And User enter amount and other details to do p2p transaction
    And User click pay api to do p2p transaction
    Then Verify p2p transaction status
    And Also verify p2p transaction status from db if transaction has been succeed


