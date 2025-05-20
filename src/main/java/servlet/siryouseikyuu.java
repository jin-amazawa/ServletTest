package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/servlet/siryouseikyuu")
public class siryouseikyuu extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		
		String[] merumaga_checked = request.getParameterValues("merumagasyurui");
		
		String YesOrNo = request.getParameter("hopeYesOrNo"); 
		
		
		out.println("<p>氏名：" + name + "</p>");
		out.println("<p>会社：" + company + "</p>");
		out.println("<p>メールアドレス：" + email + "</p>");
		out.println("<p>問い合わせ内容：" + contact + "</p>");
		
		out.println("<p>メルマガ：</p>");
		for(int i = 0; i < merumaga_checked.length; i++) {
			out.println("<p>" + merumaga_checked[i] + "</p>");
		}
		
		
		
		if("Yes".equals(YesOrNo)) {
			out.println("この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です。");
		}else {
			out.println("資料請求を希望していません");
		}
		
		out.println("<p><a href = '#'>ダミーリンク</a></p>");
		
	}
}
