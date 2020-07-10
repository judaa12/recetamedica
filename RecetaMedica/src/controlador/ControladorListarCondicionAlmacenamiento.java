package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmCondicionAlmacenamiento;
import vista.frmIngresarCondicionAlmacenamiento;
import vista.frmIngresarEnfermedad;
import vista.frmListarCondicionAlmacenamiento;

public class ControladorListarCondicionAlmacenamiento implements ActionListener{
	frmListarCondicionAlmacenamiento frm_listar_condicion_almacenamiento;

	public ControladorListarCondicionAlmacenamiento(frmListarCondicionAlmacenamiento frm_listar_condicion_almacenamiento) {
		this.frm_listar_condicion_almacenamiento=frm_listar_condicion_almacenamiento;
		this.frm_listar_condicion_almacenamiento.setVisible(true);	
		this.frm_listar_condicion_almacenamiento.txtBuscar.addActionListener(this);		
		this.frm_listar_condicion_almacenamiento.btnSeleccionar.addActionListener(this);
		this.frm_listar_condicion_almacenamiento.btnIngresar.addActionListener(this);
		this.frm_listar_condicion_almacenamiento.btnCancelar.addActionListener(this);			
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {

		if(evento.getSource()==this.frm_listar_condicion_almacenamiento.btnCancelar) {
			this.frm_listar_condicion_almacenamiento.dispose();
		}
		
		if(evento.getSource()==this.frm_listar_condicion_almacenamiento.btnIngresar) {
			frmIngresarCondicionAlmacenamiento frm_ingresar_condicion_almacenamiento = new frmIngresarCondicionAlmacenamiento();
			ControladorIngresarCondicionAlmacenamiento controlador_ingresar_condicion_almacenamiento = new ControladorIngresarCondicionAlmacenamiento(frm_ingresar_condicion_almacenamiento);
		}
		
		if(evento.getSource()==this.frm_listar_condicion_almacenamiento.btnSeleccionar) {
			
		}			
		
	}
	
	
}
