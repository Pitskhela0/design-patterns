package org.example.strategy_pattern.phone_camera_app_example.concrete_camera_apps;

import org.example.strategy_pattern.phone_camera_app_example.PhoneCameraApp;

public class FacebookCameraApp extends PhoneCameraApp {
    @Override
    public void edit() {
        System.out.println("editing in facebook editor");
    }
}
