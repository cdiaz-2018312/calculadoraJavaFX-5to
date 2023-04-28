package org.in5bm.carlosdiaz.bean;

/**
 *
 * @author carlos diaz
 * @date 25/03/2022 
 * carne: 2018312 
 * codigo tecnico: IN5BM 
 * grupo: 1
 *
 */
public abstract class Operacion {

    //atributos
    private float numero1;
    private float numero2;
    private float resultado;
    private char operador;
    // costructores

    public Operacion() {

    }

    //constructor nulo o sin parámetros
    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    //metodos getter´s and setter´s
    public float getNumero1(){
        return numero1;
    }
    public void setNumero1(float numero1){
        this.numero1=numero1;
    }
    public float getNumero2(){
        return numero2;
    }
    public void setNumero2(float numero2){
        this.numero2=numero2;
    }
    public float getResultado(){
        return resultado;
    }   
    public void setResultado(float resultado){
        this.resultado=resultado;
    }
    public char getOperador(){
        return operador;
    }
    public void setOperador(char operador){
        this.operador=operador;
    }
    public abstract float operar();
    public abstract float operar(float numero1, float numero2);
}


