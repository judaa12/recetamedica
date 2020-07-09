package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.frmIngresarProveedor;
import vista.frmModificarProveedor;
import vista.frmProveedor;

public class ControladorProveedor implements ActionListener{
	frmProveedor frm_proveedor;
	
	
	public ControladorProveedor(frmProveedor frm_proveedor) {
		this.frm_proveedor=frm_proveedor;
		this.frm_proveedor.setVisible(true);	
		this.frm_proveedor.txtBuscar.addActionListener(this);		
		this.frm_proveedor.btnIngresar.addActionListener(this);
		this.frm_proveedor.btnModificar.addActionListener(this);
		this.frm_proveedor.btnEliminar.addActionListener(this);
		this.frm_proveedor.btnCancelar.addActionListener(this);		

	}
	

	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_proveedor.btnCancelar) {
			this.frm_proveedor.dispose();
		}
		
		if(evento.getSource()==this.frm_proveedor.btnIngresar) {
			frmIngresarProveedor frm_ingresar_proveedor = new frmIngresarProveedor();
			ControladorIngresarProveedor controlador_ingresar_proveedor = new ControladorIngresarProveedor(frm_ingresar_proveedor);
		}
		
		if(evento.getSource()==this.frm_proveedor.btnModificar) {
			frmModificarProveedor frm_modificar_proveedor = new frmModificarProveedor();
			ControladorModificarProveedor controlador_modificar_proveedor = new ControladorModificarProveedor(frm_modificar_proveedor);
		}	
		
		if(evento.getSource()==this.frm_proveedor.btnEliminar) {
			if(this.frm_proveedor.jgdProveedor.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}
		}		
		
	}
	
	
}
