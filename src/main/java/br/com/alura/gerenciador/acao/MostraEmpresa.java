package br.com.alura.gerenciador.acao;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

public class MostraEmpresa implements Acao{
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		String idP = request.getParameter("id");
		Integer id = Integer.valueOf(idP);
		
		Empresa empresa = banco.findById(id);
		
		System.out.println(empresa.getNome());
		
		return "forward:/formAtualizaDadosEmpresa.jsp";
		
		
	}
}
