import java.util.*;

public class PriorityQ {
    public static void main(String[] args) {
          
        //min heap

        // PriorityQueue <Integer> pq=new PriorityQueue<>();
        // pq.add(12);
        // pq.add(23);
        // pq.add(28);
        // System.out.println(pq.size());
        // while(! pq.isEmpty()){
        //     System.out.println(pq.peek());
        //     pq.poll(); //delete
        // }
        
        //max heap

        // PriorityQueue <Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // pq.add(12);
        // pq.add(23);
        // pq.add(28);
        // System.out.println(pq.size());
        // while(! pq.isEmpty()){
        //     System.out.println(pq.peek());
        //     pq.poll(); //delete
        // }

        //print kth largest element in array
       int arr[]={12,34,45};
       int k=2;
       System.out.println("k'th largest array element is " + findKthLargest(arr, k));
    

    }
    public static int findKthLargest(int arr[], int k){

        PriorityQueue <Integer> pq=new PriorityQueue<>();
       for(int i=0;i<k;i++){
        pq.add(arr[i]);
       }
       for(int i=k;i<arr.length;i++){
        if(pq.peek()<arr[i]){
            pq.poll();
            pq.add(arr[i]);
        }
       }
       return pq.peek();
    }
    
}
