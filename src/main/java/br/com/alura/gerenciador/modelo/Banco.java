package br.com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	public static Integer ids = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(ids++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(ids++);	
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void removeEmpresa(Integer id) {
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}
	
	public void adiciona(Empresa empresa) {
		empresa.setId(ids++);
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

	public Empresa findById(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

}
