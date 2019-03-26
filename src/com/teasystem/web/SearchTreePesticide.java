package com.teasystem.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.teasystem.entity.TreePesticide;
import com.teasystem.service.TreePesticideService;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchTreePesticide")
public class SearchTreePesticide extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTreePesticide() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 //设置请求与响应编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//获取参数farmid
		String farmId=request.getParameter("farmid");
		
		if(farmId!=null && farmId!="")
		{
			//调用服务层
			TreePesticideService tps=new TreePesticideService();
			TreePesticide treePesticide=tps.getTreePesticideByIdService(farmId);
			//如果数据库里存在对应的值
			if(treePesticide!=null)
			{
				System.out.println(treePesticide.toString());
				request.setAttribute("treepesticide", treePesticide);
				request.getRequestDispatcher("ResultTreePesticide.jsp").forward(request, response);
				return;
			}
		}
             //跳转到message.jsp页面
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
