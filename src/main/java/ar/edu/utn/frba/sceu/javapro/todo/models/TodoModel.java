package ar.edu.utn.frba.sceu.javapro.todo.models;

import java.util.*;
import java.io.*;

public class TodoModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 69171663402209796L;
	String tarea;
	Date fechaLimite;
	Boolean realizada;
	Date fechaRealizada;
	
	public TodoModel(String tarea, Date fechaLimite, Boolean realizada, Date fechaRealizada) {
		this.tarea=tarea;
		this.fechaLimite=fechaLimite;
		this.realizada=realizada;
		this.fechaRealizada=fechaRealizada;		
	}

	public String getTarea() {
		return tarea;
	}

	public void setTarea(String tarea) {
		this.tarea = tarea;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public Boolean getRealizada() {
		return realizada;
	}

	public void setRealizada(Boolean realizada) {
		this.realizada = realizada;
	}

	public Date getFechaRealizada() {
		return fechaRealizada;
	}

	public void setFechaRealizada(Date fechaRealizada) {
		this.fechaRealizada = fechaRealizada;
	}
	
	
}
