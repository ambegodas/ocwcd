/**
 * @autor pathmasri
 * Aug 15, 2014 2:08:24 AM
 */
package ocwcd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class TagHandlerWithAttribute extends SimpleTagSupport {
	
	private ArrayList<String> movieList;
	

	/**
	 * @param movieList the movieList to set
	 */
	public void setMovieList(ArrayList<String> movieList) {
		this.movieList = movieList;
	}


	public void doTag() throws JspException,IOException{
		//getJspContext().getOut().print("this is the lamest use of tag handler");
		
		for(String movie: movieList){
			getJspContext().setAttribute("movie", movie);
			getJspBody().invoke(null);
		}
	}
	
}
