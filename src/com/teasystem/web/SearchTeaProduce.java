package com.teasystem.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teasystem.entity.TeaProduce;
import com.teasystem.service.TeaProduceService;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchTeaProduce")
public class SearchTeaProduce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTeaProduce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置请求与响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//获取参数
		String produceid=request.getParameter("produceid");
		//获取session
		HttpSession session = request.getSession();
		String produceid_session=String.valueOf((int)session.getAttribute("produceID"));
				
		if(produceid!=null && produceid!="")
		{
			//调用服务层
			TeaProduceService tps=new TeaProduceService();
			TeaProduce teaProduce=tps.getTeaProduceByIdService(produceid);
			if(teaProduce!=null)
			{
				System.out.println(teaProduce.toString());
				request.setAttribute("teaproduce", teaProduce);
				request.getRequestDispatcher("ResultTeaProduce.jsp").forward(request, response);
				return;
			}
		}
		
		else if(produceid_session!=null)
		{
			TeaProduceService tps=new TeaProduceService();
			TeaProduce teaProduce=tps.getTeaProduceByIdService(produceid_session);
			if(teaProduce!=null)
			{
				System.out.println(teaProduce.toString());
				request.setAttribute("teaproduce", teaProduce);
				request.getRequestDispatcher("ResultTeaProduce.jsp").forward(request, response);
				return;
			}
		}

		request.setAttribute("messageTitle", "错误");
		request.setAttribute("messageContext", "没有找到结果！");
		request.getRequestDispatcher("message.jsp").forward(request, response);
		return;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}