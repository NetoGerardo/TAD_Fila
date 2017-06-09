package pacote;

/**
 *
 * @author Gerardo
 */
public class Fila implements InterfaceFila {

    private int n, i, f,aumento;
    private Object[] array;
    private boolean lotou = false;
    
    public void setAumento(int aumento){
    	this.aumento = aumento;
    }
    
    public Object[] getArray(){
        return array;
    }
    
    public void setN(int n){
        this.n = n;
        this.array = new Object[n];
    }

    public int tamanho() {
        return (n - i + f) % n;
    }

    public boolean estaVazia() {
        if (i == f) {
            return true;
        }
        return false;
    }

    public Object inicio() throws EFilaVazia {
        if(estaVazia()) {
            throw new EFilaVazia();
        }
        return array[i];
    }

    public void enfileirar(Object o){
        if(tamanho() == n-1){
            int auxI = i;
            Object[] novoArray;
            if(aumento == 0){
            	novoArray = new Object[n*2];
            }else{
            	novoArray = new Object[n+aumento];
            }            
            int j;
            for(j = 0; j < n-1 ; j++,auxI = (auxI+1)%n){
                novoArray[j] = array[auxI];
            }
            if(aumento == 0){
            	n = n*2;
            }else{
            	n = n+aumento;
            }            
            array = novoArray;
            f = j;
        }
            array[f] = o;
            f = (f+1)%n;
    }
   

    public Object desinfileirar() throws EFilaVazia {
        if(estaVazia()){
            throw new EFilaVazia();
        }
        Object o = array[i];
        array[i] = null;
        i = (i+1)%n;
        return o;
    }
    
    public void listar(){
        System.out.println("<<<LISTANDO>>>");
        for (int j = 0; j < array.length; j++) {
            System.out.println(j+" - "+array[j]);
        }
        System.out.println("<<<-------->>>");
    }

}