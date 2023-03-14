import java.util.*;

public class HashMapImplementation {

    static class HashMap<K,V> { //(K,V)generic
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n;  //n
        private int N;
        private java.util.LinkedList<Node> buckets[]; //N = buckets.length
    
        @SuppressWarnings("unchecked")
        public HashMap() {
            this.N = 4;
            this.buckets = new java.util.LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new java.util.LinkedList<>();
            }
        }
        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        private int SearchInLL(K key, int bi) {
            java.util.LinkedList<Node> ll = buckets[bi];
            int di = 0; 

            for(int i=0; i<ll.size(); i++){
                Node node = ll.get(i);
                if(node.key == key) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        @SuppressWarnings("unchecked")
        private void rehash() {
            java.util.LinkedList<Node> oldBuck[] = buckets;
            buckets = new java.util.LinkedList[N*2];
            for(int i=0; i<buckets.length; i++){
                buckets[i] = new java.util.LinkedList<>();
            }
            // nodes -> add in bucket
            for(int i=0; i<oldBuck.length; i++) {
                java.util.LinkedList<Node> ll = oldBuck[i];
                for(int j=0; j<ll.size(); j++) {
                    Node node = ll.remove();
                    put(node.key, node.value);
                }
            }
        }

        public void put(K key, V value) { //O(1)
            int bi = hashFunction(key); //0 to 3
            int di = SearchInLL(key, bi); //valid; -1

            if(di != -1){
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0 ){
                rehash();
            }
        }
        public boolean containsKey(K key){ //O(1)
            int bi = hashFunction(key); //0 to 3
            int di = SearchInLL(key, bi); //valid; -1

            if(di != -1){
                return true;
            } else {
                return false;
            }
        }

        public V remove(K key) { //O(1)
            int bi = hashFunction(key); //0 to 3
            int di = SearchInLL(key, bi); //valid; -1

            if(di != -1){
                Node node = buckets[bi].remove(di);
                n--;
                return node.value;
            } else {
                return null;
            }
        }

        public V get(K key) {
            int bi = hashFunction(key); //0 to 3
            int di = SearchInLL(key, bi); //valid; -1

            if(di != -1){
                Node node = buckets[bi].get(di);
                return node.value;
            } else {
                return null;
            }
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i<buckets.length; i++) {
                java.util.LinkedList<Node> ll = buckets[i];
                for(Node node : ll) {
                    keys.add(node.key);
                }        
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("US", 50);
        hm.put("France", 40);
        hm.put("China", 150);
        hm.put("Nepal", 2);
        hm.put("Indonesia", 30);
        hm.put("Bhutan", 1);

        ArrayList<String> Keys = hm.keySet();
        for (String key : Keys) {
            System.out.println(key);
        }
        System.out.println(hm.get("India"));
        System.out.println(hm.remove("India"));
        System.out.println(hm.get("India"));
    }
}
