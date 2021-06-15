package swiss.fihlon.vaadin;

import com.vaadin.componentfactory.EnhancedDatePicker;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "/")
@PageTitle("Test View")
public class TestView extends Div {

    public TestView() {
        final var datePicker = new EnhancedDatePicker("Date");
        datePicker.setWeekNumbersVisible(true);

        // make sure the week number is not "hidden" on either side
        datePicker.getStyle().set("padding", "50px");

        add(datePicker);
    }
}
