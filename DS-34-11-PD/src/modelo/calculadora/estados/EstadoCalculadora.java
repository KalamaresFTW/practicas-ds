/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.calculadora.estados;

import modelo.calculadora.Calculadora;
import modelo.Operando;
import modelo.operacionesBinarias.OperacionBinaria;
import modelo.operacionesUnarias.OperacionUnaria;

/**
 *
 * @author Pablo
 */
public interface EstadoCalculadora {

    public void introducirOperando(Operando o, Calculadora c);

    public void introducirOperadorBinario(OperacionBinaria ob, Calculadora c);

    public void introducirOperadorUnario(OperacionUnaria ou, Calculadora c);
    
    public void mostrarResultado(Calculadora c);
    
    

}
