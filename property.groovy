def getTestSuitePropertyValue(String prop_name) {
    String prop_value = context.testCase.testSuite.getPropertyValue(prop_name)
    log.info("Call 'getTestSuitePropertyValue' : $prop_name = $prop_value")
    return prop_value

    //solution 2
    //String prop_value = context.getTestCase().getTestSuite().getPropertyValue(prop_name)
}

def setTestSuitePropertyValue(String prop_name, String prop_value) {
    log.info "Call 'setTestSuitePropertyValue' : $prop_name = $prop_value"
    context.testCase.testSuite.setPropertyValue(prop_name, prop_value)

    // solution 2
    // context.getTestCase().getTestSuite().setPropertyValue(prop_name, prop_value)
}
