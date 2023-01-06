package principal.agenda_pessoal;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mostraContato")
public class MostraContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ContatoDAO dao;
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);

		try {
			dao = new ContatoDAO();
			Contato contato = dao.buscaContatoPelaId(id);

			request.setAttribute("contato", contato);

			RequestDispatcher rd = request.getRequestDispatcher("/formAlteraContato.jsp");

			rd.forward(request, response);
			dao = new ContatoDAO();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
