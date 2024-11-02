package HashMap.Basics;

import java.util.*;


public class HashMapImplementation {

    static class MyHashMap<K, V>{

        public static final int DEFAULT_CAPACITY = 4;
        public static final float LOAD_FACTOR = 0.75f;

        private class Node{
            K key;
            V value;
            Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

    private int n; //number of entries in map
    private LinkedList<Node>[] buckets;


    public void initBuckets(int N){// N - capacity/size of buckets array

        buckets = new LinkedList[N];
        for(int i=0; i<buckets.length; i++){
            buckets[i]=new LinkedList<>();
        }
    }

    private int HashFunc(K key){
        int hc = key.hashCode();
        return (Math.abs(hc))%buckets.length;
    }

    //Traverse the ll and lokka for a ndoe with key if ound, retirn otherwise null

    private int searchInBucket(LinkedList<Node> ll, K key){
        for(int i=0; i<ll.size(); i++){
            if(ll.get(i).key==key){
                return i;
            }
        }

        return -1;

    }

    public MyHashMap(){
        initBuckets(DEFAULT_CAPACITY);
    }

    public  int size(){
        //return no. of entries in map...
        return n;
    }

    private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (LinkedList<Node> bucket : oldBuckets) {
                for (Node node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

    public int cpacity(){
        return buckets.length;
    }

    public float load(){
        return (n*1.0f)/buckets.length;
    }

    public void put(K key, V value){ //insert and update

        int bi = HashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket,key);

        if(ei ==-1){
            //key not exist, wehave to insert new ndoe
            Node node = new Node(key,value);
            currBucket.add(node);
            n++;
        }else{
            // update case
            Node currNode = currBucket.get(ei);
            currNode.value = value;

        }

        if(n>= buckets.length * LOAD_FACTOR){
            rehash();
        }


    }

    public V get(K key){ 
        int bi = HashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket, key);
        if(ei!=-1){
            Node currNode = currBucket.get(ei);
            return currNode.value;
        }
            return null;


    }

    public V remove(K key){ //insert and update
        int bi = HashFunc(key);
        LinkedList<Node> currBucket = buckets[bi];
        int ei = searchInBucket(currBucket, key);
        if(ei!=-1){
            Node currNode = currBucket.get(ei);
            V val = currNode.value;
            n--;
            return val;
        }
       
        return null;


    }

}

    public static void main(String[] args) {

        MyHashMap<String,Integer> mp = new MyHashMap<String,Integer>();

        System.out.println("Testing Put");

        mp.put("a",1);
        mp.put("b",2);
        mp.put("c",3);
        mp.put("d",4);
        mp.put("e",5);

        System.out.println("Testing size: "+ mp.size());

        mp.put("c",30);
        System.out.println("Testing size: "+ mp.size());

        System.out.println(mp.get("a"));
        System.out.println(mp.get("b"));
        System.out.println(mp.get("c"));
        System.out.println(mp.get("college"));

        System.out.println(mp.remove("c"));
        System.out.println(mp.remove("s"));
        System.out.println("Testing size: "+ mp.size());

        System.out.println("Capacity"+mp.cpacity());
        System.out.println("Load"+mp.load());
        


    }

}
    

