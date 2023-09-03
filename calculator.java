import java.util.Scanner;
class Calculator{
    public static void main(String args[]){
    int n=1;
    Scanner sc= new Scanner(System.in);
    while(n==1){
        System.out.println("enter the operand 1");
        int x=sc.nextInt();
        System.out.println("enter the operand 2");
        int y=sc.nextInt();
        System.out.println("enter 1 for-addition,2-subtracton,3-multiplication,4-divison,5-to get remainder");
        int k=sc.nextInt();
         
        switch(k){
            case 1:
            System.out.println( x+"+"+y+"="+(x+y));
            break;
            case 2:
            System.out.println(x+"-"+y+"="+(x-y));
            break;
            case 3:
            System.out.println(x+"*"+y+"="+x*y);
            break;
            case 4:
            System.out.println(x+"/"+y+"="+ (float)(x/y));
            break;
            case 5:
            System.out.println(x+"%"+y+"="+(x%y));
            break;
            default:
            System.out.println("enter the valid option");}
            
        
            System.out.println("if you want continue press 1 and exit press 2");
             n=sc.nextInt();
        
        
    }

        
    }
}