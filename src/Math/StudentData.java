package Math;

public class StudentData 
{

	public static void main(String[] args) 
	{
		String names[]=new String[3];
		names[0]="veena";
		names[1]="shreyu";
		names[2]="teja";
		
		int Rollno[]=new int[3];
		Rollno[0]=99;
		Rollno[1]=89;
		Rollno[2]=19;
		
		char Gender[]=new char[3];
		Gender[0]='F';
		Gender[1]='M';
		Gender[2]='M';
		 
	   System.out.println("Studentnames" +"   "   +   "Roll No"+"      "+ "Gender");
	
      for (int i=0;i<3;i++)
      {
   	  
   	   System.out.println(names[i] +    "            "     + Rollno[i] +"           "+  Gender[i]);


      }
      
}
}