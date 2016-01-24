package awu.com.awutil.context;

import android.app.Application;
import android.content.Context;

import awu.com.awutil.LogUtil;

/**
 * Easy application class.
 * Provide some easy and universal functions.
 * Created by yoyo on 2016/1/24.
 */
public class EasyApplication extends Application {
    /**
     * Application context object.
     */
    private static Context _context = null;

    @Override
    public void onCreate(){
        super.onCreate();
        _context = getApplicationContext();
    }

    /**
     * Get the application {@link android.content.Context Context} object.
     * @return current application {@link android.content.Context Context} object.
     */
    public static Context getContext(){
        return _context;
    }

    public static void setLogLevel(int level){
        LogUtil.setLEVEL(level);
    }
}
