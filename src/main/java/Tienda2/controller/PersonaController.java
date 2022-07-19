
package Tienda2.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonaController {
    
   
package com.verdureria.controller;

import com.verdureria.entity.Producto;
import com.verdureria.entity.Local;
import com.verdureria.service.ILocalService;
import com.verdureria.service.IProductoService;
//import com.verdureria.service.ILocalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


    @Autowired
    private IProductoService ProductoService;
    
    //@Autowired
    //private ILocalService localService;
    
    //Metodo para leer productos
    @GetMapping("/productos")
    public String index (Model model) {
        List<Producto> listaProductos = ProductoService.getAllVerdura();
        model.addAttribute("titulo", "Tabla productos");
        model.addAttribute("productos", listaProductos);
        return "productos";
    }
    
    //Metodo para crear productos
    @GetMapping("/productosN")
    public String CrearProducto (Model model) {
        List<Producto> listaProductos = ProductoService.getAllVerdura();
        model.addAttribute("producto",new Producto());
       // model.addAttribute("titulo", "Tabla productos");
        model.addAttribute("productos", listaProductos);
        return "crear";
    }
    
    //Metodo para 
    @GetMapping("/productos")
    public String index (Model model) {
        List<Producto> listaProductos = ProductoService.getAllVerdura();
        model.addAttribute("titulo", "Tabla productos");
        model.addAttribute("productos", listaProductos);
        return "productos";
    }
    
    
}
   
    
