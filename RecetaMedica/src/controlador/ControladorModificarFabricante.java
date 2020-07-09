package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmModificarFabricante;

public class ControladorModificarFabricante implements ActionListener{
	frmModificarFabricante frm_modificar_fabricante;
	
	
	
	public ControladorModificarFabricante(frmModificarFabricante frm_modificar_fabricante) {
		this.frm_modificar_fabricante=frm_modificar_fabricante;
		this.frm_modificar_fabricante.setVisible(true);
		this.frm_modificar_fabricante.btnAceptar.addActionListener(this);
		this.frm_modificar_fabricante.btnCancelar.addActionListener(this);		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_modificar_fabricante.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_modificar_fabricante.btnCancelar) {
			this.frm_modificar_fabricante.dispose();
		}		
		
	}
	

}
