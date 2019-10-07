import java.util.*;
import java.io.*;
/**
 * 여기에 Test 클래스 설명을 작성하십시오.
 * 
 * @author (2014671038 김진수, 2017605038 스피겔 크릴) 
 * @version (20191007)
 */
public class Test
{
    public static void main(String[] args){
        int c = 0;
        HashMap<String,Integer> h = new HashMap<String,Integer>();
        System.out.println("-----------계산-------------");
        try{
            Scanner sc = new Scanner(new FileReader(new File("c:\\Temp\\inputData20191007.txt")));
            while(sc.hasNext()){
                String word = sc.nextLine();
                //System.out.println(word);
                StringTokenizer st = new StringTokenizer(word," ");
                String key = st.nextToken();
                int val = Integer.parseInt(st.nextToken());
                h.put(key,val);
                
            }
        }catch(IOException e){
            System.out.println("시스템 오류입니다. ");
        }
        Set<String> keys = h.keySet();
        Iterator<String> it = keys.iterator();
        
        int total = 0;
        while(it.hasNext()){
            String name = it.next();
            int score = h.get(name);
            total += score;
        }
        System.out.println(h);
        
        System.out.println(total);
        
        double average = total / h.size();
        
        System.out.println(average);
        
        
    }
}
