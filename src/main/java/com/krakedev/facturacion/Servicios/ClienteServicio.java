package com.krakedev.facturacion.Servicios;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.krakedev.facturacion.entidades.Cliente;

@Service
public class ClienteServicio {
	private ArrayList<Cliente> clientes = new ArrayList<>();

	// Procede a generar el crud con clientes:

	public Cliente buscarCliente(String cedula) {
		Cliente buscado = null;
		for (Cliente c : clientes) {
			if (c.getCedula().equals(cedula)) {
				buscado = c;
				break;
			}
		}
		return buscado;
	}
	
	public boolean agregarCliente(Cliente cliente) {
		Cliente agregado =  buscarCliente(cliente.getCedula());
		if (agregado == null) {
			clientes.add(agregado);
			return true;
		}
		return false;
	}
	
	public ArrayList<Cliente> listarClientes(){
		return clientes;
	}
	
	public boolean actualizarCliente(String cedula, Cliente cliente) {
		Cliente buscado =  buscarCliente(cedula);
		if(buscado!=null) {
			buscado.setNombre(cliente.getNombre());
			buscado.setApellido(cliente.getApellido());
			buscado.setEmail(cliente.getEmail());
			buscado.setTelefono(cliente.getTelefono());
			return true;
		}
		return false;
	}
	
	public boolean actualizarCliente2(Cliente cliente) {
		Cliente buscado =  buscarCliente(cliente.getCedula());
		if(buscado!=null) {
			buscado.setNombre(cliente.getNombre());
			buscado.setApellido(cliente.getApellido());
			buscado.setEmail(cliente.getEmail());
			buscado.setTelefono(cliente.getTelefono());
			return true;
		}
		return false;
	}
	
	public boolean eliminarCliente(String cedula) {
		Cliente buscado =  buscarCliente(cedula);
		if (buscado != null) {
			clientes.remove(buscado);
			return true;
		}
		return false;
	}
}
