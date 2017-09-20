import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;


public class Solution {
	
	public void processQuery(String[][] query, List<List<Integer>>seqList, int lastAnswer){
		
		for(int i=0;i<query.length;i++)
		{
			int index =(Integer.parseInt(query[i][1])^lastAnswer)%seqList.size();
			
			if(Integer.parseInt(query[i][0])==1)
			{
				seqList.get(index).add(Integer.valueOf(query[i][2]));
				
			}
			else if(Integer.parseInt(query[i][0])==2)
			{
				int yIndex =Integer.parseInt(query[i][2])%seqList.get(index).size();
				lastAnswer =seqList.get(index).get(yIndex);
				System.out.println(lastAnswer);
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		List <List<Integer>>  seqList =new ArrayList <List<Integer>>();
		
		for(int i=0;i<count;i++)
			seqList.add(0, new ArrayList<Integer>());
		int lastAnswer =0;
		int qCount =0;
		qCount= sc.nextInt();
		String[][] queries = new String[qCount][];
		sc.nextLine();
		for(int x=0;x<qCount;x++)
		{
			String temp=sc.nextLine();
			String [] tempArr =temp.split(" ");
			//int [] v = Stream.of(temp.split(",\\s+")).mapToInt(Integer::parseInt).toArray();
			queries[x]=tempArr;					
		}
		sc.close();
		Solution s =new Solution();
		s.processQuery(queries,seqList,lastAnswer);
		
		

	}

}
