<%@taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>PortalApp</title>
<base href=".">
<meta name="viewport" content="width=device-width,initial-scale=1">
<link rel="icon" type="image/x-icon" href="favicon.ico">
<link href="<%=request.getContextPath()%>/resources/styles.bundle.css" rel="stylesheet" />
</head>
<body>
	<app-root></app-root>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/inline.bundle.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/polyfills.bundle.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/scripts.bundle.js"></script>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/resources/main.bundle.js"></script>
</body>
</html>