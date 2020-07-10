package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarCondicionAlmacenamiento;

public class ControladorIngresarCondicionAlmacenamiento implements ActionListener{
	frmIngresarCondicionAlmacenamiento frm_ingresar_condicion_almacenamiento;
	
	public ControladorIngresarCondicionAlmacenamiento(frmIngresarCondicionAlmacenamiento frm_ingresar_condicion_almacenamiento) {
		this.frm_ingresar_condicion_almacenamiento=frm_ingresar_condicion_almacenamiento;
		this.frm_ingresar_condicion_almacenamiento.setVisible(true);
		this.frm_ingresar_condicion_almacenamiento.btnAceptar.addActionListener(this);
		this.frm_ingresar_condicion_almacenamiento.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_ingresar_condicion_almacenamiento.btnCancelar) {
			this.frm_ingresar_condicion_almacenamiento.dispose();
		}
		
		if(evento.getSource()==this.frm_ingresar_condicion_almacenamiento.btnAceptar) {
			
		}
		
	}
}
