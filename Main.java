package pacote;

import java.util.Scanner;

/**
 *
 * @author guest-Yde8KX
 */
public class Main {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);    
        Fila fila = new Fila(); 
        System.out.println("Digite o tamanho da fila");
        fila.setN(r.nextInt());
        System.out.println("Quando a fila encher, deseja que ela duplique (0) ou aumente constantemente? \n Caso escolha a segunda op��o, digite o valor da constante:");
        fila.setAumento(r.nextInt());
        fila.enfileirar(1);
        fila.listar();
        fila.enfileirar(2); 
        fila.listar();
        fila.enfileirar(3); 
        fila.listar();
        try {
			fila.desinfileirar();
		} catch (EFilaVazia e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        fila.listar();
    }
}
