/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author jconklin2391
 */
public class VendingMachine {

    ArrayList<Candy>[][] vendingMachineStock;

    public VendingMachine(int size){
        vendingMachineStock = new ArrayList[size][size];
        for (int i = 0; i < vendingMachineStock.length; i++) {
            for (int j = 0; j < vendingMachineStock[i].length; j++) {
                vendingMachineStock[i][j] = new ArrayList();                
            }
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[0][0].add(new Candy("Snickers", TypeOfCandy.CHOCOLATE, 215, .98f));  
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[0][1].add(new Candy("Fruit Roll-up", TypeOfCandy.FRUITY, 50, .49f));  
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[0][2].add(new Candy("Generic Chocolate Candy", TypeOfCandy.CHOCOLATE, 50, 1.00f));
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[1][0].add(new Candy("Kit-Kat", TypeOfCandy.WAFER, 215, 1.00f));  
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[1][1].add(new Candy("M&M's", TypeOfCandy.CHOCOLATE, 50, 1.00f));  
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[1][2].add(new Candy("Generic Gummy Candy", TypeOfCandy.GUMMY, 50, 1.00f));
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[2][0].add(new Candy("Twix", TypeOfCandy.CHOCOLATE, 215, 1.00f));  
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[2][1].add(new Candy("Rasins", TypeOfCandy.FRUITY, 50, .69f));  
        }
        for (int i = 0; i < ((int)((Math.random() * 20) + 1)); i++) {
            vendingMachineStock[2][2].add(new Candy("Reese's Cups", TypeOfCandy.CHOCOLATE, 50, 1.00f));
        }
        
        
    }
    
    
    public Candy pickCandy(){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> coordLetters = new HashMap<String, Integer>();
        coordLetters.put("A", 0);
        coordLetters.put("B", 1);
        coordLetters.put("C", 2);
        
        
        
        return null;
    }
    
    public String toString(){

        String output = "   A                     B                    C           \n";
            for (int i = 0; i < vendingMachineStock.length; i++) {
            output += (1 + i) + "  ";
            for (int j = 0; j < vendingMachineStock[i].length; j++) {
                if(!(vendingMachineStock[i][j].isEmpty())){
                    output += vendingMachineStock[i][j].get(0).getName();
                }
                else{
                    output += "<empty>";
                }
                output += "     ";
            }
            output += "\n";
            
        }
        
        return output;
    }
    
    
}
