import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class backjoon2869{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int A= Integer.parseInt(st.nextToken());
        int B= Integer.parseInt(st.nextToken());
        int V= Integer.parseInt(st.nextToken());
        int res=0;
   
  
if(A>=V){
    res=1;
}  else if((V-A)%(A-B)==0){
       res=(V-A)/(A-B)+1;
   }else{
       res=(V-A)/(A-B)+2;
   }
     bw.write(Integer.toString(res));
    bw.flush();
    bw.close();
    br.close();
    }
}
