/**
 * @autor pathmasri
 * Aug 14, 2014 6:07:20 AM
 */
package ocwcd;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagTest extends SimpleTagSupport {
	
	public void doTag() throws JspException,IOException{
		//getJspContext().getOut().print("this is the lamest use of tag handler");
		getJspBody().invoke(null);
	}

}
