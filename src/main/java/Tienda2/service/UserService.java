/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda2.service;

import Tienda2.entity.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class UserService implements UserDetailsService {
    
    
    @Autowired
    public iPersonaService personaService; 

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       Persona persona = this.personaService.findByNombre(username); 
       Userprincipal userPrincipal = new Userprincipal (persona); 
       return userPrincipal; 
    }
}
