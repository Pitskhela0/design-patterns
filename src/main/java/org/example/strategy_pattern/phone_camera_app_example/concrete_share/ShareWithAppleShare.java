package org.example.strategy_pattern.phone_camera_app_example.concrete_share;

import org.example.strategy_pattern.phone_camera_app_example.Sharable;

public class ShareWithAppleShare implements Sharable {
    @Override
    public void share() {
        System.out.println("sharing with apple share");
    }
}
