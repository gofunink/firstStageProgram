package cn.ibeifeng.gaofang;

import java.util.Scanner;

public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []Array={"剪刀","石头","布"};
		String []Boss = {"刘备","孙权","曹操"};//电脑角色
		int total=0;//对战次数
		int myScore=0;//我的分数
		int BossScore=0;//电脑分数
		System.out.println("--------欢迎进入游戏世界--------");
		System.out.println("        **********");
		System.out.println("        **猜拳，开始**");
		System.out.println("        **********");
		System.out.println("出拳规则：1.剪刀2.石头3.布");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请选择对方角色（1：刘备2：孙权3：曹操）：");
		int BossIndex=sc.nextInt();//选择电脑角色
		System.out.println("请输入你的大名：");
		String myName=sc.next();//我输入的名字
		System.out.println(Boss[BossIndex-1]+"VS"+myName);
		System.out.println("要开始吗？(y/n)");
		String judge=sc.next();//输入y或者n
		while("y".equals(judge)){
			total++;//循环一次，对战次数加1
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			System.out.println("请出拳：1.剪刀2.石头3.布（输入相应数字）：");
			int index = scanner.nextInt();//输入数组判断输入的是石头剪刀还是布
			int	BossNum =((int)(Math.random()*3) +1);//随机数，作用为让电脑随机出拳
			System.out.println("你出拳："+Array[index-1]);
			System.out.println(Boss[BossIndex-1]+"出拳："+Array[BossNum-1]);
			/*
			 * 判断输赢
			 */
			if(index-BossNum==0){
				System.out.println("和局，真衰！嘿嘿，等着瞧吧！");
			}
			else if(index-BossNum==-2||index-BossNum==1){
				System.out.println("你赢了！真棒！");
				myScore++;//赢了我的分数+1
			}
			else{
				System.out.println("你输了，再接再厉！");
				BossScore++;//输了电脑分数+1
			}
			System.out.println("要开始吗？（y/n）");
			if("n".equals(scanner.next())){//如果输入的是n，跳出循环
				break;
			}
		}
		/*
		 * 输出结果
		 */
		System.out.println(Boss[BossIndex-1]+"     VS  "+myName);
		System.out.println("对战次数："+total);
		System.out.println("姓名                  得分");
		System.out.println(myName+"    "+myScore);
		System.out.println(Boss[BossIndex-1]+"                   "+BossScore);

	}

}
