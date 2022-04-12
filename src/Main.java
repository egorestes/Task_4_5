public class Main {

    public static void main(String[] args) {
        int[] data1 = new int[] {10,9,8,7,6,5,4,3,2,1}; // fix: 9 7 5 3 1
        int[] data2 = new int[] {7,10,3,8,7,2,1,9,5,7}; // fix: 10 7 2 5
        boolean[] fixed1 = new boolean[] {false, true, false, true, false, true, false, true, false, true};
        boolean[] fixed2 = new boolean[] {false, true, false, false, true, true, false, false, true, false};

        System.out.println("Data1:");
        printArray(data1);
        sort(data1, fixed1);
        printArray(data1);

        System.out.println("\nData2:");
        printArray(data2);
        sort(data2, fixed2);
        printArray(data2);
    }
    private static void printArray(int[] data) {
        StringBuilder s = new StringBuilder("[");
        for (int obj: data) {
            s.append(obj).append(", ");
        }
        String st = s.toString().substring(0, s.length() - 2) + "]";
        System.out.println(st);
    }
    private static <T extends Comparable<T>> void sort(int[] data, boolean[] fixed) {
        for(int i = 0; i < data.length; i++) {
            if(fixed[i]) {
                continue;
            }
            for(int j = i + 1; j < data.length; j++) {
                if(fixed[j]) {
                    continue;
                }
                if(data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}