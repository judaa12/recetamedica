package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarIndicacionGeneral;

public class ControladorIngresarIndicacionGeneral implements ActionListener{
	frmIngresarIndicacionGeneral frm_ingresar_indicacion_general;
	
	public ControladorIngresarIndicacionGeneral(frmIngresarIndicacionGeneral frm_ingresar_indicacion_general) {
		this.frm_ingresar_indicacion_general=frm_ingresar_indicacion_general;
		this.frm_ingresar_indicacion_general.setVisible(true);
		this.frm_ingresar_indicacion_general.btnAceptar.addActionListener(this);
		this.frm_ingresar_indicacion_general.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_ingresar_indicacion_general.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_indicacion_general.btnCancelar) {
			this.frm_ingresar_indicacion_general.dispose();
		}		
		
	}
}
