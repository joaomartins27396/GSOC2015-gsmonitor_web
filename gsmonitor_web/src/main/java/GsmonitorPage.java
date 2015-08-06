

import org.geoserver.web.GeoServerBasePage;
import org.apache.wicket.markup.MarkupStream;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.ListChoice;
import org.apache.wicket.*;

public class GsmonitorPage extends GeoServerBasePage {
  public GsmonitorPage() {
       add( new Label( "hellolabel", "Hello World!") );
       ListChoice listchoise = new org.apache.wicket.markup.html.form.ListChoice("banana");
       
       Component c = new Component("01") {
		
		@Override
		protected void onRender(MarkupStream markupStream) {
			// TODO Auto-generated method stub
			
		}
	};
	add(c);
	
  }
}
