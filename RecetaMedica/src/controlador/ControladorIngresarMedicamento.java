package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmCondicionAlmacenamiento;
import vista.frmFormaFarmaceutica;
import vista.frmIngresarMedicamento;
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
		this.frm_ingresar_medicamento.btnEnfermedad.addActionListener(this);
		this.frm_ingresar_medicamento.btnFabricante.addActionListener(this);
		this.frm_ingresar_medicamento.btnCondicion.addActionListener(this);
		this.frm_ingresar_medicamento.btnFormaFarmaceutica.addActionListener(this);
		this.frm_ingresar_medicamento.btnViaAdministracion.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnCancelar) {
			this.frm_ingresar_medicamento.dispose();
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnEnfermedad) {
			frmListarEnfermedad frm_listar_enfermedad = new frmListarEnfermedad();
			ControladorListarEnfermedad controlador_listar_enfermedad = new ControladorListarEnfermedad(frm_listar_enfermedad);
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnFabricante) {
			frmListarFabricante frm_listar_fabricante = new frmListarFabricante();
			ControladorListarFabricante controlador_listar_fabricante = new ControladorListarFabricante(frm_listar_fabricante);
		}

		if(evento.getSource()==this.frm_ingresar_medicamento.btnCondicion) {
			frmListarCondicionAlmacenamiento frm_listar_condicion_almacenamiento = new frmListarCondicionAlmacenamiento();
			ControladorListarCondicionAlmacenamiento controlador_listar_condicion_almacenamiento = new ControladorListarCondicionAlmacenamiento(frm_listar_condicion_almacenamiento);
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnFormaFarmaceutica) {
			frmListarFormaFarmaceutica frm_listar_forma_farmaceutica = new frmListarFormaFarmaceutica();
			ControladorListarFormaFarmaceutica controlador_listar_forma_farmaceutica = new ControladorListarFormaFarmaceutica(frm_listar_forma_farmaceutica);
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnViaAdministracion) {
			frmListarViaAdministracion frm_listar_via_administracion = new frmListarViaAdministracion();
			ControladorListarViaAdministracion controlador_listar_via_administracion = new ControladorListarViaAdministracion(frm_listar_via_administracion);
		}
		
		if(evento.getSource()==this.frm_ingresar_medicamento.btnAceptar) {
			
		}
		
		
	}

}
