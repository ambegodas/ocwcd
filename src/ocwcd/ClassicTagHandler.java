/**
 * @autor pathmasri
 * Aug 15, 2014 5:19:48 PM
 */
package ocwcd;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class ClassicTagHandler extends TagSupport {
	
	JspWriter out;
	
	public int doStartTag() throws JspException{
		out = pageContext.getOut();
		
		try{			
			out.println("classic tag output");			
		} catch (IOException ex){
			throw new JspException("IOException-" + ex.toString());
		}
				
		return SKIP_BODY;
	}
	
	public int doEndTag() throws JspException {
		try {
		out.println("in doEndTag()");
		} catch(IOException ex) {
		throw new JspException("IOException-" + ex.toString());
		}		
		return EVAL_PAGE ;
	}

}
