public class main {
    public  static String result = "";
    public static void main(String[] args) {
        int[] array = program.CreateArray(10);
        array = program.array(array, -10, 10);
        String printArray = program.PrintArray(array);
        System.out.println(printArray);
        program.MergeSort(array);
        System.out.println(result);
    }
}