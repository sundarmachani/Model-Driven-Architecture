package org.demo.StatePattern.state.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;
import org.demo.StatePattern.state.State;

// State representing the state for pumping a gallon of gas
@AllArgsConstructor
@Data
public class S5 implements State {

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
        // Pump a gallon of gas and display gas pumped message
        op.PumpGasUnit();
        op.GasPumpedMsg();
        // No change of state
    }

    @Override
    public void StopPump() {
        // Change state to S7 (State for stopping pumping)
        mda_Efsm.ChangeState(7);
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
