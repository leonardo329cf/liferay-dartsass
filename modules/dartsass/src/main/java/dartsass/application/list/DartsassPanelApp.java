package dartsass.application.list;

import dartsass.constants.DartsassPanelCategoryKeys;
import dartsass.constants.DartsassPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author leonardo.ferreira
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + DartsassPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class DartsassPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return DartsassPortletKeys.DARTSASS;
	}

	@Override
	@Reference(
		target = "(javax.portlet.name=" + DartsassPortletKeys.DARTSASS + ")",
		unbind = "-"
	)
	public void setPortlet(Portlet portlet) {
		super.setPortlet(portlet);
	}

}