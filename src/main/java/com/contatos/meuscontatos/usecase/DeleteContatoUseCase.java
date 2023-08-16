package com.contatos.meuscontatos.usecase;

public interface DeleteContatoUseCase {
    void execute(String id);
    void execute(String id, String addressToDelete, String phoneNumberToDelete);
}
