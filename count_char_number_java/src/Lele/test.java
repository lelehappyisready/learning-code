package Lele;

import java.util.Scanner;;

//题目描述：编写程序将字符串中的字符用字符加数字的形式表示，比如：输入一串字母AAAABBBCCCD，输出格式为：A4B3C3D1

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int len = str.length();//将输入的第一个字符用来做比较的基准值
		char nowchar = str.charAt(0);
		int count = 1,pos = 0;
		
		String res = ""; //用来存结果，用string字符串的形式输出
		if (len == 0)
			System.out.println(); //输入为空的时候
		else //输入不为空时
		{
			pos++;
			while(pos < len)  //循环判断并且计数
			{
				if(str.charAt(pos) == nowchar)//依次比较当前值与对比的值，相等则计数，并且移动到下一个位置
				{
					count++; 
					pos++;
					continue;				
				}
				else  //不相等则重新定一个比较值，将当前下标的字符用作比较字符。此时要先将上一个比较字符和次数保存到输出值中
				{
					res += nowchar;
					res += count;
					count = 1;
					nowchar = str.charAt(pos);
					pos++;
				}
			}
			res += nowchar; //处理最后一个字符
			res += count;		
			System.out.println(res);	
		}
			
	}

}
