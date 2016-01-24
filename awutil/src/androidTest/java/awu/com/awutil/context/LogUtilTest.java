package awu.com.awutil.context;

import android.test.AndroidTestCase;
import android.util.Log;

import awu.com.awutil.LogUtil;

/**
 * Created by yoyo on 2016/1/24.
 */
public class LogUtilTest extends AndroidTestCase {

    /**
     * test basic level.
     */
    public void testBasicLevel(){
        assertEquals(LogUtil.getLEVEL(),Log.VERBOSE);
    }

    /**
     * test set -1 level.
     */
    public void testNegativeLevel(){
        LogUtil.setLEVEL(-1);
        assertEquals(LogUtil.getLEVEL(),-1);
    }

    /**
     * test set one of level. ERROR.
     */
    public void testOneLevel(){
        LogUtil.setLEVEL(Log.ERROR);
        assertEquals(LogUtil.getLEVEL(), Log.ERROR);
    }

    /**
     * test set higher level.9
     */
    public void testHigherLevel(){
        LogUtil.setLEVEL(9);
        assertEquals(LogUtil.getLEVEL(),9);
    }
}
