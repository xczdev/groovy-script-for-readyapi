import groovy.json.JsonSlurper

def respondseJson = messageExchange.getResponse().contentAsString
def body = new JsonSlurper().parseText(respondseJson)

