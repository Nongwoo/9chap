package SecondHw;
import java.util.*; 
public class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        ArrayList<Character> grade= new ArrayList<Character>(); //ArrayList 객체와 레퍼런스 변수 생성
        double sum=0; 
        int count=0; 
        double score[]=new double[6]; //실수형 배열 크기 6 score
        System.out.print("6개의 학점을 빈 칸으로 분리하여 입력하시오. (A/B/C/D/F)");
        while(count!=6) //count가 6이 될때까지 반복 
        {
            String st = s.next(); //String에 문자열 입력
            char c = st.charAt(0); //지정된 index에 있는 문자 리턴해서 c에 대입
            if((c>='A'&&c<='D')||c=='F') //e학점이 없기떄문에 
            {grade.add(c); count++;} //지정된학점 입력, 카운트+ 
            else continue; 
        }
        for(int i=0;i<grade.size();i++) 
        {
            if(grade.get(i)=='A')   // A일때 4.0
            {score[i]=4.0;} 
            else if(grade.get(i)=='B') 
            {score[i]=3.0;} 
            else if(grade.get(i)=='C') 
            {score[i]=2.0;} 
            else if(grade.get(i)=='D') 
            {score[i]=1.0;}
            else if(grade.get(i)=='F') 
            {score[i]=0.0;} 
       
            sum+=score[i]; //sum에 sum과 score[i] 더한 값 대입
        }
        System.out.println(); 
        System.out.print("평균 : "+sum/grade.size() ); //평균 출력
 

    }
}