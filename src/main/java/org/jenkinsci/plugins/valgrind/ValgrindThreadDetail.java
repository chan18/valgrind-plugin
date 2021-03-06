package org.jenkinsci.plugins.valgrind;

import hudson.model.AbstractBuild;

import org.jenkinsci.plugins.valgrind.model.ValgrindProcess;
import org.jenkinsci.plugins.valgrind.model.ValgrindThread;
import org.jenkinsci.plugins.valgrind.util.ValgrindSourceFile;

/**
 * 
 * @author Johannes Ohlemacher
 * 
 */
public class ValgrindThreadDetail
{
	private ValgrindThread thread;
	private ValgrindProcess process;
	final private AbstractBuild<?, ?> owner;
	
	public ValgrindThreadDetail( AbstractBuild<?, ?> owner, ValgrindProcess process, ValgrindThread thread, ValgrindSourceFile valgrindSourceFile )
	{
		this.owner = owner;
		this.thread = thread;	
		this.process = process;
		
		if ( thread != null )
			thread.setSourceCode( valgrindSourceFile );
	}

	public ValgrindThread getThread()
	{
		return thread;
	}
	
	public ValgrindProcess getProcess()
	{
		return process;
	}

	public AbstractBuild<?, ?> getOwner()
	{
		return owner;
	}
}
