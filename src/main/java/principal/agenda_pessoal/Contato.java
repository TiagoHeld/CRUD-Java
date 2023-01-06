package principal.agenda_pessoal;


public class Contato {

		
		private Integer id;
		private String nome;
		private String telefone;
		public int getId() {
			return id;
		}
		
		public Contato() {
			
		}
		public Contato(int id, String nome, String telefone) {
			this.id = id;
			this.nome = nome;
			this.telefone = telefone;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		
		
		
	}

