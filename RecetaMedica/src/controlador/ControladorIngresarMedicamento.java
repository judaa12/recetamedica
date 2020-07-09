package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmIngresarMedicamento;

public class ControladorIngresarMedicamento implements ActionListener{
	frmIngresarMedicamento frm_ingresar_medicamento;
	
	public ControladorIngresarMedicamento(frmIngresarMedicamento frm_ingresar_medicamento) {
		this.frm_ingresar_medicamento=frm_ingresar_medicamento;
		this.frm_ingresar_medicamento.setVisible(true);
		this.frm_ingresar_medicamento.btnAceptar.addActionListener(this);
		this.frm_ingresar_medicamento.btnCancelar.addActionListener(this);	
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnCancelar) {
			this.frm_ingresar_medicamento.dispose();
		}
		
	}

}
