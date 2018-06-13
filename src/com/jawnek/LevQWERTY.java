package com.jawnek;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LevQWERTY {



    public static double levQWERTY(String s1, String s2) {

        Map<String, Set> map = generateMap();
        int i, j, m, n;
        double cost = 0;
        double d[][];

        m = s1.length();
        n = s2.length();

        d = new double[m+1][n+1];

        for (i=0; i<=m; i++)
            d[i][0] = i;
        for (j=1; j<=n; j++)
            d[0][j] = j;

        for (i=1; i<=m; i++)
        {
            for (j=1; j<=n; j++)
            {
                if (s1.charAt(i-1) == s2.charAt(j-1))
                    cost = 0;
                else{
                    if(map.get(String.valueOf(s1.charAt(i-1))).contains(String.valueOf(s2.charAt(j-1)))){
                        cost = 0.5;
                    }else{
                        cost = 1;
                    }
                }
                d[i][j] = Math.min(d[i-1][j] + 1, Math.min(d[i][j-1] + 1, d[i-1][j-1] + cost));
            }
        }
        return d[m][n];
    }

    private static Map<String, Set> generateMap(){
        Map<String, Set> map = new HashMap();
        Set<String> set = new HashSet<>();

        set.add("w");
        map.put("q", set); //Q

        set = new HashSet<>();
        set.add("e");
        set.add("q");
        map.put("w", set); //W


        set.add("w");
        set.add("r");
        map.put("e", set); //E
        set = new HashSet<>();

        set.add("t");
        set.add("e");
        map.put("r", set); //R
        set = new HashSet<>();

        set.add("y");
        set.add("r");
        map.put("t", set); //T
        set = new HashSet<>();

        set.add("u");
        set.add("t");
        map.put("y", set); //Y
        set = new HashSet<>();

        set.add("i");
        set.add("y");
        map.put("u", set); //U
        set = new HashSet<>();

        set.add("u");
        set.add("o");
        map.put("i", set); //I
        set = new HashSet<>();

        set.add("i");
        set.add("p");
        map.put("o", set); //O
        set = new HashSet<>();

        set.add("o");
        map.put("p", set); //P
        set = new HashSet<>();

        set.add("s");
        map.put("a", set); //A
        set = new HashSet<>();

        set.add("d");
        set.add("a");
        map.put("s", set); //S
        set = new HashSet<>();

        set.add("s");
        set.add("f");
        map.put("d", set); //D
        set = new HashSet<>();

        set.add("g");
        set.add("d");
        map.put("f", set); //F
        set = new HashSet<>();

        set.add("f");
        set.add("h");
        map.put("g", set); //G
        set = new HashSet<>();

        set.add("g");
        set.add("j");
        map.put("h", set); //H
        set = new HashSet<>();

        set.add("k");
        set.add("h");
        map.put("j", set); //J
        set = new HashSet<>();

        set.add("l");
        set.add("j");
        map.put("k", set); //K
        set = new HashSet<>();

        set.add("k");
        map.put("l", set); //L
        set = new HashSet<>();

        set.add("x");
        map.put("z", set); //Z
        set = new HashSet<>();

        set.add("c");
        set.add("z");
        map.put("x", set); //X
        set = new HashSet<>();

        set.add("x");
        set.add("v");
        map.put("c", set); //C
        set = new HashSet<>();

        set.add("b");
        set.add("c");
        map.put("v", set); //V
        set = new HashSet<>();

        set.add("n");
        set.add("v");
        map.put("b", set); //B
        set = new HashSet<>();

        set.add("m");
        set.add("b");
        map.put("n", set); //N
        set = new HashSet<>();

        set.add("n");
        map.put("m", set); //M
        return map;
    }
}
