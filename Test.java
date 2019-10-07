import java.util.*;
import java.io.*;
/**
 * inputData20191007파일의 문자를 받아와 HashMap에 저장 후 학생 총점과 평균을 구한다.
 * 
 * @author (2014671038 김진수, 2017605038 스피겔 크릴) 
 * @version (20191007)
 */
public class Test
{
    public static void main(String[] args){
        int c = 0;
        HashMap<String,Integer> h = new HashMap<String,Integer>();

        try{
            Scanner sc = new Scanner(new FileReader(new File("c:\\Temp\\inputData20191007.txt")));
            while(sc.hasNext()){
                String word = sc.nextLine();
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
        double average = total / h.size();

        System.out.println("-----------계산-------------");
        System.out.println("총점 : " + total);
        System.out.println("평균 : "+ average);

    }
}