package a208;

/**
 * @ClassName Trie
 * @Decription leetCode208
 * @Auther mac
 * @Date 2019-10-16 16:47
 * @Version 1.0
 **/
public class Trie {
    private TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public Trie() {
        root = new TrieNode();
        root.val = ' ';
    }

    /**
     * Inserts a word into the trie.
     */
    public void insert(String word) {
        TrieNode t = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (t.children[c - 'a'] == null) {
                t.children[c - 'a'] = new TrieNode(c);
            }
            t = t.children[c - 'a'];
        }
        t.isWord = true;
    }

    /**
     * Returns if the word is in the trie.
     */
    public boolean search(String word) {
        TrieNode t = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (t.children[c - 'a'] == null) {
                return false;
            }
            t = t.children[c - 'a'];
        }
        return t.isWord;
    }

    /**
     * Returns if there is any word in the trie that starts with the given prefix.
     */
    public boolean startsWith(String prefix) {
        TrieNode t = root;
        for (int i = 0; i<prefix.length(); i++){
            char c = prefix.charAt(i);
            if (t.children[c - 'a'] == null){
                return false;
            }
            t = t.children[c - 'a'];
        }
        return true;
    }

    public static void main(String[] args) {

        Trie obj = new Trie();
        obj.insert("trie");
        boolean param_2 = obj.search("trie");
        boolean param_3 = obj.startsWith("trie");
        System.out.println(param_2);
        System.out.println(param_3);
    }
}
