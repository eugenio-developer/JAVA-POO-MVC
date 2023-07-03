package App;

import javax.swing.JOptionPane;

import Controller.ControllerCasa;
import Service.ServiceCasa;

public class AppCasa {
	public static void main(String[] args) {
		
		try {
			ServiceCasa serviceCasa = new ServiceCasa();
			boolean control = true;
			while(control) {
				switch(menuPrincipal()) {
				case 0:
					ControllerCasa.menu(serviceCasa);
					break;
				case 1:
					control = false;
					break;
				}
			}
		}
		catch(Exception e) {
			JOptionPane.showConfirmDialog(null, e.getMessage());
		}
		
		
	}
	public static int menuPrincipal() {

		String menuMensagem = "-------------------------------------------- Imobiliaria -----------------------------------------------\n\n";
				

		String[] menuPrincipal = { "Casas", "Sair"};
		int op = JOptionPane.showOptionDialog(null, menuMensagem, "Imobiliaria", 1, 1, null, menuPrincipal,
				menuPrincipal[0]);
		return op;

	}
}
