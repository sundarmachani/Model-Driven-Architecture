package org.demo.StatePattern.state.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;
import org.demo.StatePattern.state.State;

// State representing the state for selecting gas type
@Data
@AllArgsConstructor
public class S3 implements State {

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
        // Not applicable in this state
    }

    @Override
    public void Cancel() {
        // Display cancel message and change state to S0 (Start state)
        op.CancelMsg();
        mda_Efsm.ChangeState(1);
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
        // Set the price based on the selected gas type and change state to S4 (Pumping state)
        op.SetPrice(gas);
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
        // Change state to S5 (State for pumping gas)
        mda_Efsm.ChangeState(5);
    }
}
