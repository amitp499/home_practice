package com.jp.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jp.entities.Products;
import com.jp.entities.UserMaster;
import com.jp.exceptions.ProductException;
import com.jp.services.ProductServices;
import com.jp.services.ProductServicesImpl;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	
	private ProductServices services;
    
    public FrontController() {
        super();
       
    }


	public void init() throws ServletException {
		
		try {
			
			services = new ProductServicesImpl();
			
		} catch (ProductException e) {
						
			throw new ServletException("Error in creating Services Object");
		}
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String command;
		String displayUserName=null;
		command = operateURI(request.getRequestURI());
		String jspName=null;
		String preName="/WEB-INF/jsps/";
		String postName=".jsp";
		HttpSession session =null;
		ArrayList<String> cartArr= new ArrayList();
		RequestDispatcher dispatcher = null;
		
		switch(command) {
		
			case "*" : {
				
				jspName="home";
				break;
			}
			
			case "Home" : {
				
				jspName="home";
				break;
			}
			
			case "displayCart" : {
				
				Cookie[] cookies = request.getCookies();
				
				session= request.getSession();
				for(Cookie c: cookies) {
						
					System.out.println(c.getName());
					if(c.getName().equals("itemsOncart")) {
						String cookcart = c.getValue();
						System.out.println(c.getValue());
						session.setAttribute("scart", cookcart);
						jspName="cartlist";
						break;
					}
											
					
					}
				
				//jspName="home";
				break;
			}
		
				
			case "MainMenu" : {
				boolean mfound=false;
				Cookie[] cookies = request.getCookies();
				
							
				
				for(Cookie c: cookies) {
					
					if((c.getName().equals("userName")) && (c.getValue().equals(session.getAttribute("displayUserName")))) {
						jspName="mainmenu";
						mfound=true;
						break;
					}
					
				}
								
				
				if (mfound==false) {
					jspName="home";
				}
			
									
				break;
			}
			
			case "Login" : {
				
				jspName="login";
				break;
			}
			case "Authenticate" : {
				
					String userName = request.getParameter("txtuserId");
					String userPass = request.getParameter("txtuserPass");
					UserMaster umm;
					try {
						umm = services.validateUserCredentials(userName, userPass);
						
						if (umm!=null) {
							
							
							 session= request.getSession();
							displayUserName = userName;
							session.setAttribute("displayUserName", displayUserName);
							
							Cookie sessionCookie = new Cookie("userName",displayUserName);
							response.addCookie(sessionCookie);
						
						
							//System.out.println("value of session "+session);			
							jspName="mainmenu";
							
						}else{
							
							String msg = "Inccorect Credential";
							request.setAttribute("message", msg);
							jspName="login";
						}
										
					
					} catch (ProductException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					break;
			}
			case "Logout" : {
				 session = request.getSession();
				 
				
				Cookie sessionCookie = new Cookie("userName","");
				sessionCookie.setMaxAge(0);
				response.addCookie(sessionCookie);
				String aa = (String) session.getAttribute("sessioncart");
				
				Cookie cartCookie = new Cookie("itemsOncart", aa);
				cartCookie.setMaxAge(259200);
				response.addCookie(cartCookie);
				
				
				jspName="logout";
				session.invalidate();
				break;
			}
			
			case "AddToCart" : {		
				session = request.getSession();
				 
				int bfAdd=cartArr.size();
				String pId = request.getParameter("id");
				cartArr.add(pId);
				int afAdd=cartArr.size();
				session.setAttribute("pId",pId );
				session.setAttribute("sessioncart", cartArr.get(0));
				
				//request.setAttribute("message","Selected Item Added to Cart" );
				
				
				
				if ((afAdd-bfAdd)==1) {
					
					request.setAttribute("message","Product Id - "+pId+" ,  Added to Cart" );
					jspName="cart";
				}else {
					
					request.setAttribute("message","Product Id - "+pId+", Failed to be Added to Cart" );
					jspName="cart";
				}
				
				/*System.out.println(cartArr.get(0));
				Cookie cartCookie = new Cookie("itemsOncart",cartArr.get(0).toString());
				cartCookie.setMaxAge(259200);
				response.addCookie(cartCookie);*/
				
				
				break;
			}
			
			case "productList" : {
				boolean pfound=false;
				
				session = request.getSession();
				Cookie[] cookies = request.getCookies();
				
				
				for(Cookie c: cookies) {
						
				
					if((c.getName().equals("userName")) && (c.getValue().equals(session.getAttribute("displayUserName")))) {
						pfound=true;
						try {
							ArrayList<Products> prdArray = services.displayProductList();
							request.setAttribute("aproductList", prdArray);
							jspName="productlist";
						} catch (ProductException e) {
							
							e.printStackTrace();
						}
						
					
						break;
					}
					
				}
				
				
					if (pfound==false) {
						jspName="home";
					}
																	
				
				break;
			}
		
		}
		
		dispatcher= request.getRequestDispatcher(preName+jspName+postName);
		dispatcher.forward(request, response);
		
	}
	
	private String operateURI(String Uri) {
		
		int leftPos = Uri.lastIndexOf("/");
		int rightPos = Uri.lastIndexOf(".");
		
		if(rightPos<=leftPos) {
			return "Home";
		}
		
		return Uri.substring(leftPos+1, rightPos);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
