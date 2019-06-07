/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import org.hibernate.Query;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

/**
 *
 * @author Lenovo
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  int Cantidad;
        MascotaDao mascotadao=new MascotaDao();
        Session sesion=HibernateUtil.getSessionFactory().openSession();
     Cantidad = mascotadao.CantidadMascota(sesion);
        System.out.println("CANTIDAD DE REGISTRO QUE EXISTE ES: " +Cantidad);
        
       
        

    }
    
}
