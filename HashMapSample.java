package com.bpe.map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class HashMapSample{

    public static void main(String[] args) {
        
    	//text
        String text = "Java is a programming language that is class-based, " +
        		"object-oriented, and is intended to let application developers " +
        		"\"write once, run anywhere\", meaning that code that runs on " +
        		"one platform does not need to be recompiled to run on another.";
        
        //chars
        char[] chars = text.toCharArray();
        
        //charMap
        Map<Character, AtomicInteger> charMap = new HashMap<Character, AtomicInteger>();
        // Use of AtomicInteger:
        // As an atomic counter that can be used by many threads concurrently => faster performance
        
        //Calcular frecuencia de caracteres
        for (int i = 0; i < chars.length; i++) {
            Character ch = chars[i];
            AtomicInteger count = charMap.get(ch);
            if (count == null) {
                count = new AtomicInteger();
                charMap.put(ch, count);
            }
            count.incrementAndGet();
        }

        //Recorrer y mostrar entradas del Map (key, value)
        for (Map.Entry<Character, AtomicInteger> e : charMap.entrySet()) {
            System.out.println("Caracter '" + e.getKey() + "': " + e.getValue() + " veces");
        }
        
        //Ordenar charMap por 'value' de mayor a menor nº ocurrencias
        Comparator<Integer> invComp = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        
        Map<Integer, Set<Character>> freqMap = new TreeMap<Integer, Set<Character>>(invComp);
        for (Map.Entry<Character, AtomicInteger> e : charMap.entrySet()) {
            Character ch = e.getKey();
            Integer count = e.getValue().intValue();
            Set<Character> charSet = freqMap.get(count);
            if (charSet == null) {
                charSet = new TreeSet<Character>();
                freqMap.put(count, charSet);
            }
            charSet.add(ch);
        }
        
        for (Map.Entry<Integer, Set<Character>> e : freqMap.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }
}
