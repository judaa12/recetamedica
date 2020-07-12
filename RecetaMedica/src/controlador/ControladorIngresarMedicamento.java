package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmCondicionAlmacenamiento;
import vista.frmFormaFarmaceutica;
import vista.frmIngresarCondicionAlmacenamiento;
import vista.frmIngresarEnfermedad;
import vista.frmIngresarFabricante;
import vista.frmIngresarFormaFarmaceutica;
import vista.frmIngresarMedicamento;
import vista.frmIngresarViaAdministracion;
import vista.frmListarCondicionAlmacenamiento;
import vista.frmListarEnfermedad;
import vista.frmListarFabricante;
import vista.frmListarFormaFarmaceutica;
import vista.frmListarViaAdministracion;
import vista.frmViaAdministracion;

public class ControladorIngresarMedicamento implements ActionListener{
	frmIngresarMedicamento frm_ingresar_medicamento;
	
	public ControladorIngresarMedicamento(frmIngresarMedicamento frm_ingresar_medicamento) {
		this.frm_ingresar_medicamento=frm_ingresar_medicamento;
		this.frm_ingresar_medicamento.setVisible(true);
		this.frm_ingresar_medicamento.btnAceptar.addActionListener(this);
		this.frm_ingresar_medicamento.btnCancelar.addActionListener(this);	
		this.frm_ingresar_medicamento.btnIngresarEnfermedad.addActionListener(this);
		this.frm_ingresar_medicamento.btnIngresarFabricante.addActionListener(this);
		this.frm_ingresar_medicamento.btnIngresarCondicion.addActionListener(this);
		this.frm_ingresar_medicamento.btnIngresarForma.addActionListener(this);
		this.frm_ingresar_medicamento.btnIngresarVia.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnCancelar) {
			this.frm_ingresar_medicamento.dispose();
		}
		

		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnAceptar) {
			
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnIngresarEnfermedad) {
			frmIngresarEnfermedad frm_ingresar_enfermedad = new frmIngresarEnfermedad();
			ControladorIngresarEnfermedad controlador_ingresar_enfermedad = new ControladorIngresarEnfermedad(frm_ingresar_enfermedad);
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnIngresarFabricante) {
			frmIngresarFabricante frm_ingresar_fabricante = new frmIngresarFabricante();
			ControladorIngresarFabricante controlador_ingresar_fabricante = new ControladorIngresarFabricante(frm_ingresar_fabricante);			
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnIngresarCondicion) {
			frmIngresarCondicionAlmacenamiento frm_ingresar_condicion_almacenamiento = new frmIngresarCondicionAlmacenamiento();
			ControladorIngresarCondicionAlmacenamiento controlador_ingresar_condicion_almacenamiento = new ControladorIngresarCondicionAlmacenamiento(frm_ingresar_condicion_almacenamiento);			
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnIngresarForma) {
			frmIngresarFormaFarmaceutica frm_ingresar_forma_farmaceutica = new frmIngresarFormaFarmaceutica();
			ControladorIngresarFormaFarmaceutica controlador_forma_farmaceutica = new ControladorIngresarFormaFarmaceutica(frm_ingresar_forma_farmaceutica);			
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnIngresarVia) {
			frmIngresarViaAdministracion frm_ingresar_via_administracion = new frmIngresarViaAdministracion();
			ControladorIngresarViaAdministracion controlador_ingresar_via_administracion = new ControladorIngresarViaAdministracion(frm_ingresar_via_administracion);			
		}		
			
			
	}

}
