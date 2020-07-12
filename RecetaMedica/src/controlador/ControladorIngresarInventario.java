package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.frmIngresarTransaccion;
import vista.frmModificarTransaccion;
import vista.frmIngresarInventario;
import vista.frmIngresarProveedor;

public class ControladorIngresarInventario implements ActionListener{
	frmIngresarInventario frm_ingresar_inventario;
	
	public ControladorIngresarInventario(frmIngresarInventario frm_ingresar_inventario) {
		this.frm_ingresar_inventario=frm_ingresar_inventario;
		this.frm_ingresar_inventario.setVisible(true);			
		this.frm_ingresar_inventario.btnAceptar.addActionListener(this);
		this.frm_ingresar_inventario.btnCancelar.addActionListener(this);	
		this.frm_ingresar_inventario.btnIngresarTransaccion.addActionListener(this);
		this.frm_ingresar_inventario.btnModificarTransaccion.addActionListener(this);
		this.frm_ingresar_inventario.btnIngresarPaciente.addActionListener(this);
		this.frm_ingresar_inventario.btnIngresarProveedor.addActionListener(this);
		this.frm_ingresar_inventario.btnEliminarTransaccion.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {

		if(evento.getSource()==this.frm_ingresar_inventario.btnCancelar) {
			this.frm_ingresar_inventario.dispose();
		}
		
		if(evento.getSource()==this.frm_ingresar_inventario.btnIngresarTransaccion) {
			frmIngresarTransaccion frm_ingresar_transaccion = new frmIngresarTransaccion();
			ControladorIngresarTransaccion controlador_ingresar_transaccion = new ControladorIngresarTransaccion(frm_ingresar_transaccion);
		}
		
		if(evento.getSource()==this.frm_ingresar_inventario.btnModificarTransaccion) {
			frmModificarTransaccion frm_modificar_transaccion = new frmModificarTransaccion();
			ControladorModificarTransaccion controlador_modificar_transaccion = new ControladorModificarTransaccion(frm_modificar_transaccion);
		}
		
		if(evento.getSource()==this.frm_ingresar_inventario.btnEliminarTransaccion) {
			if(this.frm_ingresar_inventario.jgdTransaccion.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}			
		}
		
		
		if(evento.getSource()==this.frm_ingresar_inventario.btnIngresarPaciente) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_inventario.btnIngresarProveedor) {
			frmIngresarProveedor frm_ingresar_proveedor = new frmIngresarProveedor();
			ControladorIngresarProveedor controlador_ingresar_proveedor = new ControladorIngresarProveedor(frm_ingresar_proveedor);
		}		
		
	}

}
