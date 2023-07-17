import java.util.*;
public class hashing {
	public static void main(String[] args) {
		//count distinct element
		int a[]= {1,1,22,33,4,33};
		Set<Integer>s=new HashSet<>();
		for(int i:a) {
			s.add(i);
		}
 System.out.println(s.size());
 
 
 //union of two array then find size of ans array
 int n[]= {11,22,33,44};
 int m[]= { 55,66,77};
 Set<Integer>set=new HashSet<>();
 for(int k:n) {
	 set.add(k);
 }
 for(int p:m) {
	 set.add(p);
 }
 System.out.println(set.size());
 
 // intersection of two array
 int a1[]= {11,22,33,55,66};
 int a2[]= {11,22};
 int count=0;
 for(int d:a1) {
	set.add(d) ;
 }for(int d:a2) {
	 if(set.contains(d)) {
		 count++;
		 set.remove(d);
	 }
 }
 System.out.println(count);

 
	}

}  




