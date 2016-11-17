package sample.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import sample.form.ParseActionForm;

public class ParseAction extends Action {
    public ActionForward execute(
        ActionMapping mapping,
        ActionForm form,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        ParseActionForm parseform = (ParseActionForm)form;
        String input = parseform.getInput();
        String output;
        int inRadix = Integer.parseInt(parseform.getInRadix());
        int outRadix = Integer.parseInt(parseform.getOutRadix());

        try {
            int tmp = Integer.parseInt(input, inRadix);
            output = Integer.toString(tmp, outRadix).toUpperCase();
        } catch(NumberFormatException nfe) {
            output = "Error!";
        }

        parseform.setOutput(output);

        return mapping.getInputForward();
    }
}