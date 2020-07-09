package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.frmLogin;
import vista.frmPrincipal;

public class ControladorLogin implements ActionListener{
	frmLogin frm_login;
	
	public ControladorLogin(frmLogin frm_login) {
		this.frm_login=frm_login;
		this.frm_login.setVisible(true);	
		this.frm_login.btnIngresar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		
		if(evento.getSource()==this.frm_login.btnIngresar) {
			frmPrincipal frm_principal = new frmPrincipal();
			ControladorPrincipal controlador_principal= new ControladorPrincipal(frm_principal);
			this.frm_login.dispose();
		}
		
	}
	
}
