package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarEnfermedad;

public class ControladorIngresarEnfermedad implements ActionListener{
	frmIngresarEnfermedad frm_ingresar_enfermedad;
	
	public ControladorIngresarEnfermedad(frmIngresarEnfermedad frm_ingresar_enfermedad) {
		this.frm_ingresar_enfermedad=frm_ingresar_enfermedad;
		this.frm_ingresar_enfermedad.setVisible(true);
		this.frm_ingresar_enfermedad.btnAceptar.addActionListener(this);
		this.frm_ingresar_enfermedad.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_ingresar_enfermedad.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_enfermedad.btnCancelar) {
			this.frm_ingresar_enfermedad.dispose();
		}
		
	}
	

}
