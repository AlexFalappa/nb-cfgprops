package af.props;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Java arrays of native and object types.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "arrays")
@Getter
@Setter
public class ArraysProperties {

    /**
     * An array of integers.
     */
    private int[] intArray;
    /**
     * An array of characters.
     */
    private char[] charArray;
    /**
     * An array of floats.
     */
    private float[] floatArray;
    /**
     * An array of strings.
     */
    private String[] stringArray;

}
