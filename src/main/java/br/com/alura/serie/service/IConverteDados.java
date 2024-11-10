package br.com.alura.serie.service;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);

}
