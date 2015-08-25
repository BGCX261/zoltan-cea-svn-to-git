package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import forms.ClubForm;


public class ClubAction extends Action{
	Log logger=LogFactory.getLog(getClass());
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		ClubForm clubForm=(ClubForm)form;
		String edad =clubForm.getEdad();
		
		logger.info("apodo: "+clubForm.getNick());
		logger.info("edad: "+clubForm.getEdad());
		
		ActionForward actionForward;
		if (Integer.parseInt(request.getParameter("edad"))< 100){
			if(Integer.parseInt(request.getParameter("edad"))< 18){
			actionForward = mapping.findForward("menor");			
			}
			else
			actionForward = mapping.findForward("mayor");
		}
		else
		actionForward = mapping.findForward("anciano");
		return actionForward;
	}
}
