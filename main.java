public class main {
    public  static String result = "";
    public static void main(String[] args) {
        int[] array = program.createArray(30);
        array = program.array(array, 0, 100);
        String printArray = program.printArray(array);
        System.out.println(printArray);
        program.mergeSort(array);
        System.out.println(result);
    }
}
