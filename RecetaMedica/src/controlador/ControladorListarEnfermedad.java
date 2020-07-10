package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarEnfermedad;
import vista.frmListarEnfermedad;

public class ControladorListarEnfermedad implements ActionListener{
	frmListarEnfermedad frm_listar_enfermedad;
	
	
	public ControladorListarEnfermedad(frmListarEnfermedad frm_listar_enfermedad) {
		this.frm_listar_enfermedad=frm_listar_enfermedad;
		this.frm_listar_enfermedad.setVisible(true);	
		this.frm_listar_enfermedad.txtBuscar.addActionListener(this);		
		this.frm_listar_enfermedad.btnSeleccionar.addActionListener(this);
		this.frm_listar_enfermedad.btnIngresar.addActionListener(this);
		this.frm_listar_enfermedad.btnCancelar.addActionListener(this);		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_listar_enfermedad.btnCancelar) {
			this.frm_listar_enfermedad.dispose();
		}
		
		if(evento.getSource()==this.frm_listar_enfermedad.btnIngresar) {
			frmIngresarEnfermedad frm_ingresar_enfermedad = new frmIngresarEnfermedad();
			ControladorIngresarEnfermedad controlador_ingresar_enfermedad = new ControladorIngresarEnfermedad(frm_ingresar_enfermedad);
		}
		
		if(evento.getSource()==this.frm_listar_enfermedad.btnSeleccionar) {
			
		}		
		
	}

}
