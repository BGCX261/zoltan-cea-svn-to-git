package forms;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class ClubForm extends ActionForm implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String nick;
	String edad;
	
	
	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public String getEdad() {
		return edad;
	}


	public void setEdad(String edad) {
		this.edad = edad;
	}


	@Override
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors actionErrors=new ActionErrors();
		if(request.getParameter("edad")==null  || request.getParameter("nick").equals("")){
			actionErrors.add("nick", new ActionMessage("error.nombreVacio"));
		}
		return actionErrors;
	}
	

}