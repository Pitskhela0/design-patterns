package org.example.strategy_pattern.phone_camera_app_example;

import org.example.strategy_pattern.phone_camera_app_example.concrete_camera_apps.FacebookCameraApp;
import org.example.strategy_pattern.phone_camera_app_example.concrete_share.ShareWithLink;

public class AppSimulator {
    public static void main(String[] args) {
        PhoneCameraApp app = new FacebookCameraApp();
        app.setShareBehaviour(new ShareWithLink());

        app.edit();
        app.performShare();
    }
}
