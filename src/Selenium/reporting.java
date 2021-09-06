package Selenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class reporting {
	
	
	public void header(){
		Reporter.log("<html><head><style>table, th, td {  border: 1px solid black;  border-collapse: collapse;}th, td {  padding: 5px;  text-align: left;   }</style></head><body><h2>Cell that spans two columns</h2><p>To make a cell span more than one column, use the colspan attribute.</p><table style='width:100%'>  <tr>    <th>Name</th>    <th colspan='2'>Telephone</th>  </tr> ");
	}
	
	public void datalog(String data1, String data2, String data3){
		Reporter.log(" <tr>    <td>"+data1+"</td>    <td>"+data2+"</td>    <td>"+data3+"</td>  </tr>");
	}
	
	public void tableEnd(){
		Reporter.log("</table></body></html>");
	}
}
