/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4;
import java.io.StringWriter;
 
import java.io.StringWriter;
 
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

 
/**
 *
 * @author s204e2
 */
public class Velocity {

    public void crearVelocity(Personas personas) throws Exception {
        VelocityEngine ve = new VelocityEngine();
        ve.init();
         
        Template t = ve.getTemplate("C:\\Users\\s112e1\\Documents\\NetBeansProjects\\Clase 4\\src\\Resource\\Web.vm");
         
        VelocityContext vc = new VelocityContext();
            vc.put("Nombre", personas.getNombre());
            vc.put("Cedula", personas.getCedula());
            vc.put("Edad", personas.getEdad());
            vc.put("Ciudad", personas.getCiudad());
            
        StringWriter sw = new StringWriter();
        t.merge(vc, sw);
         
        System.out.println(sw);
    }

    public Velocity() {
    }


    
}
