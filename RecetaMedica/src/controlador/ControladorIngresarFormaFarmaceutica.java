package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarFormaFarmaceutica;

public class ControladorIngresarFormaFarmaceutica implements ActionListener{
	frmIngresarFormaFarmaceutica frm_ingresar_forma_farmaceutica;
	
	public ControladorIngresarFormaFarmaceutica(frmIngresarFormaFarmaceutica frm_ingresar_forma_farmaceutica) {
		this.frm_ingresar_forma_farmaceutica=frm_ingresar_forma_farmaceutica;
		this.frm_ingresar_forma_farmaceutica.setVisible(true);
		this.frm_ingresar_forma_farmaceutica.btnAceptar.addActionListener(this);
		this.frm_ingresar_forma_farmaceutica.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_ingresar_forma_farmaceutica.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_forma_farmaceutica.btnCancelar) {
			this.frm_ingresar_forma_farmaceutica.dispose();
		}
		
	}
}
