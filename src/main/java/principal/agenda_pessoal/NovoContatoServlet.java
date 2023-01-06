package principal.agenda_pessoal;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novoContato")
public class NovoContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ContatoDAO dao;
		try {
			dao = new ContatoDAO();
			String nomeContato = request.getParameter("nome");
			String telefone = request.getParameter("telefone");
			Contato contato = new Contato();
			contato.setNome(nomeContato);
			contato.setTelefone(telefone);
			
			
			dao.adiciona(contato);
			
//			request.setAttribute("empresa", empresa.getNome());
			
			response.sendRedirect("listaContatos");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		//chamar o JSP
//		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas");
//		request.setAttribute("empresa", empresa.getNome());
//		rd.forward(request, response);
	}

}
