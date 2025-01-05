package br.com.alura.literalura.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.literalura.repository.AutorRepository;

@Service
public class AutorService {
    @Autowired
    public AutorRepository repositorio;
}