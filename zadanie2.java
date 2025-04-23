public class zadanie2 {
}public class Exercise2 {

    /**

     * Metoda znajduje element dominujący w tablicy liczb całkowitych.

     * Element dominujący to taki, który występuje więcej niż n/2 razy,

     * gdzie n to długość tablicy.

     *

     * @param array tablica liczb całkowitych

     * @return element dominujący lub -1, jeśli nie istnieje

     */

    public static int findDominant(int[] array) {

        Map<Integer, Integer> countMap = new HashMap<>();

        int threshold = array.length / 2;

        for (int num : array) {

            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if (countMap.get(num) > threshold) {

                return num;

            }

        }

        return -1;

    }

}

