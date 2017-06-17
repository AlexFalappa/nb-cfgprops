package af.props;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Java collections.
 * <p>
 * The {@code set} field has the setter to support initialization from a string of comma separated values.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "collections")
public class CollectionsProperties {

    /**
     * A set of doubles.
     */
    @Getter
    private final Set<Double> set = new HashSet<>();

    /**
     * A list of strings.
     */
    @Getter
    private final List<String> list = new ArrayList<>();

    /**
     * A map of strings indexed by integers.
     */
    @Getter
    private final Map<Integer, String> map = new HashMap<>();

    /**
     * A map of card suits indexed by integers.
     */
    @Getter
    private final Map<Integer, CardSuit> cardMap = new TreeMap<>();

}
