package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarEnfermedad;
import vista.frmIngresarFormaFarmaceutica;
import vista.frmListarFormaFarmaceutica;

public class ControladorListarFormaFarmaceutica implements ActionListener{
	frmListarFormaFarmaceutica frm_listar_forma_farmaceutica;

	public ControladorListarFormaFarmaceutica(frmListarFormaFarmaceutica frm_listar_forma_farmaceutica) {
		this.frm_listar_forma_farmaceutica=frm_listar_forma_farmaceutica;
		this.frm_listar_forma_farmaceutica.setVisible(true);	
		this.frm_listar_forma_farmaceutica.txtBuscar.addActionListener(this);		
		this.frm_listar_forma_farmaceutica.btnSeleccionar.addActionListener(this);
		this.frm_listar_forma_farmaceutica.btnIngresar.addActionListener(this);
		this.frm_listar_forma_farmaceutica.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_listar_forma_farmaceutica.btnCancelar) {
			this.frm_listar_forma_farmaceutica.dispose();
		}
		
		if(evento.getSource()==this.frm_listar_forma_farmaceutica.btnIngresar) {
			frmIngresarFormaFarmaceutica frm_ingresar_forma_farmaceutica = new frmIngresarFormaFarmaceutica();
			ControladorIngresarFormaFarmaceutica controlador_forma_farmaceutica = new ControladorIngresarFormaFarmaceutica(frm_ingresar_forma_farmaceutica);
		}
		
		if(evento.getSource()==this.frm_listar_forma_farmaceutica.btnSeleccionar) {
			
		}	
		
	}
	
}
