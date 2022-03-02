/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ajose
 */
public class Athlete {
    
    private String ID;
    private String name;
    private int bib;
    private int age;
    private ArrayList<Race> athleteRaces;
    public static int dorsal = 1000;
    
    /* CONSTRUCTOR COMPLETO */
    public Athlete (String ID, String name, int age){
        this.ID = ID;
        this.name = name;
        this.bib = dorsal++;
        this.age = age;
        athleteRaces = new ArrayList<>();
        System.out.println("Athlete created -->\nMemory address: " + this + "\nName: " + name + "\nDorsal: " + bib);
    }
    
    /* CONSTRUCTOR DE CAMPOS OBLIGATORIOS */
    public Athlete (String ID, String name){
        this.ID = ID;
        this.name = name;
        this.bib = dorsal++;
        athleteRaces = new ArrayList<>();
        System.out.println("Athlete created -->\nMemory address: " + this + "\nName: " + name + "\nDorsal: " + bib);
    }
    
    public ArrayList<Race> getAthleteRaces(){
        return athleteRaces;
    }
    
    /* MÉTODO PARA SABER SI EL ATLETA ES MAYOR DE 50*/
    public static boolean isSenior (int age){
        boolean senior = false;
        if (age > 50){
            senior = true;
        }
        return senior;
    }
    
    // SETTERS //
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
        
    // GETTERS //
    public String getID(){
        return ID;
    }
    public String getName(){
        return name;
    }
    public int getBib(){
        return bib;
    }
    public int getAge(){
        return age;
    }
}
