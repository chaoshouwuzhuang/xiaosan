package com.yangwe.common.utils;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PatternUitl {

	 /**
	   * 根据规则获取URL中数字,并转为日期
	   * @Title: getRqFromUrl 
	   * @Description: TODO
	   * @param url
	   * @return
	   * @return: Date
	   */
	public static Date  getRqFromUrl(String url) {
		//定义规则
		String pattern ="-(\\d+)-";
		//编译规则
		Pattern c = Pattern.compile(pattern);
		//匹配规则
		 Matcher m = c.matcher(url);
		 //查找匹配规则的内容
		 if(m.find()) {
		   return StringUtil.strToDate(m.group(1));
		 }
		return null;
		
	}
	
	
	/**
	 * 从url 获取 最后的数字
	 * @Title: getNumberFromUrl 
	 * @Description: TODO
	 * @param url
	 * @return: void
	 */
	public static Integer getNumberFromUrl(String url) {
		//
		String pattern ="[0-9]+(?=[^0-9]*$)";
		 Pattern c = Pattern.compile(pattern);
		 Matcher matcher = c.matcher(url);
		 if(matcher.find()) {
		  String str =matcher.group();
		  return StringUtil.strToInteger(str);
		 }
		return null;

	}
	
	
	
	
	/**
	 * 判断是否为数字类型
	 * @Title: strToNum 
	 * @Description: TODO
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public boolean strToNum(String str) {
		String pattern ="^[0-9]*$";
		Pattern c = Pattern.compile(pattern);
		Matcher matcher = c.matcher(str);
		return matcher.find();
	}
}
