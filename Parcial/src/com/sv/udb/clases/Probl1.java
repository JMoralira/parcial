/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.clases;

import java.awt.List;
import java.util.ArrayList;
/**
 *
 * @author Jose Lira
 */
public class Probl1 {
    private String Nombre;
    private int Edad;
    private double Altura;
    private double Peso;

   /*  public Probl1(String Nombre , int Edad, double Altura, double Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Altura = Altura;
        this.Altura = Peso;
    }
    
    public Probl1()
    {}*/

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    /**
     * @return the Altura
     */
    public double getAltura() {
        return Altura;
    }

    /**
     * @param Altura the Altura to set
     */
    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    /**
     * @return the Peso
     */
    public double getPeso() {
        return Peso;
    }

    /**
     * @param Peso the Peso to set
     */
    public void setPeso(double Peso) {
        this.Peso = Peso;
    }
    
     public ArrayList jugaTodo()
    {
        ArrayList<String> nombre = new ArrayList<String>();
         String Nom = getNombre();
             int Eda = getEdad();
             Integer.toString(Eda);
                 double altura = getAltura(); 
                 Double.toString(altura);
                     double pes = getPeso();
                     Double.toString(pes);
                     String juga2 = (Nom + "," + Eda +","+ altura +","+ pes);
                 
          nombre.add(juga2);
       for(int x=0;x<nombre.size();x++) {
          System.out.println(nombre.get(x));
}         
          return nombre;
    }
    public ArrayList nombre()
    {
         ArrayList<String> nombre = new ArrayList<String>();
         String nomb = getNombre();
                            
          nombre.add(nomb);
        return nombre;
    }
    
     public ArrayList edad()
    {
         ArrayList<String> edad2 = new ArrayList<String>();
        
             String edad = Integer.toString(getEdad());
              edad2.add(edad);
          return edad2;
          
    }
       public ArrayList altura()
    {
         ArrayList<String> edad2 = new ArrayList<String>();
        
             String alt = Double.toString(getAltura());
              edad2.add(alt);
          return edad2;
          
    }
         public ArrayList peso()
    {
         ArrayList<String> edad2 = new ArrayList<String>();
        
             String peso = Double.toString(getPeso());
              edad2.add(peso);
          return edad2;
          
    }
    
}

