package af.props;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Configuration properties with hints in the {@code META-INF/additional-spring-configuration-metadata.json} file
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "hinted")
@Getter
@Setter
public class HintedProperties {

    /**
     * A map of strings indexed by strings.
     * <p>
     * Keys should be person names, values should be pet animals.
     */
    private Map<String, String> map = new HashMap<>();

    /**
     * A person name.
     * <p>
     * Should have three hints but can have other values.
     */
    private String name;
}
