package com.helenlopezsolano.proyecto.modelo;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "docentes")
public class Docente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String docente;
	String telefono;
	String blog;
	String profesion;
	String escalafon;
	String idioma;
	String experiencia;
	String areaTrabajo;
	//@OneToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	//@JoinColumn(name="usuario_id")
	//private Usuario usuario;
	
	public Docente() {
		
	}
	public Docente(int id, String docente, String telefono, String blog, String profesion, String escalafon,
			String idioma, String experiencia, String areaTrabajo) {
		super();
		this.id = id;
		this.docente = docente;
		this.telefono = telefono;
		this.blog = blog;
		this.profesion = profesion;
		this.escalafon = escalafon;
		this.idioma = idioma;
		this.experiencia = experiencia;
		this.areaTrabajo = areaTrabajo;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getBlog() {
		return blog;
	}
	public void setBlog(String blog) {
		this.blog = blog;
	}
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getEscalafon() {
		return escalafon;
	}
	public void setEscalafon(String escalafon) {
		this.escalafon = escalafon;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	public String getAreaTrabajo() {
		return areaTrabajo;
	}
	public void setAreaTrabajo(String areaTrabajo) {
		this.areaTrabajo = areaTrabajo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
