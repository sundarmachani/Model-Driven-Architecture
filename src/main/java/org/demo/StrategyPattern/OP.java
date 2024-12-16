package org.demo.StrategyPattern;

import org.demo.AbstractFactory.AbstractFactory;
import org.demo.StrategyPattern.operations.*;

// This class represents the operation of the gas pump
public class OP {
    private StorePrices storePrices;
    private PayMsg payMsg;
    private StoreCash storeCash;
    private DisplayMenu displayMenu;
    private RejectMsg rejectMsg;
    private SetPrice setPrice;
    private SetInitialValues setInitialValues;
    private PumpGasUnit pumpGasUnit;
    private GasPumpedMsg gasPumpedMsg;
    private PrintReceipt printReceipt;
    private CancelMsg cancelMsg;
    private ReturnCash returnCash;
    private SetPayType setPayType;
    private EjectCard ejectCard;

    // Initializes the operations based on the provided abstract factory
    public void initialize(AbstractFactory abstractFactory) {
        // Initialize each operation with the corresponding operation object from the factory
        this.storePrices = abstractFactory.getStorePrices();
        this.payMsg = abstractFactory.getPayMsg();
        this.storeCash = abstractFactory.getStoreCash();
        this.displayMenu = abstractFactory.getDisplayMenu();
        this.rejectMsg = abstractFactory.getRejectMsg();
        this.setPrice = abstractFactory.getSetPrice();
        this.setInitialValues = abstractFactory.getSetInitialValues();
        this.pumpGasUnit = abstractFactory.getPumpGasUnit();
        this.gasPumpedMsg = abstractFactory.getGasPumpedMsg();
        this.printReceipt = abstractFactory.getPrintReceipt();
        this.cancelMsg = abstractFactory.getCancelMsg();
        this.returnCash = abstractFactory.getReturnCash();
        this.setPayType = abstractFactory.getSetPayType();
        this.ejectCard = abstractFactory.getEjectCard();
    }

    // Methods to perform each operation

    // StorePrices operation
    public void StorePrices() {
        storePrices.storePrices();
    }

    // PayMsg operation
    public void PayMsg() {
        payMsg.payMsg();
    }

    // StoreCash operation
    public void StoreCash() {
        storeCash.storeCash();
    }

    // DisplayMenu operation
    public void DisplayMenu() {
        displayMenu.displayMenu();
    }

    // RejectMsg operation
    public void RejectMsg() {
        rejectMsg.rejectMsg();
    }

    // SetPrice operation
    public void SetPrice(int g) {
        setPrice.setPrice(g);
    }

    // SetInitialValues operation
    public void SetInitialValues() {
        setInitialValues.setInitialValues();
    }

    // PumpGasUnit operation
    public void PumpGasUnit() {
        pumpGasUnit.pumpGasUnit();
    }

    // GasPumpedMsg operation
    public void GasPumpedMsg() {
        gasPumpedMsg.gasPumpedMsg();
    }

    // PrintReceipt operation
    public void PrintReceipt() {
        printReceipt.printReceipt();
    }

    // CancelMsg operation
    public void CancelMsg() {
        cancelMsg.cancelMsg();
    }

    // ReturnCash operation
    public void ReturnCash() {
        returnCash.returnCash();
    }

    // SetPayType operation
    public void SetPayType(int t) {
        setPayType.setPayType(t);
    }

    // EjectCard operation
    public void EjectCard() {
        ejectCard.ejectCard();
    }
}
