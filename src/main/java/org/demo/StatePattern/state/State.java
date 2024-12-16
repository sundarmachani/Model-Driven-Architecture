package org.demo.StatePattern.state;

// Interface defining the operations that can be performed by various states in the state pattern
public interface State {

    // Operations related to the state transitions

    void Activate();    // Activate the gas pump

    void Start();       // Start the gas pump

    void PayType(int t);    // Select the payment type (credit or cash)

    void Reject();      // Reject the transaction

    void Cancel();      // Cancel the transaction

    void Approved();    // Approve the transaction

    void StartPump();   // Start pumping gas

    void Pump();        // Pump gas

    void StopPump();    // Stop pumping gas

    void SelectGas(int gas);    // Select the type of gas (regular, diesel, premium)

    void Receipt();     // Print a receipt

    void NoReceipt();   // Proceed without printing a receipt

    void Continue();    // Continue the transaction
}
