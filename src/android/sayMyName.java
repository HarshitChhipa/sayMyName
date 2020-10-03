package cordova.plugin.saymyname;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class sayMyName extends CordovaPlugin {


    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("sayMyName")) {
            String message = args.getString(0);
            cordova.getActivity().runOnUiThread(new Runnable() {
                public void run() {
                    // callbackContext.success(); // Thread-safe.
                    if (message != null && message.length() > 0) {
                        callbackContext.success("Chhipa....Harshit Chhipa");
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
