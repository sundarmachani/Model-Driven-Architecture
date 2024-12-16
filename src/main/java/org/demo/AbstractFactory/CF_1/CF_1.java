package org.demo.AbstractFactory.CF_1;

import lombok.AllArgsConstructor;
import org.demo.AbstractFactory.AbstractFactory;
import org.demo.DataStore.data.DS_1;
import org.demo.StrategyPattern.operations.*;

/**
 * CF_1 is responsible for creating operations for GasPump_1 and manipulating data using DS_1.
 */
@AllArgsConstructor
public class CF_1 implements AbstractFactory {

    private final DS_1 ds1; // DataStore for GasPump_1

    @Override
    public StorePrices getStorePrices() {
        return new StorePrices_1(ds1); // Create StorePrices_1 operation for GasPump_1
    }

    @Override
    public PayMsg getPayMsg() {
        return new PayMsg_1(); // Create PayMsg_1 operation for GasPump_1
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash_1(ds1); // Create StoreCash_1 operation for GasPump_1
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu_1(); // Create DisplayMenu_1 operation for GasPump_1
    }

    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg_1(); // Create RejectMsg_1 operation for GasPump_1
    }

    @Override
    public SetPrice getSetPrice() {
        return new SetPrice_1(); // Create SetPrice_1 operation for GasPump_1
    }

    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues_1(ds1); // Create SetInitialValues_1 operation for GasPump_1
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit_1(ds1); // Create PumpGasUnit_1 operation for GasPump_1
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg_1(ds1); // Create GasPumpedMsg_1 operation for GasPump_1
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt_1(ds1); // Create PrintReceipt_1 operation for GasPump_1
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg_1(); // Create CancelMsg_1 operation for GasPump_1
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash_1(ds1); // Create ReturnCash_1 operation for GasPump_1
    }

    @Override
    public SetPayType getSetPayType() {
        return new SetPayType_1(ds1); // Create SetPayType_1 operation for GasPump_1
    }

    @Override
    public EjectCard getEjectCard() {
        return new EjectCard_1(); // Create EjectCard_1 operation for GasPump_1
    }
}
