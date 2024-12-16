package org.demo.StatePattern.state.impl;

import lombok.AllArgsConstructor;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;
import org.demo.StatePattern.state.State;

// State representing the start state of the gas pump
@AllArgsConstructor
public class Start implements State {

    private OP op;             // Object to perform operations on the gas pump
    private MDA_EFSM mda_efsm; // Context representing the state machine

    @Override
    public void Activate() {
        // Store gas prices and change state to S1
        op.StorePrices();
        mda_efsm.ChangeState(1);
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
