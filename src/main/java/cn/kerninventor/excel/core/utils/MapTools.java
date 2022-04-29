package cn.kerninventor.excel.core.utils;

import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/**
 * <p>
 *
 * </p>
 *
 * @author kern
 */
public class MapTools {

    public static <V> Object getKeyByValue(Map<?, V> map, V value) {
        return map.values().stream().filter(value::equals).findFirst().orElse(null);
    }

    public static <V> Object getKeyByValueOfArrays(Map<?, V[]> map, V value) {
        Object key = null;
        for (V[] vs : map.values()) {
            key = Arrays.stream(vs).filter(value::equals).findFirst().orElse(null);
            if (key != null) {
                return key;
            }
        }
        return key;
    }

    public static <V> Object getKeyByValueOfCollection(Map<?, Collection<V>> map, V value) {
        Object key = null;
        for (Collection<V> vs : map.values()) {
            key = vs.stream().filter(value::equals).findFirst().orElse(null);
            if (key != null) {
                return key;
            }
        }
        return key;
    }
}
