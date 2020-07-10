package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

public class ControladorPrincipal implements ActionListener{
	frmPrincipal frm_principal;
	
	public ControladorPrincipal(frmPrincipal frm_principal) {
		this.frm_principal=frm_principal;
		this.frm_principal.setVisible(true);	
		this.frm_principal.jmiSalir.addActionListener(this);
		this.frm_principal.jmiFabricante.addActionListener(this);
		this.frm_principal.jmiProveedor.addActionListener(this);
		this.frm_principal.jmiMedicamento.addActionListener(this);
		this.frm_principal.jmiEnfermedad.addActionListener(this);
		this.frm_principal.jmiCondicionAlmacenamiento.addActionListener(this);
		this.frm_principal.jmiFormaFarmaceutica.addActionListener(this);
		this.frm_principal.jmiViaAdministracion.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_principal.jmiSalir) {
			this.frm_principal.dispose();
		}
		
		if(evento.getSource()==this.frm_principal.jmiFabricante){
			frmFabricante frm_fabricante = new frmFabricante();
			ControladorFabricante controlador_fabricante= new ControladorFabricante(frm_fabricante);
		}
		
		if(evento.getSource()==this.frm_principal.jmiProveedor) {
			frmProveedor frm_proveedor = new frmProveedor();
			ControladorProveedor controlador_proveedor= new ControladorProveedor(frm_proveedor);
		}
		
		if(evento.getSource()==this.frm_principal.jmiMedicamento) {
			frmMedicamento frm_medicamento = new frmMedicamento();
			ControladorMedicamento controlador_medicamento= new ControladorMedicamento(frm_medicamento);			
		}
		
		if(evento.getSource()==this.frm_principal.jmiEnfermedad) {
			frmEnfermedad frm_enfermedad = new frmEnfermedad();
			ControladorEnfermedad controlador_enfermedad = new ControladorEnfermedad(frm_enfermedad);
		}
		
		if(evento.getSource()==this.frm_principal.jmiCondicionAlmacenamiento) {
			frmCondicionAlmacenamiento frm_condicion_almacenamiento = new frmCondicionAlmacenamiento();
			ControladorCondicionAlmacenamiento controlador_condicion_almacenamiento = new ControladorCondicionAlmacenamiento(frm_condicion_almacenamiento);
		}
		
		if(evento.getSource()==this.frm_principal.jmiFormaFarmaceutica) {
			frmFormaFarmaceutica frm_forma_farmaceutica = new frmFormaFarmaceutica();
			ControladorFormaFarmaceutica controlador_forma_farmaceutica = new ControladorFormaFarmaceutica(frm_forma_farmaceutica);
		}
		
		if(evento.getSource()==this.frm_principal.jmiViaAdministracion) {
			frmViaAdministracion frm_via_administracion = new frmViaAdministracion();
			ControladorViaAdministracion controlador_via_administracion = new ControladorViaAdministracion(frm_via_administracion);
		}
		
	}	
}
