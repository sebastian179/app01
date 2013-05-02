package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 01-may-2013 07:05:38 p.m.
 */
public class Categoria {

	private String cat_descripcion = "";
	private int cat_id = 0;

	public Categoria(){

	}

	public void finalize() throws Throwable {

	}

	public String getDescripcion(){
		return this.cat_descripcion;
	}

	public int getId(){
		return this.cat_id;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion){
		this.cat_descripcion = descripcion;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.cat_id = id;
	}

}