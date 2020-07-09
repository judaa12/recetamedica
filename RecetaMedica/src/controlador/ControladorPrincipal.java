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
		
	}	
}
