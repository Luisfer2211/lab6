import java.util.*;

class HashMapFactory implements MapFactory {
    public Map<String, String> createMap() {
        return new HashMap<>();
    }
}
