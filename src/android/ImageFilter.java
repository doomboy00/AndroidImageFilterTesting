package co.uk.ultimateweb.imagefilter;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;

import co.uk.ultimateweb.imagefilter.Filters;

public class ImageFilter extends CordovaPlugin {
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("echo")) {
            String message = args.getString(0);
            return this.echo(message, callbackContext);
        }


        boolean result = false;

        final Filters filters = new Filters();

        if(action.equalsIgnoreCase("none")){
            String fileInfo = filters.none(data);
            //result = new PluginResult(Status.OK, fileInfo);

            result = true;
            callbackContext.success(fileInfo);
        }
        if(action.equalsIgnoreCase("stark")){
            String fileInfo = filters.stark(data);
            // result = new PluginResult(Status.OK, fileInfo);

            result = true;
            callbackContext.success(fileInfo);
        }
        if(action.equalsIgnoreCase("sunnyside")){
            String fileInfo = filters.sunnyside(data);
            //result = new PluginResult(Status.OK, fileInfo);

            result = true;
            callbackContext.success(fileInfo);
        }

        if(action.equalsIgnoreCase("vintage")){
            String fileInfo = filters.vintage(data);
            //result = new PluginResult(Status.OK, fileInfo);

            result = true;
            callbackContext.success(fileInfo);
        }
        if(action.equalsIgnoreCase("worn")){
            String fileInfo = filters.worn(data);
            //result = new PluginResult(Status.OK, fileInfo);

            result = true;
            callbackContext.success(fileInfo);
        }

        return result;
    }

    private boolean echo(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            callbackContext.success(message);
            return true;
        } else {
            callbackContext.error("Expected one non-empty string argument.");
            return false;
        }
    }
}