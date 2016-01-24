package awu.com.awutil;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

/**
 * Log util for {@link android.util.Log Log}.
 * Provide switcher function for log printer.
 * Created by yoyo on 2016/1/24.
 */
public class LogUtil {
    /**
     * Log level.
     */
    private static int LEVEL = Log.VERBOSE;

    /**
     * Set the log print level.
     * Just print log lower than the level.
     * It's also called by {@link awu.com.awutil.context.EasyApplication#setLogLevel(int)}.
     *
     * @param level Log level number.see the {@link android.util.Log Log} ,
     *              such as {@link android.util.Log#VERBOSE} and so on.
     *              If you want to stop print all level print,set the level
     *              bigger than 7{@link android.util.Log#ASSERT}.
     */
    public static void setLEVEL(int level) {
        LEVEL = level;
    }

    /**
     * Get the current log level.
     *
     * @return Log level number. Such as {@link android.util.Log#VERBOSE} and so on.
     */
    public static int getLEVEL() {
        return LEVEL;
    }

    /**
     * Send a verbose log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void v(String tag, String msg) {
        if (LEVEL <= Log.VERBOSE) {
            Log.v(tag, msg);
        }
    }

    /**
     * Send a verbose log message.
     *
     * @param obj Used to identify the source of a log message.It will be the object's
     *            class simple name {@link Class#getSimpleName()}.
     * @param msg The message you would like logged.
     */
    public static void v(Object obj, String msg) {
        v(obj.getClass().getSimpleName(), msg);
    }

    /**
     * Send a debug log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void d(String tag, String msg) {
        if (LEVEL <= Log.DEBUG) {
            Log.d(tag, msg);
        }
    }

    /**
     * Send a debug log message.
     *
     * @param obj Used to identify the source of a log message.It will be the object's
     *            class simple name {@link Class#getSimpleName()}.
     * @param msg The message you would like logged.
     */
    public static void d(Object obj, String msg) {
        d(obj.getClass().getSimpleName(), msg);
    }

    /**
     * Send a info log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void i(String tag, String msg) {
        if (LEVEL <= Log.INFO) {
            Log.i(tag, msg);
        }
    }

    /**
     * Send a info log message.
     *
     * @param obj Used to identify the source of a log message.It will be the object's
     *            class simple name {@link Class#getSimpleName()}.
     * @param msg The message you would like logged.
     */
    public static void i(Object obj, String msg) {
        i(obj.getClass().getSimpleName(), msg);
    }

    /**
     * Send a warn log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void w(String tag, String msg) {
        if (LEVEL <= Log.WARN) {
            Log.w(tag, msg);
        }
    }

    /**
     * Send a warn log message.
     *
     * @param obj Used to identify the source of a log message.It will be the object's
     *            class simple name {@link Class#getSimpleName()}.
     * @param msg The message you would like logged.
     */
    public static void w(Object obj, String msg) {
        w(obj.getClass().getSimpleName(), msg);
    }

    /**
     * Send a error log message.
     *
     * @param tag Used to identify the source of a log message.  It usually identifies
     *            the class or activity where the log call occurs.
     * @param msg The message you would like logged.
     */
    public static void e(String tag, String msg) {
        if (LEVEL <= Log.ERROR) {
            Log.e(tag, msg);
        }
    }

    /**
     * Send a error log message.
     *
     * @param obj Used to identify the source of a log message.It will be the object's
     *            class simple name {@link Class#getSimpleName()}.
     * @param msg The message you would like logged.
     */
    public static void e(Object obj, String msg) {
        e(obj.getClass().getSimpleName(), msg);
    }
}
