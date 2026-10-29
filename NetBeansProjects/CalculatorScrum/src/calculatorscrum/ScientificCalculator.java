/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorscrum;

/**
 *
 * @author gabriele
 */
public interface ScientificCalculator extends Calculator{
    double power(double base, double exp);
    double squareRoot(double val);

    // Funzioni Trigonometriche 
    double sin(double val);
    double cos(double val);
    double tan(double val);

    // Gestione Memoria 
    String memoryStore(double val);
    double memoryRecall();
    String memoryClear();
    String memoryAdd(double val);
    String memorySubtract(double val);
}
