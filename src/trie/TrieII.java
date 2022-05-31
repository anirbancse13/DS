package trie;

public class TrieII {


}

class NodeII{
    NodeII[] links = new NodeII[26];
    int countEndsWith = 0;
    int countStartsWith = 0;

    boolean containsKey(char ch){
        return (links[ch - 'a'] != null);
    }

    NodeII get(char ch){
        return links[ch -'a'];
    }

    void put (char ch, NodeII node){
        links [ch-'a'] = node;
    }

    void increaseEnd(){
        countEndsWith++;
    }

    void increaseStart(){
        countStartsWith++;
    }
}