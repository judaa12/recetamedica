package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmModificarInventario;

public class ControladorModificarInventario implements ActionListener{
	frmModificarInventario frm_modificar_inventario;
	
	public ControladorModificarInventario(frmModificarInventario frm_modificar_inventario) {
		this.frm_modificar_inventario=frm_modificar_inventario;
		this.frm_modificar_inventario.setVisible(true);			
		this.frm_modificar_inventario.btnAceptar.addActionListener(this);
		this.frm_modificar_inventario.btnCancelar.addActionListener(this);			
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_modificar_inventario.btnCancelar) {
			this.frm_modificar_inventario.dispose();
		}
		
	}

}
