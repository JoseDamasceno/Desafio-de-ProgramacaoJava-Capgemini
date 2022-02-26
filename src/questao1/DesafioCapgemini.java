package questao1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesafioCapgemini {

	public static void main(String[] args) {

		/**
		 * # Quest�o 01
		 * 
		 * Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o
		 * caractere * e espa�os. A base e altura da escada devem ser iguais ao valor de
		 * n. A �ltima linha n�o deve conter nenhum espa�o.
		 */

		List<String> escada = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite numero de degrais: ");
		
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			escada.add(" ".repeat(n - i) + "*".repeat(i + 1));
		}

		for (String d : escada) {
			System.out.println(d);

		}

		/**
		  # Quest�o 02
		  
		  D�bora se inscreveu em uma rede social para se manter em contato com seus
		  amigos. A p�gina de cadastro exigia o preenchimento dos campos de nome e
		  senha, por�m a senha precisa ser forte. O site considera uma senha forte
		  quando ela satisfaz os seguintes crit�rios: Possui no m�nimo 6 caracteres.
		  Cont�m no m�nimo 1 d�gito. Cont�m no m�nimo 1 letra em min�sculo. Cont�m no
		  m�nimo 1 letra em mai�sculo. Cont�m no m�nimo 1 caractere especial. Os
		  caracteres especiais s�o: !@#$%^&*()-+
		  
		  Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab,
		  transformando a senha em Ya3&ab. 2 caracteres n�o s�o suficientes visto que a
		  senha precisa ter um tamanho m�nimo de 6 caracteres.
		  
		 */

		System.out.println("Escreva sua senha: ");
		String senha = sc.next();

		if (senha.length() >= 6) {
			System.out.println(senha.length());
		} else if ((senha.length() <= 5)) {
			
			System.out.println("Senha precisa ter um tamanho m�nimo de 6 caracteres.");
			System.out.println(senha.length());
			
			int valor = 6 - senha.length();

			System.out.println("faltam: " + valor);

		}
		sc.close();
	}

}
