package org.demo.StatePattern.state.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;
import org.demo.StatePattern.state.State;

// State representing the initial state of the gas pump
@AllArgsConstructor
@Data
public class S0 implements State {

    private OP op;         // Object to perform operations on the gas pump
    private MDA_EFSM mda_Efsm;    // Context representing the state machine

    @Override
    public void Activate() {
        // Not applicable in this state
    }

    @Override
    public void Start() {
        op.PayMsg();            // Display payment message
        mda_Efsm.ChangeState(2);    // Change state to S1 (State for accepting payment)
    }

    @Override
    public void PayType(int t) {
        // Not applicable in this state
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
