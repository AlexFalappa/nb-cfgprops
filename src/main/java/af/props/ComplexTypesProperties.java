package af.props;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Getter;
import lombok.Setter;

/**
 * Properties containing common but not so basic types like {@code Enum}s, {@code java.io.File}s, {@code java.nio.Path}s, etc.
 *
 * @author Alessandro Falappa
 */
@ConfigurationProperties(prefix = "complex-types")
@Getter
@Setter
public class ComplexTypesProperties {

    /**
     * Copy options Enum from {@code java.nio.file}.
     */
    private StandardCopyOption copyOption;

    /**
     * A cards suit (custom Enum).
     */
    private CardSuit suit;

    /**
     * A {@code java.io.File} object.
     */
    private File aFile;

    /**
     * A {@code java.nio.Path} object.
     */
    private Path aPath;

}
