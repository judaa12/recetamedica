package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarEnfermedad;
import vista.frmIngresarFabricante;
import vista.frmListarFabricante;

public class ControladorListarFabricante implements ActionListener{
	frmListarFabricante frm_listar_fabricante;
	
	
	public ControladorListarFabricante(frmListarFabricante frm_listar_fabricante) {
		this.frm_listar_fabricante=frm_listar_fabricante;
		this.frm_listar_fabricante.setVisible(true);	
		this.frm_listar_fabricante.txtBuscar.addActionListener(this);		
		this.frm_listar_fabricante.btnSeleccionar.addActionListener(this);
		this.frm_listar_fabricante.btnIngresar.addActionListener(this);
		this.frm_listar_fabricante.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_listar_fabricante.btnCancelar) {
			this.frm_listar_fabricante.dispose();
		}
		
		if(evento.getSource()==this.frm_listar_fabricante.btnIngresar) {
			frmIngresarFabricante frm_ingresar_fabricante = new frmIngresarFabricante();
			ControladorIngresarFabricante controlador_ingresar_fabricante = new ControladorIngresarFabricante(frm_ingresar_fabricante);
		}
		
		if(evento.getSource()==this.frm_listar_fabricante.btnSeleccionar) {
			
		}
		
	}
}
