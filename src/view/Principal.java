package view;

import controller.quickCont;

public class Principal {

	public static void main(String[] args) {
		int[] vetor1 = {74 ,20 ,74 ,87 ,81 ,16 ,25 ,99 ,44 ,58};
		int[] vetor2 = {44,	43,	42,	41,	40,	39,	38};
		int[] vetor3 = {31,	32,	33,	34,	99,	98,	97,	96};
		quickCont quick = new quickCont();
		vetor1 = quick.quickSort(vetor1,0,vetor1.length-1);
		vetor2 = quick.quickSort(vetor2,0,vetor2.length-1);
		vetor3 = quick.quickSort(vetor3,0,vetor3.length-1);
		System.out.println("");
		System.out.println("======================================================");
		for  (int valor:vetor1) {
			System.out.print(valor+" ");
			
		}
		System.out.println("");
		for  (int valor:vetor2) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		for  (int valor:vetor3) {
			System.out.print(valor+" ");
		}
		System.out.println("");
		System.out.println("======================================================");

	}

}