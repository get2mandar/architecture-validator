package blog.panditmandar.code.archval;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

//import com.tngtech.archunit.core.domain.JavaClasses;
//import com.tngtech.archunit.core.importer.ClassFileImporter;
//import com.tngtech.archunit.core.importer.ImportOption;
//import com.tngtech.archunit.core.importer.ImportOptions;
//import com.tngtech.archunit.library.Architectures.LayeredArchitecture;

@SpringBootTest(classes = ArchitectureValidatorConfiguration.class)
@EnableConfigurationProperties
@TestPropertySource(locations = "classpath:application-test.properties")
class ArchitectureValidatorAppTests {

//	private JavaClasses importedClasses;

	@Test
	void contextLoads() {
	}

	@Autowired
	ArchitectureValidatorConfiguration archtValidatorConfig;

//	@BeforeEach
//	public void setup() {
//		ImportOptions importOptions = new ImportOptions();
//		importOptions = importOptions.with(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS);
//		importOptions = importOptions.with(ImportOption.Predefined.DO_NOT_INCLUDE_JARS);
//		importedClasses = new ClassFileImporter(importOptions).importPackages(archtValidatorConfig.getPackageToScan());
//	}
//
//	@Test
//	public void testLayeredArchitecture() {
//		LayeredArchitecture arch = (LayeredArchitecture) ArchitectureRules.layeredArchitecture.as("LayerDummy");
//		arch.check(importedClasses);
//	}

//	@Test
//	public void testServicesPackage() {
//		ArchitectureRules.servicesPackage.check(importedClasses);
//	}
//	
//	@Test
//	public void testRestControllerPackage() {
//		ArchitectureRules.restControllerPackage.check(importedClasses);
//	}

}
