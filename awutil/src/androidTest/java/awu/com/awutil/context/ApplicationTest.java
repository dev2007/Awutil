package awu.com.awutil.context;

import android.app.Application;
import android.test.ApplicationTestCase;
import android.util.Log;

import awu.com.awutil.LogUtil;
import awu.com.awutil.context.EasyApplication;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

    /**
     * Test EasyApplication getContext function.
     */
    public void test_getContext(){
        assertNotNull(EasyApplication.getContext());
    }

    /**
     * test setLogLevel.
     */
    public void test_setLogLevel(){
        EasyApplication.setLogLevel(Log.ERROR);
        assertEquals(LogUtil.getLEVEL(),Log.ERROR);
    }
}