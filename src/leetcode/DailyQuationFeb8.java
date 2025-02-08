/*
2349. Design a Number Container System
Insert or Replace a number at the given index in the system.
Return the smallest index for the given number in the system.
Implement the NumberContainers class:
NumberContainers() Initializes the number container system.
void change(int index, int number) Fills the container at index with the number. If there is already a number at that index, replace it.
int find(int number) Returns the smallest index for the given number, or -1 if there is no index that is filled by number in the system.* */

/*
* Input
["NumberContainers", "find", "change", "change", "change", "change", "find", "change", "find"]
[[], [10], [2, 10], [1, 10], [3, 10], [5, 10], [10], [1, 20], [10]]
Output
[null, -1, null, null, null, null, 1, null, 2]
* */
package leetcode;
import java.util.HashMap;
import java.util.PriorityQueue;

public class DailyQuationFeb8 {

    class NumberContainers {

        HashMap<Integer, PriorityQueue<Integer>> q;
        HashMap<Integer,Integer> map;
        public NumberContainers() {
            q = new HashMap<>();
            map = new HashMap<>();
        }

        public void change(int index, int number) {
            map.put(index,number);
            if(!q.containsKey(number)){
                q.put(number,new PriorityQueue<>());
            }
            q.get(number).offer(index);
        }

        public int find(int number) {
            if(!q.containsKey(number))
                return -1;

            PriorityQueue<Integer> pq = q.get(number);
            while(!pq.isEmpty()){
                int idx = pq.peek();
                if(map.get(idx) == number){
                    break;
                }else{
                    pq.poll();
                }
            }
            if(pq.isEmpty()){
                q.remove(number);
                return -1;
            }
            return q.get(number).peek();
        }
    }

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */
}
