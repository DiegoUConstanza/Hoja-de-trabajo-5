package hoja_trabajo_5_2023;
import java.util.Scanner;

public class Hoja_Trabajo_5_2023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funciones fn = new Funciones();
        int op=0;
        int a,b,c,d,m,n;
        int conteot = 0,conteo1 = 0,conteo2 = 0,conteo3 = 0;
        double resultado = 1;
        double p = 0,n1,n2,n3,n4,promedio=1;
        
        do {
            System.out.println("__________Menu de opciones__________");
            System.out.println("1. Login");
            System.out.println("2. Operaciones");
            System.out.println("3. Matriz");
            System.out.println("4. Notas");
            System.out.println("5. Peso");
            System.out.println("6. Factorial");
            System.out.println("7. Salir");
            op=sc.nextInt();
            switch(op){
                case 1:
                
                    System.out.println("_____Seleccionaste el Login_____");
                    fn.login();
                    break;
                    
                case 2:
                
                    System.out.println("_____Seleccionaste la Operacion_____");
                    System.out.println("Por favor ingrese el valor de 4 numeros (enteros)");
                    a=sc.nextInt();
                    b=sc.nextInt();
                    c=sc.nextInt();
                    d=sc.nextInt();
                    fn.operaciones(a,b,c,d);
                    break;
                    
                case 3:
                
                    System.out.println("_____Seleccionaste la Matriz_____");
                    System.out.println("Ingrese el valor de la matriz (m*n)");
                    do {
                        m=sc.nextInt();
                        n=sc.nextInt();
                        if (m<=0 || n<=0) {
                            System.out.println("Por favor ingrese valores mayores a 0");
                            System.out.println("Ingrese el valor de la matriz (m*n)");
                        }else{
                            fn.matriz(m,n);
                        }
                    }while (m<=0 || n<=0);
                    break;
                    
                case 4:
                    
                    //Inconveniente de que no deja ingresar decimales
                    System.out.println("_____Seleccionaste las Notas_____");
                    do {
                        System.out.println("Ingrese las notas de sus 4 parciales");
                        n1=sc.nextDouble();
                        n2=sc.nextDouble();
                        n3=sc.nextDouble();
                        n4=sc.nextDouble();
                        if (n1<0 || n2<0 || n3<0 || n4<0) {
                            System.out.println("Tan mal estas que las notas son negativas?");
                        }else if(n1>100 || n2>100 || n3>100 || n4>100){
                            System.out.println("El maximo a obtener es 100, no ingreses mas que eso");
                        }else{
                            System.out.println("Su promedio es de " + fn.promedio(n1,n2,n3,n4,promedio));
                            if (fn.promedio(n1,n2,n3,n4,promedio)<=59) {
                                System.out.println("Debes repetir el curso (0-59), no te rindas :,)");
                            }else if (fn.promedio(n1,n2,n3,n4,promedio)<=69) {
                                System.out.println("Pasaste como Regular (60-69), trata de mejorar");
                            }else if (fn.promedio(n1,n2,n3,n4,promedio)<=79) {
                                System.out.println("Pasaste como Bueno (70-79), nada mal");
                            }else if (fn.promedio(n1,n2,n3,n4,promedio)<=84) {
                                System.out.println("Pasaste como Bueno (80-84), muy bien sigue así");
                            }else{
                                System.out.println("pasaste como Excelente (85-100), Excelente :D");
                            }
                            /*Excelente (85 - 100), Muy bueno (80 - 84), Bueno (70 - 79), Regular
                            (60 - 69) o repite curso (< 59).*/
                        }
                    } while (n1<0 || n2<0 || n3<0 || n4<0 || n1>100 || n2>100 || n3>100 || n4>100);
                    break;
                    
                case 5:
                    
                    System.out.println("_____Seleccionaste el Peso_____");    
                    //conteo1 = menores a 9.8, conteo 2 = entre 9.8 y 10.2, conteo 3 = mayor a 10.2
                    fn.peso(p,conteot,conteo1,conteo2,conteo3);
                    break;
                    
                case 6:
                    
                    System.out.println("_____Seleccionaste el Factorial_____");
                    System.out.println("Ingrese el valor a encontrar el factorial");
                    do {
                        n=sc.nextInt();
                        if(n<0){
                            System.out.println("Por favor ingrese valores mayores a 0");
                        }else if (n==0) {
                            System.out.println("El factorial de 0 es = 1");
                        }else{
                            System.out.println(" El factorial de " + n + " es = " + fn.factorial(n,resultado)); 
                        }
                    }while (n<0);
                    break;
                    
                case 7:
                    System.out.println("Acabas de salir. Nos vemos pronto :D");
                    break;
                 
                default:
                    System.out.println("Por favor ingrese una opcion valida");
                    break;
            }
        } while (op!=7);
        System.exit(0);
    }
    
}
