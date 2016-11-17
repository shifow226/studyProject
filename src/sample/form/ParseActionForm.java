package sample.form;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class ParseActionForm extends ActionForm {
    private static final long serialVersionUID = 1L;

    private String input;
    private String output;
    private String inRadix;
    private String outRadix;

    public ParseActionForm() {
        inRadix = "10";
        outRadix = "10";
    }

    public String getInput() {
        return input;
    }
    public void setInput(String input) {
        this.input = input;
    }
    public String getOutput() {
        return output;
    }
    public void setOutput(String output) {
        this.output = output;
    }
    public String getInRadix() {
        return inRadix;
    }
    public void setInRadix(String inRadix) {
        this.inRadix = inRadix;
    }
    public String getOutRadix() {
        return outRadix;
    }
    public void setOutRadix(String outRadix) {
        this.outRadix = outRadix;
    }

    public void reset(ActionMapping mapping, HttpServletRequest request) {
        super.reset(mapping, request);
        try {
            request.setCharacterEncoding("utf-8");
        } catch(UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
    }
}