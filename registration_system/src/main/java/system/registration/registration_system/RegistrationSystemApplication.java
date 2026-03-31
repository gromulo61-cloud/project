package system.registration.registration_system;

import User.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Scanner;

@SpringBootApplication
public class RegistrationSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationSystemApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		ArrayList<User> user = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int option;

		do{System.out.println("\n1 - Cadastrar");
			System.out.println("2 - Listar");
			System.out.println("3 - Editar");
			System.out.println("4 - Remover");
			System.out.println("0 - Sair");
			option = sc.nextInt();
			sc.nextLine();

			switch (option){
				case 1:
					System.out.print("Nome: ");
					String name = sc.nextLine();

					System.out.print("Idade: ");
					int year = sc.nextInt();

					user.add(new User(name, year));
					System.out.printf("Usuario cadastrado");
					break;

				case 2:
					for (int i = 0; i < user.size(); i++ ){
						System.out.println(i + " - " + user.get(i));
					}
					break;
				case 3:
					System.out.printf("Digite o índice: ");
					int indexEdit = sc.nextInt();
					sc.nextLine();

					System.out.print("Novo nome: ");
					String newName = sc.nextLine();

					System.out.print("Nova idade: ");
					int newYear = sc.nextInt();

					user.set(indexEdit, new User(newName, newYear));
					System.out.println("Atualizado!");
					break;

				case 4:
					System.out.print("Digite o índice: ");
					int indexRemove = sc.nextInt();
					user.remove(indexRemove);
					System.out.println("Removido!");
					break;
			}
		}while (option != 0);

		sc.close();
	}
}
