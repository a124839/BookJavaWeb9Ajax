package action;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String execute() throws Exception {
		//httpservletresponse方法
		
		HttpServletResponse response = ServletActionContext.getResponse();//通过上下文获取response对象
		
		System.out.println(response.toString());
		response.setContentType("text/xml;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");//禁用IE缓存
		response.getWriter().print("错误，请再次输入");
		System.out.println(name);
		//检查name，password属性
		if (name.equals("tom")&&password.equals("1")) {
			response.getWriter().println("欢迎注册");
			System.out.println("=========if===========");
		}else {
			response.getWriter().println("请再次输入");
		}
		return SUCCESS;
	}
	
	
}
