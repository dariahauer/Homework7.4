public class Even {

    public void passEvenNumbers() {
        int i = 0;
        int sum = 0;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sum += i;
            }
            i++;
        }
        System.out.println();
        System.out.println("Sum : " + sum);
    }
}

