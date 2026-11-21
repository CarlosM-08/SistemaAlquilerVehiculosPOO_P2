/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author cmu08_12mttuz
 */
public class Cliente {
    
    //ATRIBUTOS
    private String nombre;
    private int edad;
    private String identidad;
    private String licencia;
    
    //CONSTRUTOR
    public Cliente (String nombre, int edad, String identidad, String licencia){
    this.nombre = nombre;
    setEdad (edad);
    this.identidad = identidad;
    this.licencia = licencia;    
    }//FIn de constructor
    
    //GETTER Y SETTER

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 18) {
        this.edad = edad;
    } else {
        throw new IllegalArgumentException(// se agrega esta instrucción que genere una excepción cuando se reciba un argumento inválido.
            "El cliente debe tener al menos 18 años."
        );
    }
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    
}
