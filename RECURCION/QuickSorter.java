public class QuickSorter { //Se encarga de ordenar un arreglo utilizando el algoritmo QuickSort

    public void ordenar(int[] arreglo, int bajo, int alto) { //Método principal para ordenar el arreglo utilizando QuickSort
        if (bajo < alto) {
            //Se obtiene la posición del pivote después de particionar el arreglo
            int indicePivote = particionar(arreglo, bajo, alto);
            ordenar(arreglo, bajo, indicePivote - 1); //Se ordena la parte del arreglo que está a la izquierda del pivote
            ordenar(arreglo, indicePivote + 1, alto); //Se ordena la parte del arreglo que está a la derecha del pivote
        }
    }

    private int particionar(int[] arreglo, int bajo, int alto) { //Método para particionar el arreglo y obtener la posición del pivote
        int pivote = arreglo[alto];
        int i = bajo - 1;

        for (int j = bajo; j < alto; j++) { //Se recorre el arreglo desde el índice bajo hasta el índice alto - 1
            if (arreglo[j] <= pivote) { //si el valor es menor o igual al pivote esats se intercambian
                i++;
                intercambiar(arreglo, i, j);
            }
        }
        intercambiar(arreglo, i + 1, alto); //Se coloca el pivote en su posición correcta intercambiándolo con el elemento que está en la posición i + 1
        return i + 1;
    }  

    //Método para intercambiar dos elementos en el arreglo
    private void intercambiar(int[] arreglo, int posicionA, int posicionB) {
        int temporal = arreglo[posicionA];
        arreglo[posicionA] = arreglo[posicionB];
        arreglo[posicionB] = temporal;
    }
}