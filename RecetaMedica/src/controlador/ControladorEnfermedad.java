package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmEnfermedad;
import vista.frmIngresarEnfermedad;
import vista.frmIngresarFabricante;


public class ControladorEnfermedad implements ActionListener{
	frmEnfermedad frm_enfermedad;
	
	public ControladorEnfermedad(frmEnfermedad frm_enfermedad) {
		this.frm_enfermedad=frm_enfermedad;
		this.frm_enfermedad.setVisible(true);	
		this.frm_enfermedad.txtBuscar.addActionListener(this);		
		this.frm_enfermedad.btnIngresar.addActionListener(this);
		this.frm_enfermedad.btnModificar.addActionListener(this);
		this.frm_enfermedad.btnEliminar.addActionListener(this);
		this.frm_enfermedad.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_enfermedad.btnCancelar) {
			this.frm_enfermedad.dispose();
		}
		
		if(evento.getSource()==this.frm_enfermedad.btnIngresar) {
			frmIngresarEnfermedad frm_ingresar_enfermedad = new frmIngresarEnfermedad();
			ControladorIngresarEnfermedad controlador_ingresar_enfermedad = new ControladorIngresarEnfermedad(frm_ingresar_enfermedad);
		}		
		
	}
}
