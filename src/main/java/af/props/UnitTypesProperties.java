package af.props;

import java.time.Duration;
import java.time.Period;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.util.unit.DataSize;

/**
 * Properties containing data unit types like {@code java.time.Period}s,
 * {@code java.time.Duration}s, {@code org.springframework.util.unit.DataSize}s,
 * etc.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "unit-types")
@Getter
@Setter
public class UnitTypesProperties {

    /**
     * A long period of time. Uses {@code java.time.Period}.
     */
    private Period maturation;

    /**
     * A short period of time. Uses {@code java.time.Duration}.
     */
    private Duration tick;

    /**
     * Mass storage size. Uses {@code org.springframework.util.unit.DataSize}.
     */
    private DataSize storage;

}
