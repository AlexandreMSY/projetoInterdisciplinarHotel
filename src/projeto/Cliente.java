package projeto;

public class Cliente extends Forma{
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String endere�o;
	
	public Cliente(String nome, String cpf, String dataNascimento, String endere�o) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.endere�o = endere�o;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	@Override
	public void print() {
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Data Nascimento: " + this.dataNascimento);
		System.out.println("Endere�o: " + this.endere�o);
		
	}
	
	
	
	
	
	
	
}
