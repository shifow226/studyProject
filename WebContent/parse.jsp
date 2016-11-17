<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!doctype html>
<html:html lang="true">
    <head>
        <title>進数変換</title>
        <link rel="stylesheet" href="parse.css" type="text/css">
    </head>
    <body>
        <html:form action="parse.do" method="post">
            <fieldset>
                <legend>入力</legend>
                <html:text property="input" size="30" /><br>
                <html:radio property="inRadix" value="2">2 進</html:radio>
                <html:radio property="inRadix" value="8">8 進</html:radio>
                <html:radio property="inRadix" value="10">10 進</html:radio>
                <html:radio property="inRadix" value="16">16 進</html:radio>
            </fieldset>
            <p><html:submit value="変換" /></p>
            <fieldset>
                <legend>出力</legend>
                <html:text property="output" size="30" /><br>
                <html:radio property="outRadix" value="2">2 進</html:radio>
                <html:radio property="outRadix" value="8">8 進</html:radio>
                <html:radio property="outRadix" value="10">10 進</html:radio>
                <html:radio property="outRadix" value="16">16 進</html:radio>
            </fieldset>
        </html:form>
    </body>
</html:html>