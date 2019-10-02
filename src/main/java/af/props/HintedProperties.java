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
     * Has key hints for person names and value hints for pet animals.
     */
    private Map<String, String> map = new HashMap<>();

    /**
     * A person name.
     * <p>
     * Has a value provider of type <tt>any</tt> and three value hints. Default value is one of the hints.
     */
    private String name = "Alexander";

    /**
     * A logger name.
     * <p>
     * Has a value provider of type <tt>logger-name</tt>
     */
    private String myLogger;

    /**
     * A Swing GUI widget class name.
     * <p>
     * Has a value provider of type <tt>class-reference</tt> with target <tt>javax.swing.JComponent</tt>
     */
    private String swingComponent;

    /**
     * A string representing a locale.
     * <p>
     * Has a value provider of type <tt>handle-as</tt> with target <tt>java.util.Locale</tt>
     */
    private String myLocale;

    /**
     * A string representing a character encoding.
     * <p>
     * Has a value provider of type <tt>handle-as</tt> with target <tt>java.nio.charset.Charset</tt>
     */
    private String myCharset;

    /**
     * A string representing an external resource (conforming to the Spring Resource abstraction).
     * <p>
     * Has a value provider of type <tt>handle-as</tt> with target <tt>org.springframework.core.io.Resource</tt>
     */
    private String configSource;

    /**
     * A string representing values of an <tt>StandardOpenOption</tt> enumeration.
     * <p>
     * Has a value provider of type <tt>handle-as</tt> with target <tt>java.nio.file.StandardOpenOption</tt>
     */
    private String openOption;
    
}
