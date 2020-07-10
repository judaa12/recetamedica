package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.frmIngresarFabricante;
import vista.frmIngresarViaAdministracion;
import vista.frmModificarFabricante;
import vista.frmModificarViaAdministracion;
import vista.frmViaAdministracion;

public class ControladorViaAdministracion implements ActionListener{
	frmViaAdministracion frm_via_administracion;
	
	public ControladorViaAdministracion(frmViaAdministracion frm_via_administracion) {
		this.frm_via_administracion=frm_via_administracion;
		this.frm_via_administracion.setVisible(true);	
		this.frm_via_administracion.txtBuscar.addActionListener(this);		
		this.frm_via_administracion.btnIngresar.addActionListener(this);
		this.frm_via_administracion.btnModificar.addActionListener(this);
		this.frm_via_administracion.btnEliminar.addActionListener(this);
		this.frm_via_administracion.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_via_administracion.btnCancelar) {
			this.frm_via_administracion.dispose();
		}
		
		if(evento.getSource()==this.frm_via_administracion.btnIngresar) {
			frmIngresarViaAdministracion frm_ingresar_via_administracion = new frmIngresarViaAdministracion();
			ControladorIngresarViaAdministracion controlador_ingresar_via_administracion = new ControladorIngresarViaAdministracion(frm_ingresar_via_administracion);
		}
		
		if(evento.getSource()==this.frm_via_administracion.btnModificar) {
			frmModificarViaAdministracion frm_modificar_via_administracion = new frmModificarViaAdministracion();
			ControladorModificarViaAdministracion controlador_modificar_via_administracion = new ControladorModificarViaAdministracion(frm_modificar_via_administracion);
		}	
		
		if(evento.getSource()==this.frm_via_administracion.btnEliminar) {
			if(this.frm_via_administracion.jgdVia.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}
		}
		
	}
	
}
