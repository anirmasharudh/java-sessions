public class ValidateName {
    public static void main(String[] args) {
        System.out.println(ValidateName("Anirudh Sharma"));

    }

    public static boolean ValidateName(String name){
        for (char c:name.toLowerCase().toCharArray()) {
            if (c != ' ') {
                if (c < 'a' || c > 'z')
                    return false;
            }
        }
        return true;
    }
}
