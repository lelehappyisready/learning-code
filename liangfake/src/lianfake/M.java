package lianfake;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;;


public class M {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		File file=new File("E:"+File.separator+"learning"+File.separator
		
			+"learning java"+ File.separator+"liangfake"+ File.separator+"execute.stdin");
		int a[]=new int[2];
		int count[]=new int[2];
		int flag=0; 
		long max=1;
		max=max<<62;
		
		if(file.exists()) 
		{
			InputStream input=new FileInputStream(file);
			Scanner scan=new Scanner(input);
			for(int i=0;i<2;i++)
			{
				a[i]=scan.nextInt();			
			}
			 scan.close(); 
		}
		if((a[0]==0|a[0]==1)&&a[1]>=1&&a[1]<=4777) 
		{
				switch(a[0])
				{
				case 0:
				for(int i=a[1];i<=max;i++)
				{
					for(int j=1;j<=i;j++)
					{
					if(i%j==0)
					{
						count[0]++;
					}
					if(count[0]==a[1])
						{
						flag=1;
						break;							
						}
				    }					
					count[0]=0;					
					if(flag==1) 
					{
						flag=0;
						System.out.print("X="+i);
						break;
					}
					if(i>max) 
						System.out.print("INF");	
				} 				
				    break;				
				case 1:
				for(int i=a[1];i<=47777;i++) 
				{
					for(int j=1;j<=i;j++) 
					{
					if(i%j!=0) 
					{
						count[1]++;						
					}
				
					if(count[1]==a[1])
					{
					flag=1;
					break;	
				    }
					}					
					count[1]=0;
				if(flag==1)
					{
						flag=0;
						System.out.print("X="+i);
						break;
					}					
				} 
				break;
				}
	
		}else  
		{
			System.out.print("Illegal!");
			
		}
			
			
		
			
			
		
	}

}
