package ua.lviv.lgs.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import ua.lviv.lgs.domain.Bucket;
import ua.lviv.lgs.service.impl.BucketServiceImpl;

/**
 * Servlet implementation class ShowBucket
 */
@WebServlet("/showbucket")
public class ShowBucket extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private BucketServiceImpl bucketService = (BucketServiceImpl) BucketServiceImpl.getBucketService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Bucket> products = bucketService.readAll();
		String json = new Gson().toJson(products);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

}
