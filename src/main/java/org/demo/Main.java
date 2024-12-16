package org.demo;

import org.demo.AbstractFactory.CF_1.CF_1;
import org.demo.AbstractFactory.CF_2.CF_2;
import org.demo.Client.GasPump_1;
import org.demo.Client.GasPump_2;
import org.demo.DataStore.DataStore;
import org.demo.DataStore.data.DS_1;
import org.demo.DataStore.data.DS_2;
import org.demo.StrategyPattern.OP;
import org.demo.StatePattern.context.MDA_EFSM;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make a selection from the following:");
        System.out.println("1. GasPump-1");
        System.out.println("2. GasPump-2");
        System.out.println("Select a GasPump: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                GP_1();
                break;
            case 2:
                GP_2();
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                break;
        }
    }

    private static void GP_1() {
        OP op = new OP();
        DS_1 dataStore = new DS_1();
        GasPump_1 gp1 = new GasPump_1(op, dataStore, new CF_1(dataStore), new MDA_EFSM(op));

        System.out.println("                          GasPump-1");
        System.out.println("                  MENU of Operations");
        System.out.println("          0. Activate(int)");
        System.out.println("          1. Start()");
        System.out.println("          2. PayCredit");
        System.out.println("          3. Reject()");
        System.out.println("          4. Cancel()");
        System.out.println("          5. Approved()");
        System.out.println("          6. PayCash(int)");
        System.out.println("          7. StartPump()");
        System.out.println("          8. Pump()");
        System.out.println("          9. StopPump()");
        System.out.println("          q. Quit the program");

        System.out.println("Please make a note of these operations");
        System.out.println("           GasPump-1 Execution");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Select Operation: ");
            char ch = sc.next().charAt(0);
            switch (ch) {
                case '0':
                    System.out.println("Operation: Activate(int a)");
                    System.out.print("Enter value of the parameter a: ");
                    int a = sc.nextInt();
                    gp1.Activate(a);
                    break;
                case '1':
                    System.out.println("Operation: Start()");
                    gp1.Start();
                    break;
                case '2':
                    System.out.println("Operation: PayCredit()");
                    gp1.PayCredit();
                    break;
                case '3':
                    System.out.println("Operation: Reject()");
                    gp1.Reject();
                    break;
                case '4':
                    System.out.println("Operation: Cancel()");
                    gp1.Cancel();
                    break;
                case '5':
                    System.out.println("Operation: Approved()");
                    gp1.Approved();
                    break;
                case '6':
                    System.out.println("Operation: PayCash(int c)");
                    System.out.print("Enter value of the parameter c or cash : ");
                    int c = sc.nextInt();
                    gp1.PayCash(c);
                    break;
                case '7':
                    System.out.println("Operation: StartPump()");
                    gp1.StartPump();
                    break;
                case '8':
                    System.out.println("Operation: Pump()");
                    gp1.Pump();
                    break;
                case '9':
                    System.out.println("Operation: StopPump()");
                    gp1.StopPump();
                    break;
                case 'q':
                    System.out.println("Quitting the program.");
                    return;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
    }


    private static void GP_2() {
        char ch;
        OP op = new OP();
        DataStore dataStore = new DS_2();
        GasPump_2 gp2 = new GasPump_2(op, dataStore,new CF_2((DS_2) dataStore), new MDA_EFSM(op));

        System.out.println("                          GasPump-2");
        System.out.println("                  MENU of Operations");
        System.out.println("          0. Activate(int, int, int)");
        System.out.println("          1. PayCash(int)");
        System.out.println("          2. Cancel()");
        System.out.println("          3. Premium()");
        System.out.println("          4. Regular()");
        System.out.println("          5. StartPump()");
        System.out.println("          6. Stop()");
        System.out.println("          7. Receipt()");
        System.out.println("          8. NoReceipt()");
        System.out.println("          9. Diesel()");
        System.out.println("          a. PumpGallon()");
        System.out.println("          b. Start()");
        System.out.println("          q. Quit the program");

        System.out.println("Please make a note of these operations");
        System.out.println("           GasPump-2 Execution");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Select Operation: ");
            ch = sc.next().charAt(0);
            switch (ch) {
                case '0':
                    System.out.println("Operation: Activate(float a, float b, float c)");
                    System.out.print("Enter value of the parameter a: ");
                    float a = sc.nextFloat();
                    System.out.print("Enter value of the parameter b: ");
                    float b = sc.nextFloat();
                    System.out.print("Enter value of the parameter c: ");
                    float c = sc.nextFloat();
                    gp2.Activate(a, b, c);
                    break;
                case '1':
                    System.out.println("Operation: PayCash(int c)");
                    System.out.print("Enter value of the parameter c: ");
                    int cash = sc.nextInt();
                    gp2.PayCash(cash);
                    break;
                case '2':
                    System.out.println("Operation: Cancel()");
                    gp2.Cancel();
                    break;
                case '3':
                    System.out.println("Operation: Premium()");
                    gp2.Premium();
                    break;
                case '4':
                    System.out.println("Operation: Regular()");
                    gp2.Regular();
                    break;
                case '5':
                    System.out.println("Operation: StartPump()");
                    gp2.StartPump();
                    break;
                case '6':
                    System.out.println("Operation: Stop()");
                    gp2.Stop();
                    break;
                case '7':
                    System.out.println("Operation: Receipt()");
                    gp2.Receipt();
                    break;
                case '8':
                    System.out.println("Operation: NoReceipt()");
                    gp2.NoReceipt();
                    break;
                case '9':
                    System.out.println("Operation: Diesel()");
                    gp2.Diesel();
                    break;
                case 'a':
                    System.out.println("Operation: PumpGallon()");
                    gp2.PumpGallon();
                    break;
                case 'b':
                    System.out.println("Operation: Start()");
                    gp2.Start();
                    break;
                case 'q':
                    System.out.println("Quitting the program.");
                    return;
                default:
                    System.out.println("Invalid operation.");
                    break;
            }
        }
    }

}
