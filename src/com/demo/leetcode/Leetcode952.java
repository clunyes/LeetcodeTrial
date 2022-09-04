package com.demo.leetcode;

import com.demo.leetcode.datastruct.UnionDisjointSet;

import java.util.*;

public class Leetcode952 {

    public static int largestComponentSize(int[] nums) {
        ArrayList<Integer>[] factors = new ArrayList[nums.length];
        for(int i = 0; i < factors.length; ++i){
            factors[i] = new ArrayList<Integer>();
        }
        for(int i = 0; i < nums.length; ++i){
            int x = nums[i];
            int d = 2;
            while(d * d <= x){
                if(x % d == 0){
                    while(x % d == 0){
                        x /= d;
                    }
                    factors[i].add(d);
                }
                ++d;
            }
            if(x > 1 || factors[i].size() == 0){
                factors[i].add(x);
            }
        }
        HashSet<Integer> primes = new HashSet<>();
        for(List<Integer> fac : factors){
            for(int f : fac){
                primes.add(f);
            }
        }

        HashMap<Integer, Integer> prime2index = new HashMap<Integer, Integer>();

        int index = 0;
        for(int p : primes){
            prime2index.put(p, index++);
        }

        UnionDisjointSet uds = new UnionDisjointSet(primes.size());

        for(List<Integer> fac : factors){
            for (int i=0;i<fac.size();i++){
                if(i==0){
                    continue;
                }
                uds.union(prime2index.get(fac.get(0)), prime2index.get(fac.get(i)));
            }
//            for(int f : fac){
//                uds.union(prime2index.get(fac.get(0)), prime2index.get(f));
//            }
        }
        int[] count = new int[primes.size()];
        for(List<Integer> fac : factors){
            count[uds.find(prime2index.get(fac.get(0)))]++;
        }

        int max = 0;
        for(int c : count){
            if(c > max){
                max = c;
            }
        }
        return max;

    }



    public static void main(String[] args) {
//        int[] arr = {2, 3, 6, 7, 4, 12, 21, 39};
//        int[] arr = {20, 50, 9, 63};
        int[] arr = {4,6,15,35};
        System.out.println(largestComponentSize(arr));
    }
}
