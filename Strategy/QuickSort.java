
public class QuickSort<E extends Comparable<E>> implements Sort<E> {


    public void sort(E[] array) {

        qSort(array, 0, array.length - 1);
    }

    private void qSort(E[] array, int  left, int right) {
        if (left < right) {
            int pivot = internalSort(array, left, right);
            qSort(array, left, pivot);
            qSort(array, pivot + 1, right);
        }
    }


    private int internalSort(E[] array, int left, int right) {

        int pIndex = (right - left) / 2;
        E pivot = array[pIndex];
        int i = left;
        int j = right;

        while (i < j) {

            for (; i < right; i++) {
                if (array[i].compareTo(pivot) == 1) {
                    break;
                }
            }

            for (; j > left; j--) {
                if (array[j].compareTo(pivot) == -1 || array[j].compareTo(pivot) == 0) {
                    break;
                }
            }

            if (array[i].compareTo(array[j]) == 1) {
                E tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
            }

        }


        return pIndex;
    }

    //Vorteile: 
    // - Interfaceimplementierung macht Client unabhängig von konreter Implementierung
   // - Kapselung des konkreten Algorithmus, fördert Übersichtlichkeit und Wartbarkeit
   // -  Wiederverwendbarkeit
    // - Neue Algorithmen einfach hinzufügbar
    //Nachteile: Strategy Pattern
    // - Viele Klassen nötig, müssen zumindest im Resolver bekannt sein.


}