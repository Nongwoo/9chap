package SecondHw;
import java.util.*; 
public class Grades {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        ArrayList<Character> grade= new ArrayList<Character>(); //ArrayList ��ü�� ���۷��� ���� ����
        double sum=0; 
        int count=0; 
        double score[]=new double[6]; //�Ǽ��� �迭 ũ�� 6 score
        System.out.print("6���� ������ �� ĭ���� �и��Ͽ� �Է��Ͻÿ�. (A/B/C/D/F)");
        while(count!=6) //count�� 6�� �ɶ����� �ݺ� 
        {
            String st = s.next(); //String�� ���ڿ� �Է�
            char c = st.charAt(0); //������ index�� �ִ� ���� �����ؼ� c�� ����
            if((c>='A'&&c<='D')||c=='F') //e������ ���⋚���� 
            {grade.add(c); count++;} //���������� �Է�, ī��Ʈ+ 
            else continue; 
        }
        for(int i=0;i<grade.size();i++) 
        {
            if(grade.get(i)=='A')   // A�϶� 4.0
            {score[i]=4.0;} 
            else if(grade.get(i)=='B') 
            {score[i]=3.0;} 
            else if(grade.get(i)=='C') 
            {score[i]=2.0;} 
            else if(grade.get(i)=='D') 
            {score[i]=1.0;}
            else if(grade.get(i)=='F') 
            {score[i]=0.0;} 
       
            sum+=score[i]; //sum�� sum�� score[i] ���� �� ����
        }
        System.out.println(); 
        System.out.print("��� : "+sum/grade.size() ); //��� ���
 

    }
}