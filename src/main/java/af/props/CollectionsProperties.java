package af.props;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;

/**
 * Java collections.
 * <p>
 * As per documentation only field getters are needed.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "collections")
@Getter
public class CollectionsProperties {

    /**
     * A set of doubles.
     */
    private Set<Double> set = new HashSet<>();
    /**
     * A list of strings.
     */
    private List<String> list = new ArrayList<>();
    /**
     * A map of strings indexed by integers.
     */
    private Map<Integer, String> map = new HashMap<>();

}
