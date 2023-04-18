package hoja_trabajo_5_2023;
import java.util.Scanner;
import java.lang.Math;

public class Funciones {
    Scanner sc = new Scanner (System.in);
    Login vn = new Login();
    
    //1
    public void login(){
        vn.setVisible(true);
    }
    
    //2
    int operaciones (int a, int b, int c, int d){
        System.out.println("La operacion 'no1 + no2' = "+(a+b));
        System.out.println("La operacion 'no3 * no4' = "+(c*d));
        
        return 0;
    }
    
    //3
    double matriz(int m, int n){
        
        System.out.println("Acabas de ingresar una matriz de " + m + " filas  y " + n + " columnas");
        System.out.print("\n");
        
        double matriz[][] = new double [m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = Math.random()*1000;
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("\n");
        }    
        
        return 0;
    }
    
    //4
    double promedio(double n1, double n2, double n3, double n4, double promedio){
        
        n1=n1*0.20;
        n2=n2*0.20;
        n3=n3*0.30;
        n4=n4*0.30;
        promedio=n1+n2+n3+n4;
        
        return promedio;
    }
    
    //5
    double peso(double p, int conteot, int conteo1, int conteo2, int conteo3 ){
        
        //conteo1 = menores a 9.8, conteo 2 = entre 9.8 y 10.2, conteo 3 = mayor a 10.2
        
        do {
            System.out.println("Ingrese el peso de algunas piezas (medida en kilogramos)");
            p=sc.nextDouble();
            if (p<=0){
                System.out.println("No existen piezas que pesen menos o igual a 0");
            }else{
                conteot=conteot+1;
                if (p<=9.8){
                    conteo1=conteo1+1;
                }else if(p<10.2){
                    conteo2=conteo2+1;
                }else{
                    conteo3=conteo3+1;
                }
            }
        } while (p!=0);
        System.out.println("Hay un total de " + conteo1 + " piezas que pesan menos o igual que 9.8");
        System.out.println("Hay un total de " + conteo2 + " piezas que pesan entre 9.8 y 10.2");
        System.out.println("Hay un total de " + conteo3 + " piezas que pesan mas o igual que 10.2");
        System.out.println("Contando con un total de " + conteot + " piezas");
        
        return 0;
    }
    
    //6
    double factorial(int n, double resultado){
        
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;
        }
        return resultado;
    }
}
