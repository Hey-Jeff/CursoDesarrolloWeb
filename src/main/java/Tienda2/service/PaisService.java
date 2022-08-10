/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda2.service;

import Tienda2.entity.Pais;
import Tienda2.repository.PaisRepository;
import com.tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaisService implements iPaisService {

    @Autowired
    private PaisRepository paisRepository;

    public List<Pais> listCountry() {
        return (List<Pais>) paisRepository.findAll();
    }
}
