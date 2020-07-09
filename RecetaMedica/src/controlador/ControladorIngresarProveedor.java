package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarProveedor;

public class ControladorIngresarProveedor implements ActionListener{
	frmIngresarProveedor frm_ingresar_proveedor;
	
	public ControladorIngresarProveedor(frmIngresarProveedor frm_ingresar_proveedor) {
		this.frm_ingresar_proveedor=frm_ingresar_proveedor;
		this.frm_ingresar_proveedor.setVisible(true);
		this.frm_ingresar_proveedor.btnAceptar.addActionListener(this);
		this.frm_ingresar_proveedor.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_ingresar_proveedor.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_proveedor.btnCancelar) {
			this.frm_ingresar_proveedor.dispose();
		}
	}

}
