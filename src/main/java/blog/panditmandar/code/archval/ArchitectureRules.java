package blog.panditmandar.code.archval;

//import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
//import static com.tngtech.archunit.library.Architectures.layeredArchitecture;
//
//import com.tngtech.archunit.junit.ArchTest;
//import com.tngtech.archunit.lang.ArchRule;


public class ArchitectureRules {

//	@ArchTest
//	static ArchRule layeredArchitecture = layeredArchitecture()
//
//			.layer("Utility").definedBy("..repository..")
//
//			.layer("Configuration").definedBy("..config..")
//
//			.layer("Service").definedBy("..services..")
//
//			.layer("Controller").definedBy("..controller..")
//
//			.whereLayer("Service").mayOnlyBeAccessedByLayers("Controller")
//
//			.whereLayer("Configuration").mayOnlyBeAccessedByLayers("Service")
//
//			.whereLayer("Repository").mayOnlyBeAccessedByLayers("Service")
//
//			.whereLayer("Entity").mayOnlyBeAccessedByLayers("Repository", "Service");
//
//	@ArchTest
//	static ArchRule servicesPackage = classes().that().areAnnotatedWith("Service").should()
//			.resideInAPackage("..service..");
//
//	@ArchTest
//	static ArchRule restControllerPackage = classes().that().areAnnotatedWith("RestController").should()
//			.resideInAnyPackage("..controller..");

}
