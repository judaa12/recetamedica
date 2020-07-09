package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarFabricante;
import vista.frmIngresarMedicamento;
import vista.frmMedicamento;

public class ControladorMedicamento implements ActionListener{
	frmMedicamento frm_medicamento;

	public ControladorMedicamento(frmMedicamento frm_medicamento) {
		this.frm_medicamento=frm_medicamento;
		this.frm_medicamento.setVisible(true);	
		this.frm_medicamento.txtBuscar.addActionListener(this);		
		this.frm_medicamento.btnIngresar.addActionListener(this);
		this.frm_medicamento.btnModificar.addActionListener(this);
		this.frm_medicamento.btnEliminar.addActionListener(this);
		this.frm_medicamento.btnCancelar.addActionListener(this);		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource()==this.frm_medicamento.btnCancelar) {
			this.frm_medicamento.dispose();
		}		
		
		if(evento.getSource()==this.frm_medicamento.btnIngresar) {
			frmIngresarMedicamento frm_ingresar_medicamento = new frmIngresarMedicamento();
			ControladorIngresarMedicamento controlador_ingresar_medicamento = new ControladorIngresarMedicamento(frm_ingresar_medicamento);			
		}
		
	}

}
