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
		//httpservletresponse����
		
		HttpServletResponse response = ServletActionContext.getResponse();//ͨ�������Ļ�ȡresponse����
		
		System.out.println(response.toString());
		response.setContentType("text/xml;charset=UTF-8");
		response.setHeader("Cache-Control", "no-cache");//����IE����
		response.getWriter().print("�������ٴ�����");
		System.out.println(name);
		//���name��password����
		if (name.equals("tom")&&password.equals("1")) {
			response.getWriter().println("��ӭע��");
			System.out.println("=========if===========");
		}else {
			response.getWriter().println("���ٴ�����");
		}
		return SUCCESS;
	}
	
	
}
