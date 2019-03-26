package com.teasystem.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teasystem.entity.TreeFertilize;
import com.teasystem.service.TreeFertilizeService;

/**
 * Servlet implementation class SearchTreeFertilizeServlet
 */
@WebServlet("/SearchTreeFertilize")
public class SearchTreeFertilize extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTreeFertilize() {
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
		
		if(farmid!=null && farmid!="")
		{
			//调用服务层
			TreeFertilizeService tfs=new TreeFertilizeService();
			TreeFertilize treeFertilize=tfs.getTreeFertilizeByIdService(farmid);
			if(treeFertilize!=null)
			{
				System.out.println(treeFertilize.toString());
				request.setAttribute("treefertilize", treeFertilize);
				request.getRequestDispatcher("ResultTreeFertilize.jsp").forward(request, response);
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
