package org.isft.domain;

/**
 * @author SEBASTIAN
 * @version 1.0
 * @created 01-may-2013 07:40:55 p.m.
 */
public class ArticuloFabricante {

	private int artf_numero_modelo = 0;
	private double artf_precio = 0.00;
	private Articulo Articulo;
	private Fabricante Fabricante;

	public ArticuloFabricante(){

	}

	public void finalize() throws Throwable {

	}

	public Articulo getArticulo(){
		return this.Articulo;
	}

	public Fabricante getFabricante(){
		return this.Fabricante;
	}

	public int getNumeroModelo(){
		return this.artf_numero_modelo;
	}

	public double getPrecio(){
		return this.artf_precio;
	}

	/**
	 * 
	 * @param Articulo
	 */
	public void setArticulo(Articulo Articulo){
		this.Articulo = Articulo;
	}

	/**
	 * 
	 * @param Fabricante
	 */
	public void setFabricante(Fabricante Fabricante){
		this.Fabricante = Fabricante;
	}

	/**
	 * 
	 * @param numeromodelo
	 */
	public void setNumeroModelo(int numeromodelo){
		this.artf_numero_modelo = numeromodelo;
	}

	/**
	 * 
	 * @param precio
	 */
	public void setPrecio(double precio){
		this.artf_precio = precio;
	}

}