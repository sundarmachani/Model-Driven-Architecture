package org.demo.AbstractFactory.CF_1;

import lombok.AllArgsConstructor;
import org.demo.DataStore.data.DS_1;
import org.demo.StrategyPattern.operations.*;

// CF_1 implementation classes for GP-1 client

// StorePrices_1 implementation for storing prices
@AllArgsConstructor
class StorePrices_1 implements StorePrices {

    private DS_1 ds1;

    @Override
    public void storePrices() {
        ds1.setPrice(ds1.getTemp_a());
    }
}

// PayMsg_1 implementation for displaying payment methods
class PayMsg_1 implements PayMsg {
    @Override
    public void payMsg() {
        System.out.println("\tPayment methods:\n1. Credit\n2. Cash");
    }
}

// StoreCash_1 implementation for storing cash
@AllArgsConstructor
class StoreCash_1 implements StoreCash {
    DS_1 ds1;

    @Override
    public void storeCash() {
        ds1.setCash(ds1.getTemp_c());
        ds1.setW(0);
    }
}

// DisplayMenu_1 implementation for displaying the menu
class DisplayMenu_1 implements DisplayMenu {
    @Override
    public void displayMenu() {
        System.out.println("\tDisplay Menu");
    }
}

// RejectMsg_1 implementation for displaying rejection messages
class RejectMsg_1 implements RejectMsg {
    @Override
    public void rejectMsg() {
        System.out.println("\tcredit card not approved");
    }
}

// SetPrice_1 implementation for setting prices
class SetPrice_1 implements SetPrice {
    @Override
    public void setPrice(int g) {
        // Implementation not provided
    }
}

// SetInitialValues_1 implementation for setting initial values
@AllArgsConstructor
class SetInitialValues_1 implements SetInitialValues {
    DS_1 ds1;

    @Override
    public void setInitialValues() {
        ds1.setL(0);
        ds1.setTotal(0);
    }
}

// PumpGasUnit_1 implementation for pumping gas units
@AllArgsConstructor
class PumpGasUnit_1 implements PumpGasUnit {
    DS_1 ds1;

    @Override
    public void pumpGasUnit() {
        ds1.setL(ds1.getL() + 1);
        ds1.setTotal(ds1.getL() * ds1.getPrice());
    }
}

// GasPumpedMsg_1 implementation for displaying gas pumped message
@AllArgsConstructor
class GasPumpedMsg_1 implements GasPumpedMsg {
    DS_1 ds1;

    @Override
    public void gasPumpedMsg() {
        System.out.println("\tGas Disposed: " + ds1.getL());
    }
}

// PrintReceipt_1 implementation for printing receipts
@AllArgsConstructor
class PrintReceipt_1 implements PrintReceipt {
    DS_1 ds1;

    @Override
    public void printReceipt() {
        System.out.println("\tprint Receipt \nTotal : " + ds1.getTotal());
    }
}

// CancelMsg_1 implementation for displaying cancellation message
class CancelMsg_1 implements CancelMsg {
    @Override
    public void cancelMsg() {
        System.out.println("\tTransaction Cancelled");
    }
}

// ReturnCash_1 implementation for returning cash
@AllArgsConstructor
class ReturnCash_1 implements ReturnCash {
    DS_1 ds1;

    @Override
    public void returnCash() {
        if (ds1.getCash() > 0) {
            System.out.println("\tReturned Cash : " + (ds1.getCash() - ds1.getTotal()));
        } else {
            System.out.println("\tReturned Cash : " + ds1.getCash());
        }
    }
}

// SetPayType_1 implementation for setting payment type
@AllArgsConstructor
class SetPayType_1 implements SetPayType {
    DS_1 ds1;

    @Override
    public void setPayType(int type) {
        ds1.setW(type);
    }
}

// EjectCard_1 implementation for ejecting card
class EjectCard_1 implements EjectCard {

    @Override
    public void ejectCard() {
        System.out.println("\tCard is Ejected");
    }
}
