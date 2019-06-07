/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Dao.MascotaDao;
import entidades.Mascota;

public class Ejemlo1 {

    public static void main(String[] args) {
        // TODO code application logic here
        MascotaDao mascotadao = new MascotaDao();
        //Mascota mimascota=new Mascota(3, "Brandon", "Lusmery", "Pastor Aleman");
        Mascota mimascota4 = new Mascota(4, "Rambo", "mario", "Pastor Aleman");
        Mascota mimascota5 = new Mascota(5, "Capricho", "maria", "Pastor Aleman");
        Mascota mimascota6= new Mascota(6, "Furia", "jose", "Pastor Aleman");
        Mascota mimascota7 = new Mascota(7, "Pillo", "sandra", "Pastor Aleman");
        Mascota mimascota8 = new Mascota(8, "Rayo", "alex", "Pastor Aleman");
        Mascota mimascota9 = new Mascota(9, "Sandor", "luis", "Carlino");
        Mascota mimascota10= new Mascota(10, "Sandor", "leo", "Caniche");
        mascotadao.guardarMascota(mimascota4);
        mascotadao.guardarMascota(mimascota5);
        mascotadao.guardarMascota(mimascota6);
        mascotadao.guardarMascota(mimascota7);
        mascotadao.guardarMascota(mimascota8);
        mascotadao.guardarMascota(mimascota9);
        mascotadao.guardarMascota(mimascota10);
        
    }

}
