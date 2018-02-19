package hello.ZerosToEnd;

public class ZeroMover {
    public void Move (int[] arr){
        int head =0;
        int tail = arr.length;

        while (head<tail){
            if (arr[head] == 0){
                tail--;
                while(arr[tail]==0){
                    tail--;
                }
                int tmp = arr[tail];
                arr[tail]=arr[head];
                arr[head]=tmp;
            }
            head++;
        }
    }
}