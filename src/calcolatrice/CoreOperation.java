/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatrice;


public class CoreOperation {
    // Variable to store the last calculated result (Chaining Operation)
    private double result;

    // Constructor 
    public CoreOperation() {
        this.result = 0.0;
    }

    // method to get the result
    public double getResult() {
        return this.result;
    }

    
    // ADDITION OPERATION
    public double addition(double a, double b) {
        this.result = a + b;
        return this.result;
    }

    // SUBSTRACTION OPERATION
    public double subtraction(double a, double b) {
        this.result = a - b;
        return this.result;
    }

    // MULTIPLICATION OPERATION
    public double multiplication(double a, double b) {
        this.result = a * b;
        return this.result;
    }

    // DIVISION OPERATION
    public double division(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return this.result;
        }
        this.result = a / b;
        return this.result;
    }
}