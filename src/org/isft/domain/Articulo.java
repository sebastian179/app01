package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 01-may-2013 07:14:40 p.m.
 */
public class Articulo {

	private int num_interno = 0;
	protected Sucursal sucursal = null;

	public Articulo(){}

	public void finalize() throws Throwable {

	}

	public int getId(){
		return num_interno;
	}

	public Sucursal getSucursal(){
		return sucursal;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.num_interno = id;
	}

	/**
	 * 
	 * @param Sucursal
	 */
	public void setSucursal(Sucursal sucursal){
		this.sucursal = sucursal;
	}

}