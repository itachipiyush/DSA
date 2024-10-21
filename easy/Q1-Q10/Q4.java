public class Q4 {
    public int romanToInt(String s){
        int num = 0;
        int cur = 0;
        int prev = 0;
        for(int i=s.length()-1;i>=0;--i){
            switch(s.charAt(i)){
                case 'I': cur = 1; break;
                case 'V': cur = 5; break;
                case 'X': cur = 10; break;
                case 'L': cur = 50; break;
                case 'C': cur = 100; break;
                case 'D': cur = 500; break;
                case 'M': cur = 1000; break;
                default: throw new IllegalArgumentException("Invalid Roman numeral");
            }
            if(cur < prev) num-=cur;
            else num+=cur;
            prev = cur;

        }
        return num;
    }
    
    public static void main(String[] args){
        Q4 q = new Q4();
        System.out.println(q.romanToInt("III")); // 3
        System.out.println(q.romanToInt("IV")); // 4
        System.out.println(q.romanToInt("IX")); // 9
        System.out.println(q.romanToInt("LVIII")); // 58
        System.out.println(q.romanToInt("MCMXCIV")); // 1994
    }
}
