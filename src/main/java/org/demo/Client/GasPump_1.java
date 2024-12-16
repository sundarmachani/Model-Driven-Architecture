package org.demo.Client;

import lombok.Data;
import org.demo.AbstractFactory.AbstractFactory;
import org.demo.DataStore.DataStore;
import org.demo.DataStore.data.DS_1;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;

@Data
public class GasPump_1 {

    public DataStore dataStore;
    private AbstractFactory abstractFactory;
    private MDA_EFSM mda_efsm;

    // Constructor for GasPump_1
    public GasPump_1(OP op, DataStore dataStore, AbstractFactory factory, MDA_EFSM mda_efsm) {
        this.dataStore = dataStore;
        abstractFactory = factory;
        op.initialize(abstractFactory);
        this.mda_efsm = mda_efsm;
    }

    // Method to activate the gas pump
    public void Activate(int a) {
        if (a > 0) {
            ((DS_1) dataStore).setTemp_a(a);
            mda_efsm.Activate();
        }
    }

    // Method to start the gas pump
    public void Start() {
        mda_efsm.Start();
    }

    // Method to select credit payment
    public void PayCredit() {
        mda_efsm.PayType(1);
    }

    // Method to reject payment
    public void Reject() {
        mda_efsm.Reject();
    }

    // Method to cancel the transaction
    public void Cancel() {
        mda_efsm.Cancel();
    }

    // Method to approve the transaction
    public void Approved() {
        mda_efsm.Approved();
    }

    // Method to start pumping gas
    public void StartPump() {
        mda_efsm.Continue();
        mda_efsm.StartPump();
    }

    // Method to select cash payment
    public void PayCash(int c) {
        if (c > 0) {
            ((DS_1) dataStore).setTemp_c(c);
            mda_efsm.PayType(0);
        }
    }

    // Method to stop pumping gas
    public void StopPump() {
        mda_efsm.StopPump();
        mda_efsm.Receipt();
    }

    // Method to pump gas
    public void Pump() {
        if (((DS_1) dataStore).getW() == 1) {
            mda_efsm.Pump();
        } else if (((DS_1) dataStore).getCash() < ((((DS_1) dataStore).getPrice()) * (((DS_1) dataStore).getL() + 1))) {
            mda_efsm.StopPump();
            mda_efsm.Receipt();
        } else {
            mda_efsm.Pump();
        }
    }
}
