public class backjoon4673 {
    public static boolean func(int d) {
        boolean self=true;
     for(int i=1;i<d;i++){
         int sum=i;
         int num=i;
         while(num!=0){
             sum+=num%10;
             num=num/10;
         }
         if(d==sum){
             self=false;
             break;
         }
     }
     return self;
 }
     public static void main(String args[]) {
      for(int d=1;d<=10000;d++){
               if(func(d)){
                   System.out.println(d);
               }
         }
     }
 }

