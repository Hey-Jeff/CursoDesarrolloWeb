/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda2.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Tienda2.entity.Persona;
import Tienda2.repository.PersonaRepository;

@Service
public class PersonaService implements iPersonaService {

    @Autowired
    private PersonaRepository personaRepository;


    public List<Persona> getAllpersona(){
        return (List<Persona>) personaRepository.findAll();
    }

   
    public Persona getPersonaById(long id) {
        return personaRepository.findById(id).orElse(null);
    }

    
    public void savePersona(Persona persona) {
        personaRepository.save(persona);
    }

    @Override
    public void delete(long id) {
        personaRepository.deleteById(id);
    }

    @Override
    public Persona findByNombre(String nombre) {
       return personaRepository.findByNombre(nombre); 
    }

}
