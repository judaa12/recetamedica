package main;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.UIManager;

import controlador.ControladorLogin;
import vista.frmLogin;

public class Principal {

	public static void main(String[] args) {
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);
	        JDialog.setDefaultLookAndFeelDecorated(true);	
	        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		frmLogin frm_login = new frmLogin();
		ControladorLogin controlador_login= new ControladorLogin(frm_login);
	}

}
