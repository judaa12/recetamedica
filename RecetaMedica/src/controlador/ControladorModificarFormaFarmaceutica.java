package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmModificarFormaFarmaceutica;

public class ControladorModificarFormaFarmaceutica implements ActionListener{
	frmModificarFormaFarmaceutica frm_modificar_forma_farmaceutica;
	
	public ControladorModificarFormaFarmaceutica(frmModificarFormaFarmaceutica frm_modificar_forma_farmaceutica) {
		this.frm_modificar_forma_farmaceutica=frm_modificar_forma_farmaceutica;
		this.frm_modificar_forma_farmaceutica.setVisible(true);
		this.frm_modificar_forma_farmaceutica.btnAceptar.addActionListener(this);
		this.frm_modificar_forma_farmaceutica.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_modificar_forma_farmaceutica.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_modificar_forma_farmaceutica.btnCancelar) {
			this.frm_modificar_forma_farmaceutica.dispose();
		}		
		
	}
}
