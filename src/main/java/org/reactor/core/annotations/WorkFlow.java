package org.reactor.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.reactor.core.workflow.WorkFlowType;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
@Inherited
public @interface WorkFlow {
	public String name();
	public String parentName();
	public String action();
	public WorkFlowType type();
}
