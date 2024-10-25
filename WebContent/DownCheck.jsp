<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>

<div style="background-color: gray;background: white;font-family: cursive;">
<h1>DOWNLOAD FILE LIST</h1>
</div>
<pre>
<a href="./down.do?filename=downimage">DOWNLOAD IMAGE</a>
<html:link action="down.do?filename=downfile">DOWNLOAD FILE</html:link>
<html:link action="down.do?filename=downcsv">DOWNLOAD CSV FILE</html:link>
<a href="./down.do?filename=downtxt">DOWNLOAD TXT FILE</a>
</pre>
