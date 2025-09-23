import java.util.ArrayList;

public class ManipulandoArrays {

    // criando um array

    float[] array = new float[6]; // quando queremos definir um array sem elementos
    int[] array2 = {1,2,3,4,5}; // quando definimos os valores do array

    // um array por si só não pode ser alterado nem adicionar mais elementos nele
    //para isso usamos o array list

    public static void main(String[] args) {

        ArrayList<Float> array3 = new ArrayList<Float>();
        array3.add(3.5f);
        array3.add(5.85f);
        array3.add(9.85f); //adiciona elemento
        System.out.println(array3);
        System.out.println(array3.indexOf(5.85f)); // mostra o endereço do elemento
        System.out.println(array3.get(2)); //mostra o elemento no indice indicado
        array3.remove(5.85f); // remove o elemento

        System.out.println(array3);

    }

}
