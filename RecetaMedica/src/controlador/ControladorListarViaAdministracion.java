package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarEnfermedad;
import vista.frmIngresarViaAdministracion;
import vista.frmListarViaAdministracion;

public class ControladorListarViaAdministracion implements ActionListener{
	frmListarViaAdministracion frm_listar_via_administracion;
	
	public ControladorListarViaAdministracion(frmListarViaAdministracion frm_listar_via_administracion) {
		this.frm_listar_via_administracion=frm_listar_via_administracion;
		this.frm_listar_via_administracion.setVisible(true);	
		this.frm_listar_via_administracion.txtBuscar.addActionListener(this);		
		this.frm_listar_via_administracion.btnSeleccionar.addActionListener(this);
		this.frm_listar_via_administracion.btnIngresar.addActionListener(this);
		this.frm_listar_via_administracion.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {

		if(evento.getSource()==this.frm_listar_via_administracion.btnCancelar) {
			this.frm_listar_via_administracion.dispose();
		}
		
		if(evento.getSource()==this.frm_listar_via_administracion.btnIngresar) {
			frmIngresarViaAdministracion frm_ingresar_via_administracion = new frmIngresarViaAdministracion();
			ControladorIngresarViaAdministracion controlador_ingresar_via_administracion = new ControladorIngresarViaAdministracion(frm_ingresar_via_administracion);
		}
		
		if(evento.getSource()==this.frm_listar_via_administracion.btnSeleccionar) {
			
		}			
		
	}

}
