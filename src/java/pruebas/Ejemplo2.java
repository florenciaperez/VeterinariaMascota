/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import utilitarios.HibernateUtil;

public class Ejemplo2 {

    public static void main(String[] args) {
        ArrayList<Mascota> lista=new ArrayList<>();
        MascotaDao mascotadao=new MascotaDao();
        Session sesion=HibernateUtil.getSessionFactory().openSession();
     lista = mascotadao.listarMascotas();
        
        for (Mascota mascota : lista) {
            //JOptionPane.showMessageDialog(null, mascota.getNombreMascota());
            System.out.print(mascota.getNombreMascota());
        }
    }
    
}
