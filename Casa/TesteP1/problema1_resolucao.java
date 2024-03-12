//problema 1

import java.util.*;
import java.io.*;


public class problema1_resolucao{
	static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws IOException{
		Dia array[] = new Dia[0];
		int op;
		
		System.out.println("(1) - Ler do Ficheiro \n" +
						   "(2) - Acrescentar medidas\n" + 
							"(3) - Imprimir valores de temperatura e humidade\n" +
							"(4) -  Listar medidas ordenadas por valor de temperatura\n" +
							"(5) -  Listar medidas ordenadas por valor de humidade \n" + 
							"(6) -  Calcular valores médios de temperatura e humidade\n" +
							"(7) -  Calcular valores máximos e mínimos de temperatura e humidade\n" + 
							"(8) -  Calcular histograma das temperaturas e humidade\n" +
							"(9) -  Terminar programa");
	do{	
			op = sc.nextInt();
			switch(op){
				case 1: array = lerFicheiro();break;
				case 2: if(array.length < 31){
							array = acrescentar(array);
						}break;
				case 3: imprimir(array);break;
				case 4: ordenarTempCres(array);break;
				case 5: ordenarHumiDecres(array);break;
				case 6: media(array);break;
				case 7: minMax(array);break;
				case 8: histograma(array);break;
			}
		}while(op!=10);
	}
	
	public static Dia[] lerFicheiro () throws IOException{
		String nomeFicheiro;
		File ficheiro;
		int count = 0;
		Dia[] array = new Dia[31];
		do{
			do{
				nomeFicheiro = sc.nextLine();
			}while(nomeFicheiro.length() == 0);
			
			ficheiro = new File(nomeFicheiro);
		}while(!ficheiro.canRead() || !ficheiro.isFile());	
		
		Scanner scf = new Scanner(ficheiro);
		
		for(int i = 0; i < 31; i++){
			int t = 0;
			int h = 0;
			if(scf.hasNextInt()){	
				t = scf.nextInt();
				h = scf.nextInt();
				array[i] = new Dia(t,h);
				count++;
			}else break;
		}
		Dia[] array2 = new Dia[count];
		for(int i = 0; i < count; i++){
			array2[i] = array[i];
		}
		
		
		return array2;
	}
	
	public static Dia[] acrescentar(Dia[] array){
		Dia[] array2 = new Dia[array.length+1];
		int t = 0;
		int h = 0;
		do{	
			t = sc.nextInt();
		}while(t<-10||t>40);
		do{
			h = sc.nextInt();
		}while(h<0||h>100);
		for(int i = 0; i < array.length; i++){
			array2[i] = array[i];
		}
		array2[array.length] = new Dia(t,h);
		return array2;
	}
	
	public static void imprimir(Dia[] array){
		for(int i = 0; i < array.length; i++){
			System.out.printf("Temperatura: %2d;  Humidade: %3d%%\n", array[i].t, array[i].h);
		}
	}
	
	public static void ordenarTempCres(Dia[] array){
		Dia[] array2 = new Dia[array.length];
		for(int i = 0; i < array.length; i++){
			array2[i] = array[i];
		}
		boolean trocas = false;
		do{
			trocas = false;
			for(int i = 0; i < array.length-1; i++){
				if(array2[i].t > array2[i+1].t){
					Dia temporario = array2[i];
					array2[i] = array2[i+1];
					array2[i+1] = temporario;
					trocas = true; 
				}
			}
			
		}while(trocas);
		imprimir(array2);
	}
	
	public static void ordenarHumiDecres(Dia[] array){
		Dia[] array2 = new Dia[array.length];
		for(int i = 0; i < array.length; i++){
			array2[i] = array[i];
		}
		for(int i = 0; i < array.length-1; i++){
			for(int j = i+1; j < array.length; j++){
				if(array2[i].h < array2[j].h){
					Dia temporario = array2[i];
					array2[i] = array2[j];
					array2[j] = temporario; 
				}
			}
		}
		imprimir(array2);
	}
	
	public static void media(Dia[] array){
		int t=0;
		int h=0;
		for(int i = 0; i < array.length; i++){
			t = t + array[i].t;
			h = h + array[i].h;
		}
		System.out.printf("O valores medios:\nTempreatura: %2d\nHumidade: %3d%%\n", t/array.length, h/array.length);
	}
	public static void minMax(Dia[] array){
		int tmax = -10;
		int tmin = 40;
		int hmax = 0;
		int hmin = 100;
		for(int i = 0; i < array.length; i++){
			if(array[i].t > tmax)tmax = array[i].t;
			if(array[i].t < tmin)tmin = array[i].t;
			if(array[i].h > hmax)hmax = array[i].h;
			if(array[i].h < hmin)hmin = array[i].h;
		}
		System.out.printf("Temperatura Maxima: %2d\nTemperatura Minima: %2d\nHumidade Maxima: %2d\nHumidade Minima: %2d\n",tmax, tmin, hmax, hmin);
	}
	public static void printNTimes(String s, int n){
		for(int i = 0; i < n; i++){
			System.out.print(s);
		}
	}
	
	public static void histograma(Dia[] array){
		System.out.println("Histograma de Temperaturas");
		printNTimes("-", 25);
		for(int i = -10; i < 41; i++){
			System.out.printf("\n%3d | ", i);
			int count = 0;
			for(int j = 0; j < array.length; j++){
				if(array[j].t == i)count++;
			}
			printNTimes("*", count);
		}
		System.out.println();
		System.out.println();
		System.out.println("Histograma de Humidades");
		printNTimes("-", 25);
		for(int i = 0; i < 101; i++){
			System.out.printf("\n%3d%% | ", i);
			int count = 0;
			for(int j = 0; j < array.length; j++){
				if(array[j].h == i)count++;
			}
			printNTimes("*", count);
		}
	}
	
}

class Dia{
	int t;
	int h;
	
	Dia(int t1, int h1){
		t=t1;
		h=h1;
	}
}
