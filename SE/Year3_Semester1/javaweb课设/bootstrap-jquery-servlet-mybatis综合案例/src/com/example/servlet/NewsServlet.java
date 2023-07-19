package com.example.servlet;

import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.entity.DataWrapper;
import com.example.service.NewsService;
import com.example.utils.AjaxUtils;


public class NewsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public NewsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			findByCondition(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private void findByCondition(HttpServletRequest request, HttpServletResponse response) throws Exception {
		int page=Integer.parseInt(request.getParameter("page"));
		int rows=Integer.parseInt(request.getParameter("rows"));
		System.out.println(MessageFormat.format("page:{0},rows:{1}", page,rows));
		NewsService service=new NewsService();
		DataWrapper wrapper = service.findNewsByCondition(page, rows);
		AjaxUtils.sendJsonMsg(wrapper, response);		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
