package com.krakedev.facturacion.entidades;

public class ProductoFisico extends Producto {
	private double peso;
	private String cadena;

	public ProductoFisico(int codigo, String nombre, int stock, double precio, double precio2, String cadena) {
		super(codigo, nombre, stock, precio);
		precio = precio2;
		this.cadena = cadena;
	}

	@Override
	public void calcularPrecioTotal() {
		double costoFinal = peso * 0.5;
		super.setPrecio(super.getPrecio() + costoFinal);
	}

	@Override
	public String toString() {
		return "ProductoFisico [peso=" + peso + ", cadena=" + cadena + "]";
	}

}
