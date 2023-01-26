
package com.mycompany.automovil.logica;
    
import com.mycompany.automovil.persistencia.controladoraPersistencia;
import java.util.List;

public class controladora {
    
    controladoraPersistencia controlPersis = new controladoraPersistencia();
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, String cantPuertas) {
      
      
      Automovil auto = new Automovil();
      auto.setModelo(modelo);
      auto.setMarca(marca);
      auto.setMotor(motor);
      auto.setColor(color);
      auto.setPatente(patente);
      auto.setCantPuertas(cantPuertas);
      controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
      return controlPersis.traerAutos();  
    }

    public void borrarAuto(int idAuto) {
       controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
       return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, String cantPuertas) {
       auto.setColor(color);
       auto.setModelo(modelo);
       auto.setMarca(marca);
       auto.setPatente(patente);
       auto.setCantPuertas(cantPuertas);
       
       controlPersis.modificarAuto(auto);
    }
    
}
