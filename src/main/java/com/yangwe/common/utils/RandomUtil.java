package com.yangwe.common.utils;

import java.util.HashSet;
import java.util.Random;
public class RandomUtil {


	// 方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)

	public static int random(int min, int max) {
		Random r = new  Random();
		int i = r.nextInt(max - min +1 )  +min;
		return i;
	}

	// 方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。
	// (8分)
	public static int[] subRandom(int min, int max, int subs) {
		//定义一个数组,长度取决于 subs
		int[] a=new int[subs]; 

		//定义set集合
		HashSet<Integer> set = new HashSet<Integer>();
		//循环获取随机数
		while(set.size()<subs) {
			set.add( random(min,max));
		}
		//遍历set放入数组

		System.out.println(set);
		return a;
	}

	// 方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter() {
		String str ="123456789qazwsxedcrfvtgbyhnujmikolpQZWXEDCRFVTGBYHNUJMIKOLP";
		//产生随机数值  在 字符串 0 -字符串长度之间
		int i = random(0,str.length()-1);
		char c= str.charAt(i);
		return c;

	}

	// 方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length) {

		String str="";
		for(int i = 0; i<length;i++) {
			str+= randomCharacter();
		}
		return str;
	}
}
