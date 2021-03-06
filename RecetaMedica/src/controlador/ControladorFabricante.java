package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.frmFabricante;
import vista.frmIngresarFabricante;
import vista.frmModificarFabricante;



public class ControladorFabricante implements ActionListener{
	frmFabricante frm_fabricante;
	
	
	public ControladorFabricante(frmFabricante frm_fabricante){
		this.frm_fabricante=frm_fabricante;
		this.frm_fabricante.setVisible(true);	
		this.frm_fabricante.txtBuscar.addActionListener(this);		
		this.frm_fabricante.btnIngresar.addActionListener(this);
		this.frm_fabricante.btnModificar.addActionListener(this);
		this.frm_fabricante.btnEliminar.addActionListener(this);
		this.frm_fabricante.btnCancelar.addActionListener(this);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_fabricante.btnCancelar) {
			this.frm_fabricante.dispose();
		}
		
		if(evento.getSource()==this.frm_fabricante.btnIngresar) {
			frmIngresarFabricante frm_ingresar_fabricante = new frmIngresarFabricante();
			ControladorIngresarFabricante controlador_ingresar_fabricante = new ControladorIngresarFabricante(frm_ingresar_fabricante);
		}
		
		if(evento.getSource()==this.frm_fabricante.btnModificar) {
			frmModificarFabricante frm_modificar_fabricante = new frmModificarFabricante();
			ControladorModificarFabricante controlador_modificar_fabricante = new ControladorModificarFabricante(frm_modificar_fabricante);
		}	
		
		if(evento.getSource()==this.frm_fabricante.btnEliminar) {
			if(this.frm_fabricante.jgdFabricante.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}
		}
		
	}

}
