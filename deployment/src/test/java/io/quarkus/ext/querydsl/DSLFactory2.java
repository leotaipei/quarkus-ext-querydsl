package io.quarkus.ext.querydsl;

import io.quarkus.ext.querydsl.runtime.QueryFactoryCreator.MySQLFactory;
import io.quarkus.runtime.annotations.RegisterForReflection;

/**
 * 
 * @author Leo Tu
 */
@RegisterForReflection
public class DSLFactory2 extends MySQLFactory {
  int dummy = 0;
}
