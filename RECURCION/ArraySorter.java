public class ArraySorter { //Se encarga de ordenar un arreglo utilizando los algoritmos QuickSort y MergeSort, y de mostrar los resultados

    private int[] arregloOriginal;
    private int[] arregloQuickSort;
    private int[] arregloMergeSort;

    private QuickSorter quickSorter;
    private MergeSorter mergeSorter;

    public ArraySorter(int[] datos) { //Constructor que recibe un arreglo de datos y lo prepara para ser ordenado utilizando QuickSort y MergeSort
        quickSorter = new QuickSorter();
        mergeSorter = new MergeSorter();
        cargarArreglo(datos);
    }

    public void cargarArreglo(int[] datos) { //Método para cargar el arreglo original y crear copias para QuickSort y MergeSort
        arregloOriginal  = copiar(datos);
        arregloQuickSort = copiar(datos);
        arregloMergeSort = copiar(datos);
    }

    private int[] copiar(int[] origen) { //Método para crear una copia de un arreglo, para que cada algoritmo de ordenamiento trabaje con su propia copia del arreglo original
        int[] copia = new int[origen.length];
        for (int i = 0; i < origen.length; i++) {
            copia[i] = origen[i];
        }
        return copia;
    }

    private String arregloATexto(int[] arreglo) { //Método para convertir un arreglo de enteros en una cadena de texto con formato de lista, para facilitar su visualización al mostrar los resultados
        String texto = "[";
        for (int i = 0; i < arreglo.length; i++) {
            texto = texto + arreglo[i];
            if (i < arreglo.length - 1) {
                texto = texto + ", ";
            }
        }
        texto = texto + "]";
        return texto;
    }

    public void mostrarOriginal() { //Muestra el arreglo original antes de ser ordenado
        System.out.println("Arreglo original: " + arregloATexto(arregloOriginal));
    }

    public void ordenarConQuickSort() { //Ordena el arreglo utilizando el algoritmo QuickSort y muestra el resultado
        quickSorter.ordenar(arregloQuickSort, 0, arregloQuickSort.length - 1);
        System.out.println("QuickSort: " + arregloATexto(arregloQuickSort));
    }

    public void ordenarConMergeSort() { //Ordena el arreglo utilizando el algoritmo MergeSort y muestra el resultado
        mergeSorter.ordenar(arregloMergeSort, 0, arregloMergeSort.length - 1);
        System.out.println("MergeSort: " + arregloATexto(arregloMergeSort));
    }

    public void mostrarComparacion() { //Muestra una comparación de los resultados obtenidos con QuickSort y MergeSort, junto con el arreglo original para facilitar la comparación visual de los resultados
        System.out.println("RESULTADOS");
        System.out.println("Arreglo original  : " + arregloATexto(arregloOriginal));
        System.out.println("QuickSort : " + arregloATexto(arregloQuickSort));
        System.out.println("MergeSort : " + arregloATexto(arregloMergeSort));
        System.out.println("------------------------------------------------");
    }
}