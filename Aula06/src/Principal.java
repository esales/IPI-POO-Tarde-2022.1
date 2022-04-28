
public class Principal {

	public static void main(String[] args) {
		int[] vetor;
		vetor = new int[20];
		
		vetor[0] = 50;
		vetor[1] = 75;
		vetor[2] = 100;
		
//		System.out.println(vetor[0]);
//		System.out.println(vetor[1]);
//		System.out.println(vetor[2]);
//		System.out.println(vetor[3]);
//		
		vetor[1] = 100;
		//System.out.println( vetor[1] );
		
		
		//ArrayIndexOutOfBoundsException
		//vetor[20] = 50;
		
		
		int vetor2[] = {10, 20, 30, 40, 50};
		
//		System.out.println(vetor2[0]);
//		System.out.println(vetor2[1]);
//		System.out.println(vetor2[2]);
//		System.out.println(vetor2[3]);
		
		
		for(int i=0; i <= vetor.length-1; i++ ) {
			
			System.out.println( vetor[i] );
		
		}
		
	}

}
