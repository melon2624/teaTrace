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

import com.teasystem.entity.TreeFertilize;
import com.teasystem.service.GetTreeFertHistory;

/**
 * Servlet implementation class SearchTreeFertilizeHistory
 */
@WebServlet("/SearchTreeFertilizeHistory")
public class SearchTreeFertilizeHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTreeFertilizeHistory() {
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
		List<Integer>fertids=(List<Integer>)session.getAttribute("fertids");
		
		if(session.getAttribute("fertids")==null)
		{
			response.sendRedirect("timeout.jsp");
		}
		
		List<TreeFertilize> tftl=new ArrayList<TreeFertilize>();
		
		TreeFertilize treeFertilize;
		
		tftl=GetTreeFertHistory.getFertHistory(fertids);
		
		if(tftl!=null)
		{
			for(int i=0;i<tftl.size();i++)
			{
				treeFertilize=tftl.get(i);
				System.out.println(treeFertilize.getFERT_CONTENT()+treeFertilize.getFERT_AMOUNT()+treeFertilize.getFARM_TIME());
			}
			
			request.setAttribute("fertlist", tftl);
			request.getRequestDispatcher("ResultTreeFertilizeHistory.jsp").forward(request, response);
		}
		else{
			
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
