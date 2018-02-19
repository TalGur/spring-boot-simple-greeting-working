package hello.ArraySummarizer;

public class ArraySummarizer {
    public int Summarize (int[] arr){
        int sum =0;

        if (arr ==null) {
            return sum;
        }

        for (int anArr : arr) {
            sum += anArr;
        }
        return sum;
    }
}
