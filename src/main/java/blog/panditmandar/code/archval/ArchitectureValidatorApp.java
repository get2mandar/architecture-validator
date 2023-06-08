package blog.panditmandar.code.archval;

import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;

@SpringBootApplication
public class ArchitectureValidatorApp implements CommandLineRunner {

	@Autowired
	ArchitectureValidatorConfiguration archtValidatorConfig;

	public static void main(String[] args) {
		SpringApplication.run(ArchitectureValidatorApp.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("ProjectRootFolder");
		System.out.println(archtValidatorConfig.getProjectRootFolder());

		System.out.println("PackageToScan");
		System.out.println(archtValidatorConfig.getPackageToScan());

		JavaClasses classes = new ClassFileImporter().importPackages(archtValidatorConfig.getPackageToScan());

		layeredArchitecture().consideringAllDependencies()

				.layer("Controllers").definedBy(archtValidatorConfig.getPackageToScan() + "..controller..")
				.layer("Services").definedBy(archtValidatorConfig.getPackageToScan() + "..service..")
				.layer("Persistence").definedBy(archtValidatorConfig.getPackageToScan() + "..persistence..")

				.whereLayer("Controllers").mayNotBeAccessedByAnyLayer().whereLayer("Services")
				.mayOnlyBeAccessedByLayers("Controllers").whereLayer("Persistence")
				.mayOnlyBeAccessedByLayers("Services")

				.check(classes);

	}

}
