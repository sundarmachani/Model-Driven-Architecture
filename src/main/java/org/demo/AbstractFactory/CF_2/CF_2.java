package org.demo.AbstractFactory.CF_2;

import lombok.AllArgsConstructor;
import org.demo.DataStore.data.DS_2;

import org.demo.AbstractFactory.AbstractFactory;
import org.demo.StrategyPattern.operations.*;

// CF_2 implementation classes for GP-2 client
@AllArgsConstructor
public class CF_2 implements AbstractFactory {

    private DS_2 ds2;

    @Override
    public StorePrices getStorePrices() {
        return new StorePrices_2(ds2);
    }

    @Override
    public PayMsg getPayMsg() {
        return new PayMsg_2();
    }

    @Override
    public StoreCash getStoreCash() {
        return new StoreCash_2(ds2);
    }

    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu_2();
    }

    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg_2();
    }

    @Override
    public SetPrice getSetPrice() {
        return new SetPrice_2(ds2);
    }

    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues_2(ds2);
    }

    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit_2(ds2);
    }

    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg_2(ds2);
    }

    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt_2(ds2);
    }

    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg_2();
    }

    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash_2(ds2);
    }

    @Override
    public SetPayType getSetPayType() {
        return new SetPayType_2();
    }

    @Override
    public EjectCard getEjectCard() {
        return new EjectCard_2();
    }
}
