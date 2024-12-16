package org.demo.Client;

import lombok.Data;
import org.demo.AbstractFactory.AbstractFactory;
import org.demo.DataStore.DataStore;
import org.demo.DataStore.data.DS_2;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;

@Data
public class GasPump_2 {
    private DataStore dataStore;
    private MDA_EFSM mda_efsm;
    private AbstractFactory abstractFactory;

    // Constructor for GasPump_2
    public GasPump_2(OP op, DataStore dataStore, AbstractFactory factory, MDA_EFSM mda_efsm) {
        this.dataStore = dataStore;
        abstractFactory = factory;
        op.initialize(abstractFactory);
        this.mda_efsm = mda_efsm;
    }

    // Method to activate the gas pump
    public void Activate(float a, float b, float c) {
        if ((a > 0) && (b > 0) && (c > 0)) {
            ((DS_2) dataStore).setTemp_a(a);
            ((DS_2) dataStore).setTemp_b(b);
            ((DS_2) dataStore).setTemp_c(c);
            mda_efsm.Activate();
        }
    }

    // Method to select cash payment
    public void PayCash(int c) {
        if (c > 0) {
            ((DS_2) dataStore).setTemp_cash(c);
            mda_efsm.PayType(0);
        }

    }

    // Method to start the gas pump
    public void Start() {
        mda_efsm.Start();
    }

    // Method to cancel the transaction
    public void Cancel() {
        mda_efsm.Cancel();
    }

    // Method to select diesel gas type
    public void Diesel() {
        mda_efsm.SelectGas(2);
        mda_efsm.Continue();
    }

    // Method to select premium gas type
    public void Premium() {
        mda_efsm.SelectGas(3);
        mda_efsm.Continue();
    }

    // Method to select regular gas type
    public void Regular() {
        mda_efsm.SelectGas(1);
        mda_efsm.Continue();
    }

    // Method to start pumping gas
    public void StartPump() {
        mda_efsm.StartPump();
    }

    // Method to pump gas by one gallon
    public void PumpGallon() {
        if ((((DS_2) dataStore).getCash()) < ((((DS_2) dataStore).getPrice()) * (((DS_2) dataStore).getG() + 1))) {
            mda_efsm.StopPump();
        } else {
            mda_efsm.Pump();
        }
    }

    // Method to stop pumping gas
    public void Stop() {
        mda_efsm.StopPump();
    }

    // Method to print receipt
    public void Receipt() {
        mda_efsm.Receipt();
    }

    // Method to not print receipt
    public void NoReceipt() {
        mda_efsm.NoReceipt();
    }
}
