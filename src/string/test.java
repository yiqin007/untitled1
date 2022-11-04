package string;

import java.util.Arrays;

/**
 * @author 叶嘉卫
 * @date 2022/10/26/19:36
 * @Description: 字符串和编码问题
 */
public class test {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1);
        s1 = s1.toUpperCase();
        System.out.println(s1);
        int[] scores = new int[] { 88, 77, 51, 66 };
        Score s = new Score(scores);
        s.printScores();
        scores[2] = 99;
        s.printScores();
    }
}

class Score {
    private int[] scores;
    public Score(int[] scores) {
        this.scores = scores;
        this.scores=scores.clone();
    }

    public void printScores() {
        System.out.println(Arrays.toString(scores));
    }
}