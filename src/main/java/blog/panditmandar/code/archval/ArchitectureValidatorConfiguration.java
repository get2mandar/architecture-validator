package blog.panditmandar.code.archval;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArchitectureValidatorConfiguration {

	@Value("${scan.package}")
	private String packageToScan;

	@Value("${project.root.folder}")
	private String projectRootFolder;

	public String getProjectRootFolder() {
		return projectRootFolder;
	}

	public String getPackageToScan() {
		return packageToScan;
	}
}