package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarIndicacion;

public class ControladorIngresarIndicacion implements ActionListener{
	frmIngresarIndicacion frm_ingresar_indicacion;
	
	public ControladorIngresarIndicacion(frmIngresarIndicacion frm_ingresar_indicacion) {
		this.frm_ingresar_indicacion=frm_ingresar_indicacion;
		this.frm_ingresar_indicacion.setVisible(true);
		this.frm_ingresar_indicacion.btnAceptar.addActionListener(this);
		this.frm_ingresar_indicacion.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_ingresar_indicacion.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_indicacion.btnCancelar) {
			this.frm_ingresar_indicacion.dispose();
		}
		
	}

}
