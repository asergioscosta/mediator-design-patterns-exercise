package org.mediator;

public interface Setor {

    String receberAtendimento(String mensagem);

    String receberChamado(String mensagem);

    String receberRetorno(String mensagem);
}
