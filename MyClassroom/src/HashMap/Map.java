package HashMap;

import java.util.ArrayList;

public class Map<K, V> {

    ArrayList<MapNode<K, V>> buckets;

    int count;
    int numBuckets;

    public Map() {

        buckets = new ArrayList<>();
        numBuckets = 20;
        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
    }

    private int getBucketIndex(K key) {
        int hc = key.hashCode();
        int index = hc % numBuckets;
        return index;
    }

    public void insert(K key, V value) {

        int buckedIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(buckedIndex);
        // element is already there just update its value
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value; //update the value
                return;
            }
            head = head.next;
        }
        //element is not there, insert at 0 position of linked list
        head = buckets.get(buckedIndex);
        //make new node
        MapNode<K, V> newNode = new MapNode<>(key, value);
        //make newNode has a new headl
        newNode.next = head;
        buckets.set(buckedIndex, newNode);
        count++;
    }

    public int size() {
        return count;
    }

    public V removeKey(K key) {
        int buckedIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(buckedIndex);
        MapNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key)) {
                if (prev != null) {
                    prev.next = head.next;
                } else {
                    buckets.set(buckedIndex, head.next);
                }
            }
            prev = head;
            head = head.next;
        }
        return null;
    }

    public V getValue(K key) {

        int buckedIndex = getBucketIndex(key);
        MapNode<K, V> head = buckets.get(buckedIndex);

        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }
}
