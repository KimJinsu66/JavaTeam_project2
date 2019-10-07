import java.util.*;
import java.io.*;
/**
 * 여기에 Test 클래스 설명을 작성하십시오.
 * 
 * @author (2014671038 김진수, 2017605038 스피겔 크릴) 
 * @version (2014671038 김진수)
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
                System.out.println(word);
            }
        }catch(IOException e){
            System.out.println("시스템 오류입니다. ");
        }
        
        
    }
}
