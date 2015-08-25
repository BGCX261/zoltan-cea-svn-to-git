package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import forms.LibroForm;


public class LibroAction extends Action{
	Log logger=LogFactory.getLog(getClass());
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		LibroForm libroForm=(LibroForm)form;
		
		logger.info("me llega del formulario el nombre: "+libroForm.getTitulo());
		
		ActionForward actionForward;
		if ((libroForm.getTitulo().equals("La crisis ninja"))||(libroForm.getTitulo().equals("La biblia")))
			actionForward = mapping.findForward("noTa");
		else
		actionForward = mapping.findForward("ta");
		return actionForward;
		
	}
	
	
	
	
}
