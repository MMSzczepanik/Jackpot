/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jackpot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Yogi
 */
public class Checker {
    
    private Checker(int number){
        this.numbersMap = new HashMap<Integer, String>();
        numbersMap.put(1,"1");
        numbersMap.put(2,"2");
        numbersMap.put(3,"3");
        numbersMap.put(4,"4");
        numbersMap.put(5,"5");
        numbersMap.put(6,"6");
        numbersMap.put(7,"7");
        numbersMap.put(8,"8");
        numbersMap.put(9,"9");
        numbersMap.put(10,"10");
        numbersMap.put(11,"11");
        numbersMap.put(12,"12");
        numbersMap.put(13,"13");
        numbersMap.put(14,"14");
        numbersMap.put(15,"15");
        numbersMap.put(16,"16");
        numbersMap.put(17,"17");
        numbersMap.put(18,"18");
        numbersMap.put(19,"19");
        numbersMap.put(20,"20");
        numbersMap.put(21,"T7");
        numbersMap.put(22,"D11");
        numbersMap.put(24,"D12 (T8)");
        numbersMap.put(26,"D13");
        numbersMap.put(27,"T9");
        numbersMap.put(28,"D14");
        numbersMap.put(30,"D15 (T10)");
        numbersMap.put(32,"D16");
        numbersMap.put(33,"T11");
        numbersMap.put(34,"D17");
        numbersMap.put(36,"D18");
        numbersMap.put(38,"D19");
        numbersMap.put(39,"T13");
        numbersMap.put(40,"D20");
        numbersMap.put(42,"T14");
        numbersMap.put(45,"T15");
        numbersMap.put(48,"T16");
        numbersMap.put(50,"BULL");
        numbersMap.put(51,"T17");
        numbersMap.put(54,"T18");
        numbersMap.put(57,"T19");
        numbersMap.put(60,"T20");
        
        this.number = number;
   
    }
    
    public static void main(String[] args) {
    
        System.out.print(Checker.getChecksList(121));
    }
    
 
    public static List getChecksList(int number){
        Checker chr = new Checker(number);
        List<String> checksList = new ArrayList<String>();
        int tmp_number;
        
        
        for(int i :chr.numberList){
            tmp_number = number-i;
            if(tmp_number==0){
                    checksList.add(chr.numbersMap.get(i) + "\n");
                    break;
                }
            
            for(int j :chr.numberList ){
                tmp_number = number -i - j;
                if(tmp_number==0){
                    checksList.add(chr.numbersMap.get(i) + " - " + chr.numbersMap.get(j) + "\n");
                    break;
                }
                
                for(int k :chr.numberList){
                    tmp_number = number -i -j - k;
                    if(tmp_number==0){
                         checksList.add(chr.numbersMap.get(i) + " - " + chr.numbersMap.get(j) + " - " + chr.numbersMap.get(k) + "\n");
                    }
                    
                }
            }
        }
        if(checksList.isEmpty()) checksList.add("Not possible");
        
        return checksList;
    }
    
    private int [] numberList = {50,60,57,54,51,48,45,42,40,39,38,36,34,33,32,30,28,27,26,24,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
    private int number; 
    private Map<Integer,String> numbersMap;
    
}
