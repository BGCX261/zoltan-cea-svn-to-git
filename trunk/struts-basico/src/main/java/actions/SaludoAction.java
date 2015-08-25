package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import forms.SaludoForm;


public class SaludoAction extends Action{
	Log logger=LogFactory.getLog(getClass());
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		SaludoForm saludoForm=(SaludoForm)form;
		String apellido =saludoForm.getApellidos();
		
		logger.info("me llega del formulario el nombre: "+saludoForm.getNombre());
		logger.info("me llegan los apellidos: "+saludoForm.getApellidos());
		
		ActionForward actionForward;
		if (saludoForm.getNombre().equals("zoltan"))
			actionForward = mapping.findForward("conocido");
		else
		actionForward = mapping.findForward("ok");
		return actionForward;
		
	}
	
	
	
	
}
