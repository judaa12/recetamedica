package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.frmFormaFarmaceutica;
import vista.frmIngresarFabricante;
import vista.frmIngresarFormaFarmaceutica;
import vista.frmModificarFabricante;
import vista.frmModificarFormaFarmaceutica;

public class ControladorFormaFarmaceutica implements ActionListener{
	frmFormaFarmaceutica frm_forma_farmaceutica;
	
	public ControladorFormaFarmaceutica(frmFormaFarmaceutica frm_forma_farmaceutica) {
		this.frm_forma_farmaceutica=frm_forma_farmaceutica;
		this.frm_forma_farmaceutica.setVisible(true);	
		this.frm_forma_farmaceutica.txtBuscar.addActionListener(this);		
		this.frm_forma_farmaceutica.btnIngresar.addActionListener(this);
		this.frm_forma_farmaceutica.btnModificar.addActionListener(this);
		this.frm_forma_farmaceutica.btnEliminar.addActionListener(this);
		this.frm_forma_farmaceutica.btnCancelar.addActionListener(this);		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		
		if(evento.getSource()==this.frm_forma_farmaceutica.btnCancelar) {
			this.frm_forma_farmaceutica.dispose();
		}
		
		if(evento.getSource()==this.frm_forma_farmaceutica.btnIngresar) {
			frmIngresarFormaFarmaceutica frm_ingresar_forma_farmaceutica = new frmIngresarFormaFarmaceutica();
			ControladorIngresarFormaFarmaceutica controlador_forma_farmaceutica = new ControladorIngresarFormaFarmaceutica(frm_ingresar_forma_farmaceutica);
		}
		
		if(evento.getSource()==this.frm_forma_farmaceutica.btnModificar) {
			frmModificarFormaFarmaceutica frm_modificar_forma_farmaceutica = new frmModificarFormaFarmaceutica();
			ControladorModificarFormaFarmaceutica controlador_modificar_forma_farmaceutica = new ControladorModificarFormaFarmaceutica(frm_modificar_forma_farmaceutica);
		}	
		
		if(evento.getSource()==this.frm_forma_farmaceutica.btnEliminar) {
			if(this.frm_forma_farmaceutica.jgdForma.getSelectedRow()>0) {
				
			}else {
				JOptionPane.showMessageDialog(null,"Debe seleccionar una fila");
			}
		}
		
	}
}
