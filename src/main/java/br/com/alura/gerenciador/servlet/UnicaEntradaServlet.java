package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.Acao;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String paramAcao = request.getParameter("acao");
		String nomeCompleto = "br.com.alura.gerenciador.acao." + paramAcao;
		String tipo;
		
		try {
			
			Class classe = Class.forName(nomeCompleto);
			Acao acao = (Acao)classe.newInstance();
			tipo = acao.executa(request, response);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException
				| IOException e) {

			throw new ServletException(e);

		}	
		
		String[] tipoEEndereco = tipo.split(":");
 
		
		System.out.println(tipoEEndereco[1]);
		if(tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(tipoEEndereco[1]);
			rd.forward(request, response);

		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}
		
		
	}

}
