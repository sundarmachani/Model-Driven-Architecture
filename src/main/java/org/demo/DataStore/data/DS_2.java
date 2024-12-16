package org.demo.DataStore.data;

import lombok.Data;
import org.demo.DataStore.DataStore;

@Data
public class DS_2 implements DataStore {
    // Temporary variables for storing gas prices
    private float temp_a;
    private float temp_b;
    private float temp_c;
    // Temporary variable for storing cash
    private int temp_cash;
    // Price of Diesel gas
    private float Dprice;
    // Price of Regular gas
    private float Rprice;
    // Price of Premium gas
    private float Pprice;
    // Amount of cash inserted by the user
    private int cash;
    // Total price of gas pumped
    private float total;
    // Number of gallons pumped
    private int G;
    // Price per gallon
    private float price;
}
