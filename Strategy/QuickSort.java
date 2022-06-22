public class QuickSort<E> implements Sort<E> {


    public void sort(E[] array) {
        int pivot = array.length / 2;
        int last = array.length - 1;

        if (array.length == 2) {
            return;
        }

        for (int i = 0; i <= pivot; i++) {

            if (array[i].compareTo(array[last]) == 1) {

                    E tmp = array[i];
                    array[i] = array[last];
                    array[last] = tmp;
            }
            last--;
        }

        sort(array[0..pivot]);
        sort(array[pivot+1 , last + 1]);

    }



    public static void main(String[] args) {

        Sort<String> sort = new QuickSort<>();
    }

}