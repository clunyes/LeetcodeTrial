package com.demo.leetcode.onethousand;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Leetcode857 {

    public static void main(String[] args) {
        int[] q = new int[]{3,1,10,10,1};
        int[] w = new int[]{4,8,2,2,7};
        System.out.println(mincostToHireWorkers(q, w, 3));
    }

    public static double mincostToHireWorkers(int[] quality, int[] wage, int k) {
        int num = quality.length;
        double[][] worker = new double[num][2];

        // worker[性价比][质量]
        for (int i = 0; i < num; i++) {
            worker[i] = new double[]{(double) wage[i] / (double) quality[i], (double) quality[i]};
        }
        // 单位质量里，工资最少的，对于雇主来说，性价比最高
        // 所以按照性价比从高到底排序，也就是性价比这个数值升序排序
        Arrays.sort(worker, (o1, o2) -> Double.compare(o1[0], o2[0]));

        double ans = Integer.MAX_VALUE;
        int sum = 0;

        // 要在多个数中找到最小的几个数，则用大顶堆
        // 遍历是从性价比值最小开始，题目要求花费最小，所以要在所有质量中选择质量最小的k个
        // 因为最终所求答案 = 总的质量和 * 性价比
        // 而性价比是不断增大的，要想所求答案最小，那么总的质量和就要不断减小，所以就用大顶堆，将质量降序排列
        PriorityQueue<Double> pq = new PriorityQueue<>((o1, o2) -> {return Double.compare(o2, o1);});

        // 从性价比最小的开始遍历，也就是雇主最心意的员工开始遍历
        for (double[] w : worker) {
            if (pq.size() == k) {
                sum -= pq.poll();
            }
            sum += w[1];
            pq.offer(w[1]);
            if (pq.size() == k) {
                /**
                 * 每一次遍历到的w的性价比是不断增大的
                 * 用当前的性价比（x），去乘以sum
                 * 也就是 x * (qx + q1 + ...)
                 * 首先 x * qx ，保证了满足实际发的工资是等于自己的
                 * 之后的 x * q1 + x * q1 + ...
                 * 因为针对 q1 q1 ... 这些质量来说，他们是比 qx 先进入队列，也就是说，他们的性价比的数值都比 x 低
                 * 那么用 x 去乘以这些质量，肯定比 他们自己的性价比 * 自己的质量 要大，也就保证了满足实际发放的工资 >= 期望工资
                 */
                ans = Math.min(ans, sum * w[0]);
            }
        }

        return ans;

    }
}
