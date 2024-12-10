def getCookie() {
    String value_set_cookie = messageExchange.responseHeaders.getCaseInsensitiveEntry('set-cookie')
    log.info("Call 'getCookie' : httpe header 'set-cookie' value = $value_set_cookie")
}
