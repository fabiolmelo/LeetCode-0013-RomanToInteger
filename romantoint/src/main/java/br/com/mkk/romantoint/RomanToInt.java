package br.com.mkk.romantoint;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    
    
    public static int romanToIntUsingVar(String roman){
        
        int result = 0;
        int length = roman.length();

        Map<Character, Integer> romanMap = new HashMap<Character, Integer>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X',10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        for (int i=0;i<length-1;i++){
            int currentValue = romanMap.get(roman.charAt(i));
            if (currentValue < romanMap.get(roman.charAt(i+1))){
                result -= currentValue;                
            } else{
                result += currentValue;                
            }
        }
        return result + romanMap.get(roman.charAt(length-1));
    }
}
