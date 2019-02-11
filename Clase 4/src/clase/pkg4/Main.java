/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.pkg4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author s204e2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Velocity vel=new Velocity();
            Personas per=new Personas("Henry Daniel", "Medallo", 20, 123456789);
            vel.crearVelocity(per);
        } catch (Exception ex) {
            System.out.println("El ruso es gay");;
        }
    }
    
}
