
package calculadoraplus;

import javax.swing.JOptionPane;

/**
 * @author Leslie Morales
 */
public class Calculadoraplus {

    
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        
        String cantidad = JOptionPane.showInputDialog("                                       Calculadora\n"
                +"\t Ingrese la cantidad de operaciones que desea realizar: ");
        int cant = Integer.parseInt(cantidad);// veces a repetir el ciclo
        for(int i=0; i<cant;i++){//Presentacion de menu
        String entrada = JOptionPane.showInputDialog(
                "1. Fraccion por defecto y Fraccion por defecto\n"
                +"2. Digitar Fraccion y Fraccion por defecto\n"
                + "3. Fraccion Mixta y Fraccion por defecto\n"
                + "4. Digitar Fraccion y Fraccion Mixta\n"
                + "5. Digitar Fraccion y Digitar fraccion\n"
                + "6. Fraccion Mixta y Fraccion Mixta");
        int op = Integer.parseInt(entrada);//convierte entrada en int
        
                if(op < 7 && op > 0){
                
             // funciones Menu
                switch(op){//Creacion de las fracciones
                    case 1:{//1. Fraccion por defecto y Fraccion por defecto
                        Fraccionario p = new Fraccionario();
                        p.setNumerador(10);
                        p.setDenominador(5);
                        Fraccionario q = new Fraccionario();
                        q.setNumerador(12);
                        q.setDenominador(7);
                        //Operaciones
                        Fraccionario sim = Calculadora.simplificacionFraccionario1(p);
                        Fraccionario sim2 = Calculadora.simplificacionFraccionario1(q);
                        Fraccionario res = Calculadora.multiplicarFraccionario(p,q);
                        Fraccionario res2 = Calculadora.divisionFraccionario(p,q);
                        Fraccionario res3 = Calculadora.sumaFraccionario(p,q);
                        Fraccionario res4 = Calculadora.restaFraccionario(p,q);
                        for(int j=0;j<1;j++){
                            String imp = JOptionPane.showInputDialog(" Elija la forma como se va a imprimir:\n "
                                    + "1.En Fraccion\n"
                                    + "2.En Mixto\n");
                            int op2=Integer.parseInt(imp);
                            if(op2 >0 && op2 < 3){
                                switch(op2){
                                 case 1:{

                                    JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                    +"El resultado de la simplificacion de la fraccion #1 es: "+(sim)
                                    +"\nEl resultado de la simplificacion de la fraccion #2 es: "+sim2
                                    +"\nEl resultado de la multipliacion es: "+res
                                    +"\nEl resultado de la division es: "+res2
                                    +"\nEl resultado de la suma es: "+res3
                                    +"\nEl resultado de la resta es: "+res4);
                                   break;    
                                    }
                                 case 2:{

                                         JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                        +"El resultado de la simplificacion de la fraccion #1 es: "+Calculadora.pasaramixto(sim)
                                        +"\nEl resultado de la simplificacion de la fraccion #2 es: "+Calculadora.pasaramixto(sim2)
                                        +"\nEl resultado de la multipliacion es: "+Calculadora.pasaramixto(res)
                                        +"\nEl resultado de la division es: "+Calculadora.pasaramixto(res2)
                                        +"\nEl resultado de la suma es: "+Calculadora.pasaramixto(res3)
                                        +"\nEl resultado de la resta es: "+Calculadora.pasaramixto(res4));
                                    break;}
                                }//end switch operaciones
                            }// end if
                            else {
                                j--;
                                JOptionPane.showMessageDialog(null,"Vuelva a ingresar la opcion");
                                }// end else
                        }//end for
                        break;
                        }//end case 1
                    
                       case 2:{//2. Digitar Fraccion y Fraccion por defecto
                            //Nueva Fraccion 
                            String num = JOptionPane.showInputDialog(null,"Escribe el numerador de la fraccion: ");
                            int a = Integer.parseInt(num);
                            String num1 = JOptionPane.showInputDialog("Escribe el denominador de la fraccion: ");
                            int b = Integer.parseInt(num1);
                            Fraccionario q = new Fraccionario(a,b);

                            //Fraccion por defecto
                            Fraccionario p = new Fraccionario();
                            p.setNumerador(10);
                            p.setDenominador(5);

                            //Operaciones
                            Fraccionario sim    = Calculadora.simplificacionFraccionario1(p);
                            Fraccionario sim2   = Calculadora.simplificacionFraccionario1(q);
                            Fraccionario res    = Calculadora.multiplicarFraccionario(p,q);
                            Fraccionario res2   = Calculadora.divisionFraccionario(p,q);
                            Fraccionario res3   = Calculadora.sumaFraccionario(p,q);
                            Fraccionario res4   = Calculadora.restaFraccionario(p,q);
                            for(int j=0;j<1;j++){
                                String imp = JOptionPane.showInputDialog(" Elija la forma como se va a imprimir:\n "
                                        + "1.En Fraccion\n"
                                        + "2.En Mixto\n");
                                int op2=Integer.parseInt(imp);
                                if(op2 >0 && op2 < 3){
                                    switch(op2){
                                     case 1:{

                                        JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                        +"El resultado de la simplificacion de la fraccion #1 es: "+(sim)
                                        +"\nEl resultado de la simplificacion de la fraccion #2 es: "+sim2
                                        +"\nEl resultado de la multipliacion es: "+res
                                        +"\nEl resultado de la division es: "+res2
                                        +"\nEl resultado de la suma es: "+res3
                                        +"\nEl resultado de la resta es: "+res4);
                                       break;    
                                        }
                                     case 2:{

                                             JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                            +"El resultado de la simplificacion de la fraccion #1 es: "+Calculadora.pasaramixto(sim)
                                            +"\nEl resultado de la simplificacion de la fraccion #2 es: "+Calculadora.pasaramixto(sim2)
                                            +"\nEl resultado de la multipliacion es: "+Calculadora.pasaramixto(res)
                                            +"\nEl resultado de la division es: "+Calculadora.pasaramixto(res2)
                                            +"\nEl resultado de la suma es: "+Calculadora.pasaramixto(res3)
                                            +"\nEl resultado de la resta es: "+Calculadora.pasaramixto(res4));
                                        break;}
                                    }//end switch operaciones
                                }// end if
                                else {
                                    j--;
                                    JOptionPane.showMessageDialog(null,"Vuelva a ingresar la opcion");
                                    }// end else
                                }//end for
                                break;
                    }//end case 2
                       
                    case 3:{//3. Fraccion Mixta y Fraccion por defecto"
                        // Fraccion Mixta
                        String ent = JOptionPane.showInputDialog(null,"Escribe el numero entero: ");
                        int a = Integer.parseInt(ent);
                        String num = JOptionPane.showInputDialog(null,"Escribe el numerador de la fraccion: ");
                        int b = Integer.parseInt(num);
                        String num1 = JOptionPane.showInputDialog(null,"Escribe el denominador de la fraccion: ");
                        int c = Integer.parseInt(num1);
                        int x = (a*c)+b;
                        Fraccionario q = new Fraccionario(x,c);
                        Mixto m = new Mixto (a,b,c);
                        //Fraccion por defecto
                        Fraccionario p = new Fraccionario();
                        p.setNumerador(3);
                        p.setDenominador(5);
                        //Operaciones
                        Fraccionario sim = Calculadora.simplificacionFraccionario1(p);
                        Fraccionario sim2 = Calculadora.simplificacionFraccionario1(q);
                        Fraccionario res = Calculadora.multiplicarFraccionario(p,q);
                        Fraccionario res2 = Calculadora.divisionFraccionario(p,q);
                        Fraccionario res3 = Calculadora.sumaFraccionario(p,q);
                        Fraccionario res4 = Calculadora.restaFraccionario(p,q);
                        for(int j=0;j<1;j++){
                            String imp = JOptionPane.showInputDialog(" Elija la forma como se va a imprimir: \n"
                                    + "1.En Fraccion\n"
                                    + "2.En Mixto\n");
                            int op2=Integer.parseInt(imp);
                            if(op2 >0 && op2 < 3){
                                switch(op2){
                                 case 1:{

                                    JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                    +"El resultado de la simplificacion de la fraccion #1 es: "+(sim)
                                    +"\nEl resultado de la simplificacion de la fraccion #2 es: "+sim2
                                    +"\nEl resultado de la multipliacion es: "+res
                                    +"\nEl resultado de la division es: "+res2
                                    +"\nEl resultado de la suma es: "+res3
                                    +"\nEl resultado de la resta es: "+res4);
                                   break;    
                                    }
                                 case 2:{

                                         JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                        +"El resultado de la simplificacion de la fraccion #1 es: "+Calculadora.pasaramixto(sim)
                                        +"\nEl resultado de la simplificacion de la fraccion #2 es: "+Calculadora.pasaramixto(sim2)
                                        +"\nEl resultado de la multipliacion es: "+Calculadora.pasaramixto(res)
                                        +"\nEl resultado de la division es: "+Calculadora.pasaramixto(res2)
                                        +"\nEl resultado de la suma es: "+Calculadora.pasaramixto(res3)
                                        +"\nEl resultado de la resta es: "+Calculadora.pasaramixto(res4));
                                    break;}
                                }//end switch operaciones
                            }// end if
                            else {
                                j--;
                                JOptionPane.showMessageDialog(null,"Vuelva a ingresar la opcion");
                                }// end else
                        }//end for
                                break;
                    }//end case 4
                    case 5:{//5. Digitar Fraccion y Digitar fraccion
                        //Nueva Fraccion 
                        String num = JOptionPane.showInputDialog(null,"Escribe el numerador de la fraccion: ");
                        int a = Integer.parseInt(num);
                        String num1 = JOptionPane.showInputDialog("Escribe el denominador de la fraccion: ");
                        int b = Integer.parseInt(num1);
                        Fraccionario p = new Fraccionario(a,b);
                        //Nueva Fraccion 
                        String num2 = JOptionPane.showInputDialog(null,"Escribe el numerador de la fraccion: ");
                        int c = Integer.parseInt(num2);
                        String num3 = JOptionPane.showInputDialog("Escribe el denominador de la fraccion: ");
                        int d = Integer.parseInt(num3);
                        
                        Fraccionario q = new Fraccionario(c,d);
                         //Operaciones
                        Fraccionario sim = Calculadora.simplificacionFraccionario1(p);
                        Fraccionario sim2 = Calculadora.simplificacionFraccionario1(q);
                        Fraccionario res = Calculadora.multiplicarFraccionario(p,q);
                        Fraccionario res2 = Calculadora.divisionFraccionario(p,q);
                        Fraccionario res3 = Calculadora.sumaFraccionario(p,q);
                        Fraccionario res4 = Calculadora.restaFraccionario(p,q);
                        for(int j=0;j<1;j++){
                            String imp = JOptionPane.showInputDialog(" Elija la forma como se va a imprimir: "
                                    + "1.En Fraccion\n"
                                    + "2.En Mixto\n");
                            int op2=Integer.parseInt(imp);
                            if(op2 >0 && op2 < 3){
                                switch(op2){
                                 case 1:{

                                    JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                    +"El resultado de la simplificacion de la fraccion #1 es: "+(sim)
                                    +"\nEl resultado de la simplificacion de la fraccion #2 es: "+sim2
                                    +"\nEl resultado de la multipliacion es: "+res
                                    +"\nEl resultado de la division es: "+res2
                                    +"\nEl resultado de la suma es: "+res3
                                    +"\nEl resultado de la resta es: "+res4);
                                   break;    
                                    }
                                 case 2:{

                                         JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                        +"El resultado de la simplificacion de la fraccion #1 es: "+Calculadora.pasaramixto(sim)
                                        +"\nEl resultado de la simplificacion de la fraccion #2 es: "+Calculadora.pasaramixto(sim2)
                                        +"\nEl resultado de la multipliacion es: "+Calculadora.pasaramixto(res)
                                        +"\nEl resultado de la division es: "+Calculadora.pasaramixto(res2)
                                        +"\nEl resultado de la suma es: "+Calculadora.pasaramixto(res3)
                                        +"\nEl resultado de la resta es: "+Calculadora.pasaramixto(res4));
                                    break;}
                                }//end switch operaciones
                            }// end if
                            else {
                                j--;
                                JOptionPane.showMessageDialog(null,"Vuelva a ingresar la opcion");
                                }// end else
                        }//end for
                                break;
                    }//end case 5
                    case 6:{//6. Fraccion Mixta y Fraccion Mixta
                        // Fraccion Mixta
                        String ent = JOptionPane.showInputDialog(null,"Escribe el numero entero: ");
                        int n = Integer.parseInt(ent);
                        String num = JOptionPane.showInputDialog(null,"Escribe el numerador de la fraccion: ");
                        int d = Integer.parseInt(num);
                        String num1 = JOptionPane.showInputDialog(null,"Escribe el denominador de la fraccion: ");
                        int c = Integer.parseInt(num1);
                        int x = (n*c)+d;
                        Fraccionario p = new Fraccionario(x,c);
                        Mixto m = new Mixto (n,d,c);                                           
                   
                        // Fraccion Mixta
                        String ent1 = JOptionPane.showInputDialog(null,"Escribe el numero entero: ");
                        int a = Integer.parseInt(ent1);
                        String num2 = JOptionPane.showInputDialog(null,"Escribe el numerador de la fraccion: ");
                        int b = Integer.parseInt(num2);
                        String num3 = JOptionPane.showInputDialog(null,"Escribe el denominador de la fraccion: ");
                        int j = Integer.parseInt(num3);
                        int w = (a*j)+b;
                        Fraccionario q = new Fraccionario(w,j);
                        Mixto f = new Mixto (a,b,j);                        
                        System.out.println(f);
                        //Operaciones
                        Fraccionario sim  = Calculadora.simplificacionFraccionario1(p);
                        Fraccionario sim2 = Calculadora.simplificacionFraccionario1(q);
                        Fraccionario res  = Calculadora.multiplicarFraccionario(p,q);
                        Fraccionario res2 = Calculadora.divisionFraccionario(p,q);
                        Fraccionario res3 = Calculadora.sumaFraccionario(p,q);
                        Fraccionario res4 = Calculadora.restaFraccionario(p,q);
                        for(int o=0;j<1;j++){
                            String imp = JOptionPane.showInputDialog(" Elija la forma como se va a imprimir: \n"
                                    + "1.En Fraccion\n"
                                    + "2.En Mixto\n");
                            int op2=Integer.parseInt(imp);
                            if(op2 >0 && op2 < 3){
                                switch(op2){
                                 case 1:{

                                    JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                    +"El resultado de la simplificacion de la fraccion #1 es: "+(sim)
                                    +"\nEl resultado de la simplificacion de la fraccion #2 es: "+sim2
                                    +"\nEl resultado de la multipliacion es: "+res
                                    +"\nEl resultado de la division es: "+res2
                                    +"\nEl resultado de la suma es: "+res3
                                    +"\nEl resultado de la resta es: "+res4);
                                   break;    
                                    }
                                 case 2:{

                                         JOptionPane.showMessageDialog(null,"\t OPERACIONES DE FRACCINARIOS \n"
                                        +"El resultado de la simplificacion de la fraccion #1 es: "+Calculadora.pasaramixto(sim)
                                        +"\nEl resultado de la simplificacion de la fraccion #2 es: "+Calculadora.pasaramixto(sim2)
                                        +"\nEl resultado de la multipliacion es: "+Calculadora.pasaramixto(res)
                                        +"\nEl resultado de la division es: "+Calculadora.pasaramixto(res2)
                                        +"\nEl resultado de la suma es: "+Calculadora.pasaramixto(res3)
                                        +"\nEl resultado de la resta es: "+Calculadora.pasaramixto(res4));
                                    break;}
                                }//end switch operaciones
                            }// end if
                            else {
                                o--;
                                JOptionPane.showMessageDialog(null,"Vuelva a ingresar la opcion");
                                }// end else
                        }//end for
                                break;
                    }//end case 6
                    
                }//end switch
            
            }//end if
            else{
                i--;
                JOptionPane.showMessageDialog(null,"Vuelva a ingresar la opcion");
            }// end else
            
        }//end for
} // end main
}  

 
             
                