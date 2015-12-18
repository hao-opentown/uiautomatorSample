package com.tobrun.android.test.uiautomator;

import android.widget.FrameLayout;
import android.widget.TextView;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class ApiDemosTest extends UiAutomatorTestCase {
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		// Log
		Logger.d(ApiDemosTest.class.getName(), "setUp start");
		// Log
		Logger.d(ApiDemosTest.class.getName(), "setUp finish");

	}

	/**
	 * Test if the initial state of the label is visible & enabled
	 * 
	 * @throws UiObjectNotFoundException
	 */
	public void testLogTextBoxInitialStateButton() throws UiObjectNotFoundException {
		Logger.d(ApiDemosTest.class.getName(), "TEST : testing the initial state of the label");
		final UiObject label = UiAutomatorUtils.findTextViewByText("Contacts");
		Logger.d(ApiDemosTest.class.getName(), "label: " + label.getText() + " clickable: " + label.isClickable() );
		label.click();
		assertTrue(label.exists() && label.isEnabled());
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();

		// Log
		Logger.d(ApiDemosTest.class.getName(), "tearDown start");
		// Log
		Logger.d(ApiDemosTest.class.getName(), "tearDown finish");

	}

}
