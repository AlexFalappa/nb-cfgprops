package af.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Java primitive types.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "primitive-types")
@Getter
@Setter
public class PrimitiveTypesProperties {

    /**
     * A native boolean.
     */
    private boolean nativeBoolean = Boolean.TRUE;
    /**
     * A native byte.
     */
    private byte nativeByte = Byte.MAX_VALUE;
    /**
     * A native short integer.
     */
    private short nativeShort = Short.MAX_VALUE;
    /**
     * A native integer.
     */
    private int nativeInteger = Integer.MAX_VALUE;
    /**
     * A native long integer.
     */
    private long nativeLong = Long.MAX_VALUE;
    /**
     * A native single precision floating point.
     */
    private float nativeFloat = Float.MAX_VALUE;
    /**
     * A native double precision floating point.
     */
    private double nativeDouble = Double.MAX_VALUE;
    /**
     * A native character.
     */
    private char nativeChar = 'a';
}
