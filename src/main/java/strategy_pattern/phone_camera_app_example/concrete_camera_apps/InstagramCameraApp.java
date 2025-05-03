package strategy_pattern.phone_camera_app_example.concrete_camera_apps;

import strategy_pattern.phone_camera_app_example.PhoneCameraApp;

public class InstagramCameraApp extends PhoneCameraApp {
    @Override
    public void edit() {
        System.out.println("editing in instagram editor");
    }
}
