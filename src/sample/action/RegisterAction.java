package sample.action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

//import org.apache.catalina.Context;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import sample.form.RegisterForm;
import sample.model.CompleteModel;

public class RegisterAction extends Action {

    public ActionForward execute(
        ActionMapping mapping,
        ActionForm form,
        HttpServletRequest request,
        HttpServletResponse response) throws Exception {

        RegisterForm registerForm = (RegisterForm) form;

        // データベースへの登録処理
        DataSource ds = null;
        Connection con = null;
        PreparedStatement ps = null;

        int id = registerForm.getId();
//        String title = registerForm.getTitle();

        String strSql = "INSERT INTO form(ID, TITLE) VALUES(?,?)";

        try {

        	//コンテキスト初期化
        	Context ctx = new InitialContext();

        	//データソースのlookup
        	ds = (DataSource)ctx.lookup("java:comp/env/jdbc/mysql");

        	//コネクションオブジェクト定義
        	con = ds.getConnection();

        	//SQLコマンドを作成
        	ps = con.prepareStatement(strSql);
        	ps.setInt(1, id);
        	ps.setString(2, registerForm.getTitle());
        	ps.executeUpdate();

        	CompleteModel complete = new CompleteModel();
        	complete.setCompleteTitle("登録完了");
        	complete.setCompleteMessage("登録完了しました");

        	request.setAttribute("CompleteInfo", complete);

        } catch (Exception e) {
            throw e;
        } finally {
            con.close();
        }

        request.getRequestDispatcher("/complete.jsp").forward(request, response);
        return mapping.findForward("success");
    }
}

