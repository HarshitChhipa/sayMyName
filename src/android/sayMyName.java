package cordova.plugin.saymyname;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.apache.CordovaInterface;
import org.apache.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class sayMyName extends CordovaPlugin {

    @Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);
        // your init code here
    }

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("sayMyName")) {
            String message = args.getString(0);
            this.sayMyNameMethod(message, callbackContext);
            return true;
        }
        return false;
    }

    private void sayMyNameMethod(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success('Harshit Chhips is My Name');
        } else {
            callbackContext.error("Comon man Give me something at least.");
        }
    }
}
