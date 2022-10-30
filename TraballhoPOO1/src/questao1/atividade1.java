package questao1;

public class atividade1 {
	public static void main(String[] args) {
		
		int A []={1,2,3,4,5,6,7,8,9,10};
		int B []=new int[10];
		int resultado;
		
		for(int i=0;i < A.length;i++){
			resultado=A[i]*i;
			B[i]=resultado;
			
			System.out.println("Vetor A: "+A[i]+" Vetor B:  "+i+" Multiplicado por sua posicao "+i+" o valor e: "+B[i]);			
		}
	}

}
