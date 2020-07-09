package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarFabricante;

public class ControladorIngresarFabricante implements ActionListener{
	frmIngresarFabricante frm_ingresar_fabricante;
	
	public ControladorIngresarFabricante(frmIngresarFabricante frm_ingresar_fabricante) {
		this.frm_ingresar_fabricante=frm_ingresar_fabricante;
		this.frm_ingresar_fabricante.setVisible(true);
		this.frm_ingresar_fabricante.btnAceptar.addActionListener(this);
		this.frm_ingresar_fabricante.btnCancelar.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_ingresar_fabricante.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_fabricante.btnCancelar) {
			this.frm_ingresar_fabricante.dispose();
		}
	}

}
