import java.util.Scanner;

public class Execucao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("--- Dados do Cliente ---");
		// Instância = cópia
		Cliente cli=new Cliente();
		
		
		
		// Classe obg = new Classe();
		//              new [novas instãncias]  ()[construtor]
		
		ContaCorrente cc=new ContaCorrente();
		// SET - para colocar os dados
		cli.setAgencia(100);
		cli.setConta(34567);
		cli.setCpf("123.456.789-90");
		cli.setNome("José da Silva");
		cli.setEndereco("Av. dos Autonomistas 234");
		cli.setNascimento("15/06/1995");
		cli.setSaldo(100.0f);
		cli.setTelefone("(11) 9123-456");
		cli.setSenha("abc#1234");
		
		// GET - mostrando os dados
		cli.MostrarCliente();
		System.out.println("--- Conta Corrente ---");
		cc.setNumero_doc_cc(2345678);
		cc.setAgencia_cc(100);
		cc.setConta_cc(34567);
		cc.setValor_cc(50.0f);
		cc.setTipo_cc(1);
		cc.setData_ocorrencia_cc("20/10/2021");
		cc.setSaldo_cc(100.0f);
		
		System.out.println("Número do documento: " + cc.getNumero_doc_cc());
		System.out.println("Agência: " + cc.getAgencia_cc());
		System.out.println("Conta: " + cc.getConta_cc());
		System.out.println("Valor: " + cc.getValor_cc());
		System.out.println("Tipo: " + cc.getTipo_cc() + "(Depósito)");
		System.out.println("Data de ocorrência: " + cc.getData_ocorrencia_cc());
		System.out.println("Saldo anterior: " + cc.getSaldo_cc());
		cc.AtualizarSaldo();
		System.out.println("Saldo atual: " + cc.getSaldo_cc());
		cc.RegistrarOcorrencia();
	
	}

}
