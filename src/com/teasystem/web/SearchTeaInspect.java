package com.teasystem.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.teasystem.entity.TeaInspect;
import com.teasystem.service.TeaInspectService;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchTeaInspect")
public class SearchTeaInspect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTeaInspect() {
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
		//获取参数
		String qrcode=request.getParameter("qrcode");
		
		//取session内的qrcode
		HttpSession session = request.getSession();
		String qrcode_s=(String)session.getAttribute("qrcode");
		
		if(qrcode!=null && qrcode!="")
		{
			//调用服务层
			TeaInspectService tps=new TeaInspectService();
			TeaInspect teaInspect=tps.getTeaInspectByQrCodeService(qrcode);
			if(teaInspect!=null)
			{
				System.out.println(teaInspect.toString());
				request.setAttribute("teaInspectBean", teaInspect);
				request.getRequestDispatcher("ResultTeaInspect.jsp").forward(request, response);
				return;
			}
		}
		
		else if(qrcode_s!=null)
		{
			TeaInspectService tps=new TeaInspectService();
			TeaInspect teaInspect=tps.getTeaInspectByQrCodeService(qrcode_s);
			if(teaInspect!=null)
			{
				System.out.println(teaInspect.toString());
				request.setAttribute("teaInspectBean", teaInspect);
				request.getRequestDispatcher("ResultTeaInspect.jsp").forward(request, response);
				return;
			}
		}
		
		String produceid=request.getParameter("produceid");
		if(produceid!=null && produceid!="")
		{
			//调用服务层
			TeaInspectService tps=new TeaInspectService();
			TeaInspect teaInspect=tps.getTeaInspectByProduceIdService(produceid);
			if(teaInspect!=null)
			{
				System.out.println(teaInspect.toString());
				request.setAttribute("teaInspectBean", teaInspect);
				request.getRequestDispatcher("ResultInspect.jsp").forward(request, response);
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
