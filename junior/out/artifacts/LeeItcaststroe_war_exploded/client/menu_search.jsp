<%@ page import="java.net.URLEncoder" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<script type="text/javascript">
    /**
     * my_click和my_blur均是用于前台页面搜索框的函数
     */
//鼠标点击搜索框时执行
    function my_click(obj, myid){
        //点击时，如果取得的值和搜索框默认value值相同，则将搜索框清空
        if (document.getElementById(myid).value == document.getElementById(myid).defaultValue){
            document.getElementById(myid).value = '';
            obj.style.color='#000';
        }
    }
    //鼠标不聚焦在搜索框时执行
    function my_blur(obj, myid){
        //鼠标失焦时，如果搜索框没有输入值，则用搜索框的默认value值填充
        if (document.getElementById(myid).value == ''){
            document.getElementById(myid).value = document.getElementById(myid).defaultValue;
            obj.style.color='#999';
        }
    }

    /**
     * 点击搜索按钮执行的函数
     */
    function search(){
        document.getElementById("searchform").submit();
    }
</script>
<body>
<div id="divmenu">
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=文学">文学</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=生活">生活</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=计算机">计算机</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=外语">外语</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=经营">经管</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=励志">励志</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=社科">社科</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=学术">学术</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=少儿">少儿</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=艺术">艺术</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=原版">原版</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=科技">科技</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=考试">考试</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet?category=生活百科">生活百科</a>
    <a href="${pageContext.request.contextPath}/showProductByPageServlet" style="color:#b4d76d">全部商品目录</a>
</div>
<div id="divsearch">
    <form action="${pageContext.request.contextPath }/MenuSearchServlet" id="searchform">
        <table width="100%" border="0" cellspacing="0">
            <tr>
                <td style="text-align:right; padding-right:220px">
                    Search
                    <input type="text" name="textfield" class="inputtable" id="textfield" value="请输入书名"
                           onmouseover="this.focus();"
                           onclick="my_click(this, 'textfield');"
                           onBlur="my_blur(this, 'textfield');"/>
                    <a href="#">
                        <img src="../images/serchbutton.gif" border="0" style="margin-bottom:-4px" onclick="search()"/>
                    </a>
                </td>
            </tr>
        </table>
    </form>
</div>
</body>