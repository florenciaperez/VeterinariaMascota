/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedBean;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Lenovo
 */
@ManagedBean
@ViewScoped

public class managedBean {

    private Mascota mascota;
 public Mascota getMascota(){
     return  mascota;
 }
 public  void  setMascota(Mascota mascota){
     this.mascota=mascota;
 }
 
    /**
     * Creates a new instance of MascotaBean
     */
    public managedBean() {
    this.mascota=new Mascota();
    }

  
    //GUARDAR

    public String guardarMascota() {
        try {

            MascotaDao mascotadao = new MascotaDao();
            boolean respuesta = mascotadao.guardarMascota(mascota);
            if(respuesta){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("corecto","Registro Existoso"));
            }else{
                 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error","no se pede registrar"));
            }

        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return "/index";
    }

    public String  actualizarMascota() {
        try {
            MascotaDao mascotadao = new MascotaDao();
           boolean respuesta=  mascotadao.ActualizarMascota(mascota);
            if(respuesta){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("corecto","Actualizacion Existoso"));
            }else{
                 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error","no se pede actualizar"));
            }

        } catch (Exception e) {
            
        }
        return "/index";
    }

    public ArrayList<Mascota> listarMascotas() {

        ArrayList<Mascota> milista = new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista = dao.listarMascotas();
        return milista;
    }

    public String limpiar() {
        return "/index.xhtml";
    }

    
    public String eliminar(Mascota mascotas){
         try {

            MascotaDao mascotadao = new MascotaDao();
            boolean respuesta = mascotadao.eliminar(mascotas);
            if(respuesta){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("corecto","Eliminacion Existoso"));
            }else{
                 FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Error","no se pede eliminar"));
            }
            
        } catch (Exception e) {
            System.out.println("error" + e);
        }
        return "/index";        
    }

   

}
