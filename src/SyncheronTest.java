package com.example.sampleproject;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SyncheronTest {
    public static void main(String[] args) {
        String s = "ABCDEGFABCDE";
        //find the first non duplicate elements in a string

        HashSet<Character> hashSet= new HashSet<>();
        LinkedHashMap<Character,Integer> hashMap= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            if(!hashMap.containsKey(s.charAt(i))){
                hashMap.put(s.charAt(i),1);
            }else{
                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))+1);
            }
        }
        hashMap.forEach((k,v) -> {
            if(v<2){
                System.out.println(k);
            }
        });

        //find second highest in the array
        int arr[] = {13,17,22,15,27,25};
        int max = 0;
        int smax = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];

            }else if(smax<arr[i]){
                smax=arr[i];
            }
        }
        System.out.println(smax);

    }
}
