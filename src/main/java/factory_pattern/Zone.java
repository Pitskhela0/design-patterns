package factory_pattern;

public class Zone {
    private String displayName;
    private String offset;

    public Zone(String displayName, String offset) {
        this.displayName = displayName;
        this.offset = offset;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getOffset() {
        return offset;
    }
}
