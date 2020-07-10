package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmModificarCondicionAlmacenamiento;

public class ControladorModificarCondicionAlmacenamiento implements ActionListener{
	frmModificarCondicionAlmacenamiento frm_modificar_condicion_almacenamiento;	
	
	public ControladorModificarCondicionAlmacenamiento(frmModificarCondicionAlmacenamiento frm_modificar_condicion_almacenamiento) {
		this.frm_modificar_condicion_almacenamiento=frm_modificar_condicion_almacenamiento;
		this.frm_modificar_condicion_almacenamiento.setVisible(true);
		this.frm_modificar_condicion_almacenamiento.btnAceptar.addActionListener(this);
		this.frm_modificar_condicion_almacenamiento.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_modificar_condicion_almacenamiento.btnCancelar) {
			this.frm_modificar_condicion_almacenamiento.dispose();
		}
		
		if(evento.getSource()==this.frm_modificar_condicion_almacenamiento.btnAceptar) {
			
		}		
		
	}
}
