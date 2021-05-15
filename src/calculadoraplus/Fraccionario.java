/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraplus;

/**
 *
 * @author lesli
 */
public class Fraccionario {
     // atributos
    private int numerador;
    private int denominador;
    
// inicializa a un valor por defecto de los atributos
public Fraccionario ()
 {
   // this.numerador=0;
    //this.denominador=1;
 }
// constructor alternativo
 public Fraccionario (int n,int d)
 {
    numerador= n;
    denominador = d ;
 }   
    
 public void  setNumerador(int n){
    numerador = n;
 }
 
 public void  setDenominador(int d){
    denominador = d;
 }
 
    public int getNumerador() {
        return numerador;
    }
 

    public int getDenominador() {
        return denominador;
    }
 

 public void imprimir()
 {
     System.out.println(numerador+"/"+denominador);
 }
 
    @Override
 public String toString()
 {/*La clase debe tener un método toString() que devuelva un String
     con el contenido de la fracción de la forma: numerador/denominador*/
  return numerador+"/"+denominador;
 }
 
}
