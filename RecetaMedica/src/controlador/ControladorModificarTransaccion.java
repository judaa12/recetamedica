package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmModificarTransaccion;

public class ControladorModificarTransaccion implements ActionListener{
	frmModificarTransaccion frm_modificar_transaccion;
	
	public ControladorModificarTransaccion(frmModificarTransaccion frm_modificar_transaccion) {
		this.frm_modificar_transaccion=frm_modificar_transaccion;
		this.frm_modificar_transaccion.setVisible(true);			
		this.frm_modificar_transaccion.btnAceptar.addActionListener(this);
		this.frm_modificar_transaccion.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_modificar_transaccion.btnCancelar) {
			this.frm_modificar_transaccion.dispose();
		}
		
		if(evento.getSource()==this.frm_modificar_transaccion.btnAceptar) {
			
		}
		
	}

}
