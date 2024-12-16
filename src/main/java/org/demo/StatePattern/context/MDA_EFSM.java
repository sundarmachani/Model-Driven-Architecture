package org.demo.StatePattern.context;

import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.state.State;
import org.demo.StatePattern.state.impl.*;

// Context class that maintains the current state and allows state transitions
public class MDA_EFSM {

    // Current state of the EFSM
    private State state;

    // Array to hold all possible states
    private State[] LS_state = new State[8];

    // Constructor initializes the states and sets the initial state to Start
    public MDA_EFSM(OP op) {
        LS_state[0] = new Start(op, this);
        LS_state[1] = new S0(op, this);
        LS_state[2] = new S1(op, this);
        LS_state[3] = new S2(op, this);
        LS_state[4] = new S3(op, this);
        LS_state[5] = new S4(op, this);
        LS_state[6] = new S5(op, this);
        LS_state[7] = new S6(op, this);
        state = LS_state[0];
    }

    // Methods to delegate operations to the current state

    public void Activate() {
        state.Activate();
    }

    public void Start() {
        state.Start();
    }

    public void PayType(int type) {
        state.PayType(type);
    }

    public void Reject() {
        state.Reject();
    }

    public void Cancel() {
        state.Cancel();
    }

    public void Approved() {
        state.Approved();
    }

    public void StartPump() {
        state.StartPump();
    }

    public void Pump() {
        state.Pump();
    }

    public void StopPump() {
        state.StopPump();
    }

    public void SelectGas(int gas) {
        state.SelectGas(gas);
    }

    public void Receipt() {
        state.Receipt();
    }

    public void NoReceipt() {
        state.NoReceipt();
    }

    public void Continue() {
        state.Continue();
    }

    // Method to change the current state based on stateId
    public void ChangeState(int stateId) {
        // Map stateId to corresponding state name
        String str;
        if (stateId == 0) {
            str = "Start";
        } else if (stateId == 1) {
            str = "S0";
        } else if (stateId == 2) {
            str = "S1";
        } else if (stateId == 3) {
            str = "S2";
        } else if (stateId == 4) {
            str = "S3";
        } else if (stateId == 5) {
            str = "S4";
        } else if (stateId == 6) {
            str = "S5";
        } else {
            str = "S6";
        }
        // Print the state change
        System.out.println("Changing state to : '" + str + "'");
        // Set the current state to the new state based on stateId
        state = LS_state[stateId];
    }
}
