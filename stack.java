import java.util.Stack;
public class stack {
    public static void main(String[] args) {
         Stack<Integer>s=new Stack<>();
        // s.push(10);
        // s.push(20);
        // s.pop();
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        // System.out.println(s.size());

        //previoue smallest element in array
        // int a[]={4,10,5,18,3,12,7};
        // for(int i=0;i<a.length;i++){
        //     while(! s.isEmpty() && s.peek()>=a[i]){
        //         s.pop();
        //     }
        //     if(s.isEmpty()){
        //         System.out.println(-1);
        //     }else{
        //         System.out.println(s.peek());
        //     }
        //     s.push(a[i]);

        // }

        //previoue greast element in array
        int a[]={4,10,5,18,3,12,7};
        for(int i=0;i<a.length;i++){
            while(! s.isEmpty() && s.peek()<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                System.out.println(-1);
            }else{
                System.out.println(s.peek());
            }
            s.push(a[i]);

        }






    }
    
}
