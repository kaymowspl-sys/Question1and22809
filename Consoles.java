/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @ST10510570.
 */
// Variables and Methods
public abstract class Consoles implements IConsoles {
    
    // Variables
    public String consoleType;
    public String store;
    public int totalSales;

    // Constructor
    public Consoles(String consoleType, String store, int totalSales) {
        this.consoleType = consoleType;
        this.store = store;
        this.totalSales = totalSales;
    }

    // Methods 
    public String getConsoleType() { return consoleType; }
    
    public String getStore() { return store; }
    
    public int getTotalSales() { return totalSales; }
}
