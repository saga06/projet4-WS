<%--
  Created by IntelliJ IDEA.
  User: sgahama
  Date: 10/05/2018
  Time: 05:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../_include/head.jsp"%>
<body>
<%@ include file="../_include/header.jsp" %>
<div class="container" id="main-content">
    <s:actionmessage />

    <h2><s:text name="myListBook"/></h2>

    <table id="table" class="table table-dark">
        <thead class="thead-dark">
        <tr>
<%--
            <th scope="col">id</th>
--%>
            <th scope="col">Titre</th>
            <th scope="col">Auteur(s)</th>
            <th scope="col">Editeur</th>
            <th scope="col">Thème(s)</th>
            <th scope="col" style="text-align: center">Date début d'emprunt</th>
            <th scope="col" style="text-align: center">Date limite de retour</th>
            <th scope="col" style="text-align: center">État du prêt</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="listBookBorrowedByUser">
            <tr class="table-primary">
                <%--<td>
                    <s:property value="idBorrow"/>
                </td>--%>
                <td>
                    <s:property value="title"/>
                </td>
                <td>
                    <s:iterator value="authors" status="loop">
                        <s:if test="#loop.last == true ">
                            <s:property value="name" />
                        </s:if>
                        <s:else>
                            <s:property value="name" />,
                        </s:else>
                    </s:iterator>
                </td>
                <td>
                    <s:property value="editorName"/>
                </td>
                <td>
                    <s:iterator value="themes" status="loop">
                        <s:if test="#loop.last == true ">
                            <s:property value="name" />
                        </s:if>
                        <s:else>
                            <s:property value="name" />,
                        </s:else>
                    </s:iterator>
                </td>
                <td style="text-align: center">
                    <s:date name="dateStart.toGregorianCalendar.time" format="dd/MM/yyyy" />
                </td>
                <td style="text-align: center">
                     <s:date name="dateEnd.toGregorianCalendar.time" format="dd/MM/yyyy" />
                </td>
                <td style="text-align: center">
                    <s:if test="%{returned==false}">
                        <s:if test="%{alreadyExtended==false}">
                            En cours
                            <s:a cssClass="btn btn-warning" action="borrow_extend">
                                <s:param name="id" value="idBorrow" />
                                Prolonger
                            </s:a>
                        </s:if>
                        <s:else>
                            <p>Emprunt déjà prolongé</p>
                        </s:else>
                    </s:if>
                    <s:else>
                        <p>Ouvrage rendu
                        <s:if test="%{returnedOnTime==false}">
                            (en retard)</p>
                        </s:if>
                        <s:else>
                            (dans les temps)</p>
                        </s:else>
                    </s:else>
                </td>
            </tr>
        </s:iterator>
        </tbody>
    </table>
</div>
<%@ include file="../_include/footer.jsp" %>
</body>
</html>
