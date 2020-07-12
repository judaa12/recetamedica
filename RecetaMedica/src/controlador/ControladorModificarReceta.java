package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.frmIngresarIndicacion;
import vista.frmIngresarIndicacionGeneral;
import vista.frmModificarIndicacion;
import vista.frmModificarIndicacionGeneral;
import vista.frmModificarReceta;

public class ControladorModificarReceta implements ActionListener{
	frmModificarReceta frm_modificar_receta;
	
	public ControladorModificarReceta(frmModificarReceta frm_modificar_receta) {
		this.frm_modificar_receta=frm_modificar_receta;
		this.frm_modificar_receta.setVisible(true);	
		this.frm_modificar_receta.btnAceptar.addActionListener(this);
		this.frm_modificar_receta.btnCancelar.addActionListener(this);
		this.frm_modificar_receta.btnIngresarIndicacionGeneral.addActionListener(this);
		this.frm_modificar_receta.btnModificarIndicacionGeneral.addActionListener(this);
		this.frm_modificar_receta.btnEliminarIndicacionGeneral.addActionListener(this);
		this.frm_modificar_receta.btnIngresarIndicacion.addActionListener(this);
		this.frm_modificar_receta.btnModificarIndicacion.addActionListener(this);
		this.frm_modificar_receta.btnEliminarIndicacion.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_modificar_receta.btnCancelar) {
			this.frm_modificar_receta.dispose();
		}
		
		if(evento.getSource()==this.frm_modificar_receta.btnAceptar) {
			
		}
		
		// Indicacion General
		
		if(evento.getSource()==this.frm_modificar_receta.btnIngresarIndicacionGeneral) {
			frmIngresarIndicacionGeneral frm_ingresar_indicacion_general = new frmIngresarIndicacionGeneral();
			ControladorIngresarIndicacionGeneral controlador_ingresar_indicacion_general = new ControladorIngresarIndicacionGeneral(frm_ingresar_indicacion_general);
			
		}
		if(evento.getSource()==this.frm_modificar_receta.btnModificarIndicacionGeneral) {
			frmModificarIndicacionGeneral frm_modificar_indicacion_general = new frmModificarIndicacionGeneral();
			ControladorModificarIndicacionGeneral controlador_modificar_indicacion_general = new ControladorModificarIndicacionGeneral(frm_modificar_indicacion_general);
			
		}
		if(evento.getSource()==this.frm_modificar_receta.btnEliminarIndicacionGeneral) {
			if(this.frm_modificar_receta.jgdIndicacionGeneral.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}			
		}
		
		// Indicacion
		
		if(evento.getSource()==this.frm_modificar_receta.btnIngresarIndicacion) {
			frmIngresarIndicacion frm_ingresar_indicacion = new frmIngresarIndicacion();
			ControladorIngresarIndicacion controlador_ingresar_indicacion = new ControladorIngresarIndicacion(frm_ingresar_indicacion);
			
		}
		if(evento.getSource()==this.frm_modificar_receta.btnModificarIndicacion) {
			frmModificarIndicacion frm_modificar_indicacion = new frmModificarIndicacion();
			ControladorModificarIndicacion controlador_modificar_indicacion = new ControladorModificarIndicacion(frm_modificar_indicacion);
			
		}
		if(evento.getSource()==this.frm_modificar_receta.btnEliminarIndicacion) {
			if(this.frm_modificar_receta.jgdIndicacion.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}				
		}
		
	}
	
}
