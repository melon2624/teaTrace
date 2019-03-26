package com.teasystem.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teasystem.entity.TreePick;
import com.teasystem.service.TreePickService;

/**
 * Servlet implementation class searchTreePick
 */
@WebServlet("/SearchTreePick")
public class SearchTreePick extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTreePick() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//获取参数
		String farm_id=request.getParameter("farmid");
		
		if(farm_id!=null && farm_id!="")
		{
			//调用服务层
			
			TreePickService treePickService=new TreePickService();
			TreePick treePick=treePickService.getTreePickByFarmIdService(farm_id);
			
			if(treePick!=null)
			{
				System.out.println(treePick.toString());
				request.setAttribute("treepick", treePick);
				request.getRequestDispatcher("ResultTreePick.jsp").forward(request, response);
				return;
			}
		
			
		request.setAttribute("messageTitle", "错误");
		request.setAttribute("messageContext", "没有找到结果！");
		request.getRequestDispatcher("message.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
