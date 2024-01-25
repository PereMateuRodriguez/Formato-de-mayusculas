public class Main {
  public static void main(String[] args) {
// Lo que hace este codigo es pasar de "Hola_buenas_tardes" ===> "HolaBuenasTardes"
    
    String cadena = "pedro-obtuvo-un-5_en-su-examen-de-C#";
	
    cadena = cadena.replace('-', ' ');
    cadena = cadena.replace('_', ' ');
    //Agago una cadena de todas las palabras de la frase
    String [] palabras = cadena.split(" ");
	
    //Hacer mayuscula cade primera letra de la palabra
    String resultado = "";
	for (int i=1; i<palabras.length; i++){
    resultado += palabras[i].substring(0,1).toUpperCase() + 	palabras[i].substring(1);
    resultado += " ";
}
//Cogo solo la primera palabra de la lista i luego la uno
	String a = "";
	a += palabras[0].substring(0, palabras[0].length());
	resultado = a + "" + resultado;
    resultado = resultado.replace(" ", "");
    
	System.out.println(resultado);


    
  }
}
