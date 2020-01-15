public class MultiplesOf3And5 {

    public long sumOfMultiples(int number) {
        long multipleSum = 0;

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (multipleSum + i > 2147483647) {
                    multipleSum = 2147483647;
                } else {
                    multipleSum += i;
                }
            }
        }
        System.out.println(multipleSum);
        return multipleSum;
    }
}
