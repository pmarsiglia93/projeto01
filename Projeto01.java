package br.com.generation.posithives;

import java.util.Scanner;

public class Projeto01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.println("|                                            |");
		System.out.println("|               Posithives                   |");
		System.out.println("|                                            |");
		System.out.println("==============================================");
		
		System.out.println("Inicio do sistema");
		
		int opcao;
		int idade;
		boolean pausa = true;
		
		System.out.println("\nVocê possui HIV?\n");
		System.out.println("1 - Sim ");
		System.out.println("2 - Não ");
		System.out.println("3 - Não sei");
		System.out.print("\nDigite a sua opção: ");
		while(pausa) {		
			opcao = input.nextInt();
			if(opcao == 1) {
				System.out.println("\nVocê está em tratamento? \n");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				System.out.println("Digite a sua opção: ");
				while(pausa) {
					opcao = input.nextInt();
					//Diário medicamentoso (?)
					if(opcao == 1) {
						System.out.println("|--------------------|");
						System.out.println("|Diário medicamentoso|");
						System.out.println("|--------------------|");
					}
					else if(opcao == 2) {
						System.out.println("|--------------------------------------------------------------------|");
						System.out.println(" Procure um CTA para mais informações.\n                              ");
						System.out.println(" Digite seu CEP para localizar o CTA mais próximo de sua residência:  ");
						System.out.println("|--------------------------------------------------------------------|");
						// input para cep (tentar API)
					}
					else {
						System.out.println("| --------------------------------------|");
						System.out.print  ("|ERRO -- Digite apenas as opções 1 ou 2:|");
						System.out.println("| --------------------------------------|");
					}	
				}
			}
			else if(opcao == 2) {
				System.out.println("\nGostaria de participar do estudo sobre vacina contra o HIV?\n");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				System.out.println("Digite a sua opção: ");
				while(pausa) {
					opcao = input.nextInt();
					if(opcao == 1) {
						System.out.print("Digite a sua idade: ");
						idade = input.nextInt();
						if(idade >= 18 && idade <= 60) {
							System.out.println("Está em boas condições de saúde: ");
							System.out.println("1 - Sim");
							System.out.println("2 - Não");
							System.out.println("Digite a sua opção: ");
							while(pausa) {
								opcao = input.nextInt();
								if(opcao == 1) {
									System.out.println("Você utiliza PrEP? ");
									System.out.println("1 - Sim");
									System.out.println("2 - Não");
									System.out.println("Digite a sua opção: ");
									while(pausa) {
										opcao = input.nextInt();
										if(opcao == 1) {
											System.out.println("|------------------------------------|");
											System.out.println("|Você não possui critérios elegiveis |");
											System.out.println("|------------------------------------|");
											pausa = false;
										}
										else if(opcao == 2) {
											System.out.println("------------------------------------------------------------------------------------------------");
											System.out.println("PreP - A Profilaxia Pré-Exposição de risco à infecção pelo HIV consist"
													+ "e no uso preventivo de medicamentos antirretrovirais antes da exposição sexual ao "
													+ "vírus, \npara reduzir a probabilidade de infecção pelo HIV. O objetivo da PrEP é previnir a "
													+ "infecção pelo HIV e promover uma vida sexual mais saudável.");
											System.out.println("\nPara mais informações acesso o site:\n");											
											System.out.println("www.aids.gov.br");
											System.out.println("------------------------------------------------------------------------------------------------");
											pausa = false;
										}
										else {
											System.out.println("-----------------------------------------");
											System.out.println("ERRO -- Digite apenas as opções 1 ou 2:  ");
											System.out.println("-----------------------------------------");
										}
									}
									
								}
								else if(opcao == 2) {
									System.out.println("---------------------------------------");
									System.out.println("Você não possui os critérios elegiveis.");
									System.out.println("---------------------------------------");
									pausa = false;
								}
								else {
									System.out.println("-----------------------------------------");
									System.out.println("ERRO -- Digite apenas as opções 1 ou 2:  ");
									System.out.println("-----------------------------------------");
								}
							}
						}
						else {
							System.out.println("---------------------------------------");
							System.out.println("Você não possui os critérios elegiveis.");
							System.out.println("---------------------------------------");
							pausa = false;
						}
					}
					else if(opcao == 2) {
						System.out.println("|-----------------------|");
						System.out.println("|Continue se prevenindo!|");
						System.out.println("|-----------------------|");
						pausa = false;
					}
					else {
						System.out.println("|----------------------------------------|");
						System.out.println("|ERRO -- Digite apenas as opções 1 ou 2: |");
						System.out.println("|----------------------------------------|");
					}
				}
				
			}
			else if(opcao == 3) {
				System.out.println("|---------------------------------------|");
				System.out.println("|Procure um CTA para mais informações.  |");
				System.out.println("|Digite seu CEP:                        |");
				System.out.println("|---------------------------------------|");
				//input para cep (tentar API)
			}
			else {
				System.out.println("-------------------------------------------");
				System.out.println("ERRO -- Digite apenas as opções de 1 a 3:  ");
				System.out.println("-------------------------------------------");
			}
		}
		System.out.println("-------------------");				
		System.out.println("--FIM DO PROGRAMA--");
		System.out.println("-------------------");
		input.close();

		}

	}


