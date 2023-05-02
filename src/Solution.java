public class Solution {
    public static int romanToInt(String s){
        if(s.length()==0)return 0;
        if(s.charAt(0)=='M')return romanToInt(s.substring(1))+1000;
        if(s.charAt(0)=='D')return romanToInt(s.substring(1))+500;
        if(s.charAt(0)=='C'){
            if (s.length()>1 && s.charAt(1) == 'M') return romanToInt(s.substring(2)) + 900;
            if (s.length()>1 && s.charAt(1) == 'D') return romanToInt(s.substring(2) )+400;
            else return romanToInt(s.substring(1))+100;
        }
        if(s.charAt(0)=='L')return romanToInt(s.substring(1))+50;
        if(s.charAt(0)=='X'){
            if (s.length()>1 && s.charAt(1) == 'C') return romanToInt(s.substring(2)) + 90;
            if (s.length()>1 && s.charAt(1) == 'L') return romanToInt(s.substring(2) )+40;
            else return romanToInt(s.substring(1))+10;
        }
        if(s.charAt(0)=='V')return romanToInt(s.substring(1))+5;
        if(s.charAt(0)=='I'){
            if (s.length()>1 && s.charAt(1)=='X')return romanToInt(s.substring(2))+9;
            if (s.length()>1 && s.charAt(1) == 'V')return romanToInt(s.substring(2)) + 4;
            else return romanToInt(s.substring(1))+1;
        }
        return 0;
    }
    public static String intToRoman(int num){
        if(num==0)return "";
        if(num>=1000)return "M".concat(intToRoman(num-1000));
        if(num>=900)return "CM".concat(intToRoman(num-900));
        if(num>=500)return "D".concat(intToRoman(num-500));
        if(num>=400)return "CD".concat(intToRoman(num-400));
        if(num>=100)return "C".concat(intToRoman(num-100));
        if(num>=90)return "XC".concat(intToRoman(num-90));
        if(num>=50)return "L".concat(intToRoman(num-50));
        if(num>=40)return "XL".concat(intToRoman(num-40));
        if(num>=10)return "X".concat(intToRoman(num-10));
        if(num==9)return "IX";
        if(num>=5)return "V".concat(intToRoman(num-5));
        if(num==4)return "IV";
        if(num>=1)return "I".concat(intToRoman(num-1));
        return "";
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MDXXXIII"));
        System.out.println(intToRoman(14));
    }
}
