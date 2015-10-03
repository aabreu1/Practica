package com.javaexperience.web.controllers;

import com.javaexperience.negocio.entidades.Contacto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Andres
 */
@SessionScoped
@Named("agenda")
public class AgendaController implements Serializable{
private Contacto contacto  = new Contacto();
private Contacto contactoSleccionado = new Contacto(); 
private List<Contacto> listaContactos  = new ArrayList<>();
    
//METODOS CRUD
    public void prepararContacto() {
        contacto = new Contacto();      
    }

    public void agregarContacto(){
        listaContactos.add(contacto);
    }
    
    public void eliminarContacto(){
        listaContactos.remove(contactoSleccionado);
    }
   
    public void actualizarContacto(){
        
    }
    
//    GETTERS & SETTERS
    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        this.contacto = contacto;
    }

    public Contacto getContactoSleccionado() {
        return contactoSleccionado;
    }

    public void setContactoSleccionado(Contacto contactoSleccionado) {
        this.contactoSleccionado = contactoSleccionado;
    }

    public List<Contacto> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(List<Contacto> listaContactos) {
        this.listaContactos = listaContactos;
    }
    
}
