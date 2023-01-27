public class TilingProblm {

    public static int tilingProblem(int n){
        // base case
        if (n == 0 || n == 1){
            return 1;
        }
        //Kaam- Making choise
        // vertical choice
        // int fnm1 = tilingProblem(n-1);

        // // horizontal choice
        // int fnm2 = tilingProblem(n-2);
        // int totWays = fnm1 + fnm2;
        // return totWays;

        // writing the above code in optimize way(BEST)
        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(tilingProblem(5));;
    }
}
