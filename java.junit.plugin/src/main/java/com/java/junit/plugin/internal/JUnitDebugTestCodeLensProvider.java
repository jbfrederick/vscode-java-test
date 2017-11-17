package com.java.junit.plugin.internal;

public class JUnitDebugTestCodeLensProvider extends JUnitCodeLensProviderImpl {

	private static final String JAVA_DEBUG_TEST_COMMAND = "java.debug.test";
	private static final String DEBUGTEST_TYPE = "debugtest";
	private static final String JAVA_DEBUG_TEST_LABEL = "Debug Test";
	
	/**
	 * Preference key to enable/disable run test code lenses.
	 */
	public static final String DEBUG_TESTS_CODE_LENS_ENABLED_KEY = "java.debugTestsCodeLens.enabled";
	
	public JUnitDebugTestCodeLensProvider() {
	}

	@Override
	public String getType() {
		return DEBUGTEST_TYPE;
	}

	@Override
	public String commandLabel() {
		return JAVA_DEBUG_TEST_LABEL;
	}

	@Override
	public String commandName() {
		return JAVA_DEBUG_TEST_COMMAND;
	}

	@Override
	public String codeLensEnableKey() {
		return DEBUG_TESTS_CODE_LENS_ENABLED_KEY;
	}

}