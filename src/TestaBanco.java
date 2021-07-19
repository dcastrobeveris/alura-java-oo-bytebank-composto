
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente diego = new Cliente();
		diego.nome = "Diego Barcellos";
		diego.cpf = "123.456.789-00";
		diego.profissao = "Programador";
		
		Conta contaDoDiego = new Conta();
		contaDoDiego.deposita(100);
		
		contaDoDiego.titular = diego;
		System.out.println(contaDoDiego.titular.nome);
		System.out.println(contaDoDiego.titular);
		System.out.println(diego);
	}

}
