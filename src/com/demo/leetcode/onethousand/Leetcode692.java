package com.demo.leetcode.onethousand;

import java.util.*;

public class Leetcode692 {

    public static void main(String[] args) {
//        String[] words = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        String[] words = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        topKFrequent(words, 4);
    }

    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> data = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            data.put(word, data.getOrDefault(word, 0) + 1);
        }
        ArrayList<Word> list = new ArrayList();
        for (String key : data.keySet()) {
            list.add(new Word(key, data.get(key)));
        }
        Collections.sort(list);
        List<String> result = new ArrayList<>();
        for (int i = list.size() - 1; i > list.size() - 1 - k; i--) {
            result.add(list.get(i).word);
        }
        return result;
    }

    /**
     * 小根堆 大根堆 都可以用PriorityQueue实现
     * @param words
     * @param k
     * @return
     */
//    public List<String> topKFrequent(String[] words, int k) {
//        Map<String, Integer> cnt = new HashMap<String, Integer>();
//        for (String word : words) {
//            cnt.put(word, cnt.getOrDefault(word, 0) + 1);
//        }
//        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<Map.Entry<String, Integer>>(new Comparator<Map.Entry<String, Integer>>() {
//            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
//                return entry1.getValue() == entry2.getValue() ? entry2.getKey().compareTo(entry1.getKey()) : entry1.getValue() - entry2.getValue();
//            }
//        });
//        for (Map.Entry<String, Integer> entry : cnt.entrySet()) {
//            pq.offer(entry);
//            if (pq.size() > k) {
//                pq.poll();
//            }
//        }
//        List<String> ret = new ArrayList<String>();
//        while (!pq.isEmpty()) {
//            ret.add(pq.poll().getKey());
//        }
//        Collections.reverse(ret);
//        return ret;
//    }

    static class Word implements Comparable<Word> {
        String word;
        int num;

        Word(String word, int num) {
            this.word = word;
            this.num = num;
        }


        @Override
        public int compareTo(Word w) {
            if (this.num > w.num) {
                return 1;
            } else if (this.num == w.num) {
                return w.word.compareTo(this.word);
            } else {
                return -1;
            }
        }
    }

}
