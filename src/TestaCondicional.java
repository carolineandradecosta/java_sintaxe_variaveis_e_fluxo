
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 20;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Voce tem mais que 18 anos");
			System.out.println("Seja bem vindo!");
		} 
		else {
			if (quantidadePessoas >= 3) {
				System.out.println("Voce não tem 18 anos, mas pode entrar, pois está acompanhado");
			} 
			else {
				System.out.println("Infelizmente voce nao pode entrar");
			}
		}

	}

}
