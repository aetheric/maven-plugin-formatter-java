package nz.co.aetheric.maven.plugin.formatter.java;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;

@Mojo(name = "format", defaultPhase = LifecyclePhase.VALIDATE, requiresProject = false)
public class JavaFormatterMojo extends AbstractMojo {

	/** Target sources base directory */
	@Parameter(defaultValue = "${project.build.sourceDirectory}")
	private File sourceDir;

	@Override
	public void execute() throws MojoExecutionException, MojoFailureException {
		//TODO
	}

}