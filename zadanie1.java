public class zadanie1 {
    public class Exercise1 {
        /**
         * Metoda filtruje elementy tablicy, pozostawiając tylko te,
         * które znajdują się na parzystych indeksach (0, 2, 4, ...)
         * i jednocześnie są liczbami nieparzystymi.
         *
         * @param array tablica liczb całkowitych
         * @return nowa tablica z przefiltrowanymi elementami
         */
        public static int[] filterEvenIndexOddValue(int[] array) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < array.length; i += 2) {
                if (array[i] % 2 != 0) {
                    result.add(array[i]);
                }
            }
            // konwersja listy do tablicy
            int[] filteredArray = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                filteredArray[i] = result.get(i);
            }
            return filteredArray;
        }
    }
}
