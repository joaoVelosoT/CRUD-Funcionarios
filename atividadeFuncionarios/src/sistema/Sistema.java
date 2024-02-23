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
				int deletarFunc = 0;
				while (funcExiste == false) {
					System.out.println("Digite o numero do funcionario que deseja deletar");
					try {
						deletarFunc = sc.nextInt();
						pessoas.remove(deletarFunc);
						System.out.println("Funcionario deletado com sucesso !!!");
						funcExiste = true;
					} catch (Exception e) {
						System.out.println(" ");
						System.out.println("Digite novamente !!!");
						System.out.println(" ");
						System.out.println("Lembre se de que não e permitido, caracteres e numeros negativos");
						sc.nextLine();
					}

				}
			}

			case 4: {

				// Inicio da funcao de modificar o objeto, e das verificações
				boolean validacaoModificar = false;

				int modificarFunc = 0;

				while (validacaoModificar == false) {
					System.out.println("Digite o numero do objeto que deseja modificar");
					try {
						modificarFunc = sc.nextInt();
						if (modificarFunc < 0) {
							System.out.println("Digite um numero positivo");
						} else {

							if (pessoas.size() < modificarFunc) {
								System.out.println("Funcionario nao encontrado no sistema");
								continue;

							}

							System.out.println("Digite o que voce deseja modificar");
							System.out.println(" 1 - Nome");
							System.out.println(" 2 - Salario Bruto");
							System.out.println(" 3 - Numero de dependentes");
							System.out.println(" 4 - VR");
							System.out.println(" 5 - VA");
							System.out.println(" 6 - VT");
							System.out.println(" 7 - Plano de saúde");
							System.out.println(" 9 - Modificar tudo");
							int escolhaMod = sc.nextInt();

							switch (escolhaMod) {
							case 1: {

								sc.nextLine();
								// Inicio do input do nome, e da verificação
								boolean nomeVazioMod = false;
								while (nomeVazioMod == false) {
									System.out.println("Digite o nome");
									String modNome = sc.nextLine();
									if (modNome.length() == 0) {
										System.out.println("Não deixe espaços vazios");
									} else {
										pessoas.get(modificarFunc).setNome(modNome);
										System.out.println("Nome Modificado com sucesso !!!!");
										nomeVazioMod = true;
										validacaoModificar = true;
									}
								}
								continue;
							}
							case 2: {

								// inicio do input do salario bruto, e da verificação
								boolean salarioPositivoMod = false;
								while (salarioPositivoMod == false) {
									System.out.println("Digite o salario");
									try {
										double salarioBrutoMod = sc.nextDouble();
										if (salarioBrutoMod < 0) {
											System.out.println("Digite um valor positivo");
										} else {
											pessoas.get(modificarFunc).setSalarioBruto(salarioBrutoMod);
											salarioPositivoMod = true;
											validacaoModificar = true;
										}
									} catch (Exception e) {
										System.out.println("Digite um valor numerico");
									}
									sc.nextLine();
								}
								continue;
							}
							case 3: {
								// Inicio do input dos dependentes, e da verificação
								boolean dependentePositivoMod = false;
								while (dependentePositivoMod == false) {
									System.out.println("Digite o numero de dependentes");
									try {
										int numeroDependentesMod = sc.nextInt();
										if (numeroDependentesMod < 0) {
											System.out.println("Não e possivel ter menos de 0 dependentes");
										} else {
											pessoas.get(modificarFunc).setNumeroDependentes(numeroDependentesMod);
											dependentePositivoMod = true;
											validacaoModificar = true;
										}
									} catch (Exception e) {
										System.out.println("Digite um valor numerico");
									}
									sc.nextLine();

								}
								continue;
							}

							case 4: {
								// Inicio do input do beneficio vr, e da verificacao
								boolean vrPositivoMod = false;
								while (vrPositivoMod == false) {
									System.out.println("O Funcionario tem o beneficio VR ?");
									System.out.println("### SIM = TRUE ### NAO = FALSE");
									try {
										boolean vrMod = sc.nextBoolean();
										pessoas.get(modificarFunc).setVr(vrMod);
										vrPositivoMod = true;
										validacaoModificar = true;
									} catch (Exception e) {
										System.out.println("digite true ou false");
										sc.nextLine();
									}
								}
								continue;
							}
							case 5: {
								// Inicio do input do beneficio va, e da verificacao
								boolean vaPositivoMod = false;
								while (vaPositivoMod == false) {
									System.out.println("O Funcionario tem o beneficio VA ?");
									System.out.println("### SIM = TRUE ### NAO = FALSE");
									try {
										boolean vaMod = sc.nextBoolean();
										pessoas.get(modificarFunc).setVa(vaMod);
										vaPositivoMod = true;
										validacaoModificar = true;
									} catch (Exception e) {
										System.out.println("Digite true ou false");
										sc.nextLine();
									}
								}
								continue;
							}
							case 6: {
								// Inicio do input do beneficio vt, e da verificacao
								boolean vtPositivoMod = false;
								while (vtPositivoMod == false) {
									System.out.println("O Funcionario tem o beneficio VT ?");
									System.out.println("### SIM = TRUE ### NAO = FALSE");
									try {
										boolean vtMod = sc.nextBoolean();
										pessoas.get(modificarFunc).setVt(vtMod);
										vtPositivoMod = true;
										validacaoModificar = true;
									} catch (Exception e) {
										System.out.println("Digite true ou false");
										sc.nextLine();
									}
								}
								sc.nextLine();
								continue;
							}
							case 7: {
								// Inicio do input do plano de saude, e da verificacao
								boolean planoSaudeVazioMod = false;
								while (planoSaudeVazioMod == false) {
									System.out.println("Digite o plano de saúde");
									String planoSaudeMod = sc.nextLine();
									if (planoSaudeMod.length() == 0) {
										System.out.println("Não deixe espaços em branco");
									} else {
										pessoas.get(modificarFunc).setPlanoDeSaude(planoSaudeMod);
										planoSaudeVazioMod = true;
										validacaoModificar = true;
									}
								}
								continue;
							}
							case 9: {
								sc.nextLine();
								// Inicio do input do nome, e da verificação
								boolean nomeVazioMod = false;
								while (nomeVazioMod == false) {
									System.out.println("Digite o nome");
									String modNome = sc.nextLine();
									if (modNome.length() == 0) {
										System.out.println("Não deixe espaços vazios");
									} else {
										pessoas.get(modificarFunc).setNome(modNome);
										System.out.println("Nome Modificado com sucesso !!!!");
										nomeVazioMod = true;
										validacaoModificar = true;
									}
								}

								// inicio do input do salario bruto, e da verificação
								boolean salarioPositivoMod = false;
								while (salarioPositivoMod == false) {
									System.out.println("Digite o salario");
									try {
										double salarioBrutoMod = sc.nextDouble();
										if (salarioBrutoMod < 0) {
											System.out.println("Digite um valor positivo");
										} else {
											pessoas.get(modificarFunc).setSalarioBruto(salarioBrutoMod);
											salarioPositivoMod = true;
											validacaoModificar = true;
										}
									} catch (Exception e) {
										System.out.println("Digite um valor numerico");
									}
									sc.nextLine();
								}

								// Inicio do input dos dependentes, e da verificação
								boolean dependentePositivoMod = false;
								while (dependentePositivoMod == false) {
									System.out.println("Digite o numero de dependentes");
									try {
										int numeroDependentesMod = sc.nextInt();
										if (numeroDependentesMod < 0) {
											System.out.println("Não e possivel ter menos de 0 dependentes");
										} else {
											pessoas.get(modificarFunc).setNumeroDependentes(numeroDependentesMod);
											dependentePositivoMod = true;
											validacaoModificar = true;
										}
									} catch (Exception e) {
										System.out.println("Digite um valor numerico");
									}
									sc.nextLine();

								}

								// Inicio do input do beneficio vr, e da verificacao
								boolean vrPositivoMod = false;
								while (vrPositivoMod == false) {
									System.out.println("O Funcionario tem o beneficio VR ?");
									System.out.println("### SIM = TRUE ### NAO = FALSE");
									try {
										boolean vrMod = sc.nextBoolean();
										pessoas.get(modificarFunc).setVr(vrMod);
										vrPositivoMod = true;
										validacaoModificar = true;
									} catch (Exception e) {
										System.out.println("digite true ou false");
										sc.nextLine();
									}
								}

								// Inicio do input do beneficio va, e da verificacao
								boolean vaPositivoMod = false;
								while (vaPositivoMod == false) {
									System.out.println("O Funcionario tem o beneficio VA ?");
									System.out.println("### SIM = TRUE ### NAO = FALSE");
									try {
										boolean vaMod = sc.nextBoolean();
										pessoas.get(modificarFunc).setVa(vaMod);
										vaPositivoMod = true;
										validacaoModificar = true;
									} catch (Exception e) {
										System.out.println("Digite true ou false");
										sc.nextLine();
									}
								}

								// Inicio do input do beneficio vt, e da verificacao
								boolean vtPositivoMod = false;
								while (vtPositivoMod == false) {
									System.out.println("O Funcionario tem o beneficio VT ?");
									System.out.println("### SIM = TRUE ### NAO = FALSE");
									try {
										boolean vtMod = sc.nextBoolean();
										pessoas.get(modificarFunc).setVt(vtMod);
										vtPositivoMod = true;
										validacaoModificar = true;
									} catch (Exception e) {
										System.out.println("Digite true ou false");
										sc.nextLine();
									}
								}
								sc.nextLine();

								// Inicio do input do plano de saude, e da verificacao
								boolean planoSaudeVazioMod = false;
								while (planoSaudeVazioMod == false) {
									System.out.println("Digite o plano de saúde");
									String planoSaudeMod = sc.nextLine();
									if (planoSaudeMod.length() == 0) {
										System.out.println("Não deixe espaços em branco");
									} else {
										pessoas.get(modificarFunc).setPlanoDeSaude(planoSaudeMod);
										planoSaudeVazioMod = true;
										validacaoModificar = true;
									}
								}
								continue;
							}
							}
						}
					} catch (Exception e) {
						System.out.println("Digite um valor numerico");
						sc.nextLine();
					}
				}

			}
			case 5: {
				
				
				int visualizarFunc = 0;
				
				
				System.out.println("Qual funcionario voce deseja visualizar?");
				try {
					 visualizarFunc = sc.nextInt();
					if (visualizarFunc < 0) {
						System.out.println("Digite um numero positivo");
					} else {
						if (pessoas.size() < visualizarFunc) {
							System.out.println("Funcionario nao encontrado no sistema");
							continue;

						}
					}catch(ex) {
						
					}
					

				System.out.println("Funcionario" + visualizarFunc);
				pessoas.get(visualizarFunc).getNome();
				pessoas.get(visualizarFunc).getSalarioBruto();
				pessoas.get(visualizarFunc).getNumeroDependentes();
				pessoas.get(visualizarFunc).isVr();
				pessoas.get(visualizarFunc).isVa();
				pessoas.get(visualizarFunc).isVt();
				pessoas.get(visualizarFunc).getPlanoDeSaude();

				continue;

				
			
			
			}

		} while (true);

	}

	static void menu() {
		System.out.println("###############");
		System.out.println("1 - Cadastrar Funcionarios");
		System.out.println("2 - Listar Funcionarios");
		System.out.println("3 - Deletar Funcionarios");
		System.out.println("4 - Modificar Funcionarios");
		System.out.println("5 - Visualizar Funcionario especifico");
		System.out.println("9 - Sai do Sistema");
		System.out.println("###############");
	}

}
