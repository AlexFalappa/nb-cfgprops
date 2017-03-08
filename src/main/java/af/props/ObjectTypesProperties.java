package af.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Boolean.TRUE;

/**
 * Java object types.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "object-types")
@Getter
@Setter
public class ObjectTypesProperties {

    /**
     * An object boolean.
     */
    private Boolean objectBoolean = TRUE;
    /**
     * An object byte.
     */
    private Byte objectByte = Byte.MIN_VALUE;
    /**
     * An object short integer.
     */
    private Short objectShort = Short.MIN_VALUE;
    /**
     * An object integer.
     */
    private Integer objectInteger = Integer.MIN_VALUE;
    /**
     * An object long integer.
     */
    private Long objectLong = Long.MIN_VALUE;
    /**
     * An object single precision floating point.
     */
    private Float objectFloat = Float.MIN_VALUE;
    /**
     * An object double precision floating point.
     */
    private Double objectDouble = Double.MIN_VALUE;
    /**
     * An object character.
     */
    private Character objectCharacter = 'a';
    /**
     * A string.
     */
    private String objectString = "a string";
}
