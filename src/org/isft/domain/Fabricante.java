package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 01-may-2013 07:30:56 p.m.
 */
public class Fabricante {

	private String fab_direccion = "";
	private int fab_id = 0;
	private String fab_razonsocial = "";

	public Fabricante(){

	}

	public void finalize() throws Throwable {

	}

	public String getDireccion(){
		return this.fab_direccion;
	}

	public int getId(){
		return this.fab_id;
	}

	public String getRazonSocial(){
		return this.fab_razonsocial;
	}

	/**
	 * 
	 * @param razonsocial
	 */
	public void serRazonSocial(String razonsocial){
		this.fab_razonsocial = razonsocial;
	}

	/**
	 * 
	 * @param direccion
	 */
	public void setDireccion(String direccion){
		this.fab_direccion = direccion;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.fab_id = id;
	}

}