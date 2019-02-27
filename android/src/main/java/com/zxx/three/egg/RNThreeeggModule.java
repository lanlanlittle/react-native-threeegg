
package com.zxx.three.egg;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNThreeeggModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNThreeeggModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNThreeegg";
  }
}