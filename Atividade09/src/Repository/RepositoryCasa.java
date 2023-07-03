package Repository;

import java.util.ArrayList;

import Models.Casa;

public class RepositoryCasa {
	ArrayList<Casa>casas=new ArrayList<Casa>();
	
	
	public void addCasa(Casa casa) {
		casas.add(casa);
	}
	public void removeCasa(Casa casa) {
		casas.remove(casa);
	}
	public Casa getCasa(int id) {
		for (Casa casa : casas) {
			if(casa.getId() == id) {
				return casa;
			}
		}
		return null;
	}
	public ArrayList<Casa> getAll(){
		return casas;
	}
}
