public class MergeSorter { //Se encarga de ordenar un arreglo utilizando el algoritmo MergeSort

    public void ordenar(int[] arreglo, int inicio, int fin) { //Método principal para ordenar el arreglo utilizando MergeSort
        //Se valida que el inicio sea menor que el fin para continuar con la recursión
        if (inicio < fin) { 
            int medio = (inicio + fin) / 2;
            ordenar(arreglo, inicio, medio); //Se ordena la primera mitad del arreglo
            ordenar(arreglo, medio + 1, fin); //Se ordena la segunda mitad del arreglo
            combinar(arreglo, inicio, medio, fin); //Se combinan las dos mitades ordenadas para obtener el arreglo final ordenado
        }
    }

    private void combinar(int[] arreglo, int inicio, int medio, int fin) { //Método para combinar dos mitades ordenadas del arreglo
        //Se calcula el tamaño de las dos mitades del arreglo
        int tamanoIzquierda = medio - inicio + 1;
        int tamanoDerecha = fin - medio;

        //Se crean arreglos temporales para almacenar las dos mitades del arreglo
        int[] arregloIzquierda = new int[tamanoIzquierda];
        int[] arregloDerecha = new int[tamanoDerecha];

        //se copian los elementos de las dos mitades del arreglo original a los arreglos temporales
        for (int i = 0; i < tamanoIzquierda; i++) {
            arregloIzquierda[i] = arreglo[inicio + i];
        }
        for (int j = 0; j < tamanoDerecha; j++) { //Se copia la segunda mitad del arreglo original al arreglo temporal de la derecha
            arregloDerecha[j] = arreglo[medio + 1 + j];
        }

        //Se inicializan índices para recorrer los arreglos temporales y el arreglo original
        int indiceIzquierda = 0;
        int indiceDerecha = 0;
        int indiceArreglo = inicio;

        //Se combinan los elementos de los arreglos temporales de izquierda y derecha en el arreglo original de manera ordenada
        while (indiceIzquierda < tamanoIzquierda && indiceDerecha < tamanoDerecha) {
            if (arregloIzquierda[indiceIzquierda] <= arregloDerecha[indiceDerecha]) {
                arreglo[indiceArreglo] = arregloIzquierda[indiceIzquierda];
                indiceIzquierda++;
            } else {
                arreglo[indiceArreglo] = arregloDerecha[indiceDerecha];
                indiceDerecha++;
            }
            indiceArreglo++;
        }

        //Si quedan elementos en el arreglo temporal de la izquierda, se copian al arreglo original
        while (indiceIzquierda < tamanoIzquierda) {
            arreglo[indiceArreglo] = arregloIzquierda[indiceIzquierda];
            indiceIzquierda++;
            indiceArreglo++;
        }

        while (indiceDerecha < tamanoDerecha) {
            arreglo[indiceArreglo] = arregloDerecha[indiceDerecha];
            indiceDerecha++;
            indiceArreglo++;
        }
    }
}