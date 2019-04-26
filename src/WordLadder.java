/**
 * Given two words (beginWord and endWord), and a dictionary's word list,
 * find the length of shortest transformation sequence from beginWord to endWord, such that:
 *
 * Only one letter can be changed at a time.
 * Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
 *
 * Note:
 * Return 0 if there is no such transformation sequence.
 * All words have the same length.
 * All words contain only lowercase alphabetic characters.
 * You may assume no duplicates in the word list.
 * You may assume beginWord and endWord are non-empty and are not the same.
 *
 * Example 1:
 * Input:
 * beginWord = "hit",
 * endWord = "cog",
 * wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: 5
 * Explanation: As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
 * return its length 5.
 *
 * Example 2:
 * Input:
 * beginWord = "hit"
 * endWord = "cog"
 * wordList = ["hot","dot","dog","lot","log"]
 * Output: 0
 * Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WordLadder {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        wordList.add(beginWord);
        int N = wordList.size();
        int start = N - 1;
        int end = 0;
        while(end < N && !wordList.get(end).equals(endWord)){
            end++;
        }
        if(end == N)
            return 0;
        List<Integer>[] graph = generateGraph(wordList);
        return FindMinPathLength(graph, start, end);
    }
    public static List<Integer>[] generateGraph(List<String> wordList){
        int N = wordList.size();
        List<Integer>[] graph = new List[N];
        for(int i = 0; i < N; i++){
            graph[i] = new ArrayList<>();
            System.out.println(" " + i + ": ");
            for(int j = 0; j < N; j++){
                if(isConnect(wordList.get(i), wordList.get(j))){
                    graph[i].add(j);
                    System.out.println(" word.get(i): " + wordList.get(i));
                    System.out.print( " " + j + " " + wordList.get(j));
                }

            }
        }return graph;
    }
    public static boolean isConnect(String word1, String word2){
        int diffCnt = 0;
        for(int i = 0; i < word1.length() && diffCnt <= 1; i++){
            if(word1.charAt(i) != word2.charAt(i))
                diffCnt++;
        }return diffCnt == 1;
    }
    public static int FindMinPathLength(List<Integer>[] graph, int start, int end){
        Queue<Integer> queue = new LinkedList<>();
        boolean[] marked = new boolean[graph.length];
        queue.add(start);
        marked[start] = true;
        int pathLength = 1;
        while(!queue.isEmpty()){
            int size = queue.size();
            pathLength++;
            while (size-- > 0){
                int cur = queue.poll();
                for(int next : graph[cur]) {
                    if (next == end) {
                        return pathLength;
                    }
                    if (marked[next]) {
                        continue;
                    }
                    marked[next] = true;
                    queue.add(next);
                }
            }
        }return 0;
    }
}
