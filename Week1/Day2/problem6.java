//Problem - 6: Group Anagrams

//Question

//T.C : O(n) -> This approch proccess each elemnt through array exactly once 
//S.C : O(n) -> Extra space utilised for creating map which iterates through each element

//Solution

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class problem6 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String ,List<String>>  map = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            if(!map.containsKey(sortedWord)){
                map.put(sortedWord,new ArrayList<>());
            }
            map.get(sortedWord).add(word);
        }
        return new ArrayList<>(map.values());
        
    }
}
