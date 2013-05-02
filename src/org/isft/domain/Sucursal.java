package org.isft.domain;

/**
 * @author Sebastian Marquez
 * @version 1.0
 * @created 01-may-2013 07:09:57 p.m.
 */
public class Sucursal {

	private int suc_id = 0;
	private String suc_nombre = "";

	public Sucursal(){

	}

	public void finalize() throws Throwable {

	}

	public int getId(){
		return this.suc_id;
	}

	public String getNombre(){
		return this.suc_nombre;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.suc_id = id;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre){
		this.suc_nombre = nombre;
	}

}