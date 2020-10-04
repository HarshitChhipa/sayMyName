package cordova.plugin.saymyname;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.util.Log;
import android.util.Log;

/**
 * This class echoes a string called from JavaScript.
 */
public class SayMyName extends CordovaPlugin {
    private final static String LOG_TAG = "SAY_MY_NAME";
    private static CordovaInterface cordova = null;
    private CallbackContext cordovaCallBack;

    public void initialize(CordovaInterface initCordova, CordovaWebView webView) {
        Log.d(LOG_TAG, "initialized");
        cordova = initCordova;
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.d(LOG_TAG, "executed");
        if (action.equals("sayMyName")) {
            String message = args.getString(0);
            Log.d(LOG_TAG,message);
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    if (message != null && message.length() > 0) {
                        callbackContext.success(message);
                    } else {
                        callbackContext.error("Common man Give me something at least.");
                    }
                }
            });
            return true;
        }
        return false;
    }
}
