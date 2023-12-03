<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<title>사원 정보 검색</title>
</head>
<body>
	<h4>부서를 선택하면 사원 정보를 확인할 수 있습니다.</h4>
	<span id="s1">
		<select onchange="clickS1()">
			<option>선택하세요</option>
			<c:forEach items = "${dlist}" var="dept">
				<option value="${dept.deptno }">${dept.dname}</option>	
			</c:forEach>
		</select>
	</span>
	<span id="s2" onchange="clickS2()">
		<select>
		</select>
	</span>
	<span id="info">
		
	</span>
	
	<script>
		async function clickS1(){
			
			let elem = document.querySelector("#s2 select");
			while(elem.hasChildNodes()){
				elem.removeChild(elem.firstChild)
			}
			
			let elem2 = document.querySelector("#info");
			while(elem2.hasChildNodes()){
				elem2.removeChild(elem2.firstChild)
			}
			
			let deptno = document.querySelector("#s1 select").value;
			
			let url = "/emp/emps?deptno="+deptno;
			let response = await fetch(url);
			let data = await response.json();
			//console.log(data);
			
			let firstOption = document.createElement('option');
			firstOption.setAttribute("label", "선택하세요");
			document.querySelector("#s2 select").appendChild(firstOption);
			data.forEach((emp) => {
				let option = document.createElement('option');
				option.setAttribute("value", emp.empno);
				option.setAttribute("label", emp.ename);
				document.querySelector("#s2 select").appendChild(option);
				}
			);
		}
		
		async function clickS2(){
			let elem = document.querySelector("#info");
			while(elem.hasChildNodes()){
				elem.removeChild(elem.firstChild)
			}
			
			let empno = document.querySelector("#s2 select").value;
			let url = "/emp/empinfo?empno="+empno;
			let response = await fetch(url);
			let emp = await response.json();
			
			let table = document.createElement("table");
			
			for(name in emp){
				let row = document.createElement("tr");
				let td = document.createElement("td")
				td.textContent = name;
				row.appendChild(td);
				td = document.createElement("td")
				td.textContent = emp[name];
				row.appendChild(td);
				table.appendChild(row);
			}
			
			
			document.querySelector("#info").appendChild(table);	
			
			
		}
		
	</script>
</body>
</html>