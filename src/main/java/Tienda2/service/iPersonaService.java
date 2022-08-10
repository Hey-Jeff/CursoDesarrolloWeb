/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda2.service;

import com.tienda.entity.Persona;
import java.util.List;
import com.verdureria.entity.Producto;
import java.util.List;


public interface iPersonaService {
    

 
     public List <Producto> getAllVerdura();
     public Producto getVerduraById (long Id);
     public void saveVerdura (Producto verdura);
     public void delete (long id);

    public List<Persona> getAllPersona();

    public void savePersona(Persona persona);

    public Persona getPersonaById(Long idPersona);
    
}
