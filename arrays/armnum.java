import java.util.*;

public class armnum {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter a number to check if is an Armstrong number: ");
        int n=inp.nextInt();

        int r;
        int temp=n;
        int sum=0;
        while (n>0) {
            r=n%10;
            n=n/10;
            sum+=r*r*r;
        }
        if(temp==sum){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number.");
        }
    }
}
