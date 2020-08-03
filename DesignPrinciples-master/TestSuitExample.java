package junitprograms;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses(
		{
		CalculatorTest.class,
		MathematicsTest.class
		}
		)
public class TestSuiteExample {

}