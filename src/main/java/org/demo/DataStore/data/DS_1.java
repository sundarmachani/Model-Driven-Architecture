package org.demo.DataStore.data;

import lombok.Data;
import org.demo.DataStore.DataStore;

@Data
public class DS_1 implements DataStore {
    // Temporary variable for storing price
    private int temp_a;
    // Price of the gas
    private int price;
    // Number of liters pumped
    private int L;
    // Total price of the gas pumped
    private int total;
    // Temporary variable for storing cash
    private int temp_c;
    // Payment type (0 for cash, 1 for credit)
    private int w;
    // Amount of cash inserted by the user
    private int cash;
}
