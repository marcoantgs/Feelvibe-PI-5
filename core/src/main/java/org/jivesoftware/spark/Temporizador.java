/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jivesoftware.spark;

/**
 *
 * @author Lucas
 */
public class Temporizador {
    
    private boolean contagemFinalizada = false; 
    long inicio = 0;
    long fim = 0;
    long diferenca = 0;
    
    public long rodarTempo(){
        inicio  = System.currentTimeMillis();
        return inicio;
    }
    
    public void CalcularTempo(long i){
        inicio = i;
        fim = System.currentTimeMillis();
        diferenca = (fim - inicio) / 1000;
        //System.out.println(diferenca);
        if(diferenca >= 5){
            setContagemFinalizada(true);
        }
    }

    /**
     * @return the contagemFinalizada
     */
    public boolean isContagemFinalizada() {
        return contagemFinalizada;
    }

    /**
     * @param contagemFinalizada the contagemFinalizada to set
     */
    public void setContagemFinalizada(boolean contagemFinalizada) {
        this.contagemFinalizada = contagemFinalizada;
    }
    
}
