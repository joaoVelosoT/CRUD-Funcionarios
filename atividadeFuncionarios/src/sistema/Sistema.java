package sistema;

import java.util.ArrayList;
import java.util.Scanner;

import models.Pessoa;

public class Sistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		String nome = "";
		double salarioBruto = 0;
		int numeroDependentes = 0;
		boolean vr = false;
		boolean va = false;
		boolean vt = false;
		String planoSaude = "";

		do {

			menu();
			int escolha = sc.nextInt();

			switch (escolha) {

			case 1:
				sc.nextLine();
				// Inicio do input do nome, e da verificação
				boolean nomeVazio = false;
				while (nomeVazio == false) {
					System.out.println("Digite o nome");
					nome = sc.nextLine();
					if (nome.length() == 0) {
						System.out.println("Não deixe espaços vazios");

					} else {
						nomeVazio = true;
					}
				}

				// inicio do input do salario bruto, e da verificação
				boolean salarioPositivo = false;
				while (salarioPositivo == false) {
					System.out.println("Digite o salario");
					try {
						salarioBruto = sc.nextDouble();
						if (salarioBruto < 0) {
							System.out.println("Digite um valor positivo");
						} else {
							salarioPositivo = true;
						}
					} catch (Exception e) {
						System.out.println("Digite um valor numerico");
					}
					sc.nextLine();
				}

				// Inicio do input dos dependentes, e da verificação
				boolean dependentePositivo = false;
				while (dependentePositivo == false) {
					System.out.println("Digite o numero de dependentes");
					try {
						numeroDependentes = sc.nextInt();
						if (numeroDependentes < 0) {
							System.out.println("Não e possivel ter menos de 0 dependentes");
						} else {
							dependentePositivo = true;
						}
					} catch (Exception e) {
						System.out.println("Digite um valor numerico");
					}
					sc.nextLine();
				}

				// Inicio do input do beneficio vr, e da verificacao
				boolean vrPositivo = false;
				while (vrPositivo == false) {
					System.out.println("O Funcionario tem o beneficio VR ?");
					System.out.println("### SIM = TRUE ### NAO = FALSE");
					try {
						vr = sc.nextBoolean();
						vrPositivo = true;
					} catch (Exception e) {
						System.out.println("digite true ou false");
						sc.nextLine();
					}
				}

				// Inicio do input do beneficio va, e da verificacao
				boolean vaPositivo = false;
				while (vaPositivo == false) {
					System.out.println("O Funcionario tem o beneficio VA ?");
					System.out.println("### SIM = TRUE ### NAO = FALSE");
					try {
						va = sc.nextBoolean();
						vaPositivo = true;
					} catch (Exception e) {
						System.out.println("Digite true ou false");
						sc.nextLine();
					}
				}
				// Inicio do input do beneficio vt, e da verificacao
				boolean vtPositivo = false;
				while (vtPositivo == false) {
					System.out.println("O Funcionario tem o beneficio VT ?");
					System.out.println("### SIM = TRUE ### NAO = FALSE");
					try {
						vt = sc.nextBoolean();
						vtPositivo = true;
					} catch (Exception e) {
						System.out.println("Digite true ou false");
						sc.nextLine();
					}
				}
				sc.nextLine();

				// Inicio do input do plano de saude, e da verificacao
				boolean planoSaudeVazio = false;
				while (planoSaudeVazio == false) {
					System.out.println("Digite o plano de saúde");
					planoSaude = sc.nextLine();
					if (planoSaude.length() == 0) {
						System.out.println("Não deixe espaços em branco");
					} else {
						planoSaudeVazio = true;
					}
				}

				System.out.println("OBJETO PESSOA CRIADO COM SUCESSO !!!!!!!!");

				Pessoa func = new Pessoa(nome, salarioBruto, numeroDependentes, vr, va, vt, planoSaude);
				pessoas.add(func);
				continue;
			case 2: {
				pessoas.forEach(funcionarios -> {
					System.out.println("OBJETO: " + pessoas.indexOf(funcionarios));
					System.out.println("Nome: " + funcionarios.getNome());
					System.out.println("Salario bruto: " + funcionarios.getSalarioBruto());
					System.out.println("Numero de dependentes: " + funcionarios.getNumeroDependentes());
					System.out.println("VR: " + funcionarios.isVr());
					System.out.println("VA: " + funcionarios.isVa());
					System.out.println("VT: " + funcionarios.isVt());
					System.out.println("Plano de Saúde: " + funcionarios.getPlanoDeSaude());
				});
				continue;
			}
			case 3: {

				// Inicio do input do deletar objeto, e da verificacao

				boolean funcExiste = false;
				
				while (funcExiste == false) {
					System.out.println("Qual funcionario deseja deletar?");
					try {
						
					} catch (Exception e) {
						// TODO: handle exception
					}
					
					
					
					int funcDeletar = sc.nextInt();
					pessoas.remove(funcDeletar);

				}
			}
			}

		} while (true);

	}

	static void menu() {
		System.out.println("###############");
		System.out.println("1 - Cadastrar Funcionarios");
		System.out.println("2 - Listar Funcionarios");
		System.out.println("3 - Deletar Funcionarios");
		System.out.println("4 - Modificar Funcionarios");
		System.out.println("9 - Sai do Sistema");
		System.out.println("###############");
	}

}
