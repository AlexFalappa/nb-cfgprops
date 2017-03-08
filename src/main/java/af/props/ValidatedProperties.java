package af.props;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

/**
 * A set of JSR-303 validated properties.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "validated")
@Validated
@Getter
@Setter
public class ValidatedProperties {

    /**
     * Non empty string.
     */
    @NotEmpty
    private String notEmpty;
    /**
     * Non null character.
     */
    @NotNull
    private Character notNull;
    /**
     * Integer in the [0-10] inclusive range.
     */
    @Range(min = 0, max = 10)
    private Integer inRange;
    /**
     * Non null string with length from 4 to 8.
     */
    @NotNull
    @Length(min = 4, max = 8)
    private String lengthInRange;
    /**
     * Non null string representing an URL.
     */
    @URL
    @NotNull
    private String urlString;
    /**
     * A point as an array of exactly two double numbers.
     */
    @Size(min = 2, max = 2)
    @NotNull
    private double[] point;
}
