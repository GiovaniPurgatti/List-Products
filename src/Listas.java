import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas {

	public static void main(String[] args) {

		List<Produto> lista = new ArrayList<Produto>();

		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			Produto produto = new Produto();
			System.out.println("Nome: ");
			produto.setNome(sc.nextLine()); 
			System.out.println("Descricao: ");
			produto.setDescricao(sc.nextLine());

			lista.add(produto);
		}

		char resposta;
		
		
		do {
			System.out.println("Lembre-se que o primeiro item da lista tem indice 0");
			System.out.println("Deseja alterar algum item da lista?(S/N)");
			resposta = sc.next().charAt(0);
			if (resposta == 's' || resposta == 'S') {
				System.out.print("Digite o indice do item que deseja alterar: ");
				int indice = sc.nextInt();
				sc.nextLine();
				System.out.print("novo nome: ");
				lista.get(indice).setNome(sc.nextLine());
				
				System.out.print("nova descricao: ");
				lista.get(indice).setDescricao(sc.nextLine());
			}
		} while (resposta == 's' || resposta == 'S');
		
		
		do {
			System.out.println("Lembre-se que o primeiro item da lista tem indice 0");
			System.out.println("Deseja remover algum item da lista?(S/N)");
			resposta = sc.next().charAt(0);
			if (resposta == 's' || resposta == 'S') {
				System.out.print("Digite o indice do item que deseja remover: ");
				int indice = sc.nextInt();
				lista.remove(indice);
			}
		} while (resposta == 's' || resposta == 'S');

		for (int i = 0; i < lista.size(); i++) {
			Produto aux = lista.get(i);
			System.out.println("Produto #" + (i + 1));
			System.out.println(aux.toString());
			System.out.println("==================");
		}

		sc.close();
	}

}
