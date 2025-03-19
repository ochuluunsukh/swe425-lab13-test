package edu.miu.cs.cs425.test;


import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses(value = {
        ArrayFlattenerTest.class,
        ArrayReversorTest.class}
)
public class UnitsTestSuite {
}