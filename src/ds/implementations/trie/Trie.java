package ds.implementations.trie;

public class Trie {
    private final Node root;

    public Trie() {
        root = new Node();
    }

    //Insert a word in Trie
    public void insertWord(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            if (!temp.containsKey(word.charAt(i))) {
                temp.put(word.charAt(i), new Node());
            }
            temp = temp.getNext(word.charAt(i));
        }
        temp.setEnd();
    }

    // Search if the whole word is present in the trie
    public boolean searchWord(String word) {
        Node temp = root;
        for (int i = 0; i < word.length(); i++) {
            if (!temp.containsKey(word.charAt(i))) {
                return false;
            }
            temp = temp.getNext(word.charAt(i));
        }
        return temp.isEnd();
    }

    // Search if a word in the trie starts with prefix
    public boolean startsWith(String prefix) {
        Node temp = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (!temp.containsKey(prefix.charAt(i))) {
                return false;
            }
            temp = temp.getNext(prefix.charAt(i));
        }
        return true;
    }
}

class Node {
    Node[] links = new Node[26];
    boolean flag = false;

    public Node() {
    }

    boolean containsKey(char ch) {
        return (links[ch - 'a'] != null);
    }

    void put(char ch, Node node) {
        links[ch - 'a'] = node;
    }

    Node getNext(char ch) {
        return links[ch - 'a'];
    }

    void setEnd() {
        flag = true;
    }

    boolean isEnd() {
        return flag;
    }

}
