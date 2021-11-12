package com.stormnet.yandex.framework.actions.diskActions;

import com.stormnet.yandex.framework.driver.UiDriver;
import com.stormnet.yandex.framework.driver.Waiter;
import com.stormnet.yandex.framework.pageWrappers.SideBarMenuWrapper;
import com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPageWrapper;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;

import static com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPageWrapper.getBin;
import static com.stormnet.yandex.framework.pageWrappers.diskWrappers.FilesPageWrapper.getDownloadedFile;

public class FilesPageActions {

	@Step("Move downloaded file to bin")
	public static void moveDownloadedFileToBin() {
		waitTillDownloadedFileShown();
		Actions action = new Actions(UiDriver.getDriver());
		action.dragAndDrop(getDownloadedFile().getElement(), getBin().getElement())
				.build()
				.perform();
	}

	@Step("Wait till downloaded File  has been shown")
	public static void waitTillDownloadedFileShown() {
		new Waiter().untilVisible(getDownloadedFile(), "Downloaded file hasn't been shown");
	}

	@Step("Wait till Files Page has opened")
	public static void waitTillFilesPageOpened() {
		new Waiter().untilVisible(SideBarMenuWrapper.getFilesFolderButtonInSideBarMenu(), "Files page hasn't been opened");
	}

}
