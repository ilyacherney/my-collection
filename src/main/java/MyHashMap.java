public class MyHashMap<K,V> {
    private K key;
    private V value;
    final int DEFAULT_CAPACITY = 16;
    private Node<K,V>[] table;

    static class Node<K,V> {
        int hash;
        K key;
        V value;
        Node<K,V> next;

        public Node (int hash, K key, V value, Node<K,V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "hash=" + hash +
                    ", key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }
    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];
    }

    public void put(K k, V v) {
        int index = calculateIndex(k.hashCode());
        System.out.println("index: " + index);

        int hash = calculateHash(k);
        System.out.println("hash: " + hash);

        table[index] = new Node<>(hash, k, v, null);
    }

    public int calculateHash(K k) {
        return k.hashCode();
    }

    public int calculateIndex(int hash) {
        return hash & (DEFAULT_CAPACITY - 1);
    }

    public Node get(K k) {
        int hash = calculateHash(k);
        int index = calculateIndex(hash);
        return table[index];
    }


    @Override
    public String toString() {
        String output = null;
        for (int i = 0; i < table.length; i++) {
            output += "[i:" + i + " " + table[i] + "] ";
        }
        return output;
    }
}
