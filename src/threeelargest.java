public class threeelargest {
    static void main(String[] args) {
        int a=20;
        int b=23;
        int c=10;

        if(a>b && a>c){
            System.out.println(a+" Number is Largest");
        } else if (b>a && b>c) {
            System.out.println(b+"Number is Largest");
        }
        else {
            System.out.println(c+"Number is Largest");
        }
    }
}
