/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda2.service;

import Tienda2.entity.Persona;
import java.util.List;


public interface iPersonaService {

    public List<Persona> getAllPersona();

    public Persona getPersonaById(long id);

    public void savePersona(Persona persona);

    public void delete(long id);
    
    //Devolver una persona por el nombre
    public Persona findByNombre (String nombre); 
    
}
