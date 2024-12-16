package org.demo.StatePattern.state.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;
import org.demo.StatePattern.state.State;

// State representing the state after the gas pump is started
@AllArgsConstructor
@Data
public class S1 implements State {

    private OP op;         // Object to perform operations on the gas pump
    private MDA_EFSM mda_Efsm;    // Context representing the state machine

    @Override
    public void Activate() {
        // Not applicable in this state
    }

    @Override
    public void Start() {
        // Not applicable in this state
    }

    @Override
    public void PayType(int t) {
        // Based on the payment type selected, perform corresponding actions
        if (t == 0) {   // If payment type is cash
            op.StoreCash();         // Store cash amount
            op.DisplayMenu();       // Display menu for selecting gas type
            op.SetPayType(t);       // Set payment type to cash
            mda_Efsm.ChangeState(4);    // Change state to S3 (State for selecting gas type)
        } else if (t == 1) {    // If payment type is credit
            mda_Efsm.ChangeState(3);    // Change state to S2 (State for approving credit)
        }
    }

    @Override
    public void Reject() {
        // Not applicable in this state
    }

    @Override
    public void Cancel() {
        // Not applicable in this state
    }

    @Override
    public void Approved() {
        // Not applicable in this state
    }

    @Override
    public void StartPump() {
        // Not applicable in this state
    }

    @Override
    public void Pump() {
        // Not applicable in this state
    }

    @Override
    public void StopPump() {
        // Not applicable in this state
    }

    @Override
    public void SelectGas(int gas) {
        // Not applicable in this state
    }

    @Override
    public void Receipt() {
        // Not applicable in this state
    }

    @Override
    public void NoReceipt() {
        // Not applicable in this state
    }

    @Override
    public void Continue() {
        // Not applicable in this state
    }
}
