package Controller;

import javax.swing.JOptionPane;

import Service.ServiceCasa;

public class ControllerCasa {
	public static void menu(ServiceCasa serviceCasa) {
		try {
			boolean control = true;
			while(control) {
				
				String menuMensagem = "::Menu Casa::\n\n"
				+ "\n\n\n\n\nDigite sua opção:";
				String[] menuOpcao = {"Cadastrar" , "Remover" , "Listar" , "Pesquisar" ,"Voltar"};
				int op = JOptionPane.showOptionDialog(null, menuMensagem, "Sistema Imobiliaria", 1, 1, null, menuOpcao,
						menuOpcao[0]);
				switch(op) {
				case 0:
					serviceCasa.add();
					break;
				case 1:
					serviceCasa.remove();
					break;
				case 2:
					serviceCasa.listaCasa();
					break;
				case 3:
					serviceCasa.getCasa();
					break;
				case 4:
					control = false;
					break;			
				}
			}
		}
		catch(Exception e) {
			JOptionPane.showConfirmDialog(null, e.getMessage());
		}
		

	}
}
