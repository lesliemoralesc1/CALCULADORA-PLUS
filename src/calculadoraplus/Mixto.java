
package calculadoraplus;

/**
 *
 * @author lesli
 */
public class Mixto {
    private int entero;
    private Fraccionario t;   
    //construcctor por defecto
    public Mixto(){
     this.entero = 1;   
    }
    //Constructor alternativo
    public Mixto(int a,Fraccionario t){
        entero = a;
        this.t = t;
    }
    // Constructor alternativo
    public Mixto(int e,int n,int d){
        entero = e;
        t = new Fraccionario (n,d);
    }
   public Mixto(Fraccionario t){
       this.t=t;
   }
    public void setEntero(int n) {
        entero = n;
    }

    public int getEntero() {
        return entero;
    }
    
    public void imprimir()
 {
     System.out.println(entero+" "+t);
 }
 
    @Override
 public String toString()
 {/*La clase debe tener un método toString() que devuelva un String
     con el contenido de la fracción de la forma: numerador/denominador*/
  return entero+" "+t;
 }

}
