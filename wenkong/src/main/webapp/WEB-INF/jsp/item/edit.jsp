<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>ttttttt</title>

</head>
<body>

<p>上传图片：${model}</p>
<form id="itemForm"
<%--      action="${pageContext.request.contextPath }/report/updateReport.do"--%>
      action="${pageContext.request.contextPath }/report/updateReport.do"

      method="post"
      enctype="multipart/form-data"
>
    <input type="hidden" name="id" value="1" />
    <table width="100%" border=1>

            <tr>

                <td>
                    <c:if test="${item.pic !=null}">
<%--                        <img src="http://127.0.0.1:8081/pic/1.jpg" width=100 height=100/>--%>
                        <img src=" http://120.76.76.73:8081/pic/${item.pic}" width=100 height=100/>
                        <br/>
                    </c:if>
                    <input type="file"  name="pictureFile"/>
                </td>
            </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="提交" />
            </td>
        </tr>
    </table>

</form>
</body>

</html>