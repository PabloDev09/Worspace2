package ejemplosenclase;

public class VariablesLocalesGlobales {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		
		if(i==0) {
			
			int j = 2;
			j = 3;
		}
		// j = 5 no se podria utilizar fuera del bloque de codigo que pertenece la inicializacion de la variable j
	}

}
