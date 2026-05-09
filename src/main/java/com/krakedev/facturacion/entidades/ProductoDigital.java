package com.krakedev.facturacion.entidades;

public class ProductoDigital extends Producto {
	private String url;

	public ProductoDigital(int codigo, String nombre, int stock, double precio, String url) {
		super(codigo, nombre, stock, precio);
		this.url = url;
	}

	@Override
	public void calcularPrecioTotal() {
		super.setPrecio(super.getPrecio() * 0.95);
	}

	@Override
	public String toString() {
		return "ProductoDigital [url=" + url + "]";
	}

	
	
	
}
