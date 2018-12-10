package com.projet.posts;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/Post")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PostManager postManager;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostServlet() {
        super();
        // TODO Auto-generated constructor stub
        this.postManager = new PostManager();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setAttribute("posts", this.postManager.getAllPosts());
		
		request.setAttribute("jsonString", this.postManager.jsonString);

		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Post/index.jsp").forward(request, response);
	}

}
