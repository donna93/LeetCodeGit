import java.util.*;

public class Solution {
//    private static String[] wordList;
//    private static List<String> words = new ArrayList<>();
//    public static void RecordWord(String word){
//        words.add(word);
//        int len = words.size();
//        wordList = (String[]) words.toArray(new String[len]);
//    }

//    public static String[] Top5(){
//        Map<String, Integer> times = new HashMap<>();
//        for(String s : wordList){
//            times.put(s, times.getOrDefault(s, 0) + 1);
//        }
//        List<String>[] buckets = new ArrayList[wordList.length + 1];
//        for(String key : times.keySet()){
//            int frequency = times.get(key);
//            if(buckets[frequency] == null)
//                buckets[frequency] = new ArrayList<>();
//            buckets[frequency].add(key);
//        }
//        List<String> top5 = new ArrayList<>();
//        for(int i = buckets.length - 1; i >= 0 && top5.size() < 5; i--){
//            if(buckets[i] != null) {
//                top5.addAll(buckets[i]);
//            }
//        }
//        String[] Top5 = (String[]) top5.toArray(new String[5]);
//        System.out.println(Top5.length);
//        for(int i = 0; i < wordList.length; i++){
//            System.out.println(wordList[i]);
//        }
//        return Top5;
//    }
private static String[] wordList;
    private static List<String> words = new ArrayList<>();
    public static void RecordWord(String word){
        words.add(word);
        int len = words.size();
        wordList = (String[]) words.toArray(new String[len]);
    }
    public static String[] Top5(){
        Map<String, Integer> times = new HashMap<>();
        for(String s : wordList){
            times.put(s, times.getOrDefault(s, 0) + 1);
        }
        List<String>[] buckets = new ArrayList[wordList.length + 1];
        for(String key : times.keySet()){
            int frequency = times.get(key);
            if(buckets[frequency] == null){
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(key);
        }
        List<String> top5 = new ArrayList<>();
        for(int i = buckets.length - 1; i >= 0 && top5.size() < 5; i--){
            if(buckets[i] != null){
                top5.addAll(buckets[i]);
            }
        }
        String[] Top5 = (String[]) top5.toArray(new String[5]);
        return Top5;
    }
    public static void main(String[] args){
        RecordWord("a");
        RecordWord("a");
        RecordWord("a");
        RecordWord("cc");
        RecordWord("cc");
        RecordWord("cc");
        RecordWord("b");
        RecordWord("b");
        RecordWord("f");
        RecordWord("f");
        RecordWord("h");
//        for(int i = 0; i < wordList.length; i++){
//            System.out.println(wordList[i]);
//        }
        System.out.println(Arrays.toString(Top5()));
    }
}
