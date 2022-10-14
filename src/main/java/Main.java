public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        String first = "1000"; //8
        String second = "10100"; //20

        String sumOfBinary = bins.sum(first, second);
        String multOfBinary = bins.mult(first, second);
        System.out.println("Сумма бинарных чисел " + first + " и " + second +
                " равняется " + sumOfBinary);
        System.out.println("Произведение бинарных чисел " + first + " и " + second +
                " равняется " + multOfBinary);
    }
}

