package org.arkecosystem.client.api.one

import spock.lang.Specification
import org.arkecosystem.client.MockHelper

class TransactionsTest extends Specification {
    def "all"() {
        setup:
            def connection = MockHelper.connection()
        when:
            def actual = connection.api('transactions').all()
        then:
            actual.success == true
    }

    def "show"() {
        setup:
            def connection = MockHelper.connection()
        when:
            def actual = connection.api('transactions').show('038716f2d525f2f1a4f02f85b7e51c7cf46420c1505ffceee7495b5271a205ad')
        then:
            actual.success == true
    }
}
