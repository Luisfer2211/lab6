import java.util.*;

class LinkedHashMapFactory implements MapFactory {
    public Map<String, String> createMap() {
        return new LinkedHashMap<>();
    }
}