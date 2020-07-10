package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.frmCondicionAlmacenamiento;
import vista.frmIngresarCondicionAlmacenamiento;
import vista.frmModificarCondicionAlmacenamiento;

public class ControladorCondicionAlmacenamiento implements ActionListener{
	frmCondicionAlmacenamiento frm_condicion_almacenamiento;
	
	public ControladorCondicionAlmacenamiento(frmCondicionAlmacenamiento frm_condicion_almacenamiento) {
		this.frm_condicion_almacenamiento=frm_condicion_almacenamiento;
		this.frm_condicion_almacenamiento.setVisible(true);	
		this.frm_condicion_almacenamiento.txtBuscar.addActionListener(this);		
		this.frm_condicion_almacenamiento.btnIngresar.addActionListener(this);
		this.frm_condicion_almacenamiento.btnModificar.addActionListener(this);
		this.frm_condicion_almacenamiento.btnEliminar.addActionListener(this);
		this.frm_condicion_almacenamiento.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_condicion_almacenamiento.btnCancelar) {
			this.frm_condicion_almacenamiento.dispose();
		}
		
		if(evento.getSource()==this.frm_condicion_almacenamiento.btnIngresar) {
			frmIngresarCondicionAlmacenamiento frm_ingresar_condicion_almacenamiento = new frmIngresarCondicionAlmacenamiento();
			ControladorIngresarCondicionAlmacenamiento controlador_ingresar_condicion_almacenamiento = new ControladorIngresarCondicionAlmacenamiento(frm_ingresar_condicion_almacenamiento);
		}
		
		if(evento.getSource()==this.frm_condicion_almacenamiento.btnModificar) {
			frmModificarCondicionAlmacenamiento frm_modificar_condicion_almacenamiento = new frmModificarCondicionAlmacenamiento();
			ControladorModificarCondicionAlmacenamiento controlador_modificar_condicion_almacenamiento = new ControladorModificarCondicionAlmacenamiento(frm_modificar_condicion_almacenamiento);
		}
		
		if(evento.getSource()==this.frm_condicion_almacenamiento.btnEliminar) {
			if(this.frm_condicion_almacenamiento.jgdCondicion.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}
		}		
	}

}
