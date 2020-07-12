package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmModificarIndicacion;

public class ControladorModificarIndicacion implements ActionListener{
	frmModificarIndicacion frm_modificar_indicacion;

	public ControladorModificarIndicacion(frmModificarIndicacion frm_modificar_indicacion) {
		this.frm_modificar_indicacion=frm_modificar_indicacion;
		this.frm_modificar_indicacion.setVisible(true);
		this.frm_modificar_indicacion.btnAceptar.addActionListener(this);
		this.frm_modificar_indicacion.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {

		if(evento.getSource()==this.frm_modificar_indicacion.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_modificar_indicacion.btnCancelar) {
			this.frm_modificar_indicacion.dispose();
		}		
		
	}
	
}
