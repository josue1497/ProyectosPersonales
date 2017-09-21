/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package josuemartinez_java_i;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Josue Martinez
 */
public class JosueMartinez_JAVA_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre1 = "",nombre2 = "",nombre3 = "",nombre4 = "",nombre5 = "";
        String ape1 = null,ape2 = null,ape3 = null,ape4 = null,ape5 = null;
        int edad1 = 0,edad2= 0,edad3= 0,edad4= 0,edad5= 0;
        
        File archivo=new File("C:\\carpeta\\datos.txt");
        
        try {
            FileReader fr=new FileReader(archivo);
            BufferedReader br=new BufferedReader(fr);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JosueMartinez_JAVA_I.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       Scanner teclado=new Scanner(System.in);
        
      
       /*++++++++++++++++++++++++++++++++++++++++++++++++++++
       
       Primera Persona
       +++++++++++++++++++++++++++++++++++++++++++++++++++++*/
       
       
        System.out.println("Bienvenido!");
        System.out.println("Ingrese el nombre de la primera persona: ");
        nombre1=teclado.next();
        System.out.println("Ingrese su apellido: ");
        ape1=teclado.next();
        System.out.println("Ingrese su edad: ");
        edad1=teclado.nextInt();
        
        System.out.println(nombre1+edad1+ape1);
               
       
       /*++++++++++++++++++++++++++++++++++++++++++++++++++++
       
       segunda Persona
       +++++++++++++++++++++++++++++++++++++++++++++++++++++*/
       
       
        System.out.println("Ingrese el nombre de la segunda persona: ");
        nombre2=teclado.next();
        System.out.println("Ingrese su apellido: ");
        ape2=teclado.next();
        System.out.println("Ingrese su edad: ");
        edad2=teclado.nextInt();
        
        
        
       /*++++++++++++++++++++++++++++++++++++++++++++++++++++
       
       Tercera Persona
       +++++++++++++++++++++++++++++++++++++++++++++++++++++*/
       
       
        System.out.println("Ingrese el nombre de la tercera persona: ");
        nombre3=teclado.next();
        System.out.println("Ingrese su apellido: ");
        ape3=teclado.next();
        System.out.println("Ingrese su edad: ");
        edad3=teclado.nextInt();
        
        /*++++++++++++++++++++++++++++++++++++++++++++++++++++
       
       Cuarta Persona
       +++++++++++++++++++++++++++++++++++++++++++++++++++++*/
       
       
        System.out.println("Ingrese el nombre de la cuarta persona: ");
        nombre4=teclado.next();
        System.out.println("Ingrese su apellido: ");
        ape4=teclado.next();
        System.out.println("Ingrese su edad: ");
        edad4=teclado.nextInt();
        
        /*++++++++++++++++++++++++++++++++++++++++++++++++++++
       
       quinta Persona
       +++++++++++++++++++++++++++++++++++++++++++++++++++++*/
       
       
        System.out.println("Ingrese el nombre de la quinta persona: ");
        nombre5=teclado.next();
        System.out.println("Ingrese su apellido: ");
        ape5=teclado.next();
        System.out.println("Ingrese su edad: ");
        edad5=teclado.nextInt();
        
    
        //Escritura del Archivo
        
        
        FileWriter escribir=null;
        PrintWriter imprimir=null;
        
        try {
            escribir=new FileWriter(archivo);
            imprimir=new PrintWriter(escribir);
            
            imprimir.println("Nombre // Apellido // Edad\n");
            imprimir.println(nombre1+" // "+ape1+" // "+edad1);
            imprimir.println(nombre2+" // "+ape2+" // "+edad2);
            imprimir.println(nombre3+" // "+ape3+" // "+edad3);
            imprimir.println(nombre4+" // "+ape4+" // "+edad4);
            imprimir.println(nombre5+" // "+ape5+" // "+edad5);
            
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
        
            try{
                if(null!=escribir)
                    escribir.close();
            }catch(Exception e2){
                e2.printStackTrace();
            }
        }
    }
    
}
