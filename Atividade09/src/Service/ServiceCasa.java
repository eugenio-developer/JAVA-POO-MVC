package Service;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Models.Casa;
import Repository.RepositoryCasa;

public class ServiceCasa {
	RepositoryCasa repCasa = new RepositoryCasa();
	public void add() {
		JTextField id = new JTextField();
		JTextField endereco = new JTextField();
		JTextField cep = new JTextField();
		JTextField tamanho = new JTextField();
		JTextField preco = new JTextField();
		Object[] objtCasa = { "ID: ", id, "Endereco: ", endereco, "CEP: ", cep, "Tamanaho: ", tamanho, "Preco: ", preco };
		JOptionPane.showConfirmDialog(null, objtCasa, "Cadastra Casa", JOptionPane.YES_NO_OPTION);
		Casa casa = new Casa(Integer.parseInt(id.getText()) ,endereco.getText(),cep.getText(),Double.parseDouble(preco.getText()) ,Double.parseDouble(tamanho.getText()) );
		repCasa.addCasa(casa);
		JOptionPane.showConfirmDialog(null, "Cadastrado com sucesso!");
	}
	
	public void remove() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id para remover: "));
		repCasa.removeCasa(repCasa.getCasa(id));
		JOptionPane.showConfirmDialog(null, "Removido com sucesso!");
	}
	
	public void getCasa() {
		int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id para buscar: "));
		JOptionPane.showConfirmDialog(null, (repCasa.getCasa(id).toString()));
	}
	
	public void listaCasa() {
		String lista = "";
		for(int i=0; i < repCasa.getAll().size(); i++) {
			lista += repCasa.getAll().get(i).toString();
		}
		JOptionPane.showConfirmDialog(null, lista);
	}
}
