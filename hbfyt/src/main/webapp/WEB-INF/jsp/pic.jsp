<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%! int index=2; %>
<% int num = (int)request.getAttribute("num"); %>
<% List list = (List)request.getAttribute("src"); %>
<html>  
<head>  
<meta charset="UTF-8">  
<title>上传图片</title>  
</head>   
<body>   
    <form action="upload/image" method="post" enctype="multipart/form-data"  target="nm_iframe">
        <input type="file" name="file">  
        <input type="submit" value="上传"/>  
    </form>
    <a href="/pic">刷新</a>
    <iframe id="id_iframe" name="nm_iframe" style="display:none;"></iframe>    
    <div>
        <%for ( index = 0; index < num; index++){ 
             Object tmp = list.get(index);
             out.println("<img src='" + tmp + "' width='20%' height='20%'>");
        }%>
    </div>
    

</body>
</html>