
package com.tobrun.android.test.uiautomator;

import android.widget.FrameLayout;
import android.widget.TextView;

import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import jp.jun_nama.test.utf7ime.helper.Utf7ImeHelper;

/**
 * This is test sample to promote ctext.org on zhihu.
 */
public class CtextOrgPromote extends UiAutomatorTestCase {
	
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
	public void testSearch() throws UiObjectNotFoundException {
	    search("古籍");
    }

    private void search(String text) throws UiObjectNotFoundException{
		Logger.d(ApiDemosTest.class.getName(), "search " + text + " on zhihu.");
		final UiObject label = UiAutomatorUtils.findTextViewByDesc("搜索");
		Logger.d(ApiDemosTest.class.getName(), "label: " + label.getText() + " clickable: " + label.isClickable() );
		label.click();
        final UiObject input = new UiObject(new UiSelector().textContains("搜索").className(android.widget.EditText.class.getName()));
		Logger.d(ApiDemosTest.class.getName(), "input: " + input.getText() + " clickable: " + input.isClickable() );
        input.click();
        input.setText(Utf7ImeHelper.e(text));
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
