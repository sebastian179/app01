package org.isft.domain;

/**
 * @version 1.0
 * @created 01-may-2013 07:26:40 p.m.
 */
public class Empleado {

	private Categoria Categoria;
	private String emp_apellido = "";
	private String emp_nombre = "";
	private int emp_num = 0;
	private Sucursal Sucursal;

	public Empleado(){

	}

	public void finalize() throws Throwable {

	}

	public String getApellido(){
		return this.emp_apellido;
	}

	public Categoria getCategoria(){
		return this.Categoria;
	}

	public int getId(){
		return this.emp_num;
	}

	public String getNombre(){
		return this.emp_nombre;
	}

	public Sucursal getSucursal(){
		return this.Sucursal;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(String apellido){
		this.emp_apellido = apellido;
	}

	/**
	 * 
	 * @param Categoria
	 */
	public void setCategoria(Categoria Categoria){
		this.Categoria = Categoria;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id){
		this.emp_num = id;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre){
		this.emp_nombre = nombre;
	}

	/**
	 * 
	 * @param Sucursal
	 */
	public void setSucursal(Sucursal Sucursal){
		this.Sucursal = Sucursal;
	}

}