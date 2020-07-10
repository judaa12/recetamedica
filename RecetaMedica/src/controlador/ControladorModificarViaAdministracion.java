package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmModificarViaAdministracion;

public class ControladorModificarViaAdministracion implements ActionListener{
	frmModificarViaAdministracion frm_modificar_via_administracion;
	
	public ControladorModificarViaAdministracion(frmModificarViaAdministracion frm_modificar_via_administracion) {
		this.frm_modificar_via_administracion=frm_modificar_via_administracion;
		this.frm_modificar_via_administracion.setVisible(true);
		this.frm_modificar_via_administracion.btnAceptar.addActionListener(this);
		this.frm_modificar_via_administracion.btnCancelar.addActionListener(this);			
	}
		
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_modificar_via_administracion.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_modificar_via_administracion.btnCancelar) {
			this.frm_modificar_via_administracion.dispose();
		}	
		
	}
	
	
}
