package jms.integracao

import groovy.jms.integracao.Message

class MainMessage implements Message{

	String mensagem
	ReceivedMessageHandler receivedMessageHandler

	@Override
	void enviar() {

	}
}
