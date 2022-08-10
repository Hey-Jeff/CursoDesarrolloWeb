/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Tienda2.service.api;
import Tienda2.model.ReportePersonasDTO;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;


public interface ReportePersonasServiceAPI {
    
    ReportePersonasDTO obtenerReportePersonas(Map<String, Object> params) throws JRException, IOException, SQLException;
    
}

