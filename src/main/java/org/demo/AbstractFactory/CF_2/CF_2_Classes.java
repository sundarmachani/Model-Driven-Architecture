// Package for the abstract factory pattern for GasPump_2
package org.demo.AbstractFactory.CF_2;

// Import necessary classes and interfaces
import lombok.AllArgsConstructor; // Lombok annotation for constructor injection
import org.demo.DataStore.data.DS_2; // Import data store for GasPump_2
import org.demo.StrategyPattern.operations.*;

// Concrete implementation of StorePrices interface for GasPump_2
@AllArgsConstructor
class StorePrices_2 implements StorePrices {
    DS_2 ds2; // Data store instance for GasPump_2

    @Override
    public void storePrices() {
        // Store regular, premium, and diesel prices in the data store
        ds2.setRprice(ds2.getTemp_a());
        ds2.setPprice(ds2.getTemp_b());
        ds2.setDprice(ds2.getTemp_c());
    }
}

// Concrete implementation of PayMsg interface for GasPump_2
class PayMsg_2 implements PayMsg {
    @Override
    public void payMsg() {
        // Display payment methods for GasPump_2
        System.out.println("\tPayment methods:\n1. Credit\n2. Cash");
    }
}

// Concrete implementation of StoreCash interface for GasPump_2
@AllArgsConstructor
class StoreCash_2 implements StoreCash {
    DS_2 ds2; // Data store instance for GasPump_2

    @Override
    public void storeCash() {
        // Store cash amount in the data store
        ds2.setCash(ds2.getTemp_cash());
    }
}

// Concrete implementation of DisplayMenu interface for GasPump_2
class DisplayMenu_2 implements DisplayMenu {
    @Override
    public void displayMenu() {
        // Display menu for GasPump_2
        System.out.println("\tDisplay Menu");
    }
}

// Concrete implementation of RejectMsg interface for GasPump_2
class RejectMsg_2 implements RejectMsg {
    @Override
    public void rejectMsg() {
        // Display card rejection message for GasPump_2
        System.out.println("\tCard is rejected");
    }
}

// Concrete implementation of SetPrice interface for GasPump_2
@AllArgsConstructor
class SetPrice_2 implements SetPrice {
    DS_2 ds2; // Data store instance for GasPump_2

    @Override
    public void setPrice(int g) {
        // Set gas price based on the selected grade for GasPump_2
        if (g == 3) {
            ds2.setPrice(ds2.getPprice());
        } else if (g == 2) {
            ds2.setPrice(ds2.getDprice());
        } else {
            ds2.setPrice(ds2.getRprice());
        }
    }
}

// Concrete implementation of SetInitialValues interface for GasPump_2
@AllArgsConstructor
class SetInitialValues_2 implements SetInitialValues {
    DS_2 ds2; // Data store instance for GasPump_2

    @Override
    public void setInitialValues() {
        // Set initial values for GasPump_2
        ds2.setG(0); // Reset the gas pumped counter
        ds2.setTotal(0); // Reset the total amount
    }
}

// Concrete implementation of PumpGasUnit interface for GasPump_2
@AllArgsConstructor
class PumpGasUnit_2 implements PumpGasUnit {
    DS_2 ds2; // Data store instance for GasPump_2

    @Override
    public void pumpGasUnit() {
        // Increment the gas pumped counter and calculate the total amount for GasPump_2
        ds2.setG(ds2.getG() + 1);
        ds2.setTotal(ds2.getG() * ds2.getPrice());
    }
}

// Concrete implementation of GasPumpedMsg interface for GasPump_2
@AllArgsConstructor
class GasPumpedMsg_2 implements GasPumpedMsg {
    DS_2 ds2; // Data store instance for GasPump_2

    @Override
    public void gasPumpedMsg() {
        // Display the gas pumped message for GasPump_2
        System.out.println("\tGas Disposed: " + ds2.getG());
    }
}

// Concrete implementation of PrintReceipt interface for GasPump_2
@AllArgsConstructor
class PrintReceipt_2 implements PrintReceipt {
    DS_2 ds2; // Data store instance for GasPump_2

    @Override
    public void printReceipt() {
        // Print the receipt with the total amount for GasPump_2
        System.out.println("\tPrint Receipt \nTotal : " + ds2.getTotal());
    }
}

// Concrete implementation of CancelMsg interface for GasPump_2
class CancelMsg_2 implements CancelMsg {
    @Override
    public void cancelMsg() {
        // Display transaction cancelled message for GasPump_2
        System.out.println("\tTransaction Cancelled");
    }
}

// Concrete implementation of ReturnCash interface for GasPump_2
@AllArgsConstructor
class ReturnCash_2 implements ReturnCash {
    DS_2 ds2; // Data store instance for GasPump_2

    @Override
    public void returnCash() {
        // Calculate and return cash for GasPump_2
        if (ds2.getCash() > 0) {
            double total = ds2.getCash() - ds2.getTotal();
            String formattedResult = String.format("%.1f", total);
            System.out.println("\tReturned Cash : " + formattedResult);
        } else {
            System.out.println("\tReturned Cash : " + ds2.getCash());
        }
    }
}

// Concrete implementation of SetPayType interface for GasPump_2
class SetPayType_2 implements SetPayType {
    @Override
    public void setPayType(int type) {
        // Set payment type (not implemented) for GasPump_2
    }
}

// Concrete implementation of EjectCard interface for GasPump_2
class EjectCard_2 implements EjectCard {

    @Override
    public void ejectCard() {
        // Eject the card for GasPump_2
        System.out.println("\tCard Ejected");
    }
}
