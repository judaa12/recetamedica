package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarViaAdministracion;

public class ControladorIngresarViaAdministracion implements ActionListener{
	frmIngresarViaAdministracion frm_ingresar_via_administracion;
	
	public ControladorIngresarViaAdministracion(frmIngresarViaAdministracion frm_ingresar_via_administracion) {
		this.frm_ingresar_via_administracion=frm_ingresar_via_administracion;
		this.frm_ingresar_via_administracion.setVisible(true);
		this.frm_ingresar_via_administracion.btnAceptar.addActionListener(this);
		this.frm_ingresar_via_administracion.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_ingresar_via_administracion.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_via_administracion.btnCancelar) {
			this.frm_ingresar_via_administracion.dispose();
		}
		
	}
	

}
