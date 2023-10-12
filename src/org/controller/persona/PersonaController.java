package org.controller.persona;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.dao.persona.DAOPersona;
import org.modelo.persona.Persona;

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class PersonaController implements Serializable{

	private List<Persona> listPersonas;
	private Persona persona;
	
	//SUPERCLASS
	public PersonaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	//getters and setters d List
	public List<Persona> getListPersonas() {
		DAOPersona dao = new DAOPersona();
		listPersonas = dao.listPersonas();
		return listPersonas;
	}

	public void setListPersona(List<Persona> listPersonas) {
		this.listPersonas = listPersonas;
	}

	//getters persona
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	
	//methods persona
	public void limpiarPersona() {
		persona = new Persona();
	}
	
	public String agregarPersona() {
		DAOPersona dao = new DAOPersona();
		dao.addPersona(persona);
		return "index.xhtml?faces-redirect=true";
	}

	public String modificarPersona() {
		DAOPersona dao = new DAOPersona();
		dao.updatePersona(persona);
		return "index.xhtml?faces-redirect=true";
	}
	
	public String eliminarPersona() {
		DAOPersona dao = new DAOPersona();
		dao.deletePersona(persona);
		return "index.xhtml?faces-redirect=true";
	}
	
	
}
