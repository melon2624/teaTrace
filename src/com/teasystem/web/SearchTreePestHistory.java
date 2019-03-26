package com.teasystem.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teasystem.entity.TreePesticide;
import com.teasystem.service.GetTreePestHistory;

/**
 * Servlet implementation class SearchTreePestHistory
 */
@WebServlet("/SearchTreePestHistory")
public class SearchTreePestHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTreePestHistory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session=request.getSession();
		
		@SuppressWarnings("unchecked")
		List<Integer>pestids=(List<Integer>)session.getAttribute("pestids");
		
		if(session.getAttribute("pestids")==null)
		{
			response.sendRedirect("timeout.jsp");
		}
		
		List<TreePesticide> tptl=new ArrayList<TreePesticide>();
		
		tptl=GetTreePestHistory.getPestHistory(pestids);
		
		if(tptl!=null)
		{
			/*for(int i=0;i<tptl.size();i++)
			{
				treePesticide=tptl.get(i);
				System.out.println(treePesticide.getPESTI_CONTENT()+treePesticide.getPESTI_AMOUNT()+treePesticide.getFARM_TIME());
			}*/
			
			request.setAttribute("pestlist", tptl);
			request.getRequestDispatcher("ResultTreePestcideHistory.jsp").forward(request, response);
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
