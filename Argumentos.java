public class Argumentos{
	public static void main (String [] args){
		for(int i = 0 ;i < args.length; i++){
			System.out.println("args["+i+"] =" + args[i]);
		}

		// Argumentos 3 + 5
		// Primer parametro = operacion
		// Segundo y Tercer parametros = 2 3
		int resultado = 0;
		char operacion = args[1].charAt(0); // String "+"

		switch(operacion){
			case '+':
				resultado = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); 
			break;
			case '-':
				resultado = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); 
			break;
			case '*':
				resultado = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); 
			break;
			case '/':
				resultado = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); 
			break;
		}

		System.out.println(args[0]+operacion+args[2]+" = " + resultado);
	}
}