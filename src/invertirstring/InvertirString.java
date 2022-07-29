/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package invertirstring;

/**
 *
Descripción de actividad:
Dada una cadena X, devuelve la cadena "invertida" donde todos los caracteres que no son una letra permanecen en el mismo lugar y todas las letras invierten sus posiciones.
Ejemplo 1:
Input: "ab-cd"
Output: "dc-ba"

Ejemplo 2:
Input: "a-bC-dEf=ghlj!!"
Output: "j-lh-gfE=dCba!!"

 * @author Developer
 */
public class InvertirString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        invertir("a-bC-dEf=ghlj!!");
    }

public static String invertir(String entradaTexto){
    String resultado;
    char textoArray[] = entradaTexto.toCharArray();
    char textoResultado[] = entradaTexto.toCharArray();
    int cont=0;
    for(int x=0;x<textoArray.length/2;x++){
        if(((textoArray[x]>=65 && textoArray[x]<=90) || (textoArray[x]>=97 && textoArray[x]<=122))){      
            for(int y=cont;y<(textoArray.length/2);y++){
               int posInv = (textoArray.length - y - 1);
                if(((textoArray[posInv]>=65 && textoArray[posInv]<=90) || (textoArray[posInv]>=97 && textoArray[posInv]<=122))){
                   char letraTemp=textoArray[posInv];
                   //textoResultado[posInv]=textoResultado[x];
                   textoResultado[x]=letraTemp;
                   cont++;
                   break;
                }
            }
        }
    }
    System.out.println(textoResultado);
    resultado=textoResultado.toString();
  //  System.out.println(resultado);
    return resultado;
}
    
}
