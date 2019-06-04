/**
 * Implement a trie with insert, search, and startsWith methods.
 *
 * Example:
 * Trie trie = new Trie();
 *
 * trie.insert("apple");
 * trie.search("apple");   // returns true
 * trie.search("app");     // returns false
 * trie.startsWith("app"); // returns true
 * trie.insert("app");
 * trie.search("app");     // returns true
 * Note:
 *
 * You may assume that all inputs are consist of lowercase letters a-z.
 * All inputs are guaranteed to be non-empty strings.
 */
public class Trie{
    /** Initialize your data structure here. */
    public Trie() {
    }

    public class Node{
        Node[] child = new Node[26];
        boolean isLeaf;
    }
    Node root = new Node();

    /** Inserts a word into the trie. */
    public void insert(String word) {
        insert(word, root);
    }
    public void insert(String word, Node node){
        if (node == null) return;
        if (word.length() == 0){
            node.isLeaf = true;
            return;
        }
        int index = indexOfChar(word.charAt(0));
        if (node.child[index] == null){
            node.child[index] = new Node();
        }
        insert(word.substring(1), node.child[index]);
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        return search(word, root);
    }
    public boolean search(String word, Node node){
        if (node == null)return false;
        if (word.length() == 0) return node.isLeaf;
        int index = indexOfChar(word.charAt(0));
        return search(word.substring(1), node.child[index]);
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        return startsWith(prefix, root);
    }
    public boolean startsWith(String prefix, Node node){
        if (node == null)return false;
        if (prefix.length() == 0)return true;
        int index = indexOfChar(prefix.charAt(0));
        return startsWith(prefix.substring(1), node.child[index]);
    }
    public int indexOfChar(char c){
        return c - 'a';
    }
}
