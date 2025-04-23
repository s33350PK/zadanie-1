public class zadnie3 {
}public class Exercise3 {
    /**
     * Metoda wykonuje rotację elementów tablicy o podaną liczbę miejsc.
     *
     * @param array tablica liczb całkowitych
     * @param positions liczba miejsc do przesunięcia
     * @return nowa tablica po wykonaniu rotacji
     */
    public static int[] rotateArray(int[] array, int positions) {
        int n = array.length;
        if (n == 0) return new int[0];
        int[] rotated = new int[n];
        positions = positions % n;
        for (int i = 0; i < n; i++) {
            int newPosition = (i + positions) % n;
            rotated[newPosition] = array[i];
        }
        return rotated;
    }
}
