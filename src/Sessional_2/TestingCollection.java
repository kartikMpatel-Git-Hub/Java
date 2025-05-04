package Sessional_2;

import java.util.*;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class TestingCollection {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

//        list.removeFirst();
//
//        System.out.println(list);
//        list.removeLast();
//        System.out.println(list);
//
//        Iterator<Integer> i = list.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        System.out.println();
//        System.out.println();
//        for(int ele : list){
//            System.out.println(ele);
//        }
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        for(int j = 0; j < list.size(); j++){
//            System.out.println(list.get(j));
//        }
//
//        list.set(1,10);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);
//        list.add(1,11);
//        System.out.println(list);
//        list.add(3,12);
//        System.out.println(list);
//        System.out.println(list.contains(100));
//
//        System.out.println(list.toArray());
//        Object[] newObj = list.toArray();
//        System.out.println(newObj);
//        ArrayList<Integer> newLst = new ArrayList<>();
//        newLst = list.clone();
//        System.out.println(Arrays.toString(list.toArray()));
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);

//        LinkedList<String> ll = new LinkedList<>();
//        ll.add("kartik");
//        ll.add("Kevaliiii");
//        ll.add("Disa Gayyyy");
//
//        Iterator<String> i = ll.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//        System.out.println(ll);
//
//        ll.addFirst("1");
//        System.out.println(ll);
//
//        System.out.println(ll.contains("krutik Gayyy "));
//        LinkedList<String> newList = new LinkedList<>();
//        newList.addFirst("k1");
//        newList.addAll(0,ll);
//        newList.addFirst("k2");
//        newList.addLast("k2");
////        ll.addAll(1,)
//        System.out.println(ll);
//        System.out.println(newList);
//
//        System.out.println(ll.get(2));
//        System.out.println(newList.get(2));
//
//        System.out.println(newList.indexOf("Kevaliiii"));
//        System.out.println(newList.lastIndexOf("k2"));
//
//        ll.offer("kk");
//        System.out.println(ll);
//
//

//        Queue<String> queue = new LinkedList<>();
//        queue.offer("k1");
//        queue.offer("k2");
//        queue.offer("k3");
//
//        System.out.println(queue);
//
//        Iterator<String> q = queue.iterator();
//        while (q.hasNext()){
//            System.out.println(q.next());
//        }
////
////        for(; q.hasNext();){
////            System.out.println(q.next());
////        }
////        queue.o
//        System.out.println();
//        System.out.println();
//        System.out.println(queue.offer("1") + " " + queue.add("1"));
//        System.out.println(queue.poll() + " " + queue.remove());
//        System.out.println(queue.element() + " " + queue.peek());
//        System.out.println(queue);
//

//        ArrayDeque<String> dequeue = new ArrayDeque<>();
//        dequeue.pe
        /// Same As Queue

//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(3);
//        queue.add(1);
//        queue.add(2);
//        queue.add(5);
//        queue.add(4);


//        System.out.println(queue);

//        Integer ele =
//
//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(1);
//        set.add(1);
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//
//        System.out.println(set);
////        set.removeIf((n1) -> n1 % 2 == 0);///Please Ignore
////        set.removeIf(set.contains(1));
//        set.remove(2);
//        System.out.println();
//        System.out.println(set);
//
//        HashSet<Integer> newSet = new HashSet<>();
//        newSet.add(1);
//        newSet.add(3);
////        newSet.add(4);
//        System.out.println(set.equals(newSet));

//        int a = 10;
//        System.out.println(a);
//        Integer newAAA = Integer.valueOf(a);
//        Integer newA = (Integer) a;
//        System.out.println(newA);
//        System.out.println(newAAA);
//        int newaa = (int) newA;
//        int newaaa = newAAA;
//        System.out.println(newaa);

//        Float newB = 10.1f;
//        System.out.println(newB);
//        float newBB = newB;
//        System.out.println(newBB);
//
//        Double d1 = 10.111d;
//        System.out.println(d1);
//        double dd1 = d1;
//        System.out.println(dd1);
//
//        short s1 = 1;
//        System.out.println(s1);
//        Short s11 = s1;
//        System.out.println(s11);
//        short s111 = s11;
//        System.out.println(s111);
//
//        byte b1 = 11;
//        System.out.println(b1);
//        Byte b11 = b1;
//        System.out.println(b11);
//        byte b111 = b11;
//        System.out.println(b111);
//
//        TreeSet<Integer> set = new TreeSet<>();
//        HashSet<Integer> set1 = new HashSet<>();
//        set.add(5);
//        set.add(4);
//        set.add(2);
//        set.add(1);
//        set.add(3);
//        System.out.println(set.pollFirst());
//        System.out.println(set.pollLast());
//        System.out.println(set.descendingSet());
//        System.out.println(set.headSet(4,true));
//        System.out.println(set.subSet(2,false,4,true));
//        System.out.println(set.tailSet(4,true));

//        set1.add(5);
//        set1.add(4);
//        set1.add(2);
//        set1.add(1);
//        set1.add(3);
//
//        System.out.println(set);
//        System.out.println(set1);

//        HashMap<Integer,String> map = new HashMap<>();
//        map.put(1,"10");
//        map.put(2,"20");
//        map.put(3,"30");
//        map.put(4,"40");
//        map.put(5,"50");
//
//        for(Map.Entry m : map.entrySet()){
//            System.out.println(m.getKey() + " : " + m.getValue());
//        }
//
//        for (Integer key : map.keySet()){
//            System.out.println(key + " : " + map.get(key));
//        }
//        for (String val : map.values()){
//            System.out.println(val);
//        }
//        System.out.println(map.values());
//        System.out.println(map.containsKey(40));
//        System.out.println(map);
//
//        System.out.println(map.size());
//        map.remove(1);
//        System.out.println(map);
//        System.out.println(map.getOrDefault(2,"no"));
//        System.out.println(map);
//
//        map.replace(2,"aa");
//        System.out.println(map);

//        map.

//        HashSet<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(4);
//        set.add(5);
//        set.add(null);
//        set.add(null);
//        set.add(null);
//        set.add(null);
//
//        System.out.println(set);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        deque.offerLast(4);

        int srch = 120;
        boolean flag = false;
        for(int ele : deque){
            if(srch == ele){
                deque.remove(srch);
                flag = true;
            }
        }
        if(!flag){
            System.out.println("Not Found");
        }
        System.out.println(deque);
    }
}
