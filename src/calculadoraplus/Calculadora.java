
package calculadoraplus;

import javax.swing.JOptionPane;

/**
 *
 * @author lesli
 */
public class Calculadora {
      public static Fraccionario multiplicarFraccionario( Fraccionario f1 , Fraccionario f2)  
  { /* Se multiplican los numerados de ambas fracciones
      y los denominadores entre si.
      */
    int n = f1.getNumerador() * f2.getNumerador();
    int d = f1.getDenominador() * f2.getDenominador();
    Fraccionario f = new Fraccionario(n,d);
   //    Calculadora.simplificacionFraccionario1(f);
   
    return f;
     
  }
 public static Fraccionario divisionFraccionario (Fraccionario f1, Fraccionario f2){
     
    /* Se multiplica el numerador de f1 con el denominador de f2 y 
    el denominador de f1 con el numerador f2
    */ 
    int n = f1.getNumerador()*f2.getDenominador();
    int d = f1.getDenominador()* f2.getNumerador();
      
    Fraccionario dv= new Fraccionario(n,d);
    return Calculadora.simplificacionFraccionario1(dv);
   
    }
    
 public static Fraccionario sumaFraccionario (Fraccionario f1, Fraccionario f2){
        
        int m1 = f1.getNumerador() * f2.getDenominador();
        int m2 = f1.getDenominador() * f2.getNumerador();
        int n= m1+m2;
        int d = f1.getDenominador() * f2.getDenominador();
        
    Fraccionario sm = new Fraccionario(n,d);
       
       return Calculadora.simplificacionFraccionario1(sm);
    }
 public static Fraccionario restaFraccionario (Fraccionario f1, Fraccionario f2){
        
    int m1 = f1.getNumerador() * f2.getDenominador();
    int m2 = f1.getDenominador() * f2.getNumerador();
    int n= m1-m2;
    int d = f1.getDenominador() * f2.getDenominador();
    
    Fraccionario sm = new Fraccionario(n,d);
     return Calculadora.simplificacionFraccionario1(sm);
      
    }
 public static Fraccionario simplificacionFraccionario1 (Fraccionario f1){
        
       /*
         Para simplificar una fracción primero hay que hallar el máximo común divisor del numerador y del denominador.
         Una vez hallado se divide el numerador y el denominador por este número. 
       */
     int a= Math.max(f1.getNumerador(), f1.getDenominador());
     int b=Math.min(f1.getNumerador(),f1.getDenominador());
     //Declaro la variable que guardara el resultado
     int res;
     
     // Ciclo que realizará las iteraciones
     do{
         res=b;
         b = a%b;
         a=res;
         
     }while(b!=0);//end do
     // el proceso se repite hasta que b se diferente de cero
     //antes de que el % fuera igual a cero, este valor res1 será el mcd entre a y b
     int n = f1.getNumerador()/res;
     int d = f1.getDenominador()/res;
    
       Fraccionario f = new Fraccionario(n,d);
       if(n<d || n==d){
         
       return f;}
       
       else if(n>d){
        Mixto h = Calculadora.pasaramixto(f);
         
        return f;
        }
     
     return f;
    }
     
  public static Mixto pasaramixto(Fraccionario f1){
      //conversion a mixto     
       int e = f1.getNumerador()/f1.getDenominador();
       int num = f1.getNumerador()%f1.getDenominador();
       Mixto f = new Mixto (e,num,f1.getDenominador());
       
     return f; 
  }
 
}
