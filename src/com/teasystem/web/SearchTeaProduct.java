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

import com.teasystem.entity.TeaProduce;
import com.teasystem.entity.TeaProduct;
import com.teasystem.service.GetFertIDsByTreeID;
import com.teasystem.service.GetPestIDsByTreeID;
import com.teasystem.service.GetTreeBlockID;
import com.teasystem.service.TeaProduceService;
import com.teasystem.service.TeaProductService;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchTeaProduct")
public class SearchTeaProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchTeaProduct() {
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
		
		/*if(qrcode!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("qrcode", qrcode);
		}*/
		
		if(qrcode!=null && qrcode!="")
		{
			//调用服务层
			
			TeaProductService tps=new TeaProductService();
			TeaProduct teaProduct=tps.getTeaProductByIdService(qrcode);
			
			
			if(teaProduct!=null)
			{
				
				HttpSession session = request.getSession();
				session.setAttribute("qrcode", qrcode);				//二维码信息存入session
				
				session.setAttribute("teaproduct", teaProduct);		//session中存一份teaproduct
				
				int produceid=teaProduct.getPRODUCE_ID();			//取得批次编号
				
				String produceid_s=String.valueOf(produceid);		//数字转字符串
				
				session.setAttribute("produceid", produceid_s);		//批次编号存入Session中
				
				//TODO: 通过produce_id查询process_id和tree_id
				
				if(produceid_s!=null)	//如果批次不为空
				{
					TeaProduceService teaproduceservice=new TeaProduceService();
					TeaProduce teaProduce=teaproduceservice.getTeaProduceByIdService(produceid_s);
					
					int treeid=teaProduce.getTREE_ID();
					String treeid_s=String.valueOf(treeid);
					
					session.setAttribute("treeid", treeid_s);		//树编号存入Session中
					
					String tree_blockid=GetTreeBlockID.getTreeBlockID(treeid_s);
					session.setAttribute("tree_blockid", tree_blockid);		//树的地块编号存入Session中
					
					List<Integer> fertids = new ArrayList<Integer>();	//施肥记录保存到session
					fertids=GetFertIDsByTreeID.getIDs(treeid);
					session.setAttribute("fertids", fertids);
					
					List<Integer> pestids = new ArrayList<Integer>();	//杀虫记录保存到session
					pestids=GetPestIDsByTreeID.getIDs(treeid);
					session.setAttribute("pestids", pestids);
					
					
				}
				
				System.out.println(teaProduct.toString());
				request.setAttribute("teaproduct", teaProduct);
				request.getRequestDispatcher("index.jsp").forward(request, response);
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
