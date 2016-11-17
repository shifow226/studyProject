package sample.form;

import org.apache.struts.action.ActionForm;

public class UpdateForm extends ActionForm {

	private int id;
	private String title = null;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
