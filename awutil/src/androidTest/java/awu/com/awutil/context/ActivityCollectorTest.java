package awu.com.awutil.context;

import android.app.Activity;
import android.test.AndroidTestCase;

/**
 * Created by yoyo on 2016/1/25.
 */
public class ActivityCollectorTest extends AndroidTestCase {

    public void test_push(){
        Activity activity = new Activity();
        ActivityCollector.push(activity);
    }
}
