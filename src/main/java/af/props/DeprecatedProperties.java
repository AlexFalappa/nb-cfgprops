package af.props;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

import lombok.Getter;
import lombok.Setter;

/**
 * Deprecation of configuration properties.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "deprecated")
public class DeprecatedProperties {

    /**
     * A replacement configuration property.
     */
    @Getter
    @Setter
    private String replacementString;

    @DeprecatedConfigurationProperty(reason = "reason of deprecation", replacement = "deprecated.replacement-string")
    public String getDeprecatedString() {
        return getReplacementString();
    }

    public void setDeprecatedString(String deprecatedString) {
        setReplacementString(replacementString);
    }

}
