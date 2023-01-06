package principal.agenda_pessoal;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AletraEmpresaServlet
 */
@WebServlet("/alteraContato")
public class AlteraContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeContato = request.getParameter("nome");
		String telefone = request.getParameter("telefone");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(telefone);
		
		System.out.println(id);
		
		ContatoDAO dao;
		try {
			dao = new ContatoDAO();
			Contato contatoOld  = dao.buscaContatoPelaId(id);
			if(contatoOld != null) {
				Contato contatoNew = new Contato(contatoOld.getId(), nomeContato, telefone);
				dao.atualiza(contatoOld,contatoNew);
			} else {
				System.out.println("Não existe");
			}
			
			
			response.sendRedirect("listaContatos");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
