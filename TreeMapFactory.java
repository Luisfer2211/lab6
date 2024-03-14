import java.util.*;

class TreeMapFactory implements MapFactory {
    public Map<String, String> createMap() {
        return new TreeMap<>();
    }
}