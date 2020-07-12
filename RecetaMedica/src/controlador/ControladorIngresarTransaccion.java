package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarTransaccion;

public class ControladorIngresarTransaccion implements ActionListener{
	frmIngresarTransaccion frm_ingresar_transaccion;
	
	public ControladorIngresarTransaccion(frmIngresarTransaccion frm_ingresar_transaccion) {
		this.frm_ingresar_transaccion=frm_ingresar_transaccion;
		this.frm_ingresar_transaccion.setVisible(true);			
		this.frm_ingresar_transaccion.btnAceptar.addActionListener(this);
		this.frm_ingresar_transaccion.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_ingresar_transaccion.btnCancelar) {
			this.frm_ingresar_transaccion.dispose();
		}
		
		if(evento.getSource()==this.frm_ingresar_transaccion.btnAceptar) {
			
		}
		
	}

}
