package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.frmIngresarFabricante;
import vista.frmIngresarReceta;
import vista.frmListarPacientes;
import vista.frmModificarFabricante;
import vista.frmModificarReceta;
import vista.frmReceta;

public class ControladorReceta implements ActionListener{
	frmReceta frm_receta;

	public ControladorReceta(frmReceta frm_receta) {
		this.frm_receta=frm_receta;
		this.frm_receta.setVisible(true);	
		this.frm_receta.txtBuscar.addActionListener(this);		
		this.frm_receta.btnIngresar.addActionListener(this);
		this.frm_receta.btnModificar.addActionListener(this);
		this.frm_receta.btnEliminar.addActionListener(this);
		this.frm_receta.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_receta.btnCancelar) {
			this.frm_receta.dispose();
		}
		
		if(evento.getSource()==this.frm_receta.btnIngresar) {
			frmIngresarReceta frm_ingresar_receta = new frmIngresarReceta();
			ControladorIngresarReceta controlador_ingresar_receta = new ControladorIngresarReceta(frm_ingresar_receta);
		}
		
		if(evento.getSource()==this.frm_receta.btnModificar) {
			frmModificarReceta frm_modificar_receta = new frmModificarReceta();
			ControladorModificarReceta controlador_modificar_receta = new ControladorModificarReceta(frm_modificar_receta);
		}	
		
		if(evento.getSource()==this.frm_receta.btnEliminar) {
			if(this.frm_receta.jgdReceta.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}
		}
		
	}
	
	
}
