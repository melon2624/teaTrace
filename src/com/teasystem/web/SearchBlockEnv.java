package com.teasystem.web;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teasystem.entity.BlockEnv;
import com.teasystem.service.BlockEnvService;
/**
 * Servlet implementation class SearchBlockEnvServlet
 */
@WebServlet("/SearchBlockEnv")
public class SearchBlockEnv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchBlockEnv() {
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
				
				HttpSession session=request.getSession();
				
				//获取参数
				String blockid=request.getParameter("blockid");
				
				String tree_blockid=(String)session.getAttribute("tree_blockid");
				
				if(blockid!=null && blockid!="")
				{
					//调用服务层
					BlockEnvService tps=new BlockEnvService();
					BlockEnv blockenv=tps.getBlockEnvByIdService(blockid);
					if(blockenv!=null)
					{
						System.out.println(blockenv.toString());
						request.setAttribute("blockenv", blockenv);
						request.getRequestDispatcher("ResultBlockEnv.jsp").forward(request, response);
						return;
					}
				}
				else if(tree_blockid!=null && tree_blockid!="")
				{
					BlockEnvService tps=new BlockEnvService();
					BlockEnv blockenv=tps.getBlockEnvByIdService(String.valueOf(tree_blockid));
					if(blockenv!=null)
					{
						System.out.println(blockenv.toString());
						request.setAttribute("blockenv", blockenv);
						request.getRequestDispatcher("ResultBlockEnv.jsp").forward(request, response);
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
