package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.frmIngresarInventario;
import vista.frmModificarInventario;
import vista.frmInventario;

public class ControladorInventario implements ActionListener{
	frmInventario frm_inventario;
	
	public ControladorInventario(frmInventario frm_inventario) {
		this.frm_inventario=frm_inventario;
		this.frm_inventario.setVisible(true);	
		this.frm_inventario.txtBuscar.addActionListener(this);		
		this.frm_inventario.btnIngresar.addActionListener(this);
		this.frm_inventario.btnModificar.addActionListener(this);
		this.frm_inventario.btnEliminar.addActionListener(this);
		this.frm_inventario.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_inventario.btnCancelar) {
			this.frm_inventario.dispose();
		}
		
		if(evento.getSource()==this.frm_inventario.btnIngresar) {
			frmIngresarInventario frm_ingresar_inventario = new frmIngresarInventario();
			ControladorIngresarInventario controlador_ingresar_inventario = new ControladorIngresarInventario(frm_ingresar_inventario);
		}
		
		if(evento.getSource()==this.frm_inventario.btnModificar) {
			frmModificarInventario frm_modificar_inventario = new frmModificarInventario();
			ControladorModificarInventario controlador_modificar_inventario = new ControladorModificarInventario(frm_modificar_inventario);
		}	
		
		if(evento.getSource()==this.frm_inventario.btnEliminar) {
			if(this.frm_inventario.jgdTransaccion.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}
		}		
		
	}

}
