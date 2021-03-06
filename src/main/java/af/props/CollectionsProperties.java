package af.props;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import org.springframework.util.MimeType;

/**
 * Java collections.
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
     * A map of ages (integers) indexed by names (strings).
     */
    @Getter
    private final Map<String, String> agesMap = new HashMap<>();

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

    /**
     * A map of booleans indexed by card suits.
     */
    @Getter
    private final Map<CardSuit,Boolean> booleanMap = new TreeMap<>();

    /**
     * A map of locales indexed by boolean.
     */
    @Getter
    private final Map<Boolean, Locale> localeMap = new TreeMap<>();

    /**
     * A map of mimetypes indexed by charsets.
     */
    @Getter
    private final Map<Charset,MimeType> mimetypeMap = new TreeMap<>();

}
