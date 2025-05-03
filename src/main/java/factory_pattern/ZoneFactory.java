package factory_pattern;

import factory_pattern.zones.ZoneUSCentral;
import factory_pattern.zones.ZoneUSEastern;
import factory_pattern.zones.ZoneUSMountain;
import factory_pattern.zones.ZoneUSPacific;

public class ZoneFactory {
    public static Zone createZone(String zoneID){
        return switch (zoneID) {
            case "ea" -> new ZoneUSEastern("ea", "ea");
            case "ce" -> new ZoneUSCentral("ce", "ce");
            case "mo" -> new ZoneUSMountain("mo", "mo");
            case "pa" -> new ZoneUSPacific("pa", "pa");
            default -> null;
        };
    }
}
