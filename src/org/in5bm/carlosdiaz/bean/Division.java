
package org.in5bm.carlosdiaz.bean;

/**
 * @author carlos diaz
 * @date 25/03/2022 
 * carne: 2018312 
 * codigo tecnico: IN5BM 
 * grupo: 1
 *
 */
public class Division extends Operacion{
   
    @Override
    public float operar() {
        setOperador('/');
        setResultado(getNumero1() / getNumero2());
        return getResultado();
}
    
    @Override
    public float operar(float numero1, float numero2) {
        setNumero1(numero1);
        setNumero2(numero2);
        setOperador('/');
        setResultado(getNumero1() / getNumero2());
        return getResultado();
    }
}
