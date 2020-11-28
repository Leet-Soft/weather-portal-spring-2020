package uni.fmi.masters.vaadin.ui;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;

@Route("vaadin")
public class MainUI extends Div {
	private static final long serialVersionUID = 1L;

	public MainUI() {
		setText("My first Vaadin page.");
	}
}
