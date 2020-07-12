package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmListarPacientes;

public class ControladorListarPacientes implements ActionListener{
	frmListarPacientes frm_listar_pacientes;
	
	public ControladorListarPacientes(frmListarPacientes frm_listar_pacientes) {
		this.frm_listar_pacientes=frm_listar_pacientes;
		this.frm_listar_pacientes.setVisible(true);	
		this.frm_listar_pacientes.txtBuscar.addActionListener(this);		
		this.frm_listar_pacientes.btnSeleccionar.addActionListener(this);
		this.frm_listar_pacientes.btnCancelar.addActionListener(this);			
	}
		
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_listar_pacientes.btnCancelar) {
			this.frm_listar_pacientes.dispose();
		}
		
		if(evento.getSource()==this.frm_listar_pacientes.btnSeleccionar) {

		}
			
		
	}
}
