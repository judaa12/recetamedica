package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmModificarProveedor;

public class ControladorModificarProveedor implements ActionListener{
	frmModificarProveedor frm_modificar_proveedor;
	
	public ControladorModificarProveedor(frmModificarProveedor frm_modificar_proveedor) {
		this.frm_modificar_proveedor=frm_modificar_proveedor;
		this.frm_modificar_proveedor.setVisible(true);
		this.frm_modificar_proveedor.btnAceptar.addActionListener(this);
		this.frm_modificar_proveedor.btnCancelar.addActionListener(this);			
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_modificar_proveedor.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_modificar_proveedor.btnCancelar) {
			this.frm_modificar_proveedor.dispose();
		}	
		
	}
	
	
}
