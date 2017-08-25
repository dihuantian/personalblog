<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="comment-frame">
    <p class="comment-people">${param.sendmassageusername}</p>
    <p class="comment-content">${param.leaveamessagecontent}</p>
    <div>
        <span class="comment-people comment-number">#${param.status}</span>
        <a href="#" class="comment-people comment-number">来自安卓客户端</a>
        <div class="praise-low-frame">
            <span class="comment-people comment-number" style="margin-right: 0">Id:</span>
            <span class="comment-people comment-number" style="margin-right: 20px">${param.leaveamessageid}</span>
            <span class="glyphicon glyphicon-thumbs-up">
                <span class="number comment-content comment-number">
                    ${param.procrastination}
                </span>
            </span>
            <span class="glyphicon glyphicon-thumbs-down">
                    <span class="number comment-content comment-number">
                        ${param.low}
                    </span>
            </span>
            <c:if test="${param.flag==1}">
                <button id="deleteComment" class="btn-group" style="border: none;font-size:10px;color:#6d757a;margin-bottom: 4px" value="${param.leaveamessageid}">删除</button>
            </c:if>
        </div>
    </div>
</div>
