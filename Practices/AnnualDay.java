
public class AnnualDay {
    public static int student(int i1, int arr[]) {
        int tp = 0;
        for(int i=0; i<i1; i++) {
            for(int j=i; j<i1; j++) {
                if(arr[i] > arr[j]) {
                    tp++;
                }
            }
        }
        return tp;
    }
    public static void main(String[] args) {
        int i1 = 5;
        int arr[] = {1, 1, 3, 6, 2};
        System.out.print(student(i1, arr));
    }
}
