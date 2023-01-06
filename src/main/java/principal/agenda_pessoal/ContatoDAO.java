package principal.agenda_pessoal;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAO {
	
		private Connection connection = null;
		private PreparedStatement statement = null;
		
		public ContatoDAO() throws SQLException {
			connection = new ConnectionFactory().recuperaConexao();
		}
		
		public List<Contato> getContatos() {
		
			String query ="SELECT * from CONTATO";
			List<Contato>contatos = new ArrayList<>();
			try {
				statement = connection.prepareStatement(query);
				ResultSet rst = statement.executeQuery();
				while(rst.next()) {
					contatos.add(new Contato(rst.getInt("id"), rst.getString("nome"), rst.getString("telefone")));
				}
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return contatos;
			
		}

		public void adiciona(Contato contato) {
			String query = "INSERT INTO contato (nome, telefone) VALUES(?, ?)";
			
			try {
				statement = connection.prepareStatement(query);
				statement.setString(1, contato.getNome());
				statement.setString(2, contato.getTelefone());
				
				statement.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		public void removeEmpresa(Integer id) {
			String query = "DELETE FROM contato WHERE id = ?";
			
			try {
				statement = connection.prepareStatement(query);
				statement.setInt(1, id);
				statement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		public Contato buscaContatoPelaId(Integer id) {
			Contato contato = null; 
			String query = "SELECT * FROM contato WHERE id = ?";
			
			try {
				statement = connection.prepareStatement(query);
				statement.setInt(1, id);
				
				ResultSet res = statement.executeQuery();
				
			
				
				while(res.next()) {
					contato = new Contato(res.getInt("id"),res.getString("nome"), res.getString("telefone"));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return contato;
		}

		public void atualiza(Contato contatoOld, Contato contatoNew) {
			String query = "UPDATE contato SET nome = ?, telefone = ? WHERE id = ?";
			try {
				statement = connection.prepareStatement(query);
				statement.setString(1, contatoNew.getNome());
				statement.setString(2, contatoNew.getTelefone());
				statement.setInt(3, contatoNew.getId());
				statement.execute();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}


