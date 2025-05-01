package org.example.strategy_pattern.phone_camera_app_example;

public abstract class PhoneCameraApp {
    private Sharable shareBehaviour;
    public PhoneCameraApp(){}

    public void setShareBehaviour(Sharable shareBehaviour) {
        this.shareBehaviour = shareBehaviour;
    }
    public void performShare(){
        shareBehaviour.share();
    }

    public void take(){
        System.out.println("took a picture");
    }
    public void save(){
        System.out.println("saved a picture");
    }
    abstract public void edit();
}
