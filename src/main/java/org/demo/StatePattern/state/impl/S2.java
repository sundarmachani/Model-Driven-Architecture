package org.demo.StatePattern.state.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;
import org.demo.StatePattern.state.State;

// State representing the state after credit is approved
@AllArgsConstructor
@Data
public class S2 implements State {

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
        // Not applicable in this state
    }

    @Override
    public void Reject() {
        // Display rejection message, eject card, and change state to S0 (Start state)
        op.RejectMsg();
        op.EjectCard();
        mda_Efsm.ChangeState(1);
    }

    @Override
    public void Cancel() {
        // Not applicable in this state
    }

    @Override
    public void Approved() {
        // Display menu, set payment type to credit, eject card, and change state to S3 (State for selecting gas type)
        op.DisplayMenu();
        op.SetPayType(1);
        op.EjectCard();
        mda_Efsm.ChangeState(4);
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
