package com.teasystem.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.teasystem.service.GetProcessIDsByProduceID;


/**
 * Servlet implementation class ClearSearchItemServlet
 */
@WebServlet("/ClearSearchItemServlet")
public class TestFunctionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestFunctionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		/*List<Integer> fertilizeIDs=GetFertilizeIDsByTreeIDService.getIDs(1);
		
		for (int i = 0; i < fertilizeIDs.size(); i++) 
		{
			System.out.println(fertilizeIDs.get(i)); 
		}
		
		List<Integer> IDs=GetPesticideIDsByTreeIDService.getIDs(1);
		
		for (int i = 0; i < IDs.size(); i++) 
		{
			System.out.println(IDs.get(i)); 
		}*/
		
		List<Integer> IDs=GetProcessIDsByProduceID.getIDs(1);
		
		for (int i = 0; i < IDs.size(); i++) 
		{
			System.out.println(IDs.get(i)); 
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
