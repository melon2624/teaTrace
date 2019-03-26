package com.teasystem.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.teasystem.entity.TeaProcess;
import com.teasystem.service.TeaProcessService;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchTeaProcess")
public class SearchTeaProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTeaProcess() {
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
				//获取参数produceid
				String produceId=request.getParameter("produceid");
				if(produceId!=null && produceId!="")
				{
					//调用服务层
					TeaProcessService tps=new TeaProcessService();
					TeaProcess teaProcess=tps.getTeaProcessByIdService(produceId);
					//如果数据库里存在对应的值
					if(teaProcess!=null)
					{
						System.out.println(teaProcess.toString());
						request.setAttribute("teaprocess", teaProcess);
						request.getRequestDispatcher("ResultTeaProcess.jsp").forward(request, response);
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
