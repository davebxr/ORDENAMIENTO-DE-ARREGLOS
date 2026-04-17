//Actividad: Clase de ordenamiento de arreglos usando QuickSort y MergeSort
//Nombres: Edgar David Acosta Bernal y Cristian Felipe Ortiz Cucunuba

public class Main { //Clase principal que contiene el método main para ejecutar el programa de ordenamiento de arreglos utilizando QuickSort y MergeSort

    public static void main(String[] args) {

        System.out.println("1: Arreglo desordenado ");
        int[] datos1 = {45, 12, 78, 3, 56, 23, 89, 1, 67, 34};
        ArraySorter sorter1 = new ArraySorter(datos1);
        sorter1.mostrarOriginal(); //Muestra el arreglo original antes de ser ordenado
        sorter1.ordenarConQuickSort();
        sorter1.ordenarConMergeSort();
        sorter1.mostrarComparacion();

        System.out.println("2: Arreglo con negativos ");
        int[] datos2 = {-10, 5, -3, 8, 0, -7, 15, 2, -1, 9};
        ArraySorter sorter2 = new ArraySorter(datos2);
        sorter2.mostrarOriginal(); 
        sorter2.ordenarConQuickSort();
        sorter2.ordenarConMergeSort();
        sorter2.mostrarComparacion();

        System.out.println("3: Arreglo de un elemento ");
        int[] datos3 = {42};
        ArraySorter sorter3 = new ArraySorter(datos3);
        sorter3.mostrarOriginal();
        sorter3.ordenarConQuickSort();
        sorter3.ordenarConMergeSort();
        sorter3.mostrarComparacion();

        System.out.println("4: Arreglo ya ordenado ");
        int[] datos4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArraySorter sorter4 = new ArraySorter(datos4);
        sorter4.mostrarOriginal();
        sorter4.ordenarConQuickSort();
        sorter4.ordenarConMergeSort();
        sorter4.mostrarComparacion();

        System.out.println("5: Arreglo en orden inverso ");
        int[] datos5 = {100, 80, 60, 40, 20, 10};
        ArraySorter sorter5 = new ArraySorter(datos5);
        sorter5.mostrarOriginal();
        sorter5.ordenarConQuickSort();
        sorter5.ordenarConMergeSort();
        sorter5.mostrarComparacion();
    }
}