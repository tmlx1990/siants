package com.siants.core.tools.json;

import com.fasterxml.jackson.databind.ObjectMapper;



/**
 * Json转实体类工具类
 * @author yanxin
 * 
 */
public class JacksonUtil {
	
	/**
	 * 将json转化为实体POJO
	 * @param jsonStr json字符串
	 * @param obj 实体类
	 * @return
	 * @author yanxin Created on: 2016年2月25日 下午4:24:30
	 */
	public static<T> Object JSONToObj(String jsonStr,Class<T> obj) {
		T t = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			t = objectMapper.readValue(jsonStr, obj);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return t;
	}
	
	/**
	 * 将实体类转换为json字符串
	 * @param obj 实体类
	 * @return
	 * @author yanxin Created on: 2016年2月25日 下午5:36:31
	 */
	public static<T> String ObjToJSON(Class<T> obj) {
		String jsonStr = null;
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			jsonStr = objectMapper.writeValueAsString(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return jsonStr;
	}
}
