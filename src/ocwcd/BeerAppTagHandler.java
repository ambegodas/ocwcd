/**
 * @autor pathmasri
 * Aug 16, 2014 2:20:25 PM
 */
package ocwcd;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class BeerAppTagHandler extends SimpleTagSupport implements DynamicAttributes {
	
	private String name;
	private String size;
	private List optionsList;
	
	private static final String ATTR_TEMPLATE = "%s='%s'" ;
	private static final String OPTION_TEMPLATE = "<option value='%1$s'> %1$s </option>";
	
	
	public void doTag() throws IOException,JspException	{
		
		PageContext pageContext = (PageContext) getJspContext();
		JspWriter out = pageContext.getOut();
		
		out.print("<select");
		out.print(String.format(ATTR_TEMPLATE, " name", this.name));
		//out.print(String.format(ATTR_TEMPLATE, "size", this.size));
		
		for ( String attrName : tagAttrs.keySet() ) {
			String attrDefinition = String.format(ATTR_TEMPLATE, attrName, tagAttrs.get(attrName));
			out.print(attrDefinition);
		}
		
		out.println('>');
		
		for(Object option:optionsList){
			
			String optionTag = String.format(OPTION_TEMPLATE, option.toString());
			out.println(optionTag);
		}
		
		out.println("</select>");
		
	}
	
	
	
	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param optionsList the optionsList to set
	 */
	public void setOptionsList(List optionsList) {
		this.optionsList = optionsList;
	}



	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.DynamicAttributes#setDynamicAttribute(java.lang.String, java.lang.String, java.lang.Object)
	 */
	@Override
	public void setDynamicAttribute(String arg0, String name, Object value)
			throws JspException {
		tagAttrs.put(name, value);
		
	}
	
	private Map<String,Object> tagAttrs = new HashMap<String,Object>();
		
}
