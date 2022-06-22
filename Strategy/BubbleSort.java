
public class BubbleSort<E> implements Sort<E> {



    public void sort(E[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = i;  j < array.length; j++) {

                if (array[i].comparTo(array[j]) == 1) {

                    E tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                    
                }
            }
        }
    }
}