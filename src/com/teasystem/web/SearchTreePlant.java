package com.teasystem.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teasystem.entity.TreePlant;
import com.teasystem.service.TreePlantService;

/**
 * Servlet implementation class SearchTreePlantServlet
 */
@WebServlet("/SearchTreePlant")
public class SearchTreePlant extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTreePlant() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//设置请求与响应编码
				request.setCharacterEncoding("utf-8");
				response.setContentType("text/html;charset=utf-8");
				//获取参数
				String farmid=request.getParameter("farmid");
				//System.out.println(id);
				
				
				if(farmid!=null && farmid!="")
				{
					//调用服务层
					TreePlantService tps=new TreePlantService();
					TreePlant treePlant=tps.getTreePlantByIdService(farmid);
					//System.out.println(treePlant+"校验");
					if(treePlant!=null)
					{
						System.out.println(treePlant.toString());
						request.setAttribute("treeplant", treePlant);
						request.getRequestDispatcher("ResultTreePlant.jsp").forward(request, response);
						return;
					}
				}
				
				else 
				
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
