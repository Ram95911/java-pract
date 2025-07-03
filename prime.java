
import java.util.*;

class prime {
   public static void main(String[] args) {
    Scanner inp=new Scanner(System.in);
    System.out.println("Enter number to check prime number: ");
    int num=inp.nextInt();
    // int num=7;
    int count=0;
    for(int i=1;i<=num;i++){
        if(num%i==0){
            count++;
        }
    }
    if(count==2){
        System.out.println(num+" is prime number.");
    }
    else{
        System.out.println(num+" is not prime number.");
    }
   } 
}
