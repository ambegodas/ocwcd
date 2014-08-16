/**
 * @autor pathmasri
 * Aug 15, 2014 6:26:03 PM
 */
package ocwcd;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class RepeatBodyClassicTagHandler extends TagSupport {

	String[] movies= new String[] {"Spiderman", "Saved!", "Amelie"};
	int movieCounter;
	
	public int doStartTag() throws JspException {
	movieCounter=0;
	pageContext.setAttribute("movie", movies[movieCounter]);
	movieCounter++;
	return EVAL_BODY_INCLUDE;
	}
	
	public int doAfterBody() throws JspException {
		
	if (movieCounter < movies.length) {		
	pageContext.setAttribute("movie", movies[movieCounter]);
	movieCounter++;
	return EVAL_BODY_AGAIN;	
	} else {
	return SKIP_BODY;
	}
	}

	public int doEndTag() throws JspException {
	return EVAL_PAGE;
	}
	
}
