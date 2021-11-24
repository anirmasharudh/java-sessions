import java.util.Arrays;

public class ThomasDemo {
    public static void main(String[] args) {
        int a[] = {-1,-3};
        System.out.println(solution(a));

    }

    public static int solution(int a[]){
        int max = Arrays.stream(a).max().getAsInt();
        if (max<=0)
            return 1;
        a=Arrays.stream(a).distinct().sorted().toArray();
        for (int i = 0; i<a.length; i++){
            if(a[i+1]-a[i]!=1){
                return a[i]+1;
            }
        }

        return max+1;
    }
}
