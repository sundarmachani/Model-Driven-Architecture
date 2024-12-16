package org.demo.AbstractFactory;

import org.demo.StrategyPattern.operations.*;

/**
 * AbstractFactory interface defines methods for creating various operations used in the gas pump system.
 */
public interface AbstractFactory {

    // Method to get the StorePrices operation
    StorePrices getStorePrices();

    // Method to get the PayMsg operation
    PayMsg getPayMsg();

    // Method to get the StoreCash operation
    StoreCash getStoreCash();

    // Method to get the DisplayMenu operation
    DisplayMenu getDisplayMenu();

    // Method to get the RejectMsg operation
    RejectMsg getRejectMsg();

    // Method to get the SetPrice operation
    SetPrice getSetPrice();

    // Method to get the SetInitialValues operation
    SetInitialValues getSetInitialValues();

    // Method to get the PumpGasUnit operation
    PumpGasUnit getPumpGasUnit();

    // Method to get the GasPumpedMsg operation
    GasPumpedMsg getGasPumpedMsg();

    // Method to get the PrintReceipt operation
    PrintReceipt getPrintReceipt();

    // Method to get the CancelMsg operation
    CancelMsg getCancelMsg();

    // Method to get the ReturnCash operation
    ReturnCash getReturnCash();

    // Method to get the SetPayType operation
    SetPayType getSetPayType();

    // Method to get the EjectCard operation
    EjectCard getEjectCard();
}
