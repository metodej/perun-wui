package cz.metacentrum.perun.wui.client.resources;

import com.google.gwt.i18n.client.Messages;

/**
 * Global UI translations
 *
 * @author Pavel Zlámal <zlamal@cesnet.cz>
 */
public interface PerunTranslation extends Messages {

	@DefaultMessage("Not found")
	public String notFoundPageTitle();

	@DefaultMessage("Requested page was not found. Please check your URL and try again.")
	public String notFoundPageText();

	@DefaultMessage("Not authorized")
	public String notAuthorizedPageTitle();

	@DefaultMessage("You are not authorized to view requested content. Please check your URL.")
	public String notAuthorizedPageText();

	@DefaultMessage("You have been logged out.")
	public String logoutPageTitle();

	@DefaultMessage("Please close the browser window.")
	public String logoutPageSubTitle();

	@DefaultMessage("Log me back")
	public String logoutPageButton();

}