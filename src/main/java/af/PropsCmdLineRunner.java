package af;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import af.props.ArraysProperties;
import af.props.CollectionsProperties;
import af.props.ComplexTypesProperties;
import af.props.HintedProperties;
import af.props.ObjectTypesProperties;
import af.props.PrimitiveTypesProperties;
import af.props.ValidatedProperties;

/**
 * Prints the values of all the configuration properties.
 *
 * @author Alessandro Falappa
 */
@Component
@EnableConfigurationProperties({
    PrimitiveTypesProperties.class, ObjectTypesProperties.class, ArraysProperties.class,
    CollectionsProperties.class, ValidatedProperties.class, ComplexTypesProperties.class,
    HintedProperties.class
})
public class PropsCmdLineRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(PropsCmdLineRunner.class);
    private final PrimitiveTypesProperties primitives;
    private final ObjectTypesProperties objects;
    private final ArraysProperties arrays;
    private final CollectionsProperties collections;
    private final ValidatedProperties validated;
    private final ComplexTypesProperties complex;
    private final HintedProperties hinted;

    public PropsCmdLineRunner(PrimitiveTypesProperties primitives, ObjectTypesProperties objects, ArraysProperties arrays,
            CollectionsProperties collections, ValidatedProperties validated, ComplexTypesProperties complex,
            HintedProperties hinted) {
        this.primitives = primitives;
        this.objects = objects;
        this.arrays = arrays;
        this.collections = collections;
        this.validated = validated;
        this.complex = complex;
        this.hinted = hinted;
    }

    @Override
    public void run(String... strings) throws Exception {
        logger.info("********* PRIMITIVES ***********");
        logger.info("boolean: {}", String.valueOf(primitives.isNativeBoolean()));
        logger.info("byte: {}", String.valueOf(primitives.getNativeByte()));
        logger.info("short integer: {}", String.valueOf(primitives.getNativeShort()));
        logger.info("integer: {}", String.valueOf(primitives.getNativeInteger()));
        logger.info("long integer: {}", String.valueOf(primitives.getNativeLong()));
        logger.info("float: {}", String.valueOf(primitives.getNativeFloat()));
        logger.info("double: {}", String.valueOf(primitives.getNativeDouble()));
        logger.info("character: {}", String.valueOf(primitives.getNativeChar()));
        logger.info("*********** OBJECTS ************");
        logger.info("boolean: {}", objects.getObjectBoolean().toString());
        logger.info("byte: {}", objects.getObjectByte().toString());
        logger.info("short integer: {}", objects.getObjectShort().toString());
        logger.info("integer: {}", objects.getObjectInteger().toString());
        logger.info("long integer: {}", objects.getObjectLong().toString());
        logger.info("float: {}", objects.getObjectFloat().toString());
        logger.info("double: {}", objects.getObjectDouble().toString());
        logger.info("character: {}", objects.getObjectCharacter().toString());
        logger.info("string: {}", objects.getObjectString());
        logger.info("*********** ARRAYS *************");
        logger.info("array of characters: {}", Arrays.toString(arrays.getCharArray()));
        logger.info("array of integers: {}", Arrays.toString(arrays.getIntArray()));
        logger.info("array of floats: {}", Arrays.toString(arrays.getFloatArray()));
        logger.info("array of strings: {}", Arrays.toString(arrays.getStringArray()));
        logger.info("********* COLLECTIONS **********");
        logger.info("set: {}", collections.getSet().toString());
        logger.info("list: {}", collections.getList().toString());
        logger.info("map: {}", collections.getMap().toString());
        logger.info("cardMap: {}", collections.getCardMap().toString());
        logger.info("agesMap: {}", collections.getAgesMap().toString());
        logger.info("booleanMap: {}", collections.getBooleanMap().toString());
        logger.info("********** VALIDATED ***********");
        logger.info("not empty: {}", validated.getNotEmpty());
        logger.info("in range: {}", validated.getInRange().toString());
        logger.info("not null: {}", validated.getNotNull().toString());
        logger.info("length in range: {}", validated.getLengthInRange());
        logger.info("URL string: {}", validated.getUrlString());
        logger.info("point: {}", Arrays.toString(validated.getPoint()));
        logger.info("*********** COMPLEX ************");
        logger.info("suit: {}", complex.getSuit());
        logger.info("copy option: {}", complex.getCopyOption());
        logger.info("a file: {}", complex.getAFile());
        logger.info("a path: {}", complex.getAPath());
        logger.info("*********** HINTED ************");
        logger.info("hinted config source: {}", hinted.getConfigSource());
        logger.info("hinted map: {}", hinted.getMap());
        logger.info("hinted my charset: {}", hinted.getMyCharset());
        logger.info("hinted my locale: {}", hinted.getMyLocale());
        logger.info("hinted my logger: {}", hinted.getMyLogger());
        logger.info("hinted name: {}", hinted.getName());
        logger.info("hinted names: {}", hinted.getNames());
        logger.info("hinted open option: {}", hinted.getOpenOption());
        logger.info("hinted swing component: {}", hinted.getSwingComponent());
    }

}
