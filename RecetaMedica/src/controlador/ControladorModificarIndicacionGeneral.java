package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmModificarIndicacionGeneral;

public class ControladorModificarIndicacionGeneral implements ActionListener{
	frmModificarIndicacionGeneral frm_modificar_indicacion_general;
	
	public ControladorModificarIndicacionGeneral(frmModificarIndicacionGeneral frm_modificar_indicacion_general) {
		this.frm_modificar_indicacion_general=frm_modificar_indicacion_general;
		this.frm_modificar_indicacion_general.setVisible(true);
		this.frm_modificar_indicacion_general.btnAceptar.addActionListener(this);
		this.frm_modificar_indicacion_general.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_modificar_indicacion_general.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_modificar_indicacion_general.btnCancelar) {
			this.frm_modificar_indicacion_general.dispose();
		}		
		
	}

}
