public class Q2{
    public static void main(String[] args){
        int num = 121;
        System.out.println(numPal(num));
    }
    public static boolean numPal(int x){
        int sum = 0, temp;
        temp = x;
        while(x>0){
            sum = (sum*10)+x%10;
            x=x/10;
        }
        if(sum == temp) return true;
        else return false;
    }
}