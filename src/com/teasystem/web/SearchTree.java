package com.teasystem.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teasystem.entity.Tree;
import com.teasystem.service.TreeService;


/**
 * Servlet implementation class searchTreePick
 */
@WebServlet("/SearchTree")
public class SearchTree extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTree() {
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
		
		HttpSession session = request.getSession();
		
		//获取参数
		String tree_id=request.getParameter("treeid");
		String tree_id_2=(String)session.getAttribute("treeid");
		
		if(tree_id!=null && tree_id!="")
		{
			//调用服务层
			
			TreeService treeService=new TreeService();
			Tree tree=treeService.getTreeByTreeIdService(tree_id);
			
			if(tree!=null)
			{
				System.out.println(tree.toString());
				request.setAttribute("tree", tree);
				request.getRequestDispatcher("ResultTree.jsp").forward(request, response);
				return;
			}
		}
		
		else if(tree_id_2!=null)
		{
			TreeService treeService=new TreeService();
			Tree tree=treeService.getTreeByTreeIdService(tree_id_2);
			
			if(tree!=null)
			{
				System.out.println(tree.toString());
				request.setAttribute("tree", tree);
				request.getRequestDispatcher("ResultTree.jsp").forward(request, response);
				return;
			}
		}
		request.setAttribute("messageTitle", "错误");
		request.setAttribute("messageContext", "查询超时");
		request.getRequestDispatcher("message.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
