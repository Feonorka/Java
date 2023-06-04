package alg;

public class MyHashMap {

    private static final int DEFAULT_CAPACITY = 16;

    private Node[] nodes;

    private int size;

    public MyHashMap() {
        this.nodes = new Node[DEFAULT_CAPACITY];
    }

    public Object put(Integer key, Integer value) {
        int hash = hash(key);
        Node node = nodes[hash];
        while (node != null) {
            if (node.hash == hash && node.key.equals(key)) {
                Object oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            node = node.next;
        }
        addNode(hash, key, value);
        return null;
    }

    public Object get(Integer key) {
        int hash = hash(key);
        Node node = nodes[hash];
        while (node != null) {
            if (node.hash == hash && node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return null;
    }

    public Object remove(Integer key) {
        int hash = hash(key);
        Node prev = null;
        Node node = nodes[hash];
        while (node != null) {
            if (node.hash == hash && node.key.equals(key)) {
                if (prev == null) {
                    nodes[hash] = node.next;
                } else {
                    prev.next = node.next;
                }
                size--;
                return node.value;
            }
            prev = node;
            node = node.next;
        }
        return null;
    }

    public Object replace(Integer key, Integer value) {
        int hash = hash(key);
        Node node = nodes[hash];
        while (node != null) {
            if (node.hash == hash && node.key.equals(key)) {
                Object oldValue = node.value;
                node.value = value;
                return oldValue;
            }
            node = node.next;
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean containsKey(Integer key) {
        int hash = hash(key);
        Node node = nodes[hash];
        while (node != null) {
            if (node.hash == hash && node.key.equals(key)) {
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public boolean containsValue(Integer value) {
        for (int i = 0; i < nodes.length; i++) {
            Node node = nodes[i];
            while (node != null) {
                if (node.value.equals(value)) {
                    return true;
                }
                node = node.next;
            }
        }
        return false;
    }

    private int hash(Integer key) {
        return key.hashCode() % nodes.length;
    }

    private void addNode(int hash, Integer key, Integer value) {
        Node node = new Node(hash, key, value, null);
        if (nodes[hash] == null) {
            nodes[hash] = node;
        } else {
            Node lastNode = nodes[hash];
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = node;
        }
        size++;
    }

    private static class Node {
        final int hash;
        final Integer key;
        Integer value;
        Node next;

        Node(int hash, Integer key, Integer value, Node next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}