package com.stormnet.yandex.framework.pageWrappers;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.elements.Button;
import org.openqa.selenium.By;

public class MovingPopUpWrapper {

	private static final By FIRST_FOLDER_ITEM_LOCATOR = By.xpath("//div[contains(@class,\"b-tree__name\")][1]");
	private static final By MOVE_BUTTON_LOCATOR = By.xpath("//button[contains(@class,\"Button2 Button2_theme_raised Button2_view_action Button2_size_m confirmation-dialog__button confirmation-dialog__button_submit \")]");

	public static Button getFirstFolderItem() {
		return new Button(UiDriver.getDriver(), FIRST_FOLDER_ITEM_LOCATOR);
	}

	public static Button getMoveButton() {
		return new Button(UiDriver.getDriver(), MOVE_BUTTON_LOCATOR);
	}
}
