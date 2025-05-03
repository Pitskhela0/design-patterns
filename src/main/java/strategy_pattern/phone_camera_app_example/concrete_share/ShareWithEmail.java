package strategy_pattern.phone_camera_app_example.concrete_share;

import strategy_pattern.phone_camera_app_example.Sharable;

public class ShareWithEmail implements Sharable {
    @Override
    public void share() {
        System.out.println("share with email");
    }
}
