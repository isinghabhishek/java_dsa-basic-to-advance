
public class LongestWordInDictiionary {
    public static class Node {
        private char data;
        private String word;
        private boolean isEnd;
        private Node[] children;

        public Node(char data) {
            this.data = data;
            this.word = null;
            this.isEnd = false;
            this.children = new Node[26];
        }
    }    
    private Node root = new Node('/');
    private String ans = "";

    private void insert(String word) {
        Node curr = this.root;
        for(int i=0; i<word.length(); i++) {
            int childIdx = word.charAt(i)-'a';
            if(curr.children[childIdx] == null) {
                curr.children[childIdx] = new Node(word.charAt(i));
            }
            curr = curr.children[childIdx];
        }
        curr.isEnd = true;
        curr.word = word;
    }

    private void dfs(Node node) {
        if(node == null) {
            return;
        }
        if(node.word != null) {
            if(node.word.length() > ans.length()) {
                ans = node.word;
            } else if (node.word.length() == ans.length() && node.word.compareTo(ans) < 0) {
                ans = node.word;
            }
        }
        for(Node child : node.children) {
            if(child != null && child.word != null) {
                dfs(child);
            }
        }
    }

    public String longestWord(String[] words) {
        for (String word : words) {
            insert(word);
        }
        Node curr = this.root;
        dfs(curr);
        return ans;
    }

    public static void main(String[] args) {
       String words[] = {"w", "wo", "wor", "worl", "world"};
       
       
    }
}
