package com.example.utils;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;


public class AjaxUtils {
	public static String toJson(Object obj) {
		String json = JSON.toJSONString(obj
				,SerializerFeature.WriteNullStringAsEmpty
				,SerializerFeature.DisableCircularReferenceDetect
				,SerializerFeature.WriteEnumUsingToString
				);
		return json;
	}
	public static void sendJsonMsg(Object msg,HttpServletResponse response) throws IOException {
		String json = JSON.toJSONString(msg
				,SerializerFeature.WriteNullStringAsEmpty
				,SerializerFeature.DisableCircularReferenceDetect
				,SerializerFeature.WriteEnumUsingToString
				);
		//String json = JSON.toJSONString(msg,SerializerFeature.DisableCircularReferenceDetect);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out;
		out = response.getWriter();
		out.print(json);
		out.flush();
		out.close();
	}
	
	public static void sendStringMsg(Object msg,HttpServletResponse response)  throws IOException {
		response.setContentType("text/plain; charset=utf-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out;
		out = response.getWriter();
		out.print(msg);
		out.flush();
		out.close();
	}
	public static void sendBinaryMsg(byte[] byteArray,HttpServletResponse response) throws IOException {
		response.setContentType("multipart/form-data");
		ServletOutputStream out = null;
        out = response.getOutputStream();
        out.write(byteArray);
        out.flush();
		out.close();
	}
	public static void sendJsonMsg(String jsonString,HttpServletResponse response) throws IOException {
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out;
		out = response.getWriter();
		out.print(jsonString);
		out.flush();
		out.close();
	}
}
