import java.util.*;
import java.io.*;

public class problema_1__ {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String args[]) throws IOException {
		int escolher = 0;
		Data array[] = new Data[31];
		
		do {
			escolher = menu(escolher);
			
			switch (escolher) {
				case 1: array = lerFicheiro();
					break;
				case 2: 
					if (array.length < 31) {
						array = acrescentarValor(array);
					}
					break;
				case 3: listarValores(array);
					break;
				case 4: ordenarTemperaturas(array);
					break;
				case 5: ordenarHumidades(array);
					break;
				case 6: valoresMedios(array);
					break;
				case 7: valoresMaximosMinimos(array);
					break;
				case 8:
					break;
				case 9:
					break;
			}
		} while (escolher != 9);
	}
	
	public static int menu(int escolher) {
		
		System.out.print("Estação meteorológica:\n");
		System.out.print("	1 - Ler ficheiro de dados\n");
		System.out.print("	2 - Acrescentar medida\n");
		System.out.print("	3 - Listar valores de temperatura e humidade\n");
		System.out.print("	4 - Listar medidas ordenadas por valor de temperatura\n");
		System.out.print("	5 - Listar medidas ordenadas por valor de humidade\n");
		System.out.print("	6 - Calcular valores médios de temperatura e humidade\n");
		System.out.print("	7 - Calcular valores máximos e mínimos de temperatura e humidade\n");
		System.out.print("	8 - Calcular histograma das temperaturas e humidade\n");
		System.out.print("	9 - Terminar o programa\n");
		
		do {
			System.out.print("    Opção -> ");
			escolher = sc.nextInt();
		} while (escolher < 1 || escolher > 9);
		
		System.out.println("");
		
		return escolher;
	}
	
	public static Data[] lerFicheiro() throws IOException {
		Data array[] = new Data[31];
		String s;
		File fin;
		int temperatura, humidade, contador = 0;
		
		do {
			do {
				System.out.print("Ficheiro: ");
				s = sc.nextLine();
			} while (s.length() == 0);
			
			fin = new File(s);
		} while (!fin.exists() || !fin.isFile() || !fin.canRead());
		
		Scanner scf = new Scanner(fin);
		
		for (int i = 0; i < array.length; i++) {
			temperatura = 0;
			humidade = 0;
			
			if (scf.hasNextInt()) {
				temperatura = scf.nextInt();
				humidade = scf.nextInt();
				array[i] = new Data(temperatura, humidade);
				contador++;
			}
		}
		
		Data arraySimplificado[] = new Data[contador];
		for (int i = 0; i < arraySimplificado.length; i++) {
			arraySimplificado[i] = array[i];
		}
		
		return arraySimplificado;
	}
	
	public static Data[] acrescentarValor(Data array[]) {
		Data array2[] = new Data[array.length+1];
		int temperatura, humidade;
		
		do {
			System.out.print("Valor da Temperatura: ");
			temperatura = sc.nextInt();
		} while (temperatura < -10 || temperatura > 40);
		do {
			System.out.print("Valor da Humidade: ");
			humidade = sc.nextInt();
		} while (humidade < 0 || humidade > 100);
		
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		
		array2[array.length] = new Data(temperatura, humidade);
		System.out.println("");
		return array2;
	}
	
	public static void listarValores(Data array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Temperatura: %2d Humidade: %3d%%\n", array[i].temperatura, array[i].humidade);
		}
		System.out.println("");
	}
	
	public static void ordenarTemperaturas(Data array[]) {
		Data array2[] = new Data[array.length];
		boolean ohboy;
		
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		
		do {
			ohboy = false;
			for (int i = 0; i < array2.length-1; i++) {
				if (array2[i].temperatura > array2[i+1].temperatura) {
					Data troca = array2[i];
					array2[i] = array2[i+1];
					array2[i+1] = troca; 
					ohboy = true;
				}
			}
		} while (ohboy);
		
		listarValores(array2);
	}
	
	public static void ordenarHumidades(Data array[]) {
		Data array2[] = new Data[array.length];
		boolean ohboy;
		
		for (int i = 0; i < array.length; i++) {
			array2[i] = array[i];
		}
		
		do {
			ohboy = false;
			for (int i = 0; i < array2.length-1; i++) {
				if (array2[i].humidade > array2[i+1].humidade) {
					Data troca = array2[i];
					array2[i] = array2[i+1];
					array2[i+1] = troca; 
					ohboy = true;
				}
			}
		} while (ohboy);
		
		listarValores(array2);
	}
	
	public static void valoresMedios(Data array[]) {
		double temperaturaMedia = 0, humidadeMedia = 0;
		
		for (int i = 0; i < array.length; i++) {
			temperaturaMedia = temperaturaMedia + array[i].temperatura;
			humidadeMedia = humidadeMedia + array[i].humidade;
		}
		
		System.out.printf("O valor médio da temperatura foi %.1fºC.\n", temperaturaMedia/array.length);
		System.out.printf("O valor médio da humidade foi %.1f%%.\n", humidadeMedia/array.length);
		System.out.println("");
	}
	
	public static void valoresMaximosMinimos(Data array[]) {
		int t_max = -10, t_min = 40, h_max = 0, h_min = 100;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i].temperatura > t_max) t_max = array[i].temperatura;
			if(array[i].temperatura < t_min) t_min = array[i].temperatura;
			if(array[i].humidade > h_max) h_max = array[i].humidade;
			if(array[i].humidade < h_min) h_min = array[i].humidade;
		}
		
		System.out.printf("Temperatura máxima: %dºC\n", t_max);
		System.out.printf("Temperatura mínima: %dºC\n", t_min);
		System.out.printf("Humidade máxima: %d%%\n", h_max);
		System.out.printf("Humidade mínima: %d%%\n", h_min);
		System.out.println("");
	}
}

class Data {
	int temperatura;
	int humidade;
	
	Data (int temperatura_in, int humidade_in) {
		temperatura = temperatura_in;
		humidade = humidade_in;
	}
}


