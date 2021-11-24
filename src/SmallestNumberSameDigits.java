
public class SmallestNumberSameDigits {
    public static void main(String[] args) {
        System.out.println(smallest(125552));
    }

    public static int smallest(int num){
        if (num<10)
            return 0;
        return (int) Math.pow(10,String.valueOf(num).length()-1);
    }
}
