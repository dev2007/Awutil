package awu.com.awutil.context;

import android.app.Activity;

import java.util.ArrayList;

/**
 * ActivityCollector for manage {@link android.app.Activity Activity}.
 * Created by yoyo on 2016/1/25.
 */
public class ActivityCollector {
    /**
     * Container for store activities.
     */
    private static ArrayList<Activity> _arrayList = new ArrayList<>();

    /**
     * Add activity into the container.
     * @param activity {@link android.app.Activity Activity} object.
     * @return      * if it's exists,return false,or true.
     */
    public static boolean push(Activity activity){
        if(_arrayList.contains(activity))
            return false;

        _arrayList.add(activity);
        return true;
    }

    /**
     * Remove activity from the container.
     * @param activity {@link android.app.Activity Activity} object.
     */
    public static void pop(Activity activity){
        if(_arrayList.contains(activity))
            _arrayList.remove(activity);
    }

    /**
     * Finish all activities stored in the container.
     */
    public static void finishAll(){
        for (Activity activity : _arrayList){
            if(!activity.isFinishing())
                activity.finish();
        }
    }
}
