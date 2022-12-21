package interview.com.logic.program;

public class CountRemoveSpace {

	public static void main(String[] args) {

		String str="hands on learning happens here";
		String s=" ";
		int count=0;
		for(char ch:str.toCharArray())//it will give length of an character 
		{
			if(ch==' ')
			{
				count+=1; //count=count+1
			}
			else 
			{
				s+=ch; //s=s+ch;
			}
		}
		System.out.println("white space:"+count);
		System.out.println("string without white space:"+s);
		
	}

}
